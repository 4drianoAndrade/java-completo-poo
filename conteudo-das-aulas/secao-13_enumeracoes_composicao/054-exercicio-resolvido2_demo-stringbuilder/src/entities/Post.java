package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();

	public Post() {

	}

	public Post(Date moment, String title, String content, Integer likes) {

		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {

		comments.add(comment);
	}

	public void removeComment(Comment comment) {

		comments.remove(comment);
	}

	@Override
	public String toString() {

		// Devido a possibilidade da quantidade de coment�rios ser grande, a classe
		// 'StringBuilder' � mais otimizada para esse tipo de opera��o do que utilizar
		// concatena��es, al�m de consumir menos mem�ria do que um 'String.format()'

		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n"); // Converte um objeto Date para String
		sb.append(content + "\n");
		sb.append("Comments:\n");

		// Imagine um post com 200 coment�rios, usando apenas o 'toString()'
		// ter�amos que acrescentar todos manualmente: (c1, c2, c3...).

		// J� com o 'StringBuilder' � s� percorrer a lista utilizando
		// um 'for' para imprimir os coment�rios.

		for (Comment c : comments)
			sb.append(c.getText() + "\n");

		return sb.toString();
	}
}
