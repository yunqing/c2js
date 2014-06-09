// $ANTLR 3.4 src\\qsort.g 2014-06-09 18:04:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class qsortParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "LINE_COMMENT", "WS", "'!'", "'!='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'.'", "'/'", "'/='", "';'", "'<'", "'<='", "'='", "'>'", "'>='", "'['", "']'", "'^'", "'^='", "'char'", "'else'", "'if'", "'int&'", "'int'", "'int*'", "'return'", "'void'", "'while'", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int COMMENT=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int LINE_COMMENT=7;
    public static final int WS=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public qsortParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public qsortParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return qsortParser.tokenNames; }
    public String getGrammarFileName() { return "src\\qsort.g"; }


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



    // $ANTLR start "program"
    // src\\qsort.g:59:1: program : declaration declarations ;
    public final void program() throws RecognitionException {
        String declaration1 =null;

        String declarations2 =null;


        try {
            // src\\qsort.g:60:2: ( declaration declarations )
            // src\\qsort.g:60:4: declaration declarations
            {
            pushFollow(FOLLOW_declaration_in_program16);
            declaration1=declaration();

            state._fsp--;


            pushFollow(FOLLOW_declarations_in_program18);
            declarations2=declarations();

            state._fsp--;



            			System.out.println(declaration1 + declarations2);
            			if(VariableError.size() != 0)
            			{
            				System.out.println("Cannot find variable:");
            				for(String i : VariableError)
            					System.out.println(i);
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "declarations"
    // src\\qsort.g:73:1: declarations returns [String name] : ( declaration a= declarations |);
    public final String declarations() throws RecognitionException {
        String name = null;


        String a =null;

        String declaration3 =null;



        	name = null;

        try {
            // src\\qsort.g:77:2: ( declaration a= declarations |)
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==COMMENT||LA1_0==LINE_COMMENT||LA1_0==38||(LA1_0 >= 41 && LA1_0 <= 43)||LA1_0==45) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // src\\qsort.g:77:5: declaration a= declarations
                    {
                    pushFollow(FOLLOW_declaration_in_declarations43);
                    declaration3=declaration();

                    state._fsp--;


                    pushFollow(FOLLOW_declarations_in_declarations47);
                    a=declarations();

                    state._fsp--;


                    name = declaration3 + "" + a;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:79:4: 
                    {
                    name = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "declarations"



    // $ANTLR start "declaration"
    // src\\qsort.g:83:1: declaration returns [String name] : ( type functionVariable | LINE_COMMENT | COMMENT );
    public final String declaration() throws RecognitionException {
        String name = null;


        String functionVariable4 =null;

        String type5 =null;



        	name = null;

        try {
            // src\\qsort.g:87:2: ( type functionVariable | LINE_COMMENT | COMMENT )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 38:
            case 41:
            case 42:
            case 43:
            case 45:
                {
                alt2=1;
                }
                break;
            case LINE_COMMENT:
                {
                alt2=2;
                }
                break;
            case COMMENT:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // src\\qsort.g:89:3: type functionVariable
                    {
                    pushFollow(FOLLOW_type_in_declaration83);
                    type5=type();

                    state._fsp--;


                    pushFollow(FOLLOW_functionVariable_in_declaration85);
                    functionVariable4=functionVariable();

                    state._fsp--;



                    			name = functionVariable4 + "\n";
                    			CurVariable.type = type5;
                    			VariableList.add(CurVariable);
                    		

                    }
                    break;
                case 2 :
                    // src\\qsort.g:95:4: LINE_COMMENT
                    {
                    match(input,LINE_COMMENT,FOLLOW_LINE_COMMENT_in_declaration94); 

                    name = "";

                    }
                    break;
                case 3 :
                    // src\\qsort.g:97:4: COMMENT
                    {
                    match(input,COMMENT,FOLLOW_COMMENT_in_declaration104); 

                    name = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "ieStat"
    // src\\qsort.g:102:1: ieStat returns [String name] : ifPart elsePart ;
    public final String ieStat() throws RecognitionException {
        String name = null;


        String ifPart6 =null;

        String elsePart7 =null;



        	name = null;

        try {
            // src\\qsort.g:106:2: ( ifPart elsePart )
            // src\\qsort.g:106:4: ifPart elsePart
            {
            pushFollow(FOLLOW_ifPart_in_ieStat129);
            ifPart6=ifPart();

            state._fsp--;


            pushFollow(FOLLOW_elsePart_in_ieStat131);
            elsePart7=elsePart();

            state._fsp--;


            name = ifPart6 + elsePart7;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "ieStat"



    // $ANTLR start "ifPart"
    // src\\qsort.g:110:1: ifPart returns [String name] : 'if' '(' exprvalue ')' '{' block '}' ;
    public final String ifPart() throws RecognitionException {
        String name = null;


        String exprvalue8 =null;

        String block9 =null;



        	name = null;

        try {
            // src\\qsort.g:114:2: ( 'if' '(' exprvalue ')' '{' block '}' )
            // src\\qsort.g:114:4: 'if' '(' exprvalue ')' '{' block '}'
            {
            match(input,40,FOLLOW_40_in_ifPart154); 

            match(input,14,FOLLOW_14_in_ifPart156); 

            pushFollow(FOLLOW_exprvalue_in_ifPart158);
            exprvalue8=exprvalue();

            state._fsp--;


            match(input,15,FOLLOW_15_in_ifPart160); 

            match(input,47,FOLLOW_47_in_ifPart162); 

            pushFollow(FOLLOW_block_in_ifPart164);
            block9=block();

            state._fsp--;


            match(input,49,FOLLOW_49_in_ifPart166); 

            name = "if " + exprvalue8 + ":" + "\n" + "\t" +  block9 + "" + ";";

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "ifPart"



    // $ANTLR start "elsePart"
    // src\\qsort.g:118:1: elsePart returns [String name] : ( 'else' '{' block '}' |);
    public final String elsePart() throws RecognitionException {
        String name = null;


        String block10 =null;



        	name = null;

        try {
            // src\\qsort.g:122:2: ( 'else' '{' block '}' |)
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
                alt3=1;
            }
            else if ( ((LA3_0 >= COMMENT && LA3_0 <= ID)||LA3_0==LINE_COMMENT||LA3_0==38||(LA3_0 >= 40 && LA3_0 <= 46)||LA3_0==49) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // src\\qsort.g:122:4: 'else' '{' block '}'
                    {
                    match(input,39,FOLLOW_39_in_elsePart190); 

                    match(input,47,FOLLOW_47_in_elsePart192); 

                    pushFollow(FOLLOW_block_in_elsePart194);
                    block10=block();

                    state._fsp--;


                    match(input,49,FOLLOW_49_in_elsePart196); 

                    name = "else:\n" + block10 + ";";

                    }
                    break;
                case 2 :
                    // src\\qsort.g:124:4: 
                    {
                    name = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "elsePart"



    // $ANTLR start "whileStat"
    // src\\qsort.g:128:1: whileStat returns [String name] : 'while' '(' expr ')' '{' block '}' ;
    public final String whileStat() throws RecognitionException {
        String name = null;


        String expr11 =null;

        String block12 =null;



        	name = null;

        try {
            // src\\qsort.g:132:2: ( 'while' '(' expr ')' '{' block '}' )
            // src\\qsort.g:132:4: 'while' '(' expr ')' '{' block '}'
            {
            match(input,46,FOLLOW_46_in_whileStat225); 

            match(input,14,FOLLOW_14_in_whileStat227); 

            pushFollow(FOLLOW_expr_in_whileStat229);
            expr11=expr();

            state._fsp--;


            match(input,15,FOLLOW_15_in_whileStat231); 

            match(input,47,FOLLOW_47_in_whileStat233); 

            pushFollow(FOLLOW_block_in_whileStat235);
            block12=block();

            state._fsp--;


            match(input,49,FOLLOW_49_in_whileStat237); 


            			
            			name = "while " + expr11 + ":\n" + "\t"  + block12 + "" + ";";
            			
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "whileStat"



    // $ANTLR start "block"
    // src\\qsort.g:140:1: block returns [String name] : ( stat a= block |);
    public final String block() throws RecognitionException {
        String name = null;


        String a =null;

        String stat13 =null;



        	name = null;

        try {
            // src\\qsort.g:144:2: ( stat a= block |)
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= COMMENT && LA4_0 <= ID)||LA4_0==LINE_COMMENT||LA4_0==38||(LA4_0 >= 40 && LA4_0 <= 46)) ) {
                alt4=1;
            }
            else if ( (LA4_0==49) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // src\\qsort.g:144:4: stat a= block
                    {
                    pushFollow(FOLLOW_stat_in_block260);
                    stat13=stat();

                    state._fsp--;


                    pushFollow(FOLLOW_block_in_block264);
                    a=block();

                    state._fsp--;


                    name = stat13 + a;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:146:4: 
                    {

                    			name = "";
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "block"



    // $ANTLR start "stat"
    // src\\qsort.g:151:1: stat returns [String name] : ( type decVariable | ieStat | whileStat | callFunction ';' | 'return' returnSentence ';' | normalExp ';' | LINE_COMMENT | COMMENT );
    public final String stat() throws RecognitionException {
        String name = null;


        String type14 =null;

        qsortParser.decVariable_return decVariable15 =null;

        String ieStat16 =null;

        String whileStat17 =null;

        String callFunction18 =null;

        String returnSentence19 =null;

        String normalExp20 =null;



        	name = null;

        try {
            // src\\qsort.g:155:2: ( type decVariable | ieStat | whileStat | callFunction ';' | 'return' returnSentence ';' | normalExp ';' | LINE_COMMENT | COMMENT )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 38:
            case 41:
            case 42:
            case 43:
            case 45:
                {
                alt5=1;
                }
                break;
            case 40:
                {
                alt5=2;
                }
                break;
            case 46:
                {
                alt5=3;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    alt5=4;
                    }
                    break;
                case 25:
                    {
                    int LA5_9 = input.LA(3);

                    if ( (LA5_9==ID) ) {
                        int LA5_11 = input.LA(4);

                        if ( (LA5_11==14) ) {
                            alt5=4;
                        }
                        else if ( ((LA5_11 >= 10 && LA5_11 <= 13)||(LA5_11 >= 16 && LA5_11 <= 20)||(LA5_11 >= 22 && LA5_11 <= 24)||(LA5_11 >= 26 && LA5_11 <= 33)||(LA5_11 >= 36 && LA5_11 <= 37)||LA5_11==48) ) {
                            alt5=6;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 11, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 9, input);

                        throw nvae;

                    }
                    }
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 37:
                case 48:
                    {
                    alt5=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;

                }

                }
                break;
            case 44:
                {
                alt5=5;
                }
                break;
            case LINE_COMMENT:
                {
                alt5=7;
                }
                break;
            case COMMENT:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // src\\qsort.g:155:4: type decVariable
                    {
                    pushFollow(FOLLOW_type_in_stat292);
                    type14=type();

                    state._fsp--;


                    pushFollow(FOLLOW_decVariable_in_stat294);
                    decVariable15=decVariable();

                    state._fsp--;



                    			name = "\t" + type14 + "" + (decVariable15!=null?decVariable15.name:null) + "\n";
                    			CurVariable.type = type14;
                    			VariableList.add(CurVariable);

                    		

                    }
                    break;
                case 2 :
                    // src\\qsort.g:162:4: ieStat
                    {
                    pushFollow(FOLLOW_ieStat_in_stat303);
                    ieStat16=ieStat();

                    state._fsp--;



                    			
                    			name = "\t"  + ieStat16 + "\n";
                    			
                    		

                    }
                    break;
                case 3 :
                    // src\\qsort.g:168:4: whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_stat312);
                    whileStat17=whileStat();

                    state._fsp--;



                    			
                    			name = "\t"  + whileStat17 + "\n";
                    			
                    		

                    }
                    break;
                case 4 :
                    // src\\qsort.g:174:4: callFunction ';'
                    {
                    pushFollow(FOLLOW_callFunction_in_stat321);
                    callFunction18=callFunction();

                    state._fsp--;


                    match(input,28,FOLLOW_28_in_stat323); 


                    			
                    			name = "\t"  + callFunction18 + "\n";
                    		

                    }
                    break;
                case 5 :
                    // src\\qsort.g:179:4: 'return' returnSentence ';'
                    {
                    match(input,44,FOLLOW_44_in_stat332); 

                    pushFollow(FOLLOW_returnSentence_in_stat334);
                    returnSentence19=returnSentence();

                    state._fsp--;


                    match(input,28,FOLLOW_28_in_stat336); 


                    			
                    			name = "\t"  + "return " + returnSentence19 + "\n";
                    		

                    }
                    break;
                case 6 :
                    // src\\qsort.g:184:4: normalExp ';'
                    {
                    pushFollow(FOLLOW_normalExp_in_stat345);
                    normalExp20=normalExp();

                    state._fsp--;


                    match(input,28,FOLLOW_28_in_stat347); 


                    			
                    			name = "\t"  + normalExp20 + "\n";
                    		

                    }
                    break;
                case 7 :
                    // src\\qsort.g:189:4: LINE_COMMENT
                    {
                    match(input,LINE_COMMENT,FOLLOW_LINE_COMMENT_in_stat356); 


                    			name = "";
                    		

                    }
                    break;
                case 8 :
                    // src\\qsort.g:193:4: COMMENT
                    {
                    match(input,COMMENT,FOLLOW_COMMENT_in_stat365); 


                    			name = "";
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "stat"



    // $ANTLR start "functionVariable"
    // src\\qsort.g:199:1: functionVariable returns [String name] : ( decFunction | decVariable );
    public final String functionVariable() throws RecognitionException {
        String name = null;


        qsortParser.decFunction_return decFunction21 =null;

        qsortParser.decVariable_return decVariable22 =null;



        	name = null;

        try {
            // src\\qsort.g:203:2: ( decFunction | decVariable )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==14) ) {
                    alt6=1;
                }
                else if ( (LA6_1==28||LA6_1==31||LA6_1==34) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // src\\qsort.g:203:4: decFunction
                    {
                    pushFollow(FOLLOW_decFunction_in_functionVariable389);
                    decFunction21=decFunction();

                    state._fsp--;


                    name = "def " + (decFunction21!=null?decFunction21.name:null);

                    }
                    break;
                case 2 :
                    // src\\qsort.g:205:4: decVariable
                    {
                    pushFollow(FOLLOW_decVariable_in_functionVariable398);
                    decVariable22=decVariable();

                    state._fsp--;



                    			name = "" + (decVariable22!=null?decVariable22.name:null);
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "functionVariable"


    public static class decFunction_return extends ParserRuleReturnScope {
        public String name;
        public String para;
        public String funname;
        public String initial;
        public String justpara;
    };


    // $ANTLR start "decFunction"
    // src\\qsort.g:211:1: decFunction returns [String name, String para, String funname, String initial, String justpara] : decFunctionName '{' functionImplement '}' semiColon ;
    public final qsortParser.decFunction_return decFunction() throws RecognitionException {
        qsortParser.decFunction_return retval = new qsortParser.decFunction_return();
        retval.start = input.LT(1);


        qsortParser.decFunctionName_return decFunctionName23 =null;

        qsortParser.functionImplement_return functionImplement24 =null;

        String semiColon25 =null;



        	retval.name = null;
        	retval.para = null;
        	retval.funname = null;
        	retval.initial = null;
        	retval.justpara = null;

        try {
            // src\\qsort.g:219:2: ( decFunctionName '{' functionImplement '}' semiColon )
            // src\\qsort.g:219:4: decFunctionName '{' functionImplement '}' semiColon
            {
            pushFollow(FOLLOW_decFunctionName_in_decFunction421);
            decFunctionName23=decFunctionName();

            state._fsp--;


            match(input,47,FOLLOW_47_in_decFunction423); 

            pushFollow(FOLLOW_functionImplement_in_decFunction425);
            functionImplement24=functionImplement();

            state._fsp--;


            match(input,49,FOLLOW_49_in_decFunction427); 

            pushFollow(FOLLOW_semiColon_in_decFunction429);
            semiColon25=semiColon();

            state._fsp--;



            		
            			// leo
            			FunctionName.add((decFunctionName23!=null?decFunctionName23.ownname:null));
            			FunctionType.add((decFunctionName23!=null?decFunctionName23.paraType:null));
            			
            			if ((decFunctionName23!=null?decFunctionName23.paraType:null) == "int&")
            			{
            				retval.name = (decFunctionName23!=null?decFunctionName23.name:null) + ":\n" + (functionImplement24!=null?functionImplement24.name:null) + "\t" + "return [" + (decFunctionName23!=null?decFunctionName23.p:null) + "];" + semiColon25 + "\n";
            	
            				retval.para = (decFunctionName23!=null?decFunctionName23.para:null) + ":\n" + (functionImplement24!=null?functionImplement24.name:null) + "\t" + "return [" + (decFunctionName23!=null?decFunctionName23.p:null) + "];" + semiColon25 + "\n";
            				
            			}
            			else
            			{
            				retval.name = (decFunctionName23!=null?decFunctionName23.name:null) + ":\n" + (functionImplement24!=null?functionImplement24.name:null) + ";" + semiColon25 + "\n";
            				retval.para = (decFunctionName23!=null?decFunctionName23.para:null) + ":\n" + (functionImplement24!=null?functionImplement24.name:null) + ";" + semiColon25 + "\n";
            				
            			}
            			 retval.funname = (decFunctionName23!=null?decFunctionName23.funname:null);
            			 retval.justpara = (decFunctionName23!=null?decFunctionName23.para:null);
            			 retval.initial = (functionImplement24!=null?functionImplement24.initial:null);
            		

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decFunction"


    public static class decFunctionName_return extends ParserRuleReturnScope {
        public String name;
        public String para;
        public String funname;
        public String ownname;
        public String p;
        public String paraType;
    };


    // $ANTLR start "decFunctionName"
    // src\\qsort.g:245:1: decFunctionName returns [String name, String para, String funname, String ownname, String p, String paraType] : ID '(' decParameter ')' ;
    public final qsortParser.decFunctionName_return decFunctionName() throws RecognitionException {
        qsortParser.decFunctionName_return retval = new qsortParser.decFunctionName_return();
        retval.start = input.LT(1);


        Token ID26=null;
        qsortParser.decParameter_return decParameter27 =null;



        	retval.name = null;
        	retval.para = null;
        	retval.funname = null;
        	retval.ownname = null;
        	retval.p = null;
        	retval.paraType = null;

        try {
            // src\\qsort.g:254:2: ( ID '(' decParameter ')' )
            // src\\qsort.g:254:4: ID '(' decParameter ')'
            {
            ID26=(Token)match(input,ID,FOLLOW_ID_in_decFunctionName452); 

            match(input,14,FOLLOW_14_in_decFunctionName454); 

            pushFollow(FOLLOW_decParameter_in_decFunctionName456);
            decParameter27=decParameter();

            state._fsp--;


            match(input,15,FOLLOW_15_in_decFunctionName458); 


            			retval.ownname = (ID26!=null?ID26.getText():null);
            			retval.name = (ID26!=null?ID26.getText():null) + "(" + (decParameter27!=null?decParameter27.name:null) + ")";
            			retval.para = "(" + (decParameter27!=null?decParameter27.name:null) + ")";
            			retval.p = (decParameter27!=null?decParameter27.name:null);
            			retval.funname = (ID26!=null?ID26.getText():null);// + "_" + (decParameter27!=null?decParameter27.paranum:0);
            			retval.paraType = (decParameter27!=null?decParameter27.paraType:null);
            		

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decFunctionName"


    public static class decParameter_return extends ParserRuleReturnScope {
        public String name;
        public int paranum;
        public String paraType;
    };


    // $ANTLR start "decParameter"
    // src\\qsort.g:265:1: decParameter returns [String name, int paranum, String paraType] : ( decFormalPara decOtherPara |);
    public final qsortParser.decParameter_return decParameter() throws RecognitionException {
        qsortParser.decParameter_return retval = new qsortParser.decParameter_return();
        retval.start = input.LT(1);


        qsortParser.decFormalPara_return decFormalPara28 =null;

        qsortParser.decOtherPara_return decOtherPara29 =null;



        	retval.name = null;
        	retval.paranum = 0;
        	retval.paraType = null;

        try {
            // src\\qsort.g:271:2: ( decFormalPara decOtherPara |)
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38||(LA7_0 >= 41 && LA7_0 <= 43)||LA7_0==45) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // src\\qsort.g:271:4: decFormalPara decOtherPara
                    {
                    pushFollow(FOLLOW_decFormalPara_in_decParameter481);
                    decFormalPara28=decFormalPara();

                    state._fsp--;


                    pushFollow(FOLLOW_decOtherPara_in_decParameter483);
                    decOtherPara29=decOtherPara();

                    state._fsp--;



                    			retval.name = (decFormalPara28!=null?decFormalPara28.name:null) + (decOtherPara29!=null?decOtherPara29.name:null);
                    			retval.paranum = (decFormalPara28!=null?decFormalPara28.paranum:0) + (decOtherPara29!=null?decOtherPara29.paranum:0);
                    			retval.paraType = (decFormalPara28!=null?decFormalPara28.paraType:null);
                    		

                    }
                    break;
                case 2 :
                    // src\\qsort.g:277:4: 
                    {

                    			retval.name = ""; 
                    			retval.paranum = retval.paranum + 0;
                    		

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decParameter"


    public static class decFormalPara_return extends ParserRuleReturnScope {
        public String name;
        public int paranum;
        public String paraType;
    };


    // $ANTLR start "decFormalPara"
    // src\\qsort.g:283:1: decFormalPara returns [String name, int paranum, String paraType] : type ID ;
    public final qsortParser.decFormalPara_return decFormalPara() throws RecognitionException {
        qsortParser.decFormalPara_return retval = new qsortParser.decFormalPara_return();
        retval.start = input.LT(1);


        Token ID30=null;
        String type31 =null;



        	retval.name = null;
        	retval.paranum = 0;
        	retval.paraType = null;

        try {
            // src\\qsort.g:289:2: ( type ID )
            // src\\qsort.g:289:4: type ID
            {
            pushFollow(FOLLOW_type_in_decFormalPara512);
            type31=type();

            state._fsp--;


            ID30=(Token)match(input,ID,FOLLOW_ID_in_decFormalPara514); 


            			retval.name = (ID30!=null?ID30.getText():null);
            			if(retval.name == null || retval.name == "")
            				retval.paranum = 0;
            			else
            				retval.paranum = 1;
            			retval.paraType = type31;
            		

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decFormalPara"


    public static class decOtherPara_return extends ParserRuleReturnScope {
        public String name;
        public int paranum;
        public String othername;
    };


    // $ANTLR start "decOtherPara"
    // src\\qsort.g:300:1: decOtherPara returns [String name, int paranum, String othername] : ( ',' decFormalPara a= decOtherPara |);
    public final qsortParser.decOtherPara_return decOtherPara() throws RecognitionException {
        qsortParser.decOtherPara_return retval = new qsortParser.decOtherPara_return();
        retval.start = input.LT(1);


        qsortParser.decOtherPara_return a =null;

        qsortParser.decFormalPara_return decFormalPara32 =null;



        	retval.name = null;
        	retval.paranum = 0;	
        	retval.othername = null;

        try {
            // src\\qsort.g:306:2: ( ',' decFormalPara a= decOtherPara |)
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // src\\qsort.g:306:4: ',' decFormalPara a= decOtherPara
                    {
                    match(input,21,FOLLOW_21_in_decOtherPara537); 

                    pushFollow(FOLLOW_decFormalPara_in_decOtherPara539);
                    decFormalPara32=decFormalPara();

                    state._fsp--;


                    pushFollow(FOLLOW_decOtherPara_in_decOtherPara543);
                    a=decOtherPara();

                    state._fsp--;



                    			retval.name = ", " + (decFormalPara32!=null?decFormalPara32.name:null) + (a!=null?a.name:null);
                    			retval.paranum = (decFormalPara32!=null?decFormalPara32.paranum:0) + (a!=null?a.paranum:0);
                    			retval.othername = (decFormalPara32!=null?decFormalPara32.name:null);
                    		

                    }
                    break;
                case 2 :
                    // src\\qsort.g:312:4: 
                    {

                    			retval.name = "";
                    			retval.paranum = retval.paranum + 0;
                    		

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decOtherPara"


    public static class functionImplement_return extends ParserRuleReturnScope {
        public String name;
        public String initial;
    };


    // $ANTLR start "functionImplement"
    // src\\qsort.g:318:1: functionImplement returns [String name, String initial] : block ;
    public final qsortParser.functionImplement_return functionImplement() throws RecognitionException {
        qsortParser.functionImplement_return retval = new qsortParser.functionImplement_return();
        retval.start = input.LT(1);


        String block33 =null;



        	retval.name = null;
        	retval.initial = null;

        try {
            // src\\qsort.g:323:2: ( block )
            // src\\qsort.g:323:4: block
            {
            pushFollow(FOLLOW_block_in_functionImplement571);
            block33=block();

            state._fsp--;


            retval.name = block33;
            		 retval.initial = block33;
            		

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionImplement"


    public static class decVariable_return extends ParserRuleReturnScope {
        public String name;
        public String variableName;
    };


    // $ANTLR start "decVariable"
    // src\\qsort.g:329:1: decVariable returns [String name, String variableName] : ID array decExpression ';' ;
    public final qsortParser.decVariable_return decVariable() throws RecognitionException {
        qsortParser.decVariable_return retval = new qsortParser.decVariable_return();
        retval.start = input.LT(1);


        Token ID34=null;
        String array35 =null;

        String decExpression36 =null;



        	retval.name = null;
        	retval.variableName = null;

        try {
            // src\\qsort.g:334:2: ( ID array decExpression ';' )
            // src\\qsort.g:334:4: ID array decExpression ';'
            {
            ID34=(Token)match(input,ID,FOLLOW_ID_in_decVariable594); 

            pushFollow(FOLLOW_array_in_decVariable596);
            array35=array();

            state._fsp--;


            pushFollow(FOLLOW_decExpression_in_decVariable598);
            decExpression36=decExpression();

            state._fsp--;


            match(input,28,FOLLOW_28_in_decVariable600); 


            			retval.name = (ID34!=null?ID34.getText():null) + array35 + decExpression36 + "";
            			retval.variableName = (ID34!=null?ID34.getText():null) + array35;
            		

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decVariable"



    // $ANTLR start "callFunction"
    // src\\qsort.g:341:1: callFunction returns [String name] : ( callName | ID '.' callName );
    public final String callFunction() throws RecognitionException {
        String name = null;


        Token ID38=null;
        qsortParser.callName_return callName37 =null;

        qsortParser.callName_return callName39 =null;



        	name = null;

        try {
            // src\\qsort.g:345:2: ( callName | ID '.' callName )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==14) ) {
                    alt9=1;
                }
                else if ( (LA9_1==25) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // src\\qsort.g:345:4: callName
                    {
                    pushFollow(FOLLOW_callName_in_callFunction623);
                    callName37=callName();

                    state._fsp--;


                    name = (callName37!=null?callName37.name:null);

                    }
                    break;
                case 2 :
                    // src\\qsort.g:347:4: ID '.' callName
                    {
                    ID38=(Token)match(input,ID,FOLLOW_ID_in_callFunction632); 

                    match(input,25,FOLLOW_25_in_callFunction634); 

                    pushFollow(FOLLOW_callName_in_callFunction636);
                    callName39=callName();

                    state._fsp--;



                    			name = (ID38!=null?ID38.getText():null) + "." + (callName39!=null?callName39.subname:null);
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "callFunction"


    public static class callName_return extends ParserRuleReturnScope {
        public String name;
        public String subname;
    };


    // $ANTLR start "callName"
    // src\\qsort.g:353:1: callName returns [String name, String subname] : ID '(' callParameter ')' ;
    public final qsortParser.callName_return callName() throws RecognitionException {
        qsortParser.callName_return retval = new qsortParser.callName_return();
        retval.start = input.LT(1);


        Token ID40=null;
        qsortParser.callParameter_return callParameter41 =null;



        	retval.name = null;
        	retval.subname = null;

        try {
            // src\\qsort.g:358:2: ( ID '(' callParameter ')' )
            // src\\qsort.g:358:4: ID '(' callParameter ')'
            {
            ID40=(Token)match(input,ID,FOLLOW_ID_in_callName659); 

            match(input,14,FOLLOW_14_in_callName661); 

            pushFollow(FOLLOW_callParameter_in_callName663);
            callParameter41=callParameter();

            state._fsp--;


            match(input,15,FOLLOW_15_in_callName665); 


            			int k  = FunctionName.indexOf((ID40!=null?ID40.getText():null));
            			int index = 0;
            			boolean isPub = true;
            			if ((k >= 0) && (FunctionType.get(k) == "int&"))
            			{
            				if(isPub)
            					retval.name = "var temp = " + (ID40!=null?ID40.getText():null) + "(" + (callParameter41!=null?callParameter41.name:null) + ");\n" + "\t"+ (callParameter41!=null?callParameter41.temp1:null) + "= temp[0];\n" + "\t" +(callParameter41!=null?callParameter41.temp2:null) + "= temp[1]";
            				else
            					retval.name = "var temp = " + (ID40!=null?ID40.getText():null) + "(" + (callParameter41!=null?callParameter41.name:null) + ");\n" + "\t"+ (callParameter41!=null?callParameter41.temp1:null) + "= temp[0];\n" + "\t" +(callParameter41!=null?callParameter41.temp2:null) + "= temp[1]";
            			}
            			else
            			{
            				if(isPub)
            				{
            					retval.name = "" + (ID40!=null?ID40.getText():null) + "(" + (callParameter41!=null?callParameter41.name:null) + ")";
            				}
            				else
            				{
            					retval.name = (ID40!=null?ID40.getText():null) +  "(" + (callParameter41!=null?callParameter41.name:null) + ")";
            				}
            				retval.subname = (ID40!=null?ID40.getText():null) +  "(" + (callParameter41!=null?callParameter41.name:null) + ")";
            			}
            		

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callName"


    public static class callNameInObject_return extends ParserRuleReturnScope {
        public String para;
        public String var;
        public int paranum;
    };


    // $ANTLR start "callNameInObject"
    // src\\qsort.g:385:1: callNameInObject returns [String para, String var, int paranum] : ID '(' callParameter ')' ;
    public final qsortParser.callNameInObject_return callNameInObject() throws RecognitionException {
        qsortParser.callNameInObject_return retval = new qsortParser.callNameInObject_return();
        retval.start = input.LT(1);


        Token ID43=null;
        qsortParser.callParameter_return callParameter42 =null;



        	retval.para = null;
        	retval.var = null;
        	retval.paranum = 0;

        try {
            // src\\qsort.g:391:2: ( ID '(' callParameter ')' )
            // src\\qsort.g:391:4: ID '(' callParameter ')'
            {
            ID43=(Token)match(input,ID,FOLLOW_ID_in_callNameInObject688); 

            match(input,14,FOLLOW_14_in_callNameInObject690); 

            pushFollow(FOLLOW_callParameter_in_callNameInObject692);
            callParameter42=callParameter();

            state._fsp--;


            match(input,15,FOLLOW_15_in_callNameInObject694); 


            			retval.para = "(" + (callParameter42!=null?callParameter42.name:null) + ")";
            		 	retval.var = (ID43!=null?ID43.getText():null);
            		 	retval.paranum = (callParameter42!=null?callParameter42.paranum:0);
            		

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callNameInObject"


    public static class callParameter_return extends ParserRuleReturnScope {
        public String name;
        public int paranum;
        public String temp1;
        public String temp2;
    };


    // $ANTLR start "callParameter"
    // src\\qsort.g:399:1: callParameter returns [String name, int paranum, String temp1, String temp2] : ( callFormalPara callOtherPara |);
    public final qsortParser.callParameter_return callParameter() throws RecognitionException {
        qsortParser.callParameter_return retval = new qsortParser.callParameter_return();
        retval.start = input.LT(1);


        qsortParser.callFormalPara_return callFormalPara44 =null;

        qsortParser.callOtherPara_return callOtherPara45 =null;



        	retval.name = null;
        	retval.paranum = 0;
        	retval.temp1 = null;
        	retval.temp2 = null;

        try {
            // src\\qsort.g:406:2: ( callFormalPara callOtherPara |)
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0 >= ID && LA10_0 <= INT)||LA10_0==9||LA10_0==14||LA10_0==22||LA10_0==47) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // src\\qsort.g:406:4: callFormalPara callOtherPara
                    {
                    pushFollow(FOLLOW_callFormalPara_in_callParameter719);
                    callFormalPara44=callFormalPara();

                    state._fsp--;


                    pushFollow(FOLLOW_callOtherPara_in_callParameter721);
                    callOtherPara45=callOtherPara();

                    state._fsp--;



                    			retval.name = (callFormalPara44!=null?callFormalPara44.name:null) + (callOtherPara45!=null?callOtherPara45.name:null);
                    			retval.paranum = (callFormalPara44!=null?callFormalPara44.paranum:0) + (callOtherPara45!=null?callOtherPara45.paranum:0);
                    			retval.temp1 = (callFormalPara44!=null?callFormalPara44.name:null);
                    			retval.temp2 = (callOtherPara45!=null?callOtherPara45.othername:null);
                    		

                    }
                    break;
                case 2 :
                    // src\\qsort.g:413:4: 
                    {

                    			retval.name = "";
                    			retval.paranum += 0;
                    		

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callParameter"


    public static class callFormalPara_return extends ParserRuleReturnScope {
        public String name;
        public int paranum;
    };


    // $ANTLR start "callFormalPara"
    // src\\qsort.g:419:1: callFormalPara returns [String name, int paranum] : exprvalue ;
    public final qsortParser.callFormalPara_return callFormalPara() throws RecognitionException {
        qsortParser.callFormalPara_return retval = new qsortParser.callFormalPara_return();
        retval.start = input.LT(1);


        String exprvalue46 =null;



        	retval.name = null;
        	retval.paranum = 0;

        try {
            // src\\qsort.g:424:2: ( exprvalue )
            // src\\qsort.g:424:4: exprvalue
            {
            pushFollow(FOLLOW_exprvalue_in_callFormalPara749);
            exprvalue46=exprvalue();

            state._fsp--;



            			retval.name = exprvalue46;
            			if(retval.name == "" || retval.name == null)
            				retval.paranum = 0;
            			else
            				retval.paranum = 1;
            		

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callFormalPara"


    public static class callOtherPara_return extends ParserRuleReturnScope {
        public String name;
        public int paranum;
        public String othername;
    };


    // $ANTLR start "callOtherPara"
    // src\\qsort.g:434:1: callOtherPara returns [String name, int paranum, String othername] : ( ',' callFormalPara a= callOtherPara |);
    public final qsortParser.callOtherPara_return callOtherPara() throws RecognitionException {
        qsortParser.callOtherPara_return retval = new qsortParser.callOtherPara_return();
        retval.start = input.LT(1);


        qsortParser.callOtherPara_return a =null;

        qsortParser.callFormalPara_return callFormalPara47 =null;



        	retval.name = null;
        	retval.paranum = 0;
        	retval.othername = null;

        try {
            // src\\qsort.g:440:2: ( ',' callFormalPara a= callOtherPara |)
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // src\\qsort.g:440:4: ',' callFormalPara a= callOtherPara
                    {
                    match(input,21,FOLLOW_21_in_callOtherPara772); 

                    pushFollow(FOLLOW_callFormalPara_in_callOtherPara774);
                    callFormalPara47=callFormalPara();

                    state._fsp--;


                    pushFollow(FOLLOW_callOtherPara_in_callOtherPara778);
                    a=callOtherPara();

                    state._fsp--;



                    			retval.name = ", " + (callFormalPara47!=null?callFormalPara47.name:null) + (a!=null?a.name:null);
                    			retval.paranum += (callFormalPara47!=null?callFormalPara47.paranum:0) + (a!=null?a.paranum:0);
                    			retval.othername = (callFormalPara47!=null?callFormalPara47.name:null);
                    		

                    }
                    break;
                case 2 :
                    // src\\qsort.g:446:4: 
                    {

                    			retval.name = "";
                    			retval.paranum += 0;
                    		

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callOtherPara"



    // $ANTLR start "array"
    // src\\qsort.g:452:1: array returns [String name] : ( '[' index ']' |);
    public final String array() throws RecognitionException {
        String name = null;


        String index48 =null;



        	name = null;

        try {
            // src\\qsort.g:456:2: ( '[' index ']' |)
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            else if ( ((LA12_0 >= 10 && LA12_0 <= 13)||(LA12_0 >= 15 && LA12_0 <= 24)||(LA12_0 >= 26 && LA12_0 <= 33)||(LA12_0 >= 35 && LA12_0 <= 37)||LA12_0==48) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // src\\qsort.g:456:4: '[' index ']'
                    {
                    match(input,34,FOLLOW_34_in_array806); 

                    pushFollow(FOLLOW_index_in_array808);
                    index48=index();

                    state._fsp--;


                    match(input,35,FOLLOW_35_in_array810); 

                    name = "[" + index48 + "]";
                    		 if(index48 == "")
                    			name = "";

                    }
                    break;
                case 2 :
                    // src\\qsort.g:460:4: 
                    {
                    name = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "array"



    // $ANTLR start "index"
    // src\\qsort.g:463:1: index returns [String name] : ( exprvalue |);
    public final String index() throws RecognitionException {
        String name = null;


        String exprvalue49 =null;



        	name = null;

        try {
            // src\\qsort.g:467:2: ( exprvalue |)
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= ID && LA13_0 <= INT)||LA13_0==9||LA13_0==14||LA13_0==22||LA13_0==47) ) {
                alt13=1;
            }
            else if ( (LA13_0==35) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // src\\qsort.g:467:4: exprvalue
                    {
                    pushFollow(FOLLOW_exprvalue_in_index838);
                    exprvalue49=exprvalue();

                    state._fsp--;


                    name = exprvalue49;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:469:4: 
                    {
                    name = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "index"



    // $ANTLR start "semiColon"
    // src\\qsort.g:473:1: semiColon returns [String name] : ( ';' |);
    public final String semiColon() throws RecognitionException {
        String name = null;



        	name = null;

        try {
            // src\\qsort.g:477:2: ( ';' |)
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||LA14_0==COMMENT||LA14_0==LINE_COMMENT||LA14_0==38||(LA14_0 >= 41 && LA14_0 <= 43)||LA14_0==45) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // src\\qsort.g:477:4: ';'
                    {
                    match(input,28,FOLLOW_28_in_semiColon867); 

                    name = "";

                    }
                    break;
                case 2 :
                    // src\\qsort.g:479:4: 
                    {
                    name = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "semiColon"



    // $ANTLR start "decExpression"
    // src\\qsort.g:482:1: decExpression returns [String name] : ( '=' exprvalue |);
    public final String decExpression() throws RecognitionException {
        String name = null;


        String exprvalue50 =null;



        	name = null;

        try {
            // src\\qsort.g:486:2: ( '=' exprvalue |)
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // src\\qsort.g:486:4: '=' exprvalue
                    {
                    match(input,31,FOLLOW_31_in_decExpression895); 

                    pushFollow(FOLLOW_exprvalue_in_decExpression897);
                    exprvalue50=exprvalue();

                    state._fsp--;


                    name = " = " + exprvalue50;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:488:4: 
                    {
                    name = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "decExpression"



    // $ANTLR start "exprvalue"
    // src\\qsort.g:491:1: exprvalue returns [String name] : ( expr | '!' expr | '-' expr | '{' INT ints '}' );
    public final String exprvalue() throws RecognitionException {
        String name = null;


        Token INT54=null;
        String expr51 =null;

        String expr52 =null;

        String expr53 =null;

        String ints55 =null;



        	name = null;

        try {
            // src\\qsort.g:495:2: ( expr | '!' expr | '-' expr | '{' INT ints '}' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case 14:
                {
                alt16=1;
                }
                break;
            case 9:
                {
                alt16=2;
                }
                break;
            case 22:
                {
                alt16=3;
                }
                break;
            case 47:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // src\\qsort.g:495:4: expr
                    {
                    pushFollow(FOLLOW_expr_in_exprvalue925);
                    expr51=expr();

                    state._fsp--;


                    name = expr51;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:497:4: '!' expr
                    {
                    match(input,9,FOLLOW_9_in_exprvalue934); 

                    pushFollow(FOLLOW_expr_in_exprvalue936);
                    expr52=expr();

                    state._fsp--;


                    name = "!" + expr52;

                    }
                    break;
                case 3 :
                    // src\\qsort.g:499:4: '-' expr
                    {
                    match(input,22,FOLLOW_22_in_exprvalue945); 

                    pushFollow(FOLLOW_expr_in_exprvalue947);
                    expr53=expr();

                    state._fsp--;


                    name = "-" + expr53;

                    }
                    break;
                case 4 :
                    // src\\qsort.g:501:4: '{' INT ints '}'
                    {
                    match(input,47,FOLLOW_47_in_exprvalue956); 

                    INT54=(Token)match(input,INT,FOLLOW_INT_in_exprvalue958); 

                    pushFollow(FOLLOW_ints_in_exprvalue960);
                    ints55=ints();

                    state._fsp--;


                    match(input,49,FOLLOW_49_in_exprvalue962); 

                    name = "[" + (INT54!=null?INT54.getText():null) + ints55 + "]";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "exprvalue"



    // $ANTLR start "expr"
    // src\\qsort.g:505:1: expr returns [String name] : formalOperation otherOperation ;
    public final String expr() throws RecognitionException {
        String name = null;


        String formalOperation56 =null;

        String otherOperation57 =null;



        	name = null;

        try {
            // src\\qsort.g:509:2: ( formalOperation otherOperation )
            // src\\qsort.g:509:4: formalOperation otherOperation
            {
            pushFollow(FOLLOW_formalOperation_in_expr985);
            formalOperation56=formalOperation();

            state._fsp--;


            pushFollow(FOLLOW_otherOperation_in_expr987);
            otherOperation57=otherOperation();

            state._fsp--;


            name = formalOperation56 + otherOperation57;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "expr"



    // $ANTLR start "formalOperation"
    // src\\qsort.g:513:1: formalOperation returns [String name] : ( ID array | INT | '(' expr ')' | callFunction | object );
    public final String formalOperation() throws RecognitionException {
        String name = null;


        Token ID58=null;
        Token INT60=null;
        String array59 =null;

        String expr61 =null;

        String callFunction62 =null;

        String object63 =null;



        	name = null;

        try {
            // src\\qsort.g:517:2: ( ID array | INT | '(' expr ')' | callFunction | object )
            int alt17=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    alt17=4;
                    }
                    break;
                case 25:
                    {
                    int LA17_5 = input.LA(3);

                    if ( (LA17_5==ID) ) {
                        int LA17_7 = input.LA(4);

                        if ( (LA17_7==14) ) {
                            alt17=4;
                        }
                        else if ( ((LA17_7 >= 10 && LA17_7 <= 13)||(LA17_7 >= 15 && LA17_7 <= 24)||(LA17_7 >= 26 && LA17_7 <= 33)||(LA17_7 >= 35 && LA17_7 <= 37)||LA17_7==48) ) {
                            alt17=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 7, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 48:
                    {
                    alt17=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt17=2;
                }
                break;
            case 14:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // src\\qsort.g:517:4: ID array
                    {
                    ID58=(Token)match(input,ID,FOLLOW_ID_in_formalOperation1010); 

                    pushFollow(FOLLOW_array_in_formalOperation1012);
                    array59=array();

                    state._fsp--;


                    name = (ID58!=null?ID58.getText():null) + array59;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:519:4: INT
                    {
                    INT60=(Token)match(input,INT,FOLLOW_INT_in_formalOperation1021); 

                    name = (INT60!=null?INT60.getText():null);

                    }
                    break;
                case 3 :
                    // src\\qsort.g:521:4: '(' expr ')'
                    {
                    match(input,14,FOLLOW_14_in_formalOperation1030); 

                    pushFollow(FOLLOW_expr_in_formalOperation1032);
                    expr61=expr();

                    state._fsp--;


                    match(input,15,FOLLOW_15_in_formalOperation1034); 

                    name = "(" + expr61 + ")";

                    }
                    break;
                case 4 :
                    // src\\qsort.g:523:4: callFunction
                    {
                    pushFollow(FOLLOW_callFunction_in_formalOperation1043);
                    callFunction62=callFunction();

                    state._fsp--;


                    name = callFunction62;

                    }
                    break;
                case 5 :
                    // src\\qsort.g:525:4: object
                    {
                    pushFollow(FOLLOW_object_in_formalOperation1052);
                    object63=object();

                    state._fsp--;


                    name = object63;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "formalOperation"



    // $ANTLR start "otherOperation"
    // src\\qsort.g:529:1: otherOperation returns [String name] : ( operator formalOperation a= otherOperation | singleOperator |);
    public final String otherOperation() throws RecognitionException {
        String name = null;


        String a =null;

        String operator64 =null;

        String formalOperation65 =null;

        String singleOperator66 =null;



        	name = null;

        try {
            // src\\qsort.g:533:2: ( operator formalOperation a= otherOperation | singleOperator |)
            int alt18=3;
            switch ( input.LA(1) ) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 36:
            case 37:
            case 48:
                {
                alt18=1;
                }
                break;
            case 19:
            case 23:
                {
                alt18=2;
                }
                break;
            case 15:
            case 21:
            case 28:
            case 35:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // src\\qsort.g:533:4: operator formalOperation a= otherOperation
                    {
                    pushFollow(FOLLOW_operator_in_otherOperation1075);
                    operator64=operator();

                    state._fsp--;


                    pushFollow(FOLLOW_formalOperation_in_otherOperation1077);
                    formalOperation65=formalOperation();

                    state._fsp--;


                    pushFollow(FOLLOW_otherOperation_in_otherOperation1081);
                    a=otherOperation();

                    state._fsp--;


                    name = operator64 + formalOperation65 + a;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:535:4: singleOperator
                    {
                    pushFollow(FOLLOW_singleOperator_in_otherOperation1090);
                    singleOperator66=singleOperator();

                    state._fsp--;


                    name = singleOperator66;

                    }
                    break;
                case 3 :
                    // src\\qsort.g:537:4: 
                    {
                    name = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "otherOperation"



    // $ANTLR start "object"
    // src\\qsort.g:540:1: object returns [String name] : a= ID '.' b= ID ;
    public final String object() throws RecognitionException {
        String name = null;


        Token a=null;
        Token b=null;


        	name = null;

        try {
            // src\\qsort.g:544:2: (a= ID '.' b= ID )
            // src\\qsort.g:544:4: a= ID '.' b= ID
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_object1120); 

            match(input,25,FOLLOW_25_in_object1122); 

            b=(Token)match(input,ID,FOLLOW_ID_in_object1126); 

            name = (a!=null?a.getText():null) + "." + (b!=null?b.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "object"



    // $ANTLR start "returnSentence"
    // src\\qsort.g:548:1: returnSentence returns [String name] : ( exprvalue |);
    public final String returnSentence() throws RecognitionException {
        String name = null;


        String exprvalue67 =null;



        	name = null;

        try {
            // src\\qsort.g:552:2: ( exprvalue |)
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0 >= ID && LA19_0 <= INT)||LA19_0==9||LA19_0==14||LA19_0==22||LA19_0==47) ) {
                alt19=1;
            }
            else if ( (LA19_0==28) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // src\\qsort.g:552:4: exprvalue
                    {
                    pushFollow(FOLLOW_exprvalue_in_returnSentence1149);
                    exprvalue67=exprvalue();

                    state._fsp--;


                    name = exprvalue67;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:554:4: 
                    {
                    name = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "returnSentence"



    // $ANTLR start "normalExp"
    // src\\qsort.g:557:1: normalExp returns [String name] : normalGiveValue otherOperation ;
    public final String normalExp() throws RecognitionException {
        String name = null;


        String normalGiveValue68 =null;

        String otherOperation69 =null;



        	name = null;

        try {
            // src\\qsort.g:561:2: ( normalGiveValue otherOperation )
            // src\\qsort.g:561:4: normalGiveValue otherOperation
            {
            pushFollow(FOLLOW_normalGiveValue_in_normalExp1177);
            normalGiveValue68=normalGiveValue();

            state._fsp--;


            pushFollow(FOLLOW_otherOperation_in_normalExp1179);
            otherOperation69=otherOperation();

            state._fsp--;


            name = normalGiveValue68 + otherOperation69;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "normalExp"



    // $ANTLR start "normalGiveValue"
    // src\\qsort.g:565:1: normalGiveValue returns [String name] : ( ID array | object );
    public final String normalGiveValue() throws RecognitionException {
        String name = null;


        Token ID70=null;
        String array71 =null;

        String object72 =null;



        	name = null;

        try {
            // src\\qsort.g:569:2: ( ID array | object )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==25) ) {
                    alt20=2;
                }
                else if ( ((LA20_1 >= 10 && LA20_1 <= 13)||(LA20_1 >= 16 && LA20_1 <= 20)||(LA20_1 >= 22 && LA20_1 <= 24)||(LA20_1 >= 26 && LA20_1 <= 34)||(LA20_1 >= 36 && LA20_1 <= 37)||LA20_1==48) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // src\\qsort.g:569:4: ID array
                    {
                    ID70=(Token)match(input,ID,FOLLOW_ID_in_normalGiveValue1202); 

                    pushFollow(FOLLOW_array_in_normalGiveValue1204);
                    array71=array();

                    state._fsp--;


                    name = (ID70!=null?ID70.getText():null) + array71;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:571:4: object
                    {
                    pushFollow(FOLLOW_object_in_normalGiveValue1213);
                    object72=object();

                    state._fsp--;


                    name = object72;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "normalGiveValue"



    // $ANTLR start "operator"
    // src\\qsort.g:576:1: operator returns [String name] : ( '+' | '-' | '*' | '/' | '^' | '&' | '&&' | '||' | '+=' | '-=' | '*=' | '/=' | '^=' | '&=' | '=' | '>' | '>=' | '<' | '<=' | '!=' );
    public final String operator() throws RecognitionException {
        String name = null;



        	name = null;

        try {
            // src\\qsort.g:580:2: ( '+' | '-' | '*' | '/' | '^' | '&' | '&&' | '||' | '+=' | '-=' | '*=' | '/=' | '^=' | '&=' | '=' | '>' | '>=' | '<' | '<=' | '!=' )
            int alt21=20;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt21=1;
                }
                break;
            case 22:
                {
                alt21=2;
                }
                break;
            case 16:
                {
                alt21=3;
                }
                break;
            case 26:
                {
                alt21=4;
                }
                break;
            case 36:
                {
                alt21=5;
                }
                break;
            case 12:
                {
                alt21=6;
                }
                break;
            case 11:
                {
                alt21=7;
                }
                break;
            case 48:
                {
                alt21=8;
                }
                break;
            case 20:
                {
                alt21=9;
                }
                break;
            case 24:
                {
                alt21=10;
                }
                break;
            case 17:
                {
                alt21=11;
                }
                break;
            case 27:
                {
                alt21=12;
                }
                break;
            case 37:
                {
                alt21=13;
                }
                break;
            case 13:
                {
                alt21=14;
                }
                break;
            case 31:
                {
                alt21=15;
                }
                break;
            case 32:
                {
                alt21=16;
                }
                break;
            case 33:
                {
                alt21=17;
                }
                break;
            case 29:
                {
                alt21=18;
                }
                break;
            case 30:
                {
                alt21=19;
                }
                break;
            case 10:
                {
                alt21=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // src\\qsort.g:580:4: '+'
                    {
                    match(input,18,FOLLOW_18_in_operator1237); 

                    name = " + ";

                    }
                    break;
                case 2 :
                    // src\\qsort.g:582:4: '-'
                    {
                    match(input,22,FOLLOW_22_in_operator1246); 

                    name = " - ";

                    }
                    break;
                case 3 :
                    // src\\qsort.g:584:4: '*'
                    {
                    match(input,16,FOLLOW_16_in_operator1255); 

                    name = " * ";

                    }
                    break;
                case 4 :
                    // src\\qsort.g:586:4: '/'
                    {
                    match(input,26,FOLLOW_26_in_operator1264); 

                    name = " / ";

                    }
                    break;
                case 5 :
                    // src\\qsort.g:590:4: '^'
                    {
                    match(input,36,FOLLOW_36_in_operator1277); 

                    name = " ^ ";

                    }
                    break;
                case 6 :
                    // src\\qsort.g:592:4: '&'
                    {
                    match(input,12,FOLLOW_12_in_operator1286); 

                    name = " & ";

                    }
                    break;
                case 7 :
                    // src\\qsort.g:594:4: '&&'
                    {
                    match(input,11,FOLLOW_11_in_operator1295); 

                    name = " and ";

                    }
                    break;
                case 8 :
                    // src\\qsort.g:596:4: '||'
                    {
                    match(input,48,FOLLOW_48_in_operator1304); 

                    name = " or ";

                    }
                    break;
                case 9 :
                    // src\\qsort.g:598:4: '+='
                    {
                    match(input,20,FOLLOW_20_in_operator1313); 

                    name = " += ";

                    }
                    break;
                case 10 :
                    // src\\qsort.g:600:4: '-='
                    {
                    match(input,24,FOLLOW_24_in_operator1322); 

                    name = " -= ";

                    }
                    break;
                case 11 :
                    // src\\qsort.g:602:4: '*='
                    {
                    match(input,17,FOLLOW_17_in_operator1331); 

                    name = " *= ";

                    }
                    break;
                case 12 :
                    // src\\qsort.g:604:4: '/='
                    {
                    match(input,27,FOLLOW_27_in_operator1340); 

                    name = " /= ";

                    }
                    break;
                case 13 :
                    // src\\qsort.g:608:4: '^='
                    {
                    match(input,37,FOLLOW_37_in_operator1353); 

                    name = " ^= ";

                    }
                    break;
                case 14 :
                    // src\\qsort.g:610:4: '&='
                    {
                    match(input,13,FOLLOW_13_in_operator1362); 

                    name = " &= ";

                    }
                    break;
                case 15 :
                    // src\\qsort.g:612:4: '='
                    {
                    match(input,31,FOLLOW_31_in_operator1371); 

                    name = " = ";

                    }
                    break;
                case 16 :
                    // src\\qsort.g:614:4: '>'
                    {
                    match(input,32,FOLLOW_32_in_operator1380); 

                    name = " > ";

                    }
                    break;
                case 17 :
                    // src\\qsort.g:616:4: '>='
                    {
                    match(input,33,FOLLOW_33_in_operator1389); 

                    name = " >= ";

                    }
                    break;
                case 18 :
                    // src\\qsort.g:618:4: '<'
                    {
                    match(input,29,FOLLOW_29_in_operator1398); 

                    name = " < ";

                    }
                    break;
                case 19 :
                    // src\\qsort.g:620:4: '<='
                    {
                    match(input,30,FOLLOW_30_in_operator1407); 

                    name = " <= ";

                    }
                    break;
                case 20 :
                    // src\\qsort.g:622:4: '!='
                    {
                    match(input,10,FOLLOW_10_in_operator1416); 

                    name = " != ";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "operator"



    // $ANTLR start "singleOperator"
    // src\\qsort.g:626:1: singleOperator returns [String name] : ( '++' | '--' );
    public final String singleOperator() throws RecognitionException {
        String name = null;



        	name = null;

        try {
            // src\\qsort.g:630:2: ( '++' | '--' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            else if ( (LA22_0==23) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // src\\qsort.g:630:4: '++'
                    {
                    match(input,19,FOLLOW_19_in_singleOperator1439); 

                    name = "+= 1";

                    }
                    break;
                case 2 :
                    // src\\qsort.g:632:4: '--'
                    {
                    match(input,23,FOLLOW_23_in_singleOperator1448); 

                    name = "-= 1";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "singleOperator"



    // $ANTLR start "ints"
    // src\\qsort.g:636:1: ints returns [String name] : ( ',' INT a= ints |);
    public final String ints() throws RecognitionException {
        String name = null;


        Token INT73=null;
        String a =null;



        	name = null;

        try {
            // src\\qsort.g:640:5: ( ',' INT a= ints |)
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            else if ( (LA23_0==49) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // src\\qsort.g:640:9: ',' INT a= ints
                    {
                    match(input,21,FOLLOW_21_in_ints1476); 

                    INT73=(Token)match(input,INT,FOLLOW_INT_in_ints1478); 

                    pushFollow(FOLLOW_ints_in_ints1484);
                    a=ints();

                    state._fsp--;


                    name = ", " + (INT73!=null?INT73.getText():null) + a;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:642:7: 
                    {
                    name = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "ints"



    // $ANTLR start "type"
    // src\\qsort.g:646:1: type returns [String name] : ( 'int' | 'char' | 'void' | 'int*' | 'int&' );
    public final String type() throws RecognitionException {
        String name = null;



        	name = null;

        try {
            // src\\qsort.g:650:2: ( 'int' | 'char' | 'void' | 'int*' | 'int&' )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            case 45:
                {
                alt24=3;
                }
                break;
            case 43:
                {
                alt24=4;
                }
                break;
            case 41:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // src\\qsort.g:650:4: 'int'
                    {
                    match(input,42,FOLLOW_42_in_type1520); 

                    name = "";

                    }
                    break;
                case 2 :
                    // src\\qsort.g:652:4: 'char'
                    {
                    match(input,38,FOLLOW_38_in_type1529); 

                    name = "";

                    }
                    break;
                case 3 :
                    // src\\qsort.g:654:4: 'void'
                    {
                    match(input,45,FOLLOW_45_in_type1538); 

                    name = "";

                    }
                    break;
                case 4 :
                    // src\\qsort.g:656:4: 'int*'
                    {
                    match(input,43,FOLLOW_43_in_type1547); 

                    name = "";

                    }
                    break;
                case 5 :
                    // src\\qsort.g:658:4: 'int&'
                    {
                    match(input,41,FOLLOW_41_in_type1556); 

                    name = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_in_program16 = new BitSet(new long[]{0x00002E4000000090L});
    public static final BitSet FOLLOW_declarations_in_program18 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations43 = new BitSet(new long[]{0x00002E4000000090L});
    public static final BitSet FOLLOW_declarations_in_declarations47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration83 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_functionVariable_in_declaration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_COMMENT_in_declaration94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_declaration104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifPart_in_ieStat129 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_elsePart_in_ieStat131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ifPart154 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ifPart156 = new BitSet(new long[]{0x0000800000404260L});
    public static final BitSet FOLLOW_exprvalue_in_ifPart158 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ifPart160 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ifPart162 = new BitSet(new long[]{0x00027F40000000B0L});
    public static final BitSet FOLLOW_block_in_ifPart164 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ifPart166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_elsePart190 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_elsePart192 = new BitSet(new long[]{0x00027F40000000B0L});
    public static final BitSet FOLLOW_block_in_elsePart194 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_elsePart196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_whileStat225 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_whileStat227 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_expr_in_whileStat229 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_whileStat231 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_whileStat233 = new BitSet(new long[]{0x00027F40000000B0L});
    public static final BitSet FOLLOW_block_in_whileStat235 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_whileStat237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_block260 = new BitSet(new long[]{0x00007F40000000B0L});
    public static final BitSet FOLLOW_block_in_block264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_stat292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_decVariable_in_stat294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ieStat_in_stat303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_stat312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callFunction_in_stat321 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_stat323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_stat332 = new BitSet(new long[]{0x0000800010404260L});
    public static final BitSet FOLLOW_returnSentence_in_stat334 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_stat336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalExp_in_stat345 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_stat347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_COMMENT_in_stat356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_stat365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decFunction_in_functionVariable389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decVariable_in_functionVariable398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decFunctionName_in_decFunction421 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_decFunction423 = new BitSet(new long[]{0x00007F40000000B0L});
    public static final BitSet FOLLOW_functionImplement_in_decFunction425 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_decFunction427 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_semiColon_in_decFunction429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decFunctionName452 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_decFunctionName454 = new BitSet(new long[]{0x00002E4000008000L});
    public static final BitSet FOLLOW_decParameter_in_decFunctionName456 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_decFunctionName458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decFormalPara_in_decParameter481 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_decOtherPara_in_decParameter483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_decFormalPara512 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_decFormalPara514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_decOtherPara537 = new BitSet(new long[]{0x00002E4000000000L});
    public static final BitSet FOLLOW_decFormalPara_in_decOtherPara539 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_decOtherPara_in_decOtherPara543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_functionImplement571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decVariable594 = new BitSet(new long[]{0x0000000490000000L});
    public static final BitSet FOLLOW_array_in_decVariable596 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_decExpression_in_decVariable598 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_decVariable600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callName_in_callFunction623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callFunction632 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_callFunction634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_callName_in_callFunction636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callName659 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callName661 = new BitSet(new long[]{0x000080000040C260L});
    public static final BitSet FOLLOW_callParameter_in_callName663 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_callName665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callNameInObject688 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callNameInObject690 = new BitSet(new long[]{0x000080000040C260L});
    public static final BitSet FOLLOW_callParameter_in_callNameInObject692 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_callNameInObject694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callFormalPara_in_callParameter719 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_callOtherPara_in_callParameter721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprvalue_in_callFormalPara749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_callOtherPara772 = new BitSet(new long[]{0x0000800000404260L});
    public static final BitSet FOLLOW_callFormalPara_in_callOtherPara774 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_callOtherPara_in_callOtherPara778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_array806 = new BitSet(new long[]{0x0000800800404260L});
    public static final BitSet FOLLOW_index_in_array808 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_array810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprvalue_in_index838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_semiColon867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_decExpression895 = new BitSet(new long[]{0x0000800000404260L});
    public static final BitSet FOLLOW_exprvalue_in_decExpression897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprvalue925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_exprvalue934 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_expr_in_exprvalue936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_exprvalue945 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_expr_in_exprvalue947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_exprvalue956 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_exprvalue958 = new BitSet(new long[]{0x0002000000200000L});
    public static final BitSet FOLLOW_ints_in_exprvalue960 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprvalue962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalOperation_in_expr985 = new BitSet(new long[]{0x00010033EDDF3C00L});
    public static final BitSet FOLLOW_otherOperation_in_expr987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_formalOperation1010 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_array_in_formalOperation1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_formalOperation1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_formalOperation1030 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_expr_in_formalOperation1032 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_formalOperation1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callFunction_in_formalOperation1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_formalOperation1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_in_otherOperation1075 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_formalOperation_in_otherOperation1077 = new BitSet(new long[]{0x00010033EDDF3C00L});
    public static final BitSet FOLLOW_otherOperation_in_otherOperation1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleOperator_in_otherOperation1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object1120 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_object1122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_object1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprvalue_in_returnSentence1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalGiveValue_in_normalExp1177 = new BitSet(new long[]{0x00010033EDDF3C00L});
    public static final BitSet FOLLOW_otherOperation_in_normalExp1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_normalGiveValue1202 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_array_in_normalGiveValue1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_normalGiveValue1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_operator1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_operator1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_operator1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_operator1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_operator1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_operator1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_operator1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_operator1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_operator1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_operator1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_operator1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_operator1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_operator1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_operator1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_operator1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_operator1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_operator1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_operator1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_operator1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_operator1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_singleOperator1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_singleOperator1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ints1476 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_ints1478 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ints_in_ints1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_type1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_type1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_type1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_type1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_type1556 = new BitSet(new long[]{0x0000000000000002L});

}