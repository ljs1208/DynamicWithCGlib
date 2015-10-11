

import com.proxy.CglibProxy;
import com.test.impl.TestNumberImpl;

public class test {
	public static void main(String[] args) {
		
		CglibProxy proxy = new CglibProxy();
		TestNumberImpl test = (TestNumberImpl) proxy.getProxy(TestNumberImpl.class);
		test.create();
		//TestNumber test = (TestNumber)Proxy.newProxyInstance(TestNumberImpl.class.getClassLoader(), TestNumberImpl.class.getInterfaces(),new MyProxy(new TestNumberImpl()));
		//Integer number = test.add(3, 4);
		//System.out.println(number);
	}
}
