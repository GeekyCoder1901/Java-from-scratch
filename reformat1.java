You are given an alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).

You have to find a permutation of the string where no letter is followed by another letter and no digit is followed by another digit. That is, no two adjacent characters have the same type.

Return the reformatted string or return an empty string if it is impossible to reformat the string.

class Solution {
    public String reformat(String s) {
    Stack<Integer> stack1=new Stack<>();
    Stack<Character> stack2=new Stack<>();
    StringBuffer sb=new StringBuffer();
    int co=0,d=0;
    for(char c:s.toCharArray()){
        if(Character.isDigit(c)){
            stack1.push(c-'0');
            d++;
        }
        else{
            stack2.push(c);
            co++;
        }
    }
    if(co-d==0||co-d==1||co-d==-1){
        while(!stack1.isEmpty()&&!stack2.isEmpty()){
            sb.append(stack1.pop());
            sb.append(stack2.pop());
        }
        if(!stack1.isEmpty())sb.append(stack1.pop());
        else if(!stack2.isEmpty()) sb.insert(0,stack2.pop());
        return sb.toString();
    }
    return "";
    }
}