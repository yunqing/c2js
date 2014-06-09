// $ANTLR 3.4 src\\qsort.g 2014-06-09 18:34:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class qsortParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "LINE_COMMENT", "WS", "'!'", "'!='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'.'", "'/'", "'/='", "';'", "'<'", "'<='", "'='", "'>'", "'>='", "'['", "']'", "'^'", "'^='", "'char'", "'else'", "'for'", "'if'", "'int&'", "'int'", "'int*'", "'return'", "'void'", "'while'", "'{'", "'||'", "'}'"
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
    public static final int T__50=50;
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

            if ( (LA1_0==COMMENT||LA1_0==LINE_COMMENT||LA1_0==38||(LA1_0 >= 42 && LA1_0 <= 44)||LA1_0==46) ) {
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
            case 42:
            case 43:
            case 44:
            case 46:
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
            match(input,41,FOLLOW_41_in_ifPart154); 

            match(input,14,FOLLOW_14_in_ifPart156); 

            pushFollow(FOLLOW_exprvalue_in_ifPart158);
            exprvalue8=exprvalue();

            state._fsp--;


            match(input,15,FOLLOW_15_in_ifPart160); 

            match(input,48,FOLLOW_48_in_ifPart162); 

            pushFollow(FOLLOW_block_in_ifPart164);
            block9=block();

            state._fsp--;


            match(input,50,FOLLOW_50_in_ifPart166); 

            name = "if(" + exprvalue8 + ") {" + "\n" + "\t" +  block9 + "\t" + "}";

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
            else if ( ((LA3_0 >= COMMENT && LA3_0 <= ID)||LA3_0==LINE_COMMENT||LA3_0==38||(LA3_0 >= 40 && LA3_0 <= 47)||LA3_0==50) ) {
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

                    match(input,48,FOLLOW_48_in_elsePart192); 

                    pushFollow(FOLLOW_block_in_elsePart194);
                    block10=block();

                    state._fsp--;


                    match(input,50,FOLLOW_50_in_elsePart196); 

                    name = "else{\n" + block10 + "\n}";

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



    // $ANTLR start "forStat"
    // src\\qsort.g:127:1: forStat returns [String name] : 'for' '(' forPara ';' expr ';' normalExp ')' '{' block '}' ;
    public final String forStat() throws RecognitionException {
        String name = null;


        String forPara11 =null;

        String expr12 =null;

        String normalExp13 =null;

        String block14 =null;



        	name = null;

        try {
            // src\\qsort.g:131:2: ( 'for' '(' forPara ';' expr ';' normalExp ')' '{' block '}' )
            // src\\qsort.g:131:4: 'for' '(' forPara ';' expr ';' normalExp ')' '{' block '}'
            {
            match(input,40,FOLLOW_40_in_forStat224); 

            match(input,14,FOLLOW_14_in_forStat226); 

            pushFollow(FOLLOW_forPara_in_forStat228);
            forPara11=forPara();

            state._fsp--;


            match(input,28,FOLLOW_28_in_forStat230); 

            pushFollow(FOLLOW_expr_in_forStat232);
            expr12=expr();

            state._fsp--;


            match(input,28,FOLLOW_28_in_forStat234); 

            pushFollow(FOLLOW_normalExp_in_forStat236);
            normalExp13=normalExp();

            state._fsp--;


            match(input,15,FOLLOW_15_in_forStat238); 

            match(input,48,FOLLOW_48_in_forStat240); 

            pushFollow(FOLLOW_block_in_forStat242);
            block14=block();

            state._fsp--;


            match(input,50,FOLLOW_50_in_forStat244); 


            			
            			name = "for(" + forPara11 + "; " + expr12 + "; " + normalExp13 + ") {\n" + "\t" + block14 +  "\t" + "}";
            			
            		

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
    // $ANTLR end "forStat"



    // $ANTLR start "forPara"
    // src\\qsort.g:139:1: forPara returns [String name] : ( decExpression | normalExp | type normalExp );
    public final String forPara() throws RecognitionException {
        String name = null;


        String decExpression15 =null;

        String normalExp16 =null;

        String type17 =null;

        String normalExp18 =null;



        	name = null;

        try {
            // src\\qsort.g:143:2: ( decExpression | normalExp | type normalExp )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 28:
            case 31:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                alt4=2;
                }
                break;
            case 38:
            case 42:
            case 43:
            case 44:
            case 46:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // src\\qsort.g:143:4: decExpression
                    {
                    pushFollow(FOLLOW_decExpression_in_forPara267);
                    decExpression15=decExpression();

                    state._fsp--;


                    name = decExpression15;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:145:4: normalExp
                    {
                    pushFollow(FOLLOW_normalExp_in_forPara276);
                    normalExp16=normalExp();

                    state._fsp--;


                    name = normalExp16;

                    }
                    break;
                case 3 :
                    // src\\qsort.g:147:4: type normalExp
                    {
                    pushFollow(FOLLOW_type_in_forPara285);
                    type17=type();

                    state._fsp--;


                    pushFollow(FOLLOW_normalExp_in_forPara287);
                    normalExp18=normalExp();

                    state._fsp--;



                    			name = type17 + " " + normalExp18;
                    		

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
    // $ANTLR end "forPara"



    // $ANTLR start "whileStat"
    // src\\qsort.g:153:1: whileStat returns [String name] : 'while' '(' expr ')' '{' block '}' ;
    public final String whileStat() throws RecognitionException {
        String name = null;


        String expr19 =null;

        String block20 =null;



        	name = null;

        try {
            // src\\qsort.g:157:2: ( 'while' '(' expr ')' '{' block '}' )
            // src\\qsort.g:157:4: 'while' '(' expr ')' '{' block '}'
            {
            match(input,47,FOLLOW_47_in_whileStat310); 

            match(input,14,FOLLOW_14_in_whileStat312); 

            pushFollow(FOLLOW_expr_in_whileStat314);
            expr19=expr();

            state._fsp--;


            match(input,15,FOLLOW_15_in_whileStat316); 

            match(input,48,FOLLOW_48_in_whileStat318); 

            pushFollow(FOLLOW_block_in_whileStat320);
            block20=block();

            state._fsp--;


            match(input,50,FOLLOW_50_in_whileStat322); 


            			
            			name = "while(" + expr19 + ") {\n" + "\t"  + block20 + "\t" + "}";
            			
            		

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
    // src\\qsort.g:165:1: block returns [String name] : ( stat a= block |);
    public final String block() throws RecognitionException {
        String name = null;


        String a =null;

        String stat21 =null;



        	name = null;

        try {
            // src\\qsort.g:169:2: ( stat a= block |)
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= COMMENT && LA5_0 <= ID)||LA5_0==LINE_COMMENT||LA5_0==38||(LA5_0 >= 40 && LA5_0 <= 47)) ) {
                alt5=1;
            }
            else if ( (LA5_0==50) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // src\\qsort.g:169:4: stat a= block
                    {
                    pushFollow(FOLLOW_stat_in_block345);
                    stat21=stat();

                    state._fsp--;


                    pushFollow(FOLLOW_block_in_block349);
                    a=block();

                    state._fsp--;


                    name = stat21 + a;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:171:4: 
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
    // src\\qsort.g:176:1: stat returns [String name] : ( type decVariable | ieStat | forStat | whileStat | callFunction ';' | 'return' returnSentence ';' | normalExp ';' | LINE_COMMENT | COMMENT );
    public final String stat() throws RecognitionException {
        String name = null;


        String type22 =null;

        qsortParser.decVariable_return decVariable23 =null;

        String ieStat24 =null;

        String forStat25 =null;

        String whileStat26 =null;

        String callFunction27 =null;

        String returnSentence28 =null;

        String normalExp29 =null;



        	name = null;

        try {
            // src\\qsort.g:180:2: ( type decVariable | ieStat | forStat | whileStat | callFunction ';' | 'return' returnSentence ';' | normalExp ';' | LINE_COMMENT | COMMENT )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 38:
            case 42:
            case 43:
            case 44:
            case 46:
                {
                alt6=1;
                }
                break;
            case 41:
                {
                alt6=2;
                }
                break;
            case 40:
                {
                alt6=3;
                }
                break;
            case 47:
                {
                alt6=4;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    alt6=5;
                    }
                    break;
                case 25:
                    {
                    int LA6_10 = input.LA(3);

                    if ( (LA6_10==ID) ) {
                        int LA6_12 = input.LA(4);

                        if ( (LA6_12==14) ) {
                            alt6=5;
                        }
                        else if ( ((LA6_12 >= 10 && LA6_12 <= 13)||(LA6_12 >= 16 && LA6_12 <= 20)||(LA6_12 >= 22 && LA6_12 <= 24)||(LA6_12 >= 26 && LA6_12 <= 33)||(LA6_12 >= 36 && LA6_12 <= 37)||LA6_12==49) ) {
                            alt6=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 12, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 10, input);

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
                case 49:
                    {
                    alt6=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;

                }

                }
                break;
            case 45:
                {
                alt6=6;
                }
                break;
            case LINE_COMMENT:
                {
                alt6=8;
                }
                break;
            case COMMENT:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // src\\qsort.g:180:4: type decVariable
                    {
                    pushFollow(FOLLOW_type_in_stat377);
                    type22=type();

                    state._fsp--;


                    pushFollow(FOLLOW_decVariable_in_stat379);
                    decVariable23=decVariable();

                    state._fsp--;



                    			name = "\t" + type22 + " " + (decVariable23!=null?decVariable23.name:null) + "\n";
                    			CurVariable.type = type22;
                    			VariableList.add(CurVariable);

                    		

                    }
                    break;
                case 2 :
                    // src\\qsort.g:187:4: ieStat
                    {
                    pushFollow(FOLLOW_ieStat_in_stat388);
                    ieStat24=ieStat();

                    state._fsp--;



                    			
                    			name = "\t"  + ieStat24 + "\n";
                    			
                    		

                    }
                    break;
                case 3 :
                    // src\\qsort.g:193:4: forStat
                    {
                    pushFollow(FOLLOW_forStat_in_stat397);
                    forStat25=forStat();

                    state._fsp--;



                    			
                    			name = "\t"  + forStat25 + "\n";
                    			
                    		

                    }
                    break;
                case 4 :
                    // src\\qsort.g:199:4: whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_stat406);
                    whileStat26=whileStat();

                    state._fsp--;



                    			
                    			name = "\t"  + whileStat26 + "\n";
                    			
                    		

                    }
                    break;
                case 5 :
                    // src\\qsort.g:205:4: callFunction ';'
                    {
                    pushFollow(FOLLOW_callFunction_in_stat415);
                    callFunction27=callFunction();

                    state._fsp--;


                    match(input,28,FOLLOW_28_in_stat417); 


                    			
                    			name = "\t"  + callFunction27 + ";\n";
                    		

                    }
                    break;
                case 6 :
                    // src\\qsort.g:210:4: 'return' returnSentence ';'
                    {
                    match(input,45,FOLLOW_45_in_stat426); 

                    pushFollow(FOLLOW_returnSentence_in_stat428);
                    returnSentence28=returnSentence();

                    state._fsp--;


                    match(input,28,FOLLOW_28_in_stat430); 


                    			
                    			name = "\t"  + "return " + returnSentence28 + ";\n";
                    		

                    }
                    break;
                case 7 :
                    // src\\qsort.g:215:4: normalExp ';'
                    {
                    pushFollow(FOLLOW_normalExp_in_stat439);
                    normalExp29=normalExp();

                    state._fsp--;


                    match(input,28,FOLLOW_28_in_stat441); 


                    			
                    			name = "\t"  + normalExp29 + ";\n";
                    		

                    }
                    break;
                case 8 :
                    // src\\qsort.g:220:4: LINE_COMMENT
                    {
                    match(input,LINE_COMMENT,FOLLOW_LINE_COMMENT_in_stat450); 


                    			name = "";
                    		

                    }
                    break;
                case 9 :
                    // src\\qsort.g:224:4: COMMENT
                    {
                    match(input,COMMENT,FOLLOW_COMMENT_in_stat459); 


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
    // src\\qsort.g:230:1: functionVariable returns [String name] : ( decFunction | decVariable );
    public final String functionVariable() throws RecognitionException {
        String name = null;


        qsortParser.decFunction_return decFunction30 =null;

        qsortParser.decVariable_return decVariable31 =null;



        	name = null;

        try {
            // src\\qsort.g:234:2: ( decFunction | decVariable )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==14) ) {
                    alt7=1;
                }
                else if ( (LA7_1==28||LA7_1==31||LA7_1==34) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // src\\qsort.g:234:4: decFunction
                    {
                    pushFollow(FOLLOW_decFunction_in_functionVariable483);
                    decFunction30=decFunction();

                    state._fsp--;


                    name = "function " + (decFunction30!=null?decFunction30.name:null);

                    }
                    break;
                case 2 :
                    // src\\qsort.g:236:4: decVariable
                    {
                    pushFollow(FOLLOW_decVariable_in_functionVariable492);
                    decVariable31=decVariable();

                    state._fsp--;



                    			name = "var " + (decVariable31!=null?decVariable31.name:null);
                    		

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
    // src\\qsort.g:242:1: decFunction returns [String name, String para, String funname, String initial, String justpara] : decFunctionName '{' functionImplement '}' semiColon ;
    public final qsortParser.decFunction_return decFunction() throws RecognitionException {
        qsortParser.decFunction_return retval = new qsortParser.decFunction_return();
        retval.start = input.LT(1);


        qsortParser.decFunctionName_return decFunctionName32 =null;

        qsortParser.functionImplement_return functionImplement33 =null;

        String semiColon34 =null;



        	retval.name = null;
        	retval.para = null;
        	retval.funname = null;
        	retval.initial = null;
        	retval.justpara = null;

        try {
            // src\\qsort.g:250:2: ( decFunctionName '{' functionImplement '}' semiColon )
            // src\\qsort.g:250:4: decFunctionName '{' functionImplement '}' semiColon
            {
            pushFollow(FOLLOW_decFunctionName_in_decFunction515);
            decFunctionName32=decFunctionName();

            state._fsp--;


            match(input,48,FOLLOW_48_in_decFunction517); 

            pushFollow(FOLLOW_functionImplement_in_decFunction519);
            functionImplement33=functionImplement();

            state._fsp--;


            match(input,50,FOLLOW_50_in_decFunction521); 

            pushFollow(FOLLOW_semiColon_in_decFunction523);
            semiColon34=semiColon();

            state._fsp--;



            		
            			// leo
            			FunctionName.add((decFunctionName32!=null?decFunctionName32.ownname:null));
            			FunctionType.add((decFunctionName32!=null?decFunctionName32.paraType:null));
            			
            			if ((decFunctionName32!=null?decFunctionName32.paraType:null) == "int&")
            			{
            				retval.name = (decFunctionName32!=null?decFunctionName32.name:null) + "\n\t{\n" + (functionImplement33!=null?functionImplement33.name:null) + "\t" + "return [" + (decFunctionName32!=null?decFunctionName32.p:null) + "];\n\t}" + semiColon34 + "\n";
            	
            				retval.para = (decFunctionName32!=null?decFunctionName32.para:null) + "\n\t{\n" + (functionImplement33!=null?functionImplement33.name:null) + "\t" + "return [" + (decFunctionName32!=null?decFunctionName32.p:null) + "];\n\t}" + semiColon34 + "\n";
            				
            			}
            			else
            			{
            				retval.name = (decFunctionName32!=null?decFunctionName32.name:null) + "\n{\n" + (functionImplement33!=null?functionImplement33.name:null) + "}" + semiColon34 + "\n";
            				retval.para = (decFunctionName32!=null?decFunctionName32.para:null) + "\n\t{\n" + (functionImplement33!=null?functionImplement33.name:null) + "\t}" + semiColon34 + "\n";
            				
            			}
            			 retval.funname = (decFunctionName32!=null?decFunctionName32.funname:null);
            			 retval.justpara = (decFunctionName32!=null?decFunctionName32.para:null);
            			 retval.initial = (functionImplement33!=null?functionImplement33.initial:null);
            		

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
    // src\\qsort.g:276:1: decFunctionName returns [String name, String para, String funname, String ownname, String p, String paraType] : ID '(' decParameter ')' ;
    public final qsortParser.decFunctionName_return decFunctionName() throws RecognitionException {
        qsortParser.decFunctionName_return retval = new qsortParser.decFunctionName_return();
        retval.start = input.LT(1);


        Token ID35=null;
        qsortParser.decParameter_return decParameter36 =null;



        	retval.name = null;
        	retval.para = null;
        	retval.funname = null;
        	retval.ownname = null;
        	retval.p = null;
        	retval.paraType = null;

        try {
            // src\\qsort.g:285:2: ( ID '(' decParameter ')' )
            // src\\qsort.g:285:4: ID '(' decParameter ')'
            {
            ID35=(Token)match(input,ID,FOLLOW_ID_in_decFunctionName546); 

            match(input,14,FOLLOW_14_in_decFunctionName548); 

            pushFollow(FOLLOW_decParameter_in_decFunctionName550);
            decParameter36=decParameter();

            state._fsp--;


            match(input,15,FOLLOW_15_in_decFunctionName552); 


            			retval.ownname = (ID35!=null?ID35.getText():null);
            			retval.name = (ID35!=null?ID35.getText():null) + "(" + (decParameter36!=null?decParameter36.name:null) + ")";
            			retval.para = "(" + (decParameter36!=null?decParameter36.name:null) + ")";
            			retval.p = (decParameter36!=null?decParameter36.name:null);
            			retval.funname = (ID35!=null?ID35.getText():null);// + "_" + (decParameter36!=null?decParameter36.paranum:0);
            			retval.paraType = (decParameter36!=null?decParameter36.paraType:null);
            		

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
    // src\\qsort.g:296:1: decParameter returns [String name, int paranum, String paraType] : ( decFormalPara decOtherPara |);
    public final qsortParser.decParameter_return decParameter() throws RecognitionException {
        qsortParser.decParameter_return retval = new qsortParser.decParameter_return();
        retval.start = input.LT(1);


        qsortParser.decFormalPara_return decFormalPara37 =null;

        qsortParser.decOtherPara_return decOtherPara38 =null;



        	retval.name = null;
        	retval.paranum = 0;
        	retval.paraType = null;

        try {
            // src\\qsort.g:302:2: ( decFormalPara decOtherPara |)
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38||(LA8_0 >= 42 && LA8_0 <= 44)||LA8_0==46) ) {
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
                    // src\\qsort.g:302:4: decFormalPara decOtherPara
                    {
                    pushFollow(FOLLOW_decFormalPara_in_decParameter575);
                    decFormalPara37=decFormalPara();

                    state._fsp--;


                    pushFollow(FOLLOW_decOtherPara_in_decParameter577);
                    decOtherPara38=decOtherPara();

                    state._fsp--;



                    			retval.name = (decFormalPara37!=null?decFormalPara37.name:null) + (decOtherPara38!=null?decOtherPara38.name:null);
                    			retval.paranum = (decFormalPara37!=null?decFormalPara37.paranum:0) + (decOtherPara38!=null?decOtherPara38.paranum:0);
                    			retval.paraType = (decFormalPara37!=null?decFormalPara37.paraType:null);
                    		

                    }
                    break;
                case 2 :
                    // src\\qsort.g:308:4: 
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
    // src\\qsort.g:314:1: decFormalPara returns [String name, int paranum, String paraType] : type ID ;
    public final qsortParser.decFormalPara_return decFormalPara() throws RecognitionException {
        qsortParser.decFormalPara_return retval = new qsortParser.decFormalPara_return();
        retval.start = input.LT(1);


        Token ID39=null;
        String type40 =null;



        	retval.name = null;
        	retval.paranum = 0;
        	retval.paraType = null;

        try {
            // src\\qsort.g:320:2: ( type ID )
            // src\\qsort.g:320:4: type ID
            {
            pushFollow(FOLLOW_type_in_decFormalPara606);
            type40=type();

            state._fsp--;


            ID39=(Token)match(input,ID,FOLLOW_ID_in_decFormalPara608); 


            			retval.name = (ID39!=null?ID39.getText():null);
            			if(retval.name == null || retval.name == "")
            				retval.paranum = 0;
            			else
            				retval.paranum = 1;
            			retval.paraType = type40;
            		

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
    // src\\qsort.g:331:1: decOtherPara returns [String name, int paranum, String othername] : ( ',' decFormalPara a= decOtherPara |);
    public final qsortParser.decOtherPara_return decOtherPara() throws RecognitionException {
        qsortParser.decOtherPara_return retval = new qsortParser.decOtherPara_return();
        retval.start = input.LT(1);


        qsortParser.decOtherPara_return a =null;

        qsortParser.decFormalPara_return decFormalPara41 =null;



        	retval.name = null;
        	retval.paranum = 0;	
        	retval.othername = null;

        try {
            // src\\qsort.g:337:2: ( ',' decFormalPara a= decOtherPara |)
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // src\\qsort.g:337:4: ',' decFormalPara a= decOtherPara
                    {
                    match(input,21,FOLLOW_21_in_decOtherPara631); 

                    pushFollow(FOLLOW_decFormalPara_in_decOtherPara633);
                    decFormalPara41=decFormalPara();

                    state._fsp--;


                    pushFollow(FOLLOW_decOtherPara_in_decOtherPara637);
                    a=decOtherPara();

                    state._fsp--;



                    			retval.name = ", " + (decFormalPara41!=null?decFormalPara41.name:null) + (a!=null?a.name:null);
                    			retval.paranum = (decFormalPara41!=null?decFormalPara41.paranum:0) + (a!=null?a.paranum:0);
                    			retval.othername = (decFormalPara41!=null?decFormalPara41.name:null);
                    		

                    }
                    break;
                case 2 :
                    // src\\qsort.g:343:4: 
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
    // src\\qsort.g:349:1: functionImplement returns [String name, String initial] : block ;
    public final qsortParser.functionImplement_return functionImplement() throws RecognitionException {
        qsortParser.functionImplement_return retval = new qsortParser.functionImplement_return();
        retval.start = input.LT(1);


        String block42 =null;



        	retval.name = null;
        	retval.initial = null;

        try {
            // src\\qsort.g:354:2: ( block )
            // src\\qsort.g:354:4: block
            {
            pushFollow(FOLLOW_block_in_functionImplement665);
            block42=block();

            state._fsp--;


            retval.name = block42;
            		 retval.initial = block42;
            		

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
    // src\\qsort.g:360:1: decVariable returns [String name, String variableName] : ID array decExpression ';' ;
    public final qsortParser.decVariable_return decVariable() throws RecognitionException {
        qsortParser.decVariable_return retval = new qsortParser.decVariable_return();
        retval.start = input.LT(1);


        Token ID43=null;
        String array44 =null;

        String decExpression45 =null;



        	retval.name = null;
        	retval.variableName = null;

        try {
            // src\\qsort.g:365:2: ( ID array decExpression ';' )
            // src\\qsort.g:365:4: ID array decExpression ';'
            {
            ID43=(Token)match(input,ID,FOLLOW_ID_in_decVariable688); 

            pushFollow(FOLLOW_array_in_decVariable690);
            array44=array();

            state._fsp--;


            pushFollow(FOLLOW_decExpression_in_decVariable692);
            decExpression45=decExpression();

            state._fsp--;


            match(input,28,FOLLOW_28_in_decVariable694); 


            			retval.name = (ID43!=null?ID43.getText():null) + array44 + decExpression45 + ";";
            			retval.variableName = (ID43!=null?ID43.getText():null) + array44;
            		

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
    // src\\qsort.g:372:1: callFunction returns [String name] : ( callName | ID '.' callName );
    public final String callFunction() throws RecognitionException {
        String name = null;


        Token ID47=null;
        qsortParser.callName_return callName46 =null;

        qsortParser.callName_return callName48 =null;



        	name = null;

        try {
            // src\\qsort.g:376:2: ( callName | ID '.' callName )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==14) ) {
                    alt10=1;
                }
                else if ( (LA10_1==25) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // src\\qsort.g:376:4: callName
                    {
                    pushFollow(FOLLOW_callName_in_callFunction717);
                    callName46=callName();

                    state._fsp--;


                    name = (callName46!=null?callName46.name:null);

                    }
                    break;
                case 2 :
                    // src\\qsort.g:378:4: ID '.' callName
                    {
                    ID47=(Token)match(input,ID,FOLLOW_ID_in_callFunction726); 

                    match(input,25,FOLLOW_25_in_callFunction728); 

                    pushFollow(FOLLOW_callName_in_callFunction730);
                    callName48=callName();

                    state._fsp--;



                    			name = (ID47!=null?ID47.getText():null) + "." + (callName48!=null?callName48.subname:null);
                    		

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
    // src\\qsort.g:384:1: callName returns [String name, String subname] : ID '(' callParameter ')' ;
    public final qsortParser.callName_return callName() throws RecognitionException {
        qsortParser.callName_return retval = new qsortParser.callName_return();
        retval.start = input.LT(1);


        Token ID49=null;
        qsortParser.callParameter_return callParameter50 =null;



        	retval.name = null;
        	retval.subname = null;

        try {
            // src\\qsort.g:389:2: ( ID '(' callParameter ')' )
            // src\\qsort.g:389:4: ID '(' callParameter ')'
            {
            ID49=(Token)match(input,ID,FOLLOW_ID_in_callName753); 

            match(input,14,FOLLOW_14_in_callName755); 

            pushFollow(FOLLOW_callParameter_in_callName757);
            callParameter50=callParameter();

            state._fsp--;


            match(input,15,FOLLOW_15_in_callName759); 


            			int k  = FunctionName.indexOf((ID49!=null?ID49.getText():null));
            			int index = 0;
            			boolean isPub = true;
            			if ((k >= 0) && (FunctionType.get(k) == "int&"))
            			{
            				if(isPub)
            					retval.name = "var temp = " + (ID49!=null?ID49.getText():null) + "(" + (callParameter50!=null?callParameter50.name:null) + ");\n" + "\t"+ (callParameter50!=null?callParameter50.temp1:null) + "= temp[0];\n" + "\t" +(callParameter50!=null?callParameter50.temp2:null) + "= temp[1]";
            				else
            					retval.name = "var temp = " + (ID49!=null?ID49.getText():null) + "(" + (callParameter50!=null?callParameter50.name:null) + ");\n" + "\t"+ (callParameter50!=null?callParameter50.temp1:null) + "= temp[0];\n" + "\t" +(callParameter50!=null?callParameter50.temp2:null) + "= temp[1]";
            			}
            			else
            			{
            				if(isPub)
            				{
            					retval.name = "" + (ID49!=null?ID49.getText():null) + "(" + (callParameter50!=null?callParameter50.name:null) + ")";
            				}
            				else
            				{
            					retval.name = (ID49!=null?ID49.getText():null) + "(" + (callParameter50!=null?callParameter50.name:null) + ")";
            				}
            				retval.subname = (ID49!=null?ID49.getText():null) + "(" + (callParameter50!=null?callParameter50.name:null) + ")";
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
    // src\\qsort.g:416:1: callNameInObject returns [String para, String var, int paranum] : ID '(' callParameter ')' ;
    public final qsortParser.callNameInObject_return callNameInObject() throws RecognitionException {
        qsortParser.callNameInObject_return retval = new qsortParser.callNameInObject_return();
        retval.start = input.LT(1);


        Token ID52=null;
        qsortParser.callParameter_return callParameter51 =null;



        	retval.para = null;
        	retval.var = null;
        	retval.paranum = 0;

        try {
            // src\\qsort.g:422:2: ( ID '(' callParameter ')' )
            // src\\qsort.g:422:4: ID '(' callParameter ')'
            {
            ID52=(Token)match(input,ID,FOLLOW_ID_in_callNameInObject782); 

            match(input,14,FOLLOW_14_in_callNameInObject784); 

            pushFollow(FOLLOW_callParameter_in_callNameInObject786);
            callParameter51=callParameter();

            state._fsp--;


            match(input,15,FOLLOW_15_in_callNameInObject788); 


            			retval.para = "(" + (callParameter51!=null?callParameter51.name:null) + ")";
            		 	retval.var = (ID52!=null?ID52.getText():null);
            		 	retval.paranum = (callParameter51!=null?callParameter51.paranum:0);
            		

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
    // src\\qsort.g:430:1: callParameter returns [String name, int paranum, String temp1, String temp2] : ( callFormalPara callOtherPara |);
    public final qsortParser.callParameter_return callParameter() throws RecognitionException {
        qsortParser.callParameter_return retval = new qsortParser.callParameter_return();
        retval.start = input.LT(1);


        qsortParser.callFormalPara_return callFormalPara53 =null;

        qsortParser.callOtherPara_return callOtherPara54 =null;



        	retval.name = null;
        	retval.paranum = 0;
        	retval.temp1 = null;
        	retval.temp2 = null;

        try {
            // src\\qsort.g:437:2: ( callFormalPara callOtherPara |)
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0 >= ID && LA11_0 <= INT)||LA11_0==9||LA11_0==14||LA11_0==22||LA11_0==48) ) {
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
                    // src\\qsort.g:437:4: callFormalPara callOtherPara
                    {
                    pushFollow(FOLLOW_callFormalPara_in_callParameter813);
                    callFormalPara53=callFormalPara();

                    state._fsp--;


                    pushFollow(FOLLOW_callOtherPara_in_callParameter815);
                    callOtherPara54=callOtherPara();

                    state._fsp--;



                    			retval.name = (callFormalPara53!=null?callFormalPara53.name:null) + (callOtherPara54!=null?callOtherPara54.name:null);
                    			retval.paranum = (callFormalPara53!=null?callFormalPara53.paranum:0) + (callOtherPara54!=null?callOtherPara54.paranum:0);
                    			retval.temp1 = (callFormalPara53!=null?callFormalPara53.name:null);
                    			retval.temp2 = (callOtherPara54!=null?callOtherPara54.othername:null);
                    		

                    }
                    break;
                case 2 :
                    // src\\qsort.g:444:4: 
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
    // src\\qsort.g:450:1: callFormalPara returns [String name, int paranum] : exprvalue ;
    public final qsortParser.callFormalPara_return callFormalPara() throws RecognitionException {
        qsortParser.callFormalPara_return retval = new qsortParser.callFormalPara_return();
        retval.start = input.LT(1);


        String exprvalue55 =null;



        	retval.name = null;
        	retval.paranum = 0;

        try {
            // src\\qsort.g:455:2: ( exprvalue )
            // src\\qsort.g:455:4: exprvalue
            {
            pushFollow(FOLLOW_exprvalue_in_callFormalPara843);
            exprvalue55=exprvalue();

            state._fsp--;



            			retval.name = exprvalue55;
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
    // src\\qsort.g:465:1: callOtherPara returns [String name, int paranum, String othername] : ( ',' callFormalPara a= callOtherPara |);
    public final qsortParser.callOtherPara_return callOtherPara() throws RecognitionException {
        qsortParser.callOtherPara_return retval = new qsortParser.callOtherPara_return();
        retval.start = input.LT(1);


        qsortParser.callOtherPara_return a =null;

        qsortParser.callFormalPara_return callFormalPara56 =null;



        	retval.name = null;
        	retval.paranum = 0;
        	retval.othername = null;

        try {
            // src\\qsort.g:471:2: ( ',' callFormalPara a= callOtherPara |)
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // src\\qsort.g:471:4: ',' callFormalPara a= callOtherPara
                    {
                    match(input,21,FOLLOW_21_in_callOtherPara866); 

                    pushFollow(FOLLOW_callFormalPara_in_callOtherPara868);
                    callFormalPara56=callFormalPara();

                    state._fsp--;


                    pushFollow(FOLLOW_callOtherPara_in_callOtherPara872);
                    a=callOtherPara();

                    state._fsp--;



                    			retval.name = ", " + (callFormalPara56!=null?callFormalPara56.name:null) + (a!=null?a.name:null);
                    			retval.paranum += (callFormalPara56!=null?callFormalPara56.paranum:0) + (a!=null?a.paranum:0);
                    			retval.othername = (callFormalPara56!=null?callFormalPara56.name:null);
                    		

                    }
                    break;
                case 2 :
                    // src\\qsort.g:477:4: 
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
    // src\\qsort.g:483:1: array returns [String name] : ( '[' index ']' |);
    public final String array() throws RecognitionException {
        String name = null;


        String index57 =null;



        	name = null;

        try {
            // src\\qsort.g:487:2: ( '[' index ']' |)
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            else if ( ((LA13_0 >= 10 && LA13_0 <= 13)||(LA13_0 >= 15 && LA13_0 <= 24)||(LA13_0 >= 26 && LA13_0 <= 33)||(LA13_0 >= 35 && LA13_0 <= 37)||LA13_0==49) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // src\\qsort.g:487:4: '[' index ']'
                    {
                    match(input,34,FOLLOW_34_in_array900); 

                    pushFollow(FOLLOW_index_in_array902);
                    index57=index();

                    state._fsp--;


                    match(input,35,FOLLOW_35_in_array904); 

                    name = "[" + index57 + "]";
                    		 if(index57 == "")
                    			name = "";

                    }
                    break;
                case 2 :
                    // src\\qsort.g:491:4: 
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
    // src\\qsort.g:494:1: index returns [String name] : ( exprvalue |);
    public final String index() throws RecognitionException {
        String name = null;


        String exprvalue58 =null;



        	name = null;

        try {
            // src\\qsort.g:498:2: ( exprvalue |)
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= ID && LA14_0 <= INT)||LA14_0==9||LA14_0==14||LA14_0==22||LA14_0==48) ) {
                alt14=1;
            }
            else if ( (LA14_0==35) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // src\\qsort.g:498:4: exprvalue
                    {
                    pushFollow(FOLLOW_exprvalue_in_index932);
                    exprvalue58=exprvalue();

                    state._fsp--;


                    name = exprvalue58;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:500:4: 
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
    // src\\qsort.g:504:1: semiColon returns [String name] : ( ';' |);
    public final String semiColon() throws RecognitionException {
        String name = null;



        	name = null;

        try {
            // src\\qsort.g:508:2: ( ';' |)
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==EOF||LA15_0==COMMENT||LA15_0==LINE_COMMENT||LA15_0==38||(LA15_0 >= 42 && LA15_0 <= 44)||LA15_0==46) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // src\\qsort.g:508:4: ';'
                    {
                    match(input,28,FOLLOW_28_in_semiColon961); 

                    name = ";";

                    }
                    break;
                case 2 :
                    // src\\qsort.g:510:4: 
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
    // src\\qsort.g:513:1: decExpression returns [String name] : ( '=' exprvalue |);
    public final String decExpression() throws RecognitionException {
        String name = null;


        String exprvalue59 =null;



        	name = null;

        try {
            // src\\qsort.g:517:2: ( '=' exprvalue |)
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==28) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // src\\qsort.g:517:4: '=' exprvalue
                    {
                    match(input,31,FOLLOW_31_in_decExpression989); 

                    pushFollow(FOLLOW_exprvalue_in_decExpression991);
                    exprvalue59=exprvalue();

                    state._fsp--;


                    name = " = " + exprvalue59;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:519:4: 
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
    // src\\qsort.g:522:1: exprvalue returns [String name] : ( expr | '!' expr | '-' expr | '{' INT ints '}' );
    public final String exprvalue() throws RecognitionException {
        String name = null;


        Token INT63=null;
        String expr60 =null;

        String expr61 =null;

        String expr62 =null;

        String ints64 =null;



        	name = null;

        try {
            // src\\qsort.g:526:2: ( expr | '!' expr | '-' expr | '{' INT ints '}' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case 14:
                {
                alt17=1;
                }
                break;
            case 9:
                {
                alt17=2;
                }
                break;
            case 22:
                {
                alt17=3;
                }
                break;
            case 48:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // src\\qsort.g:526:4: expr
                    {
                    pushFollow(FOLLOW_expr_in_exprvalue1019);
                    expr60=expr();

                    state._fsp--;


                    name = expr60;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:528:4: '!' expr
                    {
                    match(input,9,FOLLOW_9_in_exprvalue1028); 

                    pushFollow(FOLLOW_expr_in_exprvalue1030);
                    expr61=expr();

                    state._fsp--;


                    name = "!" + expr61;

                    }
                    break;
                case 3 :
                    // src\\qsort.g:530:4: '-' expr
                    {
                    match(input,22,FOLLOW_22_in_exprvalue1039); 

                    pushFollow(FOLLOW_expr_in_exprvalue1041);
                    expr62=expr();

                    state._fsp--;


                    name = "-" + expr62;

                    }
                    break;
                case 4 :
                    // src\\qsort.g:532:4: '{' INT ints '}'
                    {
                    match(input,48,FOLLOW_48_in_exprvalue1050); 

                    INT63=(Token)match(input,INT,FOLLOW_INT_in_exprvalue1052); 

                    pushFollow(FOLLOW_ints_in_exprvalue1054);
                    ints64=ints();

                    state._fsp--;


                    match(input,50,FOLLOW_50_in_exprvalue1056); 

                    name = "[" + (INT63!=null?INT63.getText():null) + ints64 + "]";

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
    // src\\qsort.g:536:1: expr returns [String name] : formalOperation otherOperation ;
    public final String expr() throws RecognitionException {
        String name = null;


        String formalOperation65 =null;

        String otherOperation66 =null;



        	name = null;

        try {
            // src\\qsort.g:540:2: ( formalOperation otherOperation )
            // src\\qsort.g:540:4: formalOperation otherOperation
            {
            pushFollow(FOLLOW_formalOperation_in_expr1079);
            formalOperation65=formalOperation();

            state._fsp--;


            pushFollow(FOLLOW_otherOperation_in_expr1081);
            otherOperation66=otherOperation();

            state._fsp--;


            name = formalOperation65 + otherOperation66;

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
    // src\\qsort.g:544:1: formalOperation returns [String name] : ( ID array | INT | '(' expr ')' | callFunction | object );
    public final String formalOperation() throws RecognitionException {
        String name = null;


        Token ID67=null;
        Token INT69=null;
        String array68 =null;

        String expr70 =null;

        String callFunction71 =null;

        String object72 =null;



        	name = null;

        try {
            // src\\qsort.g:548:2: ( ID array | INT | '(' expr ')' | callFunction | object )
            int alt18=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    alt18=4;
                    }
                    break;
                case 25:
                    {
                    int LA18_5 = input.LA(3);

                    if ( (LA18_5==ID) ) {
                        int LA18_7 = input.LA(4);

                        if ( (LA18_7==14) ) {
                            alt18=4;
                        }
                        else if ( ((LA18_7 >= 10 && LA18_7 <= 13)||(LA18_7 >= 15 && LA18_7 <= 24)||(LA18_7 >= 26 && LA18_7 <= 33)||(LA18_7 >= 35 && LA18_7 <= 37)||LA18_7==49) ) {
                            alt18=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 7, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 5, input);

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
                case 49:
                    {
                    alt18=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt18=2;
                }
                break;
            case 14:
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
                    // src\\qsort.g:548:4: ID array
                    {
                    ID67=(Token)match(input,ID,FOLLOW_ID_in_formalOperation1104); 

                    pushFollow(FOLLOW_array_in_formalOperation1106);
                    array68=array();

                    state._fsp--;


                    name = (ID67!=null?ID67.getText():null) + array68;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:550:4: INT
                    {
                    INT69=(Token)match(input,INT,FOLLOW_INT_in_formalOperation1115); 

                    name = (INT69!=null?INT69.getText():null);

                    }
                    break;
                case 3 :
                    // src\\qsort.g:552:4: '(' expr ')'
                    {
                    match(input,14,FOLLOW_14_in_formalOperation1124); 

                    pushFollow(FOLLOW_expr_in_formalOperation1126);
                    expr70=expr();

                    state._fsp--;


                    match(input,15,FOLLOW_15_in_formalOperation1128); 

                    name = "(" + expr70 + ")";

                    }
                    break;
                case 4 :
                    // src\\qsort.g:554:4: callFunction
                    {
                    pushFollow(FOLLOW_callFunction_in_formalOperation1137);
                    callFunction71=callFunction();

                    state._fsp--;


                    name = callFunction71;

                    }
                    break;
                case 5 :
                    // src\\qsort.g:556:4: object
                    {
                    pushFollow(FOLLOW_object_in_formalOperation1146);
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
    // $ANTLR end "formalOperation"



    // $ANTLR start "otherOperation"
    // src\\qsort.g:560:1: otherOperation returns [String name] : ( operator formalOperation a= otherOperation | singleOperator |);
    public final String otherOperation() throws RecognitionException {
        String name = null;


        String a =null;

        String operator73 =null;

        String formalOperation74 =null;

        String singleOperator75 =null;



        	name = null;

        try {
            // src\\qsort.g:564:2: ( operator formalOperation a= otherOperation | singleOperator |)
            int alt19=3;
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
            case 49:
                {
                alt19=1;
                }
                break;
            case 19:
            case 23:
                {
                alt19=2;
                }
                break;
            case 15:
            case 21:
            case 28:
            case 35:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // src\\qsort.g:564:4: operator formalOperation a= otherOperation
                    {
                    pushFollow(FOLLOW_operator_in_otherOperation1169);
                    operator73=operator();

                    state._fsp--;


                    pushFollow(FOLLOW_formalOperation_in_otherOperation1171);
                    formalOperation74=formalOperation();

                    state._fsp--;


                    pushFollow(FOLLOW_otherOperation_in_otherOperation1175);
                    a=otherOperation();

                    state._fsp--;


                    name = operator73 + formalOperation74 + a;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:566:4: singleOperator
                    {
                    pushFollow(FOLLOW_singleOperator_in_otherOperation1184);
                    singleOperator75=singleOperator();

                    state._fsp--;


                    name = singleOperator75;

                    }
                    break;
                case 3 :
                    // src\\qsort.g:568:4: 
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
    // src\\qsort.g:571:1: object returns [String name] : a= ID '.' b= ID ;
    public final String object() throws RecognitionException {
        String name = null;


        Token a=null;
        Token b=null;


        	name = null;

        try {
            // src\\qsort.g:575:2: (a= ID '.' b= ID )
            // src\\qsort.g:575:4: a= ID '.' b= ID
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_object1214); 

            match(input,25,FOLLOW_25_in_object1216); 

            b=(Token)match(input,ID,FOLLOW_ID_in_object1220); 

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
    // src\\qsort.g:579:1: returnSentence returns [String name] : ( exprvalue |);
    public final String returnSentence() throws RecognitionException {
        String name = null;


        String exprvalue76 =null;



        	name = null;

        try {
            // src\\qsort.g:583:2: ( exprvalue |)
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0 >= ID && LA20_0 <= INT)||LA20_0==9||LA20_0==14||LA20_0==22||LA20_0==48) ) {
                alt20=1;
            }
            else if ( (LA20_0==28) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // src\\qsort.g:583:4: exprvalue
                    {
                    pushFollow(FOLLOW_exprvalue_in_returnSentence1243);
                    exprvalue76=exprvalue();

                    state._fsp--;


                    name = exprvalue76;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:585:4: 
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
    // src\\qsort.g:588:1: normalExp returns [String name] : normalGiveValue otherOperation ;
    public final String normalExp() throws RecognitionException {
        String name = null;


        String normalGiveValue77 =null;

        String otherOperation78 =null;



        	name = null;

        try {
            // src\\qsort.g:592:2: ( normalGiveValue otherOperation )
            // src\\qsort.g:592:4: normalGiveValue otherOperation
            {
            pushFollow(FOLLOW_normalGiveValue_in_normalExp1271);
            normalGiveValue77=normalGiveValue();

            state._fsp--;


            pushFollow(FOLLOW_otherOperation_in_normalExp1273);
            otherOperation78=otherOperation();

            state._fsp--;


            name = normalGiveValue77 + otherOperation78;

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
    // src\\qsort.g:596:1: normalGiveValue returns [String name] : ( ID array | object );
    public final String normalGiveValue() throws RecognitionException {
        String name = null;


        Token ID79=null;
        String array80 =null;

        String object81 =null;



        	name = null;

        try {
            // src\\qsort.g:600:2: ( ID array | object )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==25) ) {
                    alt21=2;
                }
                else if ( ((LA21_1 >= 10 && LA21_1 <= 13)||(LA21_1 >= 15 && LA21_1 <= 20)||(LA21_1 >= 22 && LA21_1 <= 24)||(LA21_1 >= 26 && LA21_1 <= 34)||(LA21_1 >= 36 && LA21_1 <= 37)||LA21_1==49) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // src\\qsort.g:600:4: ID array
                    {
                    ID79=(Token)match(input,ID,FOLLOW_ID_in_normalGiveValue1296); 

                    pushFollow(FOLLOW_array_in_normalGiveValue1298);
                    array80=array();

                    state._fsp--;


                    name = (ID79!=null?ID79.getText():null) + array80;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:602:4: object
                    {
                    pushFollow(FOLLOW_object_in_normalGiveValue1307);
                    object81=object();

                    state._fsp--;


                    name = object81;

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
    // src\\qsort.g:607:1: operator returns [String name] : ( '+' | '-' | '*' | '/' | '^' | '&' | '&&' | '||' | '+=' | '-=' | '*=' | '/=' | '^=' | '&=' | '=' | '>' | '>=' | '<' | '<=' | '!=' );
    public final String operator() throws RecognitionException {
        String name = null;



        	name = null;

        try {
            // src\\qsort.g:611:2: ( '+' | '-' | '*' | '/' | '^' | '&' | '&&' | '||' | '+=' | '-=' | '*=' | '/=' | '^=' | '&=' | '=' | '>' | '>=' | '<' | '<=' | '!=' )
            int alt22=20;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt22=1;
                }
                break;
            case 22:
                {
                alt22=2;
                }
                break;
            case 16:
                {
                alt22=3;
                }
                break;
            case 26:
                {
                alt22=4;
                }
                break;
            case 36:
                {
                alt22=5;
                }
                break;
            case 12:
                {
                alt22=6;
                }
                break;
            case 11:
                {
                alt22=7;
                }
                break;
            case 49:
                {
                alt22=8;
                }
                break;
            case 20:
                {
                alt22=9;
                }
                break;
            case 24:
                {
                alt22=10;
                }
                break;
            case 17:
                {
                alt22=11;
                }
                break;
            case 27:
                {
                alt22=12;
                }
                break;
            case 37:
                {
                alt22=13;
                }
                break;
            case 13:
                {
                alt22=14;
                }
                break;
            case 31:
                {
                alt22=15;
                }
                break;
            case 32:
                {
                alt22=16;
                }
                break;
            case 33:
                {
                alt22=17;
                }
                break;
            case 29:
                {
                alt22=18;
                }
                break;
            case 30:
                {
                alt22=19;
                }
                break;
            case 10:
                {
                alt22=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // src\\qsort.g:611:4: '+'
                    {
                    match(input,18,FOLLOW_18_in_operator1331); 

                    name = " + ";

                    }
                    break;
                case 2 :
                    // src\\qsort.g:613:4: '-'
                    {
                    match(input,22,FOLLOW_22_in_operator1340); 

                    name = " - ";

                    }
                    break;
                case 3 :
                    // src\\qsort.g:615:4: '*'
                    {
                    match(input,16,FOLLOW_16_in_operator1349); 

                    name = " * ";

                    }
                    break;
                case 4 :
                    // src\\qsort.g:617:4: '/'
                    {
                    match(input,26,FOLLOW_26_in_operator1358); 

                    name = " / ";

                    }
                    break;
                case 5 :
                    // src\\qsort.g:621:4: '^'
                    {
                    match(input,36,FOLLOW_36_in_operator1371); 

                    name = " ^ ";

                    }
                    break;
                case 6 :
                    // src\\qsort.g:623:4: '&'
                    {
                    match(input,12,FOLLOW_12_in_operator1380); 

                    name = " & ";

                    }
                    break;
                case 7 :
                    // src\\qsort.g:625:4: '&&'
                    {
                    match(input,11,FOLLOW_11_in_operator1389); 

                    name = " && ";

                    }
                    break;
                case 8 :
                    // src\\qsort.g:627:4: '||'
                    {
                    match(input,49,FOLLOW_49_in_operator1398); 

                    name = " || ";

                    }
                    break;
                case 9 :
                    // src\\qsort.g:629:4: '+='
                    {
                    match(input,20,FOLLOW_20_in_operator1407); 

                    name = " += ";

                    }
                    break;
                case 10 :
                    // src\\qsort.g:631:4: '-='
                    {
                    match(input,24,FOLLOW_24_in_operator1416); 

                    name = " -= ";

                    }
                    break;
                case 11 :
                    // src\\qsort.g:633:4: '*='
                    {
                    match(input,17,FOLLOW_17_in_operator1425); 

                    name = " *= ";

                    }
                    break;
                case 12 :
                    // src\\qsort.g:635:4: '/='
                    {
                    match(input,27,FOLLOW_27_in_operator1434); 

                    name = " /= ";

                    }
                    break;
                case 13 :
                    // src\\qsort.g:639:4: '^='
                    {
                    match(input,37,FOLLOW_37_in_operator1447); 

                    name = " ^= ";

                    }
                    break;
                case 14 :
                    // src\\qsort.g:641:4: '&='
                    {
                    match(input,13,FOLLOW_13_in_operator1456); 

                    name = " &= ";

                    }
                    break;
                case 15 :
                    // src\\qsort.g:643:4: '='
                    {
                    match(input,31,FOLLOW_31_in_operator1465); 

                    name = " = ";

                    }
                    break;
                case 16 :
                    // src\\qsort.g:645:4: '>'
                    {
                    match(input,32,FOLLOW_32_in_operator1474); 

                    name = " > ";

                    }
                    break;
                case 17 :
                    // src\\qsort.g:647:4: '>='
                    {
                    match(input,33,FOLLOW_33_in_operator1483); 

                    name = " >= ";

                    }
                    break;
                case 18 :
                    // src\\qsort.g:649:4: '<'
                    {
                    match(input,29,FOLLOW_29_in_operator1492); 

                    name = " < ";

                    }
                    break;
                case 19 :
                    // src\\qsort.g:651:4: '<='
                    {
                    match(input,30,FOLLOW_30_in_operator1501); 

                    name = " <= ";

                    }
                    break;
                case 20 :
                    // src\\qsort.g:653:4: '!='
                    {
                    match(input,10,FOLLOW_10_in_operator1510); 

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
    // src\\qsort.g:657:1: singleOperator returns [String name] : ( '++' | '--' );
    public final String singleOperator() throws RecognitionException {
        String name = null;



        	name = null;

        try {
            // src\\qsort.g:661:2: ( '++' | '--' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            else if ( (LA23_0==23) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // src\\qsort.g:661:4: '++'
                    {
                    match(input,19,FOLLOW_19_in_singleOperator1533); 

                    name = "++";

                    }
                    break;
                case 2 :
                    // src\\qsort.g:663:4: '--'
                    {
                    match(input,23,FOLLOW_23_in_singleOperator1542); 

                    name = "--";

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
    // src\\qsort.g:667:1: ints returns [String name] : ( ',' INT a= ints |);
    public final String ints() throws RecognitionException {
        String name = null;


        Token INT82=null;
        String a =null;



        	name = null;

        try {
            // src\\qsort.g:671:5: ( ',' INT a= ints |)
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            else if ( (LA24_0==50) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // src\\qsort.g:671:9: ',' INT a= ints
                    {
                    match(input,21,FOLLOW_21_in_ints1570); 

                    INT82=(Token)match(input,INT,FOLLOW_INT_in_ints1572); 

                    pushFollow(FOLLOW_ints_in_ints1578);
                    a=ints();

                    state._fsp--;


                    name = ", " + (INT82!=null?INT82.getText():null) + a;

                    }
                    break;
                case 2 :
                    // src\\qsort.g:673:7: 
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
    // src\\qsort.g:677:1: type returns [String name] : ( 'int' | 'char' | 'void' | 'int*' | 'int&' );
    public final String type() throws RecognitionException {
        String name = null;



        	name = null;

        try {
            // src\\qsort.g:681:2: ( 'int' | 'char' | 'void' | 'int*' | 'int&' )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt25=1;
                }
                break;
            case 38:
                {
                alt25=2;
                }
                break;
            case 46:
                {
                alt25=3;
                }
                break;
            case 44:
                {
                alt25=4;
                }
                break;
            case 42:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // src\\qsort.g:681:4: 'int'
                    {
                    match(input,43,FOLLOW_43_in_type1614); 

                    name = "var";

                    }
                    break;
                case 2 :
                    // src\\qsort.g:683:4: 'char'
                    {
                    match(input,38,FOLLOW_38_in_type1623); 

                    name = "var";

                    }
                    break;
                case 3 :
                    // src\\qsort.g:685:4: 'void'
                    {
                    match(input,46,FOLLOW_46_in_type1632); 

                    name = "var";

                    }
                    break;
                case 4 :
                    // src\\qsort.g:687:4: 'int*'
                    {
                    match(input,44,FOLLOW_44_in_type1641); 

                    name = "var";

                    }
                    break;
                case 5 :
                    // src\\qsort.g:689:4: 'int&'
                    {
                    match(input,42,FOLLOW_42_in_type1650); 

                    name = "int&";

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


 

    public static final BitSet FOLLOW_declaration_in_program16 = new BitSet(new long[]{0x00005C4000000090L});
    public static final BitSet FOLLOW_declarations_in_program18 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations43 = new BitSet(new long[]{0x00005C4000000090L});
    public static final BitSet FOLLOW_declarations_in_declarations47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration83 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_functionVariable_in_declaration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_COMMENT_in_declaration94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_declaration104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifPart_in_ieStat129 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_elsePart_in_ieStat131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ifPart154 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ifPart156 = new BitSet(new long[]{0x0001000000404260L});
    public static final BitSet FOLLOW_exprvalue_in_ifPart158 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ifPart160 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ifPart162 = new BitSet(new long[]{0x0004FF40000000B0L});
    public static final BitSet FOLLOW_block_in_ifPart164 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ifPart166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_elsePart190 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_elsePart192 = new BitSet(new long[]{0x0004FF40000000B0L});
    public static final BitSet FOLLOW_block_in_elsePart194 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_elsePart196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_forStat224 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_forStat226 = new BitSet(new long[]{0x00005C4080000020L});
    public static final BitSet FOLLOW_forPara_in_forStat228 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_forStat230 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_expr_in_forStat232 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_forStat234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_normalExp_in_forStat236 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_forStat238 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_forStat240 = new BitSet(new long[]{0x0004FF40000000B0L});
    public static final BitSet FOLLOW_block_in_forStat242 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_forStat244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decExpression_in_forPara267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalExp_in_forPara276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_forPara285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_normalExp_in_forPara287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_whileStat310 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_whileStat312 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_expr_in_whileStat314 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_whileStat316 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_whileStat318 = new BitSet(new long[]{0x0004FF40000000B0L});
    public static final BitSet FOLLOW_block_in_whileStat320 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_whileStat322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_block345 = new BitSet(new long[]{0x0000FF40000000B0L});
    public static final BitSet FOLLOW_block_in_block349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_stat377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_decVariable_in_stat379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ieStat_in_stat388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStat_in_stat397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_stat406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callFunction_in_stat415 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_stat417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_stat426 = new BitSet(new long[]{0x0001000010404260L});
    public static final BitSet FOLLOW_returnSentence_in_stat428 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_stat430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalExp_in_stat439 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_stat441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_COMMENT_in_stat450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_stat459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decFunction_in_functionVariable483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decVariable_in_functionVariable492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decFunctionName_in_decFunction515 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_decFunction517 = new BitSet(new long[]{0x0000FF40000000B0L});
    public static final BitSet FOLLOW_functionImplement_in_decFunction519 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_decFunction521 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_semiColon_in_decFunction523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decFunctionName546 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_decFunctionName548 = new BitSet(new long[]{0x00005C4000008000L});
    public static final BitSet FOLLOW_decParameter_in_decFunctionName550 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_decFunctionName552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decFormalPara_in_decParameter575 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_decOtherPara_in_decParameter577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_decFormalPara606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_decFormalPara608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_decOtherPara631 = new BitSet(new long[]{0x00005C4000000000L});
    public static final BitSet FOLLOW_decFormalPara_in_decOtherPara633 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_decOtherPara_in_decOtherPara637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_functionImplement665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decVariable688 = new BitSet(new long[]{0x0000000490000000L});
    public static final BitSet FOLLOW_array_in_decVariable690 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_decExpression_in_decVariable692 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_decVariable694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callName_in_callFunction717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callFunction726 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_callFunction728 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_callName_in_callFunction730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callName753 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callName755 = new BitSet(new long[]{0x000100000040C260L});
    public static final BitSet FOLLOW_callParameter_in_callName757 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_callName759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callNameInObject782 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callNameInObject784 = new BitSet(new long[]{0x000100000040C260L});
    public static final BitSet FOLLOW_callParameter_in_callNameInObject786 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_callNameInObject788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callFormalPara_in_callParameter813 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_callOtherPara_in_callParameter815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprvalue_in_callFormalPara843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_callOtherPara866 = new BitSet(new long[]{0x0001000000404260L});
    public static final BitSet FOLLOW_callFormalPara_in_callOtherPara868 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_callOtherPara_in_callOtherPara872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_array900 = new BitSet(new long[]{0x0001000800404260L});
    public static final BitSet FOLLOW_index_in_array902 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_array904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprvalue_in_index932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_semiColon961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_decExpression989 = new BitSet(new long[]{0x0001000000404260L});
    public static final BitSet FOLLOW_exprvalue_in_decExpression991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprvalue1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_exprvalue1028 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_expr_in_exprvalue1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_exprvalue1039 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_expr_in_exprvalue1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exprvalue1050 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_exprvalue1052 = new BitSet(new long[]{0x0004000000200000L});
    public static final BitSet FOLLOW_ints_in_exprvalue1054 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_exprvalue1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalOperation_in_expr1079 = new BitSet(new long[]{0x00020033EDDF3C00L});
    public static final BitSet FOLLOW_otherOperation_in_expr1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_formalOperation1104 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_array_in_formalOperation1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_formalOperation1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_formalOperation1124 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_expr_in_formalOperation1126 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_formalOperation1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callFunction_in_formalOperation1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_formalOperation1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_in_otherOperation1169 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_formalOperation_in_otherOperation1171 = new BitSet(new long[]{0x00020033EDDF3C00L});
    public static final BitSet FOLLOW_otherOperation_in_otherOperation1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleOperator_in_otherOperation1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object1214 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_object1216 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_object1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprvalue_in_returnSentence1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalGiveValue_in_normalExp1271 = new BitSet(new long[]{0x00020033EDDF3C00L});
    public static final BitSet FOLLOW_otherOperation_in_normalExp1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_normalGiveValue1296 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_array_in_normalGiveValue1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_normalGiveValue1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_operator1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_operator1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_operator1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_operator1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_operator1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_operator1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_operator1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_operator1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_operator1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_operator1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_operator1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_operator1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_operator1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_operator1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_operator1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_operator1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_operator1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_operator1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_operator1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_operator1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_singleOperator1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_singleOperator1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ints1570 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_ints1572 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ints_in_ints1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_type1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_type1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_type1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_type1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_type1650 = new BitSet(new long[]{0x0000000000000002L});

}