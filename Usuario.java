import java.util.ArrayList;
	
public class Usuario {
	private String login;
	private String senha;
	 
	public ArrayList<Tweet> tweet;
	
	public Usuario()
	{
		this.tweet=new ArrayList<>(); 
	}
	
   public void setLogin(String log){
		
		this.login=log;
	}
    
    public String getLogin(){
    	return this.login;
    }
    
 public void setSenha(String senha){
		
		this.senha=senha;
	}
    
    public String getSenha(){
    	return this.senha;
    }
    
    public void efetuarLogin(){
    	 if (senha.equalsIgnoreCase("poo")){
         	System.out.println("Acesso OK!");
         }
    	 else{
    		 System.exit(0);
    	 }
    }
    public  void listar ()
	 {
		 System.out.println("Usuário: "+ login);
		 for(int i = 0; i < tweets.size(); i++) 
		 {
			 System.out.println((tweets.get(i).getDescricao()));
		 }  
	 }
}
