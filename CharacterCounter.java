public class CharacterCounter
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    String str = "ASCII, abbreviated from American Standard Code for Information Interchange, is a character encoding standard for electronic communication. ASCII codes represent text in computers, telecommunications equipment, and other devices.";
    
    int[] alphaIndex = new int[27];
    int index = 0;
    for(int i = 0 ; i < str.length(); i++){
      index = getIndexOfChar(str.charAt(i));
      alphaIndex[index]++;
    }
    
    
    for(int i = 0 ; i < alphaIndex.length-1 ; i++){
      char c = (char)(65 + i);
    System.out.println(c + "-"+alphaIndex[i]+"\n");
    }
      
  }
  
  public static int getIndexOfChar(char c){
    int val = (int) c;
    
    if(97<= val && val <=122 ){
      return val - 97;
    }
    else if(65<= val && val <=90){
      return val - 65;
    }
    else{
      return 26;
    }
      
  }     
}
