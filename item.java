You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
for(int i =0;i<items.size();i++)
{
switch(ruleKey){
case "type":
if(items.get(i).get(0).equals(ruleValue)){
count++;
}
break;
case "color":
if(items.get(i).get(1).equals(ruleValue)){
count++;
}
break;
case "name":
if(items.get(i).get(2).equals(ruleValue)){
count++;
}
break;
default:
break;
}

    }
    return count;
    }
}