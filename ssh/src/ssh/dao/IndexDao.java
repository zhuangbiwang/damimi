package ssh.dao;

import java.util.List;

import ssh.entity.BookCard;

//创建IndexDao(接口类)
public interface IndexDao {

	public List<BookCard> getAllBookCard();

}