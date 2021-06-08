package posmy.interview.boot.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import posmy.interview.boot.pojo.ResponsePOJO;
import posmy.interview.boot.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberResourse {
    
	@Autowired MemberService memberService;
	
	@GetMapping(value = "/book/view", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponsePOJO viewBook(@RequestParam Long bookId) throws Exception {
		
		ResponsePOJO response = new ResponsePOJO();
		
		response = memberService.viewBook(bookId);
		
		return response;
		
	}
	
	@PutMapping(value = "/book/borrow", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponsePOJO borrowBook(@RequestParam Long bookId) {
		
		ResponsePOJO response = new ResponsePOJO();
		
		response = memberService.borrowBook(bookId);
		
		return response;
		
	}
	
	@PutMapping(value = "/book/return", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponsePOJO returnBook(@RequestParam Long bookId) {
		
		ResponsePOJO response = new ResponsePOJO();

		response = memberService.returnBook(bookId);
		
		return response;
		
	}
	
	@DeleteMapping(value = "/account/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponsePOJO deleteAccount(@RequestParam Long memberId) {
		
		ResponsePOJO response = new ResponsePOJO();

		response = memberService.deleteAccount(memberId);
		
		return response;
		
	}
	
}