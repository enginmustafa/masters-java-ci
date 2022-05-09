package uni.pu.fmi.sa.cidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiDemoController {
	@GetMapping("/")
	public String getName() {
		return "CI Demo";
	}
	
	private void travisTest() {	}
}