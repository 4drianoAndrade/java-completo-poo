package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		// INSERÇÃO DE DADOS
//		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
//		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
//		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		// INSERÇÃO DE DADOS
//		em.getTransaction().begin(); // APENAS UMA SIMPLES CONSULTA QUE NÃO UTILIZA O 'getTransaction()'
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit(); // PARA AS DE MAIS SÃO NECESSÁRIAS: (INSERT, UPDATE, DELETE)

		// RECUPERAÇÃO DE DADOS
//		Pessoa p = em.find(Pessoa.class, 2);
//		System.out.println(p);

		// OBJETOS MONITORADOS
		// DELEÇÃO DE DADOS / COMANDO ACEITO POIS É UM OBJETO QUE ACABOU DE SER INSERIDO
//		Pessoa p = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
//		em.remove(p);

		// DELEÇÃO DE DADOS / COMANDO ACEITO POIS O OBJETO FOI BUSCADO DO BANCO DE DADOS
		// E AINDA NÃO FOI FECHADO O 'EntityManager'
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();

		System.out.println("Pronto!");
		em.close();
		emf.close();
	}
}
