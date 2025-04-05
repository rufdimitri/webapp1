package rd.webapp1;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class Webapp1ApplicationTests {

	@Test
	void contextLoads(ApplicationContext ctx) {
		Assert.isTrue(ctx.getBeanDefinitionNames().length > 0, "Could not find loaded Beans");
	}

}
