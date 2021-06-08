package posmy.interview.boot.service;

import posmy.interview.boot.pojo.ResponsePOJO;

public interface MemberService {
   
	public ResponsePOJO viewBook(Long bookId) throws Exception;

	public ResponsePOJO borrowBook(Long bookId);

	public ResponsePOJO returnBook(Long bookId);
	
	public ResponsePOJO deleteAccount(Long memberId);
	
}