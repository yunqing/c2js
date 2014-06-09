grammar qsort;

@members{
	ArrayList<String> FunctionName = new ArrayList();
	ArrayList<String> FunctionType = new ArrayList();
	ArrayList<String> VariableError = new ArrayList();
	ArrayList<String> ClassError = new ArrayList();
	Variable CurVariable = new Variable();

	class TabController {
		ArrayList<String> tabList = new ArrayList();
		public void addTab() {
			tabList.add("\t");
		}
		public void removeTab() {
			if (tabList.size() == 0) {
				return;
			}
			tabList.remove(tabList.size() - 1);
		}
		public String tab() {
			String temp = "";
			for (int i = 0; i < tabList.size(); i++) {
				temp += tabList.get(i);
			}
			return temp;
		}
	};
	TabController tabs = new TabController();
	class Variable
	{
		String name;
		String type;
		String classStr;
		boolean flag;
	};
	ArrayList<Variable> VariableList = new ArrayList();
	
	class Function
	{
		String name;
		ArrayList<String> paras = new ArrayList();
		String paraString;
		String classStr;
		boolean flag;
		String returnString;
	};
	ArrayList<Function> FunctionList = new ArrayList();
	
	class ClassStruct
	{
		String ClassName;
		String ConstructFunctionPara;
		String initial;
	};
	ArrayList<ClassStruct> ClassList = new ArrayList();
}

program
	:	declaration declarations
		{
			System.out.println($declaration.name + $declarations.name);
			if(VariableError.size() != 0)
			{
				System.out.println("Cannot find variable:");
				for(String i : VariableError)
					System.out.println(i);
			}
		}
	;


declarations returns [String name]
@init{
	name = null;
}
	: 	declaration a=declarations
		{$name = $declaration.name + "" + $a.name;}
	|	{$name = "";}
	;

	
declaration returns [String name]
@init{
	name = null;
}
	:	//classDefine
		//{$name = $classDefine.name + "\n";} |
		type functionVariable
		{
			$name = $functionVariable.name + "\n";
			CurVariable.type = $type.name;
			VariableList.add(CurVariable);
		}
	|	LINE_COMMENT 
		{$name = "";}
	|	COMMENT 
		{$name = "";}
	;


ieStat returns [String name]
@init{
	name = null;
}
	:	ifPart elsePart
		{$name = $ifPart.name + $elsePart.name;}
	;

ifPart returns [String name]
@init{
	name = null;
}
	:	'if' '(' exprvalue ')' '{' block '}'
		{$name = "if " + $exprvalue.name + ":" + "\n" + "\t" +  $block.name + "" + ";";}
	;
	
elsePart returns [String name]
@init{
	name = null;
}
	:	'else' '{' block '}'
		{$name = "else:\n" + $block.name + ";";}
	|	{$name = "";}
	;


whileStat returns [String name]
@init{
	name = null;
}
	:	'while' '(' expr ')' '{' block '}'
		{
			
			$name = "while " + $expr.name + ":\n" + "\t"  + $block.name + "" + ";";
			
		}
	;

block returns [String name]
@init{
	name = null;
}
	:	stat a=block
		{$name = $stat.name + $a.name;}
	|	{
			$name = "";
		}
	;

stat returns [String name]
@init{
	name = null;
}
	:	type decVariable
		{
			$name = "\t" + $type.name + "" + $decVariable.name + "\n";
			CurVariable.type = $type.name;
			VariableList.add(CurVariable);

		}
	|	ieStat
		{
			
			$name = "\t"  + $ieStat.name + "\n";
			
		}
	|	whileStat
		{
			
			$name = "\t"  + $whileStat.name + "\n";
			
		}
	|	callFunction ';'
		{
			
			$name = "\t"  + $callFunction.name + "\n";
		}
	|	'return' returnSentence ';'
		{
			
			$name = "\t"  + "return " + $returnSentence.name + "\n";
		}
	|	normalExp ';'
		{
			
			$name = "\t"  + $normalExp.name + "\n";
		}
	|	LINE_COMMENT
		{
			$name = "";
		}
	|	COMMENT 
		{
			$name = "";
		}
	;

functionVariable returns [String name]
@init{
	name = null;
}
	:	decFunction
		{$name = "def " + $decFunction.name;}
	|	decVariable
		{
			$name = "" + $decVariable.name;
		}
	;

decFunction returns [String name, String para, String funname, String initial, String justpara]
@init{
	$name = null;
	$para = null;
	$funname = null;
	$initial = null;
	$justpara = null;
}
	:	decFunctionName '{' functionImplement '}' semiColon
		{
		
			// leo
			FunctionName.add($decFunctionName.ownname);
			FunctionType.add($decFunctionName.paraType);
			
			if ($decFunctionName.paraType == "int&")
			{
				$name = $decFunctionName.name + ":\n" + $functionImplement.name + "\t" + "return [" + $decFunctionName.p + "];" + $semiColon.name + "\n";
	
				$para = $decFunctionName.para + ":\n" + $functionImplement.name + "\t" + "return [" + $decFunctionName.p + "];" + $semiColon.name + "\n";
				
			}
			else
			{
				$name = $decFunctionName.name + ":\n" + $functionImplement.name + ";" + $semiColon.name + "\n";
				$para = $decFunctionName.para + ":\n" + $functionImplement.name + ";" + $semiColon.name + "\n";
				
			}
			 $funname = $decFunctionName.funname;
			 $justpara = $decFunctionName.para;
			 $initial = $functionImplement.initial;
		}
	;

