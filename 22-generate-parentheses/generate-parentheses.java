class Solution {
  public void parenthesis(int n,List<String>list,int op,int cp,String s){
    if(s.length()==n*2){
      list.add(s);
      return;
    }
    if(op<n){
      parenthesis(n,list,op+1,cp,s+'(');

    }
    if(cp<op){
      parenthesis(n,list,op,cp+1,s+')');
    }
  }
    public List<String> generateParenthesis(int n) {
     List<String>list = new ArrayList<>();
     parenthesis(n,list,0,0,"");
     return list;

    }
}