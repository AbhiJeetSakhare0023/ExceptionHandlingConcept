class Sample{
    public static void div()
    {
        int a=10;
        int b=0;
        int c=a/b; // unexpected stmt i.e c=10/0 // 3
        // when line 6 encountered div() creates exception
        // includes : 1.name, 2.description 3.location
        // handover to jvm then jvm checks is any exception handling code present in div or not
        // if not then goes to caller method i.e main check
        // there also but there also not present
        // then finally calls to default exception handler i.e printStackTrace()
        // default exception handler provides complete info of exception
        System.out.println("Exception Occured"); // not execute
        System.out.println(c);
        int arr[] = new int[3];
        arr[4]=55;
    }
    public static void main(String[] args) { // 1
        div(); // 2

    }
}

