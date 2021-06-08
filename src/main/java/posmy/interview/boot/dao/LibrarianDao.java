package posmy.interview.boot.dao;

import posmy.interview.boot.pojo.MemberPOJO;
import posmy.interview.boot.pojo.RequestPOJO;

public interface LibrarianDao {
    
	public Integer addBook(RequestPOJO requestBody);

	public Integer updateBook(RequestPOJO requestBody);

	public Integer removeBook(Long bookId);

	public Integer addMember(RequestPOJO requestBody);

	public MemberPOJO viewMember(Long memberId);

	public Integer updateMember(RequestPOJO requestBody);

	public Integer removeMember(Long memberId);
	
}