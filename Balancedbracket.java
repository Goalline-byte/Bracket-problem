import java.util.*;
public class Balancedbracket {
    public static void main(String[] args){
        Scanner Scn = new Scanner(System.in)
        String str = Scn.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);

            }else if(ch == ')'){
               boolean val = handleClosing(st,'(');
               if(val == false){
                   System.out.println(val);
                   return;
               }

               
            } else if(ch == '}'){
               boolean val =  handleClosing(st, '{');
                if(val == false){
                    System.out.println(val);
                    return; 

                }

            }else if(ch == ']'){
                boolean val = handleClosing(st, '[');
                if(val == false){
                    System.out.println(val);
                    return;
                }

            }else{

            }
        }

        if(st.size() == 0){
            System.out.println(true);

        }else{
            System.out.println(false);
        }



    }

   public static boolean handleClosing(Stack <Character> st, char corresoch){
    if(st.size() == 0){
        System.out.println(false);
        return;
    } else if(st.peek() != corresoch){
        System.out.println(false);
        return;
    } else {
        st.pop();
    }

   }

}
