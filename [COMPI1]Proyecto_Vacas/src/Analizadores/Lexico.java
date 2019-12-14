/* The following code was generated by JFlex 1.6.1 */

package analizadores;
import java_cup.runtime.Symbol; 



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Lexico</tt>
 */
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMENTARIO_MULTI = 2;
  public static final int ESTADO_CADENA = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 10,  6,  8,  8,  7,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    10, 21, 12,  0,  0, 15, 23,  5, 16, 17, 11, 13, 25, 14,  4,  9, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 29, 26, 19, 18, 20, 30, 
     0,  1,  1, 57, 55,  1,  1, 59,  1, 56,  1,  1,  1,  1,  1,  1, 
     1,  1,  1, 46,  1,  1,  1,  1,  1,  1,  1, 31,  0, 32, 24,  3, 
     0, 44, 39, 42, 36, 41, 52, 47, 43, 33,  1, 54, 40, 58, 34, 37, 
    51,  1, 45, 48, 35, 38, 50, 53, 49,  1,  1, 27, 22, 28,  0,  0, 
     0,  0,  0,  0,  0,  8,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\1\1\4\1\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\2\1\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\21\2"+
    "\2\6\1\34\1\35\4\0\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\2\1\50"+
    "\6\2\1\51\31\2\1\52\1\53\1\54\1\5\1\55"+
    "\3\2\1\56\25\2\1\57\7\2\1\60\6\2\1\61"+
    "\3\2\1\62\1\63\4\2\1\64\3\2\1\65\1\66"+
    "\2\2\1\67\5\2\1\70\14\2\1\71\4\2\1\72"+
    "\2\2\1\73\4\2\1\74\1\2\1\75\2\2\1\76"+
    "\2\2\1\77\1\100\1\101\3\2\1\102\1\2\1\103"+
    "\1\104\5\2\1\105\1\2\1\106\1\107\1\110\1\111"+
    "\10\2\1\112\1\113\1\114\4\2\1\115\1\116\4\2"+
    "\1\117\1\120\1\121\6\2\1\122\1\2\1\123\2\2"+
    "\1\124\1\125\1\126\4\2\1\127\5\2\1\130";

  private static int [] zzUnpackAction() {
    int [] result = new int[276];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\74\0\170\0\264\0\360\0\u012c\0\u0168\0\264"+
    "\0\u01a4\0\264\0\u01e0\0\u021c\0\u0258\0\264\0\u0294\0\u02d0"+
    "\0\264\0\264\0\264\0\u030c\0\u0348\0\u0384\0\u03c0\0\u03fc"+
    "\0\u0438\0\264\0\264\0\264\0\264\0\264\0\264\0\264"+
    "\0\264\0\264\0\u0474\0\u04b0\0\u04ec\0\u0528\0\u0564\0\u05a0"+
    "\0\u05dc\0\u0618\0\u0654\0\u0690\0\u06cc\0\u0708\0\u0744\0\u0780"+
    "\0\u07bc\0\u07f8\0\u0834\0\264\0\u0870\0\264\0\264\0\u08ac"+
    "\0\u0168\0\u08e8\0\u0924\0\264\0\264\0\264\0\264\0\264"+
    "\0\264\0\264\0\264\0\264\0\264\0\u0960\0\360\0\u099c"+
    "\0\u09d8\0\u0a14\0\u0a50\0\u0a8c\0\u0ac8\0\u0b04\0\u0b40\0\u0b7c"+
    "\0\u0bb8\0\u0bf4\0\u0c30\0\u0c6c\0\u0ca8\0\u0ce4\0\u0d20\0\u0d5c"+
    "\0\u0d98\0\u0dd4\0\u0e10\0\u0e4c\0\u0e88\0\u0ec4\0\u0f00\0\u0f3c"+
    "\0\u0f78\0\u0fb4\0\u0ff0\0\u102c\0\u1068\0\u10a4\0\u10e0\0\264"+
    "\0\u08ac\0\264\0\u111c\0\360\0\u1158\0\u1194\0\u11d0\0\360"+
    "\0\u120c\0\u1248\0\u1284\0\u12c0\0\u12fc\0\u1338\0\u1374\0\u13b0"+
    "\0\u13ec\0\u1428\0\u1464\0\u14a0\0\u14dc\0\u1518\0\u1554\0\u1590"+
    "\0\u15cc\0\u1608\0\u1644\0\u1680\0\u16bc\0\360\0\u16f8\0\u1734"+
    "\0\u1770\0\u17ac\0\u17e8\0\u1824\0\u1860\0\360\0\u189c\0\u18d8"+
    "\0\u1914\0\u1950\0\u198c\0\u19c8\0\360\0\u1a04\0\u1a40\0\u1a7c"+
    "\0\360\0\360\0\u1ab8\0\u1af4\0\u1b30\0\u1b6c\0\360\0\u1ba8"+
    "\0\u1be4\0\u1c20\0\360\0\360\0\u1c5c\0\u1c98\0\u1cd4\0\u1d10"+
    "\0\u1d4c\0\u1d88\0\u1dc4\0\u1e00\0\360\0\u1e3c\0\u1e78\0\u1eb4"+
    "\0\u1ef0\0\u1f2c\0\u1f68\0\u1fa4\0\u1fe0\0\u201c\0\u2058\0\u2094"+
    "\0\u20d0\0\360\0\u210c\0\u2148\0\u2184\0\u21c0\0\360\0\u21fc"+
    "\0\u2238\0\360\0\u2274\0\u22b0\0\u22ec\0\u2328\0\360\0\u2364"+
    "\0\360\0\u23a0\0\u23dc\0\u2418\0\u2454\0\u2490\0\360\0\360"+
    "\0\360\0\u24cc\0\u2508\0\u2544\0\360\0\u2580\0\360\0\360"+
    "\0\u25bc\0\u25f8\0\u2634\0\u2670\0\u26ac\0\360\0\u26e8\0\360"+
    "\0\360\0\360\0\360\0\u2724\0\u2760\0\u279c\0\u27d8\0\u2814"+
    "\0\u2850\0\u288c\0\u28c8\0\360\0\360\0\360\0\u2904\0\u2940"+
    "\0\u297c\0\u29b8\0\360\0\360\0\u29f4\0\u2a30\0\u2a6c\0\u2aa8"+
    "\0\360\0\360\0\360\0\u2ae4\0\u2b20\0\u2b5c\0\u2b98\0\u2bd4"+
    "\0\u2c10\0\360\0\u2c4c\0\360\0\u2c88\0\u2cc4\0\360\0\360"+
    "\0\360\0\u2d00\0\u2d3c\0\u2d78\0\u2db4\0\360\0\u2df0\0\u2e2c"+
    "\0\u2e68\0\u2ea4\0\u2ee0\0\360";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[276];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\0\1\14\1\13\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\2\5\1\47\1\5"+
    "\1\50\1\51\1\5\1\52\1\53\1\54\1\55\1\56"+
    "\1\5\1\57\1\60\1\61\1\62\5\5\1\63\6\64"+
    "\1\12\1\13\1\0\1\64\1\13\1\65\60\64\6\66"+
    "\3\0\3\66\1\67\57\66\75\0\3\5\35\0\33\5"+
    "\2\0\1\6\1\0\1\70\70\0\2\5\1\71\35\0"+
    "\33\5\6\72\3\0\63\72\7\0\1\13\2\0\1\13"+
    "\72\0\1\73\1\0\1\74\73\0\1\75\75\0\1\76"+
    "\74\0\1\77\77\0\1\100\73\0\1\101\73\0\1\102"+
    "\73\0\1\103\77\0\1\104\74\0\1\105\45\0\3\5"+
    "\35\0\1\5\1\106\21\5\1\107\5\5\1\110\1\5"+
    "\1\0\3\5\35\0\5\5\1\111\2\5\1\112\22\5"+
    "\1\0\3\5\35\0\4\5\1\113\5\5\1\114\1\5"+
    "\1\115\16\5\1\0\3\5\35\0\4\5\1\116\3\5"+
    "\1\117\22\5\1\0\3\5\35\0\4\5\1\120\7\5"+
    "\1\121\16\5\1\0\3\5\35\0\7\5\1\122\10\5"+
    "\1\123\12\5\1\0\3\5\35\0\4\5\1\124\2\5"+
    "\1\125\2\5\1\126\1\127\17\5\1\0\3\5\35\0"+
    "\6\5\1\130\24\5\1\0\3\5\35\0\10\5\1\131"+
    "\22\5\1\0\3\5\35\0\2\5\1\132\30\5\1\0"+
    "\3\5\35\0\14\5\1\133\16\5\1\0\3\5\35\0"+
    "\2\5\1\134\2\5\1\135\16\5\1\136\6\5\1\0"+
    "\3\5\35\0\4\5\1\137\26\5\1\0\3\5\35\0"+
    "\5\5\1\140\6\5\1\141\16\5\1\0\3\5\35\0"+
    "\1\142\3\5\1\143\6\5\1\144\17\5\1\0\3\5"+
    "\35\0\12\5\1\145\1\5\1\146\16\5\1\0\3\5"+
    "\35\0\14\5\1\147\16\5\11\0\1\150\64\0\1\151"+
    "\76\0\1\152\66\0\6\73\1\12\1\153\1\0\63\73"+
    "\1\0\3\5\35\0\2\5\1\154\14\5\1\155\13\5"+
    "\1\0\3\5\35\0\22\5\1\156\10\5\1\0\3\5"+
    "\35\0\7\5\1\157\23\5\1\0\3\5\35\0\24\5"+
    "\1\160\6\5\1\0\3\5\35\0\26\5\1\161\1\162"+
    "\1\163\2\5\1\0\3\5\35\0\1\164\32\5\1\0"+
    "\3\5\35\0\5\5\1\165\25\5\1\0\3\5\35\0"+
    "\5\5\1\166\25\5\1\0\3\5\35\0\23\5\1\167"+
    "\7\5\1\0\3\5\35\0\4\5\1\170\26\5\1\0"+
    "\3\5\35\0\10\5\1\171\22\5\1\0\3\5\35\0"+
    "\17\5\1\172\13\5\1\0\3\5\35\0\2\5\1\173"+
    "\30\5\1\0\3\5\35\0\1\5\1\174\31\5\1\0"+
    "\3\5\35\0\13\5\1\175\17\5\1\0\3\5\35\0"+
    "\13\5\1\176\17\5\1\0\3\5\35\0\17\5\1\177"+
    "\13\5\1\0\3\5\35\0\17\5\1\200\13\5\1\0"+
    "\3\5\35\0\2\5\1\201\10\5\1\202\17\5\1\0"+
    "\3\5\35\0\14\5\1\203\16\5\1\0\3\5\35\0"+
    "\13\5\1\204\17\5\1\0\3\5\35\0\13\5\1\205"+
    "\1\206\16\5\1\0\3\5\35\0\22\5\1\207\10\5"+
    "\1\0\3\5\35\0\1\210\32\5\1\0\3\5\35\0"+
    "\1\211\32\5\1\0\3\5\35\0\6\5\1\212\24\5"+
    "\1\0\3\5\35\0\1\213\3\5\1\214\26\5\1\0"+
    "\3\5\35\0\1\5\1\215\31\5\1\0\3\5\35\0"+
    "\14\5\1\216\16\5\1\0\3\5\35\0\7\5\1\217"+
    "\23\5\1\0\3\5\35\0\1\220\32\5\1\0\3\5"+
    "\35\0\1\221\32\5\1\0\3\5\35\0\13\5\1\222"+
    "\17\5\6\0\1\12\66\0\3\5\35\0\2\5\1\223"+
    "\30\5\1\0\3\5\35\0\4\5\1\224\26\5\1\0"+
    "\3\5\35\0\7\5\1\225\23\5\1\0\3\5\35\0"+
    "\4\5\1\226\26\5\1\0\3\5\35\0\1\5\1\227"+
    "\31\5\1\0\3\5\35\0\12\5\1\230\20\5\1\0"+
    "\3\5\35\0\17\5\1\231\13\5\1\0\3\5\35\0"+
    "\10\5\1\232\22\5\1\0\3\5\35\0\6\5\1\233"+
    "\24\5\1\0\3\5\35\0\13\5\1\234\17\5\1\0"+
    "\3\5\35\0\7\5\1\235\23\5\1\0\3\5\35\0"+
    "\13\5\1\236\17\5\1\0\3\5\35\0\10\5\1\237"+
    "\22\5\1\0\3\5\35\0\10\5\1\240\22\5\1\0"+
    "\3\5\35\0\2\5\1\241\30\5\1\0\3\5\35\0"+
    "\17\5\1\242\13\5\1\0\3\5\35\0\14\5\1\243"+
    "\16\5\1\0\3\5\35\0\10\5\1\244\22\5\1\0"+
    "\3\5\35\0\2\5\1\245\30\5\1\0\3\5\35\0"+
    "\5\5\1\246\25\5\1\0\3\5\35\0\3\5\1\247"+
    "\27\5\1\0\3\5\35\0\1\250\32\5\1\0\3\5"+
    "\35\0\22\5\1\251\10\5\1\0\3\5\35\0\2\5"+
    "\1\252\30\5\1\0\3\5\35\0\10\5\1\253\22\5"+
    "\1\0\3\5\35\0\2\5\1\254\30\5\1\0\3\5"+
    "\35\0\3\5\1\255\27\5\1\0\3\5\35\0\7\5"+
    "\1\256\23\5\1\0\3\5\35\0\1\5\1\257\17\5"+
    "\1\260\11\5\1\0\3\5\35\0\2\5\1\261\30\5"+
    "\1\0\3\5\35\0\13\5\1\262\17\5\1\0\3\5"+
    "\35\0\17\5\1\263\13\5\1\0\3\5\35\0\7\5"+
    "\1\264\23\5\1\0\3\5\35\0\2\5\1\265\30\5"+
    "\1\0\3\5\35\0\23\5\1\266\7\5\1\0\3\5"+
    "\35\0\13\5\1\267\17\5\1\0\3\5\35\0\14\5"+
    "\1\270\16\5\1\0\3\5\35\0\5\5\1\271\25\5"+
    "\1\0\3\5\35\0\2\5\1\272\30\5\1\0\3\5"+
    "\35\0\13\5\1\273\17\5\1\0\3\5\35\0\7\5"+
    "\1\274\23\5\1\0\3\5\35\0\5\5\1\275\25\5"+
    "\1\0\3\5\35\0\10\5\1\276\22\5\1\0\3\5"+
    "\35\0\25\5\1\277\5\5\1\0\3\5\35\0\1\5"+
    "\1\300\31\5\1\0\3\5\35\0\1\301\32\5\1\0"+
    "\3\5\35\0\17\5\1\302\13\5\1\0\3\5\35\0"+
    "\14\5\1\303\16\5\1\0\3\5\35\0\14\5\1\304"+
    "\16\5\1\0\2\5\1\305\35\0\33\5\1\0\3\5"+
    "\35\0\1\5\1\306\31\5\1\0\3\5\35\0\12\5"+
    "\1\307\20\5\1\0\3\5\35\0\1\310\32\5\1\0"+
    "\3\5\35\0\14\5\1\311\16\5\1\0\3\5\35\0"+
    "\11\5\1\312\21\5\1\0\3\5\35\0\1\313\32\5"+
    "\1\0\3\5\35\0\2\5\1\314\30\5\1\0\3\5"+
    "\35\0\13\5\1\315\17\5\1\0\3\5\35\0\10\5"+
    "\1\316\22\5\1\0\3\5\35\0\7\5\1\317\23\5"+
    "\1\0\3\5\35\0\10\5\1\320\22\5\1\0\3\5"+
    "\35\0\10\5\1\321\22\5\1\0\3\5\35\0\10\5"+
    "\1\322\22\5\1\0\3\5\35\0\1\323\32\5\1\0"+
    "\3\5\35\0\1\5\1\324\31\5\1\0\3\5\35\0"+
    "\2\5\1\325\30\5\1\0\3\5\35\0\6\5\1\326"+
    "\24\5\1\0\3\5\35\0\14\5\1\327\16\5\1\0"+
    "\3\5\35\0\10\5\1\330\22\5\1\0\3\5\35\0"+
    "\7\5\1\331\23\5\1\0\3\5\35\0\13\5\1\332"+
    "\17\5\1\0\3\5\35\0\3\5\1\333\27\5\1\0"+
    "\3\5\35\0\1\5\1\334\31\5\1\0\3\5\35\0"+
    "\13\5\1\335\17\5\1\0\3\5\35\0\1\5\1\336"+
    "\31\5\1\0\3\5\35\0\23\5\1\337\7\5\1\0"+
    "\3\5\35\0\16\5\1\340\14\5\1\0\3\5\35\0"+
    "\11\5\1\341\21\5\1\0\3\5\35\0\12\5\1\342"+
    "\20\5\1\0\3\5\35\0\11\5\1\343\21\5\1\0"+
    "\3\5\35\0\2\5\1\344\4\5\1\345\23\5\1\0"+
    "\3\5\35\0\2\5\1\346\30\5\1\0\3\5\35\0"+
    "\11\5\1\347\21\5\1\0\2\5\1\350\35\0\33\5"+
    "\1\0\3\5\35\0\11\5\1\351\21\5\1\0\3\5"+
    "\35\0\11\5\1\352\21\5\1\0\3\5\35\0\7\5"+
    "\1\353\23\5\1\0\3\5\35\0\2\5\1\354\30\5"+
    "\1\0\3\5\35\0\1\5\1\355\31\5\1\0\3\5"+
    "\35\0\17\5\1\356\13\5\1\0\3\5\35\0\5\5"+
    "\1\357\25\5\1\0\3\5\35\0\11\5\1\360\21\5"+
    "\1\0\3\5\35\0\1\361\32\5\1\0\3\5\35\0"+
    "\13\5\1\362\17\5\1\0\3\5\35\0\1\5\1\363"+
    "\31\5\1\0\3\5\35\0\10\5\1\364\22\5\1\0"+
    "\3\5\35\0\2\5\1\365\30\5\1\0\3\5\35\0"+
    "\23\5\1\366\7\5\1\0\3\5\35\0\13\5\1\367"+
    "\17\5\1\0\3\5\35\0\10\5\1\370\22\5\1\0"+
    "\3\5\35\0\10\5\1\371\22\5\1\0\3\5\35\0"+
    "\10\5\1\372\22\5\1\0\3\5\35\0\2\5\1\373"+
    "\30\5\1\0\3\5\35\0\7\5\1\374\23\5\1\0"+
    "\3\5\35\0\6\5\1\375\24\5\1\0\3\5\35\0"+
    "\10\5\1\376\22\5\1\0\3\5\35\0\1\377\32\5"+
    "\1\0\3\5\35\0\14\5\1\u0100\16\5\1\0\3\5"+
    "\35\0\4\5\1\u0101\26\5\1\0\3\5\35\0\10\5"+
    "\1\u0102\22\5\1\0\3\5\35\0\7\5\1\u0103\23\5"+
    "\1\0\3\5\35\0\3\5\1\u0104\27\5\1\0\3\5"+
    "\35\0\7\5\1\u0105\23\5\1\0\2\5\1\u0106\35\0"+
    "\33\5\1\0\3\5\35\0\23\5\1\u0107\7\5\1\0"+
    "\3\5\35\0\13\5\1\u0108\17\5\1\0\3\5\35\0"+
    "\10\5\1\u0109\22\5\1\0\3\5\35\0\3\5\1\u010a"+
    "\4\5\1\u010b\22\5\1\0\3\5\35\0\4\5\1\u010c"+
    "\26\5\1\0\3\5\35\0\1\5\1\u010d\31\5\1\0"+
    "\3\5\35\0\2\5\1\u010e\30\5\1\0\3\5\35\0"+
    "\2\5\1\u010f\30\5\1\0\3\5\35\0\4\5\1\u0110"+
    "\26\5\1\0\3\5\35\0\14\5\1\u0111\16\5\1\0"+
    "\3\5\35\0\1\5\1\u0112\31\5\1\0\3\5\35\0"+
    "\4\5\1\u0113\26\5\1\0\3\5\35\0\17\5\1\u0114"+
    "\13\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12060];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\3\1\1\11\1\1\1\11\3\1\1\11"+
    "\2\1\3\11\6\1\11\11\21\1\1\11\1\1\2\11"+
    "\4\0\12\11\42\1\1\11\1\1\1\11\252\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[276];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	String aux = "";


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
      yyline = 1; 
    yychar = 1; 
    this.zzReader = in;
  }



  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.err.println("Este es un error lexico: "+yytext()+", en la linea: "+yyline+", en la columna: "+yychar);
    //Interfaz.lista_errores.add(new CError("Léxico", "Caractér incorrecto '" + yytext() + "'", yyline, yychar));
            }
          case 89: break;
          case 2: 
            { return new Symbol(sym.id,yyline,yychar, yytext());
            }
          case 90: break;
          case 3: 
            { return new Symbol(sym.entero,yyline,yychar, yytext());
            }
          case 91: break;
          case 4: 
            { return new Symbol(sym.punto,yyline,yychar, yytext());
            }
          case 92: break;
          case 5: 
            { yychar=1;
            }
          case 93: break;
          case 6: 
            { 
            }
          case 94: break;
          case 7: 
            { return new Symbol(sym.division,yyline,yychar, yytext());
            }
          case 95: break;
          case 8: 
            { return new Symbol(sym.por,yyline,yychar, yytext());
            }
          case 96: break;
          case 9: 
            { yybegin(ESTADO_CADENA); aux = "";
            }
          case 97: break;
          case 10: 
            { return new Symbol(sym.mas,yyline,yychar, yytext());
            }
          case 98: break;
          case 11: 
            { return new Symbol(sym.menos,yyline,yychar, yytext());
            }
          case 99: break;
          case 12: 
            { return new Symbol(sym.modulo,yyline,yychar, yytext());
            }
          case 100: break;
          case 13: 
            { return new Symbol(sym.parizquierdo,yyline,yychar, yytext());
            }
          case 101: break;
          case 14: 
            { return new Symbol(sym.parderecho,yyline,yychar, yytext());
            }
          case 102: break;
          case 15: 
            { return new Symbol(sym.igual,yyline,yychar, yytext());
            }
          case 103: break;
          case 16: 
            { return new Symbol(sym.menorque,yyline,yychar, yytext());
            }
          case 104: break;
          case 17: 
            { return new Symbol(sym.mayorque,yyline,yychar, yytext());
            }
          case 105: break;
          case 18: 
            { return new Symbol(sym.rnot,yyline,yychar, yytext());
            }
          case 106: break;
          case 19: 
            { return new Symbol(sym.rxor,yyline,yychar, yytext());
            }
          case 107: break;
          case 20: 
            { return new Symbol(sym.coma,yyline,yychar, yytext());
            }
          case 108: break;
          case 21: 
            { return new Symbol(sym.puntoycoma,yyline,yychar, yytext());
            }
          case 109: break;
          case 22: 
            { return new Symbol(sym.llaveizq,yyline,yychar, yytext());
            }
          case 110: break;
          case 23: 
            { return new Symbol(sym.llaveder,yyline,yychar, yytext());
            }
          case 111: break;
          case 24: 
            { return new Symbol(sym.dospuntos,yyline,yychar, yytext());
            }
          case 112: break;
          case 25: 
            { return new Symbol(sym.interrogacion,yyline,yychar, yytext());
            }
          case 113: break;
          case 26: 
            { return new Symbol(sym.corizquierdo,yyline,yychar, yytext());
            }
          case 114: break;
          case 27: 
            { return new Symbol(sym.corderecho,yyline,yychar, yytext());
            }
          case 115: break;
          case 28: 
            { aux = aux + yytext();
            }
          case 116: break;
          case 29: 
            { yybegin(YYINITIAL); return new Symbol(sym.cadena,yyline,yychar,aux);
            }
          case 117: break;
          case 30: 
            { yybegin(COMENTARIO_MULTI);
            }
          case 118: break;
          case 31: 
            { return new Symbol(sym.rpow,yyline,yychar,yytext());
            }
          case 119: break;
          case 32: 
            { return new Symbol(sym.masmas,yyline,yychar, yytext());
            }
          case 120: break;
          case 33: 
            { return new Symbol(sym.menosmenos,yyline,yychar, yytext());
            }
          case 121: break;
          case 34: 
            { return new Symbol(sym.igualigual,yyline,yychar, yytext());
            }
          case 122: break;
          case 35: 
            { return new Symbol(sym.menorigualque,yyline,yychar, yytext());
            }
          case 123: break;
          case 36: 
            { return new Symbol(sym.mayorigualque,yyline,yychar, yytext());
            }
          case 124: break;
          case 37: 
            { return new Symbol(sym.diferenteque,yyline,yychar, yytext());
            }
          case 125: break;
          case 38: 
            { return new Symbol(sym.ror,yyline,yychar, yytext());
            }
          case 126: break;
          case 39: 
            { return new Symbol(sym.rand,yyline,yychar, yytext());
            }
          case 127: break;
          case 40: 
            { return new Symbol(sym.rif,yyline,yychar, yytext());
            }
          case 128: break;
          case 41: 
            { return new Symbol(sym.rdo,yyline,yychar, yytext());
            }
          case 129: break;
          case 42: 
            { yybegin(YYINITIAL);
            }
          case 130: break;
          case 43: 
            { return new Symbol(sym.doble,yyline,yychar, yytext());
            }
          case 131: break;
          case 44: 
            { return new Symbol(sym.caracter,yyline,yychar, yytext());
            }
          case 132: break;
          case 45: 
            { return new Symbol(sym.rint,yyline,yychar, yytext());
            }
          case 133: break;
          case 46: 
            { return new Symbol(sym.rnew,yyline,yychar, yytext());
            }
          case 134: break;
          case 47: 
            { return new Symbol(sym.rstr,yyline,yychar, yytext());
            }
          case 135: break;
          case 48: 
            { return new Symbol(sym.rfor,yyline,yychar, yytext());
            }
          case 136: break;
          case 49: 
            { return new Symbol(sym.rnull,yyline,yychar, yytext());
            }
          case 137: break;
          case 50: 
            { return new Symbol(sym.rthis,yyline,yychar, yytext());
            }
          case 138: break;
          case 51: 
            { return new Symbol(sym.rtrue,yyline,yychar, yytext());
            }
          case 139: break;
          case 52: 
            { return new Symbol(sym.relse,yyline,yychar, yytext());
            }
          case 140: break;
          case 53: 
            { return new Symbol(sym.rchar,yyline,yychar, yytext());
            }
          case 141: break;
          case 54: 
            { return new Symbol(sym.rcase,yyline,yychar, yytext());
            }
          case 142: break;
          case 55: 
            { return new Symbol(sym.rread,yyline,yychar, yytext());
            }
          case 143: break;
          case 56: 
            { return new Symbol(sym.rvoid,yyline,yychar, yytext());
            }
          case 144: break;
          case 57: 
            { return new Symbol(sym.rtoInt,yyline,yychar, yytext());
            }
          case 145: break;
          case 58: 
            { return new Symbol(sym.rbreak,yyline,yychar, yytext());
            }
          case 146: break;
          case 59: 
            { return new Symbol(sym.rclass,yyline,yychar, yytext());
            }
          case 147: break;
          case 60: 
            { return new Symbol(sym.rgraph,yyline,yychar, yytext());
            }
          case 148: break;
          case 61: 
            { return new Symbol(sym.rsuper,yyline,yychar, yytext());
            }
          case 149: break;
          case 62: 
            { return new Symbol(sym.rprint,yyline,yychar, yytext());
            }
          case 150: break;
          case 63: 
            { return new Symbol(sym.rfinal,yyline,yychar, yytext());
            }
          case 151: break;
          case 64: 
            { return new Symbol(sym.rfalse,yyline,yychar, yytext());
            }
          case 152: break;
          case 65: 
            { return new Symbol(sym.rwhile,yyline,yychar, yytext());
            }
          case 153: break;
          case 66: 
            { return new Symbol(sym.rimport,yyline,yychar, yytext());
            }
          case 154: break;
          case 67: 
            { return new Symbol(sym.rtoChar,yyline,yychar, yytext());
            }
          case 155: break;
          case 68: 
            { return new Symbol(sym.rdouble,yyline,yychar, yytext());
            }
          case 156: break;
          case 69: 
            { return new Symbol(sym.rreturn,yyline,yychar, yytext());
            }
          case 157: break;
          case 70: 
            { return new Symbol(sym.rstring,yyline,yychar, yytext());
            }
          case 158: break;
          case 71: 
            { return new Symbol(sym.rstatic,yyline,yychar, yytext());
            }
          case 159: break;
          case 72: 
            { return new Symbol(sym.rswitch,yyline,yychar, yytext());
            }
          case 160: break;
          case 73: 
            { return new Symbol(sym.rpublic,yyline,yychar, yytext());
            }
          case 161: break;
          case 74: 
            { return new Symbol(sym.rdefault,yyline,yychar, yytext());
            }
          case 162: break;
          case 75: 
            { return new Symbol(sym.rboolean,yyline,yychar, yytext());
            }
          case 163: break;
          case 76: 
            { return new Symbol(sym.rextends,yyline,yychar, yytext());
            }
          case 164: break;
          case 77: 
            { return new Symbol(sym.rprintln,yyline,yychar, yytext());
            }
          case 165: break;
          case 78: 
            { return new Symbol(sym.rprivate,yyline,yychar, yytext());
            }
          case 166: break;
          case 79: 
            { return new Symbol(sym.rtoDouble,yyline,yychar, yytext());
            }
          case 167: break;
          case 80: 
            { return new Symbol(sym.rcontinue,yyline,yychar, yytext());
            }
          case 168: break;
          case 81: 
            { return new Symbol(sym.rabstract,yyline,yychar, yytext());
            }
          case 169: break;
          case 82: 
            { return new Symbol(sym.rread_file,yyline,yychar, yytext());
            }
          case 170: break;
          case 83: 
            { return new Symbol(sym.rprotected,yyline,yychar, yytext());
            }
          case 171: break;
          case 84: 
            { return new Symbol(sym.rinstanceof,yyline,yychar, yytext());
            }
          case 172: break;
          case 85: 
            { return new Symbol(sym.rprinttabla,yyline,yychar, yytext());
            }
          case 173: break;
          case 86: 
            { return new Symbol(sym.rwrite_file,yyline,yychar, yytext());
            }
          case 174: break;
          case 87: 
            { return new Symbol(sym.rgraphdot,yyline,yychar,yytext());
            }
          case 175: break;
          case 88: 
            { return new Symbol(sym.rgraphent,yyline,yychar,yytext());
            }
          case 176: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
