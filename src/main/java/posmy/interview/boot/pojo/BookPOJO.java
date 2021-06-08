package posmy.interview.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookPOJO {

	private String bookId;
	private String bookName;
	private String borrowStatus;
	
}