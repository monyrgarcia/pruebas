package mx.com.sura.cobranza.admonconfiguracion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AdmonConfiguracionServiceApplicationTests.class },
properties = { "spring.cloud.config.enabled:false" })
public class AdmonConfiguracionServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}

