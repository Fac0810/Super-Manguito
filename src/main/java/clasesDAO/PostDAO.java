package clasesDAO;

import clases.Post;

public interface PostDAO extends GenericDAO<Post> {
	public Post recuperarPost(long id);
}
