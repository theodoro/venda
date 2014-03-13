import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;

import org.hibernate.jpa.boot.internal.ParsedPersistenceXmlDescriptor;

import br.com.dk.venda.entidade.Cliente;
import br.com.dk.venda.entidade.Usuario;
import br.com.dk.venda.util.JPAUtil;


public class Teste {
	
	public static void main(String[] args){
		
		EntityManager em = JPAUtil.getEntityManager();
		
		/*Usuario usu = new Usuario();
		
		usu.setNome("Bruno Theodoro de Aquino");
		usu.setEmail("theodorodeaquino@gmail.com");
		usu.setSenha("qwe123");*/
		
		Cliente cli = new Cliente();
		
		cli.setNome("Bruno Theodoro de Aquino");
		cli.setCpf("000.000.000-00");
		cli.setEmail("theodorodeaquino@gmail.com");
		cli.setEndereco("Hermenegildo Gomes de Castro");
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		String data = "25/04/1986";
		
		try {
			cli.setDataNasc(sd.parse(data));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try{
			em.getTransaction().begin();
			em.persist(cli);
			em.getTransaction().commit();
		}catch(RuntimeException e){
			em.getTransaction().rollback();
		}
		
		em.close();
	}

}
