class Solution {
    public String removeDigit(String number, char digit) {
        String maxNumber = "";
        for(int i = 0 ; i < number.length() ; i++)
        {
            if(number.charAt(i) == digit)
            {
                String newNumber = number.substring(0 ,i) + number.substring(i+1);

                if(newNumber.compareTo(maxNumber) > 0)
                {
                    maxNumber = newNumber;
                }
            }
        }
        return maxNumber;
    }
}


// optimized approach


//as generating all substrings is a big task so we are trying to avoid he multiple checks
//by thinking logically so ,as to check for the digit whose next char is greater than the respective digit check .if we get the digit with this condition 
//we return the number by eliminating the particular index and returning the result using substring

//in else condition we use a lastOccurenceOf() method to find the last occurence digit as we failed the 1st occurence one. this will be the result which we get the maximum string .
class Solution {
    public String removeDigit(String number, char digit) {
        for(int i = 0 ; i < number.length() -1 ; i++){

            if(number.charAt(i) == digit && number.charAt(i +1) > digit)
            {
                return number.substring(0 ,i) + number.substring(i+1);
            }

        }
        int lastOccurence = number.lastIndexOf(digit);

        return number.substring(0 ,lastOccurence) + number.substring(lastOccurence +1);
    
    }
}