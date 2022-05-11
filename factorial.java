
class Solution {
    static ArrayList<Integer> factorial(int n){
        //code here
      java.math.BigInteger[] fact=new java.math.BigInteger[n+1];
      fact[1]=java.math.BigInteger.valueOf(1);
      for(int i=2;i<=n;i++){
          fact[i]=fact[i-1].multiply(java.math.BigInteger.valueOf(i));
      }
      char[] ans=fact[n].toString().toCharArray();
      ArrayList<Integer>sol=new ArrayList<>();
      for(int i=0;i<ans.length;i++){
          sol.add(ans[i]-'0');
      }
      return sol;
    }
}