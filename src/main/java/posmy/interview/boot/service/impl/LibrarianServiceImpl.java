package posmy.interview.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import posmy.interview.boot.dao.LibrarianDao;
import posmy.interview.boot.pojo.MemberPOJO;
import posmy.interview.boot.pojo.RequestPOJO;
import posmy.interview.boot.pojo.ResponsePOJO;
import posmy.interview.boot.service.LibrarianService;
import posmy.interview.boot.util.CommonUtil;

@Service
public class LibrarianServiceImpl implements LibrarianService {
    
	@Autowired CommonUtil commonUtil;
	
	@Autowired LibrarianDao librarianDao;
	
	@Override
	public ResponsePOJO addBook(RequestPOJO requestBody) throws Exception {
		
		ResponsePOJO response = new ResponsePOJO();
		boolean requestValidation = commonUtil.requestValidation(requestBody);
		
		if(requestValidation) {
			Integer addBook = librarianDao.addBook(requestBody);
			
			if(addBook == 1) {
				response.setStatus("Success");
				response.setMessage("Book has been added successfully");
			} else {
				response.setStatus("Failed");
				response.setMessage("Failed to add this book");
			}
		} else {
			response.setStatus("Failed");
			response.setMessage("Invalid request");
		}
		
		return response;
	}
	
	@Override
	public ResponsePOJO updateBook(RequestPOJO requestBody) throws Exception {
		ResponsePOJO response = new ResponsePOJO();
		boolean requestValidation = commonUtil.requestValidation(requestBody);
		
		if(requestValidation) {
			Integer updateBook = librarianDao.updateBook(requestBody);
			
			if(updateBook == 1) {
				response.setStatus("Success");
				response.setMessage("Book has been updated successfully");
			} else {
				response.setStatus("Failed");
				response.setMessage("Failed to update this book");
			}
		} else {
			response.setStatus("Failed");
			response.setMessage("Invalid request");
		}
		
		return response;
	}

	@Override
	public ResponsePOJO removeBook(Long bookId) {
		ResponsePOJO response = new ResponsePOJO();
		Integer borrowBook = librarianDao.removeBook(bookId);
		
		if(borrowBook != 1) {
			response.setStatus("Success");
			response.setMessage("Book has been removed successfully");
		} else {
			response.setStatus("Failed");
			response.setMessage("Failed to remove the book");
		}
		
		return response;
	}

	@Override
	public ResponsePOJO addMember(RequestPOJO requestBody) {
		ResponsePOJO response = new ResponsePOJO();
		boolean requestValidation = commonUtil.requestValidation(requestBody);
		
		if(requestValidation) {
			Integer addMember = librarianDao.addMember(requestBody);
			
			if(addMember == 1) {
				response.setStatus("Success");
				response.setMessage("Member has been added successfully");
			} else {
				response.setStatus("Failed");
				response.setMessage("Failed to add this member");
			}
		} else {
			response.setStatus("Failed");
			response.setMessage("Invalid request");
		}
		
		return response;
	}

	@Override
	public ResponsePOJO viewMember(Long memberId) {
		ResponsePOJO response = new ResponsePOJO();
		MemberPOJO memberdetails = librarianDao.viewMember(memberId);
		
		if(memberdetails != null) {
			response.setStatus("Success");
			response.setMessage("Member is found");
			response.setMemberDetails(memberdetails);
		} else {
			response.setStatus("Failed");
			response.setMessage("Member is not found");
		}
		
		return response;
	}

	@Override
	public ResponsePOJO updateMember(RequestPOJO requestBody) {
		ResponsePOJO response = new ResponsePOJO();
		boolean requestValidation = commonUtil.requestValidation(requestBody);
		
		if(requestValidation) {
			Integer updateMember = librarianDao.updateMember(requestBody);
			
			if(updateMember == 1) {
				response.setStatus("Success");
				response.setMessage("Member has been updated successfully");
			} else {
				response.setStatus("Failed");
				response.setMessage("Failed to update this member");
			}
		} else {
			response.setStatus("Failed");
			response.setMessage("Invalid request");
		}
		
		return response;
	}
	
	@Override
	public ResponsePOJO removeMember(Long memberId) {
		ResponsePOJO response = new ResponsePOJO();
		Integer removeMember = librarianDao.removeMember(memberId);
		
		if(removeMember != 1) {
			response.setStatus("Success");
			response.setMessage("Member has been removed successfully");
		} else {
			response.setStatus("Failed");
			response.setMessage("Failed to remove the member");
		}
		
		return response;
	}

}