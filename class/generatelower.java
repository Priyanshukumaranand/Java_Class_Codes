public class generatelower {
    public static void main(String[] args){

        //my logic only using math function
        int[] freq=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<100;i++){
            char gen=(char)('a'+ (Math.random()*(25)));
            freq[gen-'a']++;
            gen=getRandomLowerCaseLetter();
            freq2[gen-'a']++;
        }
        for(int i=0;i<26;i++){
            System.out.println((char)('a'+i)+":"+freq[i]);
            System.out.println((char)('a'+i)+":"+freq2[i]);
        }
        //using functions
        

    }
    //teachers logic
      public static char getRandomLetter(char ch1,char ch2){
        return (char)(ch1 + Math.random()*(ch2-ch1+1));
      }
      public static char getRandomLowerCaseLetter(){
        return getRandomLetter('a','z');
      }
      public static char getRandomUpperCaseLetter(){
            return getRandomLetter('A','Z');
      }
      public static char getRandomDigitCharacter(){
            return getRandomLetter('0','9');
      }
      public static int[] countLetters(char[] chars){
        int[] counts=new int[26];
        for(int i=0;i<chars.length;i++){
            if(Character.isLetter(chars[i])){
                counts[Character.toUpperCase(chars[i])-'A']++;
            }
        }
        return counts;
      }
      public static void displayCounts(int[] counts){
        for(int i=0;i<counts.length;i++){
            if((i+1)%10==0){
                System.out.println(counts[i]+" "+(char)('A'+i));
            }else{
                System.out.print(counts[i]+" "+(char)('A'+i)+" ");
            }
        }
      }
}
