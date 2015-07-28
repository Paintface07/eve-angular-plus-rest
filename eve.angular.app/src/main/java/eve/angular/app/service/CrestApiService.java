package eve.angular.app.service;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;


@Service
public abstract class CrestApiService<I, O> {
//	protected final String ROOT;
//	private final HttpEntity<I> inputType;
//	private final O outputType;
//	
//	public CrestApiService(HttpEntity<I> inputType, O outputType, String root) {
//		this.ROOT = root;
//		this.inputType = inputType;
//		this.outputType = outputType;
//	}
//	
//	public O get() {
//		Object response = new RestTemplate().getForEntity(ROOT, outputType.getClass());
//		O value = null;
//		try {
//			value = (O) response;
//		} catch (ClassCastException cce) {
//			
//		}
//		return value;
//	}

}
