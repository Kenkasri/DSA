class Solution {
  public void paraenthesis(List<String>list,int n,String s,int op,int cp){
    if(s.length()==n*2){
      list.add(s);
      return;
    }
    if(op<n){
       paraenthesis(list,n,s+'(',op+1,cp);
    }
    if(cp<op){
      paraenthesis(list,n,s+')',op,cp+1);
    }
  }
    public List<String> generateParenthesis(int n) {
       List<String>list =  new ArrayList<>();
       paraenthesis(list,n,"",0,0);
       return list; 
    }
}