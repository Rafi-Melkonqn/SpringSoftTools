package master.soft.tools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {

	@GetMapping("/")
	String fn() {
		return "Rafi Melkonyan 1901717002";
	}
}
