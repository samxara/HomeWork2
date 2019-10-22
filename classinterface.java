package com.company;

public class ClassInterface implements FirstInterface {
    int a;
    int b;

    @Override
    public void NumbersBetweenAandB(int a, int b) {
            for (var i = a; i < b; i++) {
                System.out.println(i); }
    }

    @Override
    public void SeparateNumbers(int a) {
        for(var i = 1; i <= a; i++) {
            if(a % i == 0) {
                System.out.println(i);
                i++;}
        }
    }

    @Override
    public void EasySeparateNumbers(int b) {

        int i =0;
        int num =0;
        String  basicNumbers = "";
        for (i = 1; i <= b; i++)
        {
            int count=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    count = count + 1;
                }
            }
            if (count ==2)
            {
                basicNumbers = basicNumbers + i + " "; }
        }
        System.out.println(basicNumbers);
    }

    @Override
    public int NumberThatIsOftenRepeated() {
        return 0; }
}
