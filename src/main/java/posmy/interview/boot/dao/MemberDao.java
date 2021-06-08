package posmy.interview.boot.dao;

import posmy.interview.boot.pojo.BookPOJO;

public interface MemberDao {
    
	public BookPOJO viewBook(Long bookId);

	public Integer borrowBook(Long bookId);

	public Integer returnBook(Long bookId);

	public Integer deleteAccount(Long memberId);
	
}