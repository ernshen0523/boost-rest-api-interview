package posmy.interview.boot.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import posmy.interview.boot.pojo.RequestPOJO;
import posmy.interview.boot.pojo.ResponsePOJO;
import posmy.interview.boot.service.LibrarianService;

@RestController
@RequestMapping("/librarian")
public class LibrarianResourse {

	@Autowired LibrarianService librarianService;
	
	@PostMapping(value = "/book/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponsePOJO addBook(@RequestBody RequestPOJO requestBody) throws Exception {
		
		ResponsePOJO response = new ResponsePOJO();
		
		response = librarianService.addBook(requestBody);
		
		return response;
		
	}
	
	@PutMapping(value = "/book/update", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponsePOJO updateBook(@RequestBody RequestPOJO requestBody) throws Exception {
		
		ResponsePOJO response = new ResponsePOJO();

		response = librarianService.updateBook(requestBody);
		
		return response;
		
	}
	
	@DeleteMapping(value = "/book/remove", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponsePOJO removeBook(@RequestParam Long bookId) throws Exception {
		
		ResponsePOJO response = new ResponsePOJO();

		response = librarianService.removeBook(bookId);
		
		return response;
		
	}
	
	@PostMapping(value = "/member/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponsePOJO addMember(@RequestBody RequestPOJO requestBody) throws Exception {
		
		ResponsePOJO response = new ResponsePOJO();

		response = librarianService.addMember(requestBody);
		
		return response;
		
	}
	
	@GetMapping(value = "/member/view", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponsePOJO viewMember(@RequestParam Long memberId) throws Exception {
		
		ResponsePOJO response = new ResponsePOJO();

		response = librarianService.viewMember(memberId);
		
		return response;
		
	}
	
	@PutMapping(value = "/member/update", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponsePOJO updateMember(@RequestBody RequestPOJO requestBody) throws Exception {
		
		ResponsePOJO response = new ResponsePOJO();

		response = librarianService.updateMember(requestBody);
		
		return response;
		
	}

	@DeleteMapping(value = "/member/remove", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponsePOJO removeMember(@RequestParam Long memberId) throws Exception {
		
		ResponsePOJO response = new ResponsePOJO();

		response = librarianService.removeMember(memberId);
		
		return response;
		
	}
	
}