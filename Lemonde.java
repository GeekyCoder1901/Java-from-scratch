At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. You must provide the correct change to each customer so that the net transaction is that the customer pays $5.

Note that you do not have any change in hand at first.

Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can provide every customer with the correct change, or false otherwise.

 

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] temp = new int[3];
        for(int i:bills){
            if(i==5){
                temp[0]+=1;
            }
            if(i==10){
                if(temp[0]>0){
                    temp[1]+=1;
                    temp[0]-=1;
                }
                else{
                    return false;
                }
            }
            if(i==20){
                if(temp[0]>0 && temp[1]>0){
                    temp[2]+=1;
                    temp[1]-=1;
                    temp[0]-=1;
                }
                else if(temp[0]>=3){
                    temp[2]+=1;
                    temp[0]-=3;
                }
                else{
                    return false;
                }
            }
	}
        return true;
    }
}