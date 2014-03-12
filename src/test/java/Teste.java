import javax.persistence.EntityManager;

import br.com.dk.venda.entidade.Usuario;
import br.com.dk.venda.util.JPAUtil;


public class Teste {
	
	public static void main(String[] args){
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Usuario usu = new Usuario();
		
		usu.setNome("Bruno Theodoro de Aquino");
		usu.setEmail("theodorodeaquino@gmail.com");
		usu.setSenha("qwe123");
		
		try{
			em.getTransaction().begin();
			em.persist(usu);
			em.getTransaction().commit();
		}catch(RuntimeException e){
			em.getTransaction().rollback();
		}
		
		em.close();
	}

}
