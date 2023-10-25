package lessons.lesson7;

import java.util.Arrays;

public class StringBufferExample {
    public static void main(String[] args) {
        String str = "0123456789";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer2 = new StringBuffer("Anna - ");
        stringBuffer2.append(Integer.valueOf(2));
        stringBuffer2.append("4 ");
        stringBuffer2.append(false);
        stringBuffer2.append('\n');
        stringBuffer2.append('c');
        stringBuffer2.append(Arrays.asList(1, 2, 3));
        System.out.println(stringBuffer.substring(3));
        System.out.println(stringBuffer2);
    }
}