decFunctionName returns [String name, String para, String funname, String ownname, String p, String paraType]
@init{
	$name = null;
	$para = null;
	$funname = null;
	$ownname = null;
	$p = null;
	$paraType = null;
}
	:	ID '(' decParameter ')'
		{
			$ownname = $ID.text;
			$name = $ID.text + "(" + $decParameter.name + ")";
			$para = "(" + $decParameter.name + ")";
			$p = $decParameter.name;
			$funname = $ID.text;// + "_" + $decParameter.paranum;
			$paraType = $decParameter.paraType;
		}
	;

decParameter returns [String name, int paranum, String paraType]
@init{
	$name = null;
	$paranum = 0;
	$paraType = null;
}
	:	decFormalPara decOtherPara
		{
			$name = $decFormalPara.name + $decOtherPara.name;
			$paranum = $decFormalPara.paranum + $decOtherPara.paranum;
			$paraType = $decFormalPara.paraType;
		}
	|	{
			$name = ""; 
			$paranum = $paranum + 0;
		}
	;
	
decFormalPara returns [String name, int paranum, String paraType]
@init{
	$name = null;
	$paranum = 0;
	$paraType = null;
}
	:	type ID
		{
			$name = $ID.text;
			if($name == null || $name == "")
				$paranum = 0;
			else
				$paranum = 1;
			$paraType = $type.name;
		}
	;

decOtherPara returns [String name, int paranum, String othername]
@init{
	$name = null;
	$paranum = 0;	
	$othername = null;
}
	:	',' decFormalPara a=decOtherPara
		{
			$name = ", " + $decFormalPara.name + $a.name;
			$paranum = $decFormalPara.paranum + $a.paranum;
			$othername = $decFormalPara.name;
		}
	|	{
			$name = "";
			$paranum = $paranum + 0;
		}
	;

functionImplement returns [String name, String initial]
@init{
	$name = null;
	$initial = null;
}
	:	block
		{$name = $block.name;
		 $initial = $block.name;
		}
	;

decVariable returns [String name, String variableName]
@init{
	$name = null;
	$variableName = null;
}
	:	ID array decExpression ';'
		{
			$name = $ID.text + $array.name + $decExpression.name + "";
			$variableName = $ID.text + $array.name;
		}
	;

callFunction returns [String name]
@init{
	name = null;
}
	:	callName
		{$name = $callName.name;}
	|	ID '.'	callName
		{
			$name = $ID.text + "." + $callName.subname;
		}
	;

callName returns [String name, String subname]
@init{
	$name = null;
	$subname = null;
}
	:	ID '(' callParameter ')'
		{
			int k  = FunctionName.indexOf($ID.text);
			int index = 0;
			boolean isPub = true;
			if ((k >= 0) && (FunctionType.get(k) == "int&"))
			{
				if(isPub)
					$name = "var temp = " + $ID.text + "(" + $callParameter.name + ");\n" + "\t"+ $callParameter.temp1 + "= temp[0];\n" + "\t" +$callParameter.temp2 + "= temp[1]";
				else
					$name = "var temp = " + $ID.text + "(" + $callParameter.name + ");\n" + "\t"+ $callParameter.temp1 + "= temp[0];\n" + "\t" +$callParameter.temp2 + "= temp[1]";
			}
			else
			{
				if(isPub)
				{
					$name = "" + $ID.text + "(" + $callParameter.name + ")";
				}
				else
				{
					$name = $ID.text +  "(" + $callParameter.name + ")";
				}
				$subname = $ID.text +  "(" + $callParameter.name + ")";
			}
		}
	;

callNameInObject returns [String para, String var, int paranum]
@init{
	$para = null;
	$var = null;
	$paranum = 0;
}
	:	ID '(' callParameter ')'
		{
			$para = "(" + $callParameter.name + ")";
		 	$var = $ID.text;
		 	$paranum = $callParameter.paranum;
		}
	;	
	
callParameter returns [String name, int paranum, String temp1, String temp2]
@init{
	$name = null;
	$paranum = 0;
	$temp1 = null;
	$temp2 = null;
}
	:	callFormalPara callOtherPara
		{
			$name = $callFormalPara.name + $callOtherPara.name;
			$paranum = $callFormalPara.paranum + $callOtherPara.paranum;
			$temp1 = $callFormalPara.name;
			$temp2 = $callOtherPara.othername;
		}
	|	{
			$name = "";
			$paranum += 0;
		}
	;

callFormalPara returns [String name, int paranum]
@init{
	$name = null;
	$paranum = 0;
}
	:	exprvalue
		{
			$name = $exprvalue.name;
			if($name == "" || $name == null)
				$paranum = 0;
			else
				$paranum = 1;
		}
	;

