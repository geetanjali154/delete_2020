package com.lambton;

public class Delete {
    public static void main(String[] args) {
        String str[]=new String[]{"australia","canada","india"};
        String str1[]=new String[3];
        int length=str.length;
        for(int i=0;i<length;i++){

            char ch[]=str[i].toCharArray();
            char b[]=new char[str[i].length()];
            int k=0;
            for(int j=0;j<ch.length;j++)
            {
                if(k>=0)
                {
                    if(ch[j]!='a')
                    {
                        b[k]=ch[j];
                        ++k;

                    }
                    else
                        continue;

                }
            }
            str1[i]=new String(b);
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(str1[j]);
        }
    }
}
