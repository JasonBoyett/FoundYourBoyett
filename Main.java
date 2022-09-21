/* 
 * Jason Boyett - jaboye2448
 * CIT 4423 01
 * Sept 20, 2022
 * macOS
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        String findIn = JOptionPane.showInputDialog(frame,"enter some random characters!", "");
        if(findIn.equals(null)){
            System.exit(0);
        }
        String findThis = JOptionPane.showInputDialog(frame,"enter the characters you want me to find");
        if(findThis.equals(null)){
            System.exit(0);
        }
        System.out.println(findThis);
        String pattern = findPattern(findIn, findThis);
        if(!pattern.equals("")) {
            JOptionPane.showMessageDialog(frame, "your pattern is" + pattern);
        }
        else if(pattern.equals("")) {
            JOptionPane.showMessageDialog(null, "your pattern does not exist");
        }
        System.exit(0);
    }

    public static String findPattern(String findIn, String findThis){
        try{
        String pattern = "";
        for(int i = 0; i < findThis.length(); i++){
            for(int j = 0; j < findIn.length(); j++){
                if(findThis.charAt(i) == findIn.substring(j).charAt(0)){
                    pattern += " " + String.valueOf(j + 1);
                    findIn = findIn.substring(0,j) + " " + findIn.substring(j+1,findIn.length());
                    break;
                }
            }
        
        }
        return pattern;
        }
        catch(Exception e){
            System.exit(0);
            return "";
        }
    }
}