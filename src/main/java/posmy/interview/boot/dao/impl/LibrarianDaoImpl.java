package posmy.interview.boot.dao.impl;

import org.springframework.stereotype.Repository;

import posmy.interview.boot.dao.LibrarianDao;
import posmy.interview.boot.pojo.MemberPOJO;
import posmy.interview.boot.pojo.RequestPOJO;

@Repository
public class LibrarianDaoImpl implements LibrarianDao {

	@Override
	public Integer addBook(RequestPOJO requestBody) {
		
		Integer addBookResult = 0;
		//Insert the code to add the book based on the book details passed in from the requestBody
		
		return addBookResult;
	}

	@Override
	public Integer updateBook(RequestPOJO requestBody) {
		
		Integer updateBookResult = 0;
		//Insert the code to add the book based on the book details passed in from the requestBody
		
		return updateBookResult;
	}

	@Override
	public Integer removeBook(Long bookId) {
		
		Integer removeBookResult = 0;
		//Insert the code to remove the book based on the bookId and which the book is currently not borrowed by anyone
		
		return removeBookResult;
	}

	@Override
	public Integer addMember(RequestPOJO requestBody) {
		
		Integer addMemberResult = 0;
		//Insert the code to add the member based on the member details passed in from the requestBody
		
		return addMemberResult;
	}

	@Override
	public MemberPOJO viewMember(Long memberId) {
		
		MemberPOJO memberDetails = new MemberPOJO();
		//Insert the code to select the member details based on memberId
		
		return memberDetails;
	}

	@Override
	public Integer updateMember(RequestPOJO requestBody) {
		
		Integer updateMemberResult = 0;
		//Insert the code to update the member based on the member details passed in from the requestBody
		
		return updateMemberResult;
	}

	@Override
	public Integer removeMember(Long memberId) {

		Integer removeMemberResult = 0;
		//Insert the code to remove the member based on the memberId and which the member currently does not have any book borrowed by him
		
		return removeMemberResult;
	}
    
	
}