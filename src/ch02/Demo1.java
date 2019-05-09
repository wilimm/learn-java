package ch02;

/**
 * @Author: wilimm
 * @Date: 2019/5/9 13:16
 */
public class Demo1 {

    /**
     * 成员变量不初始化就会赋默认值
     */
    static byte byteDefaultValue;

    static short shortDefaultValue;

    static int intDefaultValue;

    static long longDefaultValue;

    static float floatDefaultValue;

    static double doubleDefaultValue;

    static boolean booleanDefaultValue;

    static char charDefaultValue;


    public static void main(String[] args) {

        System.out.println("2^7 = " + pow(2, 7));
        System.out.println("2^15 = " + pow(2, 15));
        System.out.println("2^31 = " + pow(2, 31));
        System.out.println("2^63 = " + pow(2, 63));


        System.out.println("byte 占 " + Byte.SIZE + "(bit)" + "--------" + "byte 的默认值：[" + byteDefaultValue + "] byte 的数据范围：[" + Byte.MIN_VALUE + ", " + Byte.MAX_VALUE + "]");

        System.out.println("short 占 " + Short.SIZE + "(bit)" + "--------" + "short 的默认值：[" + shortDefaultValue + "] short 的数据范围：[" + Short.MIN_VALUE + ", " + Short.MAX_VALUE + "]");

        System.out.println("int 占 " + Integer.SIZE + "(bit)"  + "--------" +  "int 的默认值：[" + intDefaultValue + "] int 的数据范围：[" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + "]");

        System.out.println("long 占 " + Long.SIZE + "(bit)" + "--------" + "long 的默认值：[" + longDefaultValue + "] long 的数据范围：[" + Long.MIN_VALUE + ", " + Long.MAX_VALUE + "]");

        System.out.println("float 占 " + Float.SIZE + "(bit)" + "--------" + "float 的默认值：[" + floatDefaultValue + "]");

        System.out.println("double 占 " + Double.SIZE + "(bit)" + "--------" + "double 的默认值：[" + doubleDefaultValue + "]");

        System.out.println("boolean 的默认值：" + booleanDefaultValue);

        System.out.println("char 占 " + Character.SIZE + "(bit)" + "--------" + "char 的默认值：[" + charDefaultValue + "]");


        System.out.println("char 的默认值是 '\\u0000': " + (charDefaultValue == '\u0000'));

    }

    /**
     * 计算 a^n 的值
     *
     * @param a
     * @param n
     * @return
     */
    public static long pow(int a, int n) {
        if (n == 1) {
            return a;
        }
        long result = 1;
        for (int i = 0; i < n; i ++) {
            result = result * a;
        }
        return result;

    }
}
