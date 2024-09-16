/*Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.*/

//Here is my solution

public class Vowels {

    public static int getCount(String str) {
      int num_vowels = 0;
      char[] arr = new char[str.length()];
      for(int i = 0; i < str.length(); i++){
        arr[i] = str.charAt(i);
      }
      
      /*another for loop*/
      for(int j = 0; j < arr.length; j++){
        if(arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u'){
          num_vowels += 1;
        }
      }
      
      return num_vowels;
    }
  
}