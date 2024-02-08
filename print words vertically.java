Given a string s. Return all the words vertically in the same order in which they appear in s.
Words are returned as a list of strings, complete with spaces when is necessary. (Trailing spaces are not allowed).
Each word would be put on only one column and that in one column there will be only one word.

class Solution {
    public List<String> printVertically(String s) {
         String[] arr = s.split("\\s+");
   
    int MaxLength = 0;
    for(String x:arr){
        if(MaxLength<x.length()){
            MaxLength = x.length();
        }
    }
    ArrayList<String> al = new ArrayList<>();
    for(int i=0;i<MaxLength;i++){
        String x = "";
    for(int j=0;j<arr.length;j++){
        if(i>arr[j].length()-1){
            x +=" ";
        }else{
        x += arr[j].charAt(i);
        }
    }
    al.add(x.replaceAll("\\s+$", ""));
    }
 return al;
    }
}