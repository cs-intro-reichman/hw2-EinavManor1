public class Cheers {
        public static void main(String[] args) {
                 String theCheerWord = String.valueOf(args[0]);
                 int slength = theCheerWord.length();
                 String capWord = theCheerWord.toUpperCase();
                 String numRepeatCheer = String.valueOf(args[1]);
                 int i = 0;
                 while ( (slength) > i ) {
                         char letter =  capWord.charAt(i);    
                         String letter1 = String.valueOf(letter);
                         String anLetters = "AEFHILMNORSX";
                         int count  = 0;
                         Boolean didPriting = null;
                         for (int j = 0;j <= 11; j++) { 
                                 char anLetter = anLetters.charAt(j);   
                                 String anLetter1 = String.valueOf(anLetter);  
                                 if ((letter1).equals(anLetter1) ){
                                         i++;
                                         System.out.println("Give me an "+letter1+": "+letter1+"!");
                                         didPriting = true;
                                 }else { 
                                         count = count +1;
                                         }
                                 if (count > 11 && (didPriting == null)){
                                         i++;
                                         System.out.println("Give me a  "+letter1+": "+letter1+"!");
                                 }
                         }
                 }
                         System.out.println("What does that spell?");
                 int repeatCheer = Integer.parseInt(numRepeatCheer);
                 while (repeatCheer > 0){
                         System.out.println(capWord+"!!!");
                         repeatCheer = repeatCheer - 1;
                          
                 }
         
         }
 }
 //DONE