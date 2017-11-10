package ssh.service;

import java.util.List;

import ssh.dao.IndexDao;
import ssh.entity.BookCard;

public class IndexServiceImpl implements IndexService {

	// dao实例使用注入方式
	private IndexDao id;

	// 用于注入使用
	public void setId(IndexDao id) {
		this.id = id;
	}

	@Override
	public List<BookCard> getAllBookCard() {
		// 本类应该编写业务逻辑的代码，
		// 但本例没有业务逻辑，就不用写。

		// 访问数据库的代码，不会出现在service这一层
		// 交给dao来操作数据库
		List<BookCard> myBookCardList = id.getAllBookCard();

		// 进行其它的业务逻辑操作，比如增加多一个选项，是否过期
		// 本例不需要
		// ....

		return myBookCardList;
	}

}
