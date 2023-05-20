package org.example.arrays.easy;

public class ReverseString {

    public void printReversedString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }

    public void printReversedStringWithoutExtraSpace(String str) {
        char[] strArr = str.toCharArray();

        for (int start = 0, end = str.length() -1 ; start <= end; start++,end--) {
            char temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
        }
        System.out.println(new String(strArr));
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.printReversedString("abcd");
        obj.printReversedStringWithoutExtraSpace("pqrst");
    }
}

