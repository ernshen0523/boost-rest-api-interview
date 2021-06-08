package posmy.interview.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import posmy.interview.boot.dao.MemberDao;
import posmy.interview.boot.pojo.BookPOJO;
import posmy.interview.boot.pojo.ResponsePOJO;
import posmy.interview.boot.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
    
	@Autowired MemberDao memberDao;
	
	@Override
	public ResponsePOJO viewBook(Long bookId) throws Exception {
		ResponsePOJO response = new ResponsePOJO();
		BookPOJO bookDetails = memberDao.viewBook(bookId);
		
		if(bookDetails != null) {
			response.setStatus("Success");
			response.setMessage("Book is found");
			response.setBookDetails(bookDetails);
		} else {
			response.setStatus("Failed");
			response.setMessage("Book is not found");
		}
		
		return response;
	}

	@Override
	public ResponsePOJO borrowBook(Long bookId) {
		ResponsePOJO response = new ResponsePOJO();
		Integer borrowBook = memberDao.borrowBook(bookId);
		
		if(borrowBook != 1) {
			response.setStatus("Success");
			response.setMessage("Book has been borrowed successfully");
		} else {
			response.setStatus("Failed");
			response.setMessage("Failed to borrow the book");
		}
		
		return response;
	}

	@Override
	public ResponsePOJO returnBook(Long bookId) {
		ResponsePOJO response = new ResponsePOJO();
		Integer returnBook = memberDao.returnBook(bookId);
		
		if(returnBook != 1) {
			response.setStatus("Success");
			response.setMessage("Book has been returned successfully");
		} else {
			response.setStatus("Failed");
			response.setMessage("Failed to return the book");
		}
		
		return response;
	}

	@Override
	public ResponsePOJO deleteAccount(Long memberId) {
		ResponsePOJO response = new ResponsePOJO();
		Integer deleteAccount = memberDao.deleteAccount(memberId);
		
		if(deleteAccount != 1) {
			response.setStatus("Success");
			response.setMessage("Account has been deleted successfully");
		} else {
			response.setStatus("Failed");
			response.setMessage("Failed to delete the account");
		}
		
		return response;
	}
}