package tanweer;

class P {
    
    public static void main(String[] args) {
    String st="mom dad child";
    String[] s=st.split(" ");
    
    for(int i=0;i<s.length;i++){
    	
        String pal=s[i];
         String pal2=s[i];
         System.out.println(pal2);
         
        StringBuilder sb=new StringBuilder(pal2);
        int k=0;
        int l=sb.length()-1;
        while(k<l){
            char front=sb.charAt(k);
            char back=sb.charAt(l);
            sb.setCharAt(k,back);
            sb.setCharAt(l,front);
              k++;
              l--;
        }
        System.out.println(sb);
        
       if(sb.toString().equals(pal))
       System.out.println(pal+"===>"+"palindrom");
            
        }
  
    }
}
