package guru.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;

@Configuration

public class PropertyConfig {

	@Value("${guru.username}")
	String user;
	
	@Value("${guru.password}")
	String password;
	
	@Value("${guru.dburl}")
	String url;
	
	@Value("${guru.jms.username}")
	String jmsUser;
	
	@Value("${guru.jms.password}")
	String jmsPassword;
	
	@Value("${guru.jms.dburl}")
	String jmsUrl;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(user);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}
	
	@Bean 
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker jms = new FakeJmsBroker();
		jms.setUser(jmsUser);
		jms.setPassword(jmsPassword);
		jms.setUrl(jmsUrl);
		return jms;
	}
	

}
