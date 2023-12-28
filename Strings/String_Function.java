public class String_Function {
     public static void main(String[] args) {
        String s1="Sanika";
        String s2="Sanika";
        String s3=new String("Sanika");
        if(s1==s2){
            System.out.println("Strings are equal");
        }else{
             System.out.println("Strings are not equal");
        }

        // if(s1==s3){  //It prints strings are not equal
        //     System.out.println("Strings are equal");  
        // }else{
        //      System.out.println("Strings are not equal");
        // }

        if(s1.equals(s3)){  //It prints strings are equal
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        

     }
}
