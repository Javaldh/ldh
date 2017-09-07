package ldh.test.biz;

import junit.framework.TestCase;
import ldh.core.bank.biz.BankChannelBiz;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TsBankChannelBiz extends TestCase {

	ClassPathXmlApplicationContext context;

	BankChannelBiz bankChannelBiz;

	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
		super.setUp();
		bankChannelBiz = (BankChannelBiz) context.getBean("bankChannelBiz");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		context = null;
	}

	public void testA() {
	}
}
