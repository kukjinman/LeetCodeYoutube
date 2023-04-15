class Solution {
    
    public class strLengthCompare implements Comparator<String> {

        public int compare(String s1, String s2)
        {
            if(s1.length() < s2.length())
            {
                return -1;
            }
            else if(s1.length() > s2.length())
            {
                return 1;
            }

            return 0;
        }
    }


    void printer(String[] strs_)
    {
        for(int i = 0; i< strs_.length; i++)
        {
            System.out.print(strs_[i] + " ");
        }
        System.out.println();
    }
    
    public String longestCommonPrefix(String[] strs) {
        String ans = "";

        if(strs.length == 1)
        {
            return strs[0];
        }

        // printer(strs);
        // System.out.println("------------");
        Arrays.sort(strs,new strLengthCompare());
        // printer(strs);

        for(int i = 0;i < strs[0].length(); i++)
        {
            boolean successFlag = false;

            for(int j = 1; j < strs.length; j++)
            {
                if(strs[0].charAt(i) == strs[j].charAt(i))
                {
                    successFlag = true;
                }else
                {
                    successFlag = false;
                    break;
                }


            }

            if( successFlag == true)
            {
                ans += strs[0].charAt(i);
            }
            else
            {
                break;
            }

        }

        return ans;
    }
}