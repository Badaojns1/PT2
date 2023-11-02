/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class MyString implements IString{
    public static boolean reverse(String name){
        StringBuilder sb = new StringBuilder(name);
        return name.equals(sb.reverse().toString())&&name.length()>1;
    }

    

    @Override
    public int f1(String str) {
        int sum=0;
        String[] s = str.split("\\s+");
        for (String string : s) {
            if(!reverse(string)) sum+=string.length();
        }
        return sum;
    }

    @Override
    public String f2(String str) {
        int[] a = new int[256];
        for(int i=0;i<str.length();i++){
            a[(int)str.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(a[(int)str.charAt(i)]>0){
                sb.append(str.charAt(i));
                a[(int)str.charAt(i)]=0;
            }
        }
        return sb.toString();
    }
}
