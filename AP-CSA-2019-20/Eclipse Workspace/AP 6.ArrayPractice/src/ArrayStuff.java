public class ArrayStuff {
    //problem 1
    public static int centeredAverage(int[] input1) {
        int max = input1[0], min = input1[0], center, sum = 0, divide = 0;
        for (int i = 0; i < input1.length; i++) {
            if (input1[i] > max) {
                max = input1[i];
            }
            if (input1[i] < min) {
                min = input1[i];
            }
        }
        for (int i = 0; i < input1.length; i++) {
            sum += input1[i];
            divide++;
        }
        sum -= min;
        sum -= max;
        divide -= 2;
        center = sum/divide;
        return (center);
        }
    //prblem 2
    public static boolean haveFiveThree(int[] input2) {
        int numof5s = 0, prevnum = 0;
        boolean touching5 = false;
        for (int i = 0; i < input2.length; i++) {
            if (input2[i] == 5) {
                numof5s++;
            }
        }
        for (int i = 0; i < input2.length; i++) {
            if (input2[i] == prevnum && prevnum == 5 && i!= 0) {
                touching5 = true;
            }
            prevnum = input2[i];
        }
        if (numof5s == 3 && touching5 == false) {
            return true;
        } else {
            return false;
        }
    }
    //problem 3
        
        public static boolean either37(int[] input3) {
            int prevnum = 0;
            boolean touching3 = false, touching7 = false;
            for (int i = 0; i < input3.length; i++) {
                if (input3[i] == prevnum && prevnum == 3 && i!= 0) {
                    touching3 = true;
                }
                prevnum = input3[i];
            }
            for (int i = 0; i < input3.length; i++) {
                if (input3[i] == prevnum && prevnum == 7 && i!= 0) {
                    touching7 = true;
                }
                prevnum = input3[i];
            }
              if ((touching3 == true && touching7 == false) || (touching3 == false && touching7 == true)) {
                  return true;
              } else {
                  return false;
              }
            }
 
        
        //Problem 4 
        
        public static int sum34(int[] input4) {
            int theSum = 0;
            boolean canIgnore = false;
            for (int i = 0; i < input4.length; i++)
            {
                if (input4[i] == 3)
                {
                    canIgnore = true;
                }
                if (canIgnore == false)
                {
                    theSum += input4[i];
                }
                if (input4[i] == 4 && canIgnore == true) {
                    canIgnore = false;
                }
            }
            return theSum;
              
        }
        
     }
