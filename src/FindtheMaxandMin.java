public class FindtheMaxandMin {

    int a;
    int b;
    int c;

     void  FindtheMaxandMin( short a,short b,short c){


    short result= (short) ((a>b && a>c && b>c)? (a*c):(b>a && b>c && a<c) ? (b*a)  : ( c>a && c>b && b>a) ? (c*a): 0);
        System.out.println( result);
    }
    void  FindtheMaxandMin( int a,int b,int c){

        int result=  ((a>b && a>c && b>c)? (a*c):(b>a && b>c && a<c) ? (b*a)  : ( c>a && c>b && b>a) ? (c*a): 0);
        System.out.println( result);
    }
    void  FindtheMaxandMin( float a,float b,float c){


        float result= ((a>b && a>c && b>c)? (a*c):(b>a && b>c && a<c) ? (b*a)  : ( c>a && c>b && b>a) ? (c*a): 0);
        System.out.println( result);
    }




}
