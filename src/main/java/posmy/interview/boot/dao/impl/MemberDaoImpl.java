package posmy.interview.boot.dao.impl;

import org.springframework.stereotype.Repository;
import posmy.interview.boot.dao.MemberDao;
import posmy.interview.boot.pojo.BookPOJO;

@Repository
public class MemberDaoImpl implements MemberDao {

	
	@Override
	public BookPOJO viewBook(Long bookId) {
		
		BookPOJO bookDetails = new BookPOJO();
		//Insert the code to select the book details based on bookId
		
		return bookDetails;
	}

	@Override
	public Integer borrowBook(Long bookId) {
		
		Integer borrowBookResult = 0;
		//Insert the code to borrow the book based on bookId and which the book status is AVAILABLE and update the book status to BORROW
		
		return borrowBookResult;
	}

	@Override
	public Integer returnBook(Long bookId) {
		
		Integer returnBookResult = 0;
		//Insert the code to return the book based on bookId and update the book status to AVAILABLE
		
		return returnBookResult;
	}

	@Override
	public Integer deleteAccount(Long memberId) {
		
		Integer deleteAccountResult = 0;
		//Insert the code to delete the member account based on memberId and which the member status is ACTIVE and update the member status to DELETED
		
		return deleteAccountResult;
	}
    
	
}