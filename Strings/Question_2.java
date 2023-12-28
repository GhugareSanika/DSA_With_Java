/*Given a route containing 4 directions (E,W,N,S).Find the shortest path to reach destination
   
      Input:"WNEENESENNN"
      Output:5.0

      Input:"NS"
      Output:0.0
 * 
 */


public class Question_2 {
    public static float getPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);

            //south
            if(dir=='S'){  
                y--;
            }
            //North
            else if(dir=='N'){
                y++;
            }
            //West
            else if(dir=='W'){
                x--;
            }
            else if(dir=='E'){
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return((float)Math.sqrt(X2+Y2)); //typs casting 
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getPath(path));
    }
}