callOtherPara returns [String name, int paranum, String othername]
@init{
	$name = null;
	$paranum = 0;
	$othername = null;
}
	:	',' callFormalPara a=callOtherPara
		{
			$name = ", " + $callFormalPara.name + $a.name;
			$paranum += $callFormalPara.paranum + $a.paranum;
			$othername = $callFormalPara.name;
		}
	|	{
			$name = "";
			$paranum += 0;
		}
	;

array returns [String name]
@init{
	name = null;
}
	:	'[' index ']'
		{$name = "[" + $index.name + "]";
		 if($index.name == "")
			$name = "";}
	|	{$name = "";}
	;

index returns [String name]
@init{
	name = null;
}
	:	exprvalue
		{$name = $exprvalue.name;}
	|	{$name = "";}
	;


semiColon returns [String name]
@init{
	name = null;
}
	:	';'
		{$name = "";}
	|	{$name = "";}
	;

decExpression returns [String name]
@init{
	name = null;
}
	:	'=' exprvalue
		{$name = " = " + $exprvalue.name;}
	|	{$name = "";}
	;

exprvalue returns [String name]
@init{
	name = null;
}
	:	expr
		{$name = $expr.name;}
	|	'!' expr
		{$name = "!" + $expr.name;}
	|	'-' expr
		{$name = "-" + $expr.name;}
	|	'{'	INT ints '}'
		{$name = "[" + $INT.text + $ints.name + "]";}
	;

expr returns [String name]
@init{
	name = null;
}
	:	formalOperation otherOperation
		{$name = $formalOperation.name + $otherOperation.name;}
	;

formalOperation returns [String name]
@init{
	name = null;
}
	:	ID array
		{$name = $ID.text + $array.name;}
	|	INT
		{$name = $INT.text;}
	|	'(' expr ')'
		{$name = "(" + $expr.name + ")";}
	|	callFunction
		{$name = $callFunction.name;}
	|	object
		{$name = $object.name;}
	;

otherOperation returns [String name]
@init{
	name = null;
}
	:	operator formalOperation a=otherOperation
		{$name = $operator.name + $formalOperation.name + $a.name;}
	|	singleOperator
		{$name = $singleOperator.name;}
	|	{$name = "";}
	;

object returns [String name]
@init{
	name = null;
}
	:	a=ID '.'	b=ID
		{$name = $a.text + "." + $b.text;}
	;

returnSentence returns [String name]
@init{
	name = null;
}
	:	exprvalue
		{$name = $exprvalue.name;}
	|	{$name = "";}
	;

normalExp returns [String name]
@init{
	name = null;
}
	:	normalGiveValue otherOperation
		{$name = $normalGiveValue.name + $otherOperation.name;}
	;

normalGiveValue returns [String name]
@init{
	name = null;
}
	:	ID array
		{$name = $ID.text + $array.name;}
	|	object
		{$name = $object.name;}
	;


operator returns [String name]
@init{
	name = null;
}
	:	'+'
		{$name = " + ";}
	|	'-'
		{$name = " - ";}
	|	'*'
		{$name = " * ";}
	|	'/'
		{$name = " / ";}
	//|	'%'
	//	{$name = "%";}
	|	'^'
		{$name = " ^ ";}
	|	'&'
		{$name = " & ";}
	|	'&&'
		{$name = " and ";}
	|	'||'
		{$name = " or ";}
	|	'+='
		{$name = " += ";}
	|	'-='
		{$name = " -= ";}
	|	'*='
		{$name = " *= ";}
	|	'/='
		{$name = " /= ";}
	//|	'%='
	//	{$name = "%=";}
	|	'^='
		{$name = " ^= ";}
	|	'&='
		{$name = " &= ";}
	|	'='
		{$name = " = ";}
	|	'>'
		{$name = " > ";}
	|	'>='
		{$name = " >= ";}
	|	'<'
		{$name = " < ";}
	|	'<='
		{$name = " <= ";}
	|	'!='
		{$name = " != ";}
	;

singleOperator returns [String name]
@init{
	name = null;
}
	:	'++'
		{$name = "+= 1";}
	|	'--'
		{$name = "-= 1";}
	;

ints returns [String name]
@init{
	name = null;
}
    :   ',' INT a = ints
		{$name = ", " + $INT.text + $a.name;}
    |	{$name = "";}
    ; 


type returns [String name]
@init{
	name = null;
}
	:	'int'
		{$name = "";}
	|	'char'
		{$name = "";}
	|	'void'
		{$name = "";}
	|	'int*'
		{$name = "";}
	|	'int&'
		{$name = "";}
	;

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	('0'..'9')('0'..'9')*
    ;

COMMENT 
    : '/*' . * '*/' {skip();} 
    ;

LINE_COMMENT 
    : '//' ~ ('\n' | '\r') * '\r'? '\n' {skip();} 
    ;

WS  :   (   ' '
        |   '\t'
        |   '\r'
        |   '\n'
        )+
        { $channel=HIDDEN; }
    ;    
	