package posmy.interview.boot.service;

import posmy.interview.boot.pojo.RequestPOJO;
import posmy.interview.boot.pojo.ResponsePOJO;

public interface LibrarianService {
   
	public ResponsePOJO addBook(RequestPOJO requestBody) throws Exception;

	public ResponsePOJO updateBook(RequestPOJO requestBody) throws Exception;

	public ResponsePOJO removeBook(Long bookId) throws Exception;

	public ResponsePOJO addMember(RequestPOJO requestBody) throws Exception;

	public ResponsePOJO viewMember(Long memberId) throws Exception;

	public ResponsePOJO updateMember(RequestPOJO requestBody) throws Exception;

	public ResponsePOJO removeMember(Long memberId) throws Exception;
	
}