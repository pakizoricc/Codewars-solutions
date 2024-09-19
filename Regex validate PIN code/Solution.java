/*Description:
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

Examples (Input --> Output)
"1234"   -->  true
"12345"  -->  false
"a234"   -->  false*/

import java.lang.*;

public class Solution {

  public static boolean validatePin(String pin) {
    if(pin.length() != 4 && pin.length() != 6){
      return false;
    }
    for(int i = 0; i < pin.length(); i++){
      char c = pin.charAt(i);
      if(Character.isDigit(c) == true){
        continue;
      } else {
        return false;
      }
    }
    return true;
  }

}