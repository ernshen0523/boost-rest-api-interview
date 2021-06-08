package posmy.interview.boot.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestPOJO {

	private String status;
	private String message;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private BookPOJO bookDetails;
	
}