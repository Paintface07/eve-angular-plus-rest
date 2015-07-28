package eve.angular.app.model.crest;

public class EveApiAuth {
//	@Getter @Setter 
	private String vCode;
//	@Getter @Setter 
	private String apiKey;
	
	public EveApiAuth(){}
	
	public EveApiAuth(String vCode, String apiKey) {
		this.vCode = vCode;
		this.apiKey = vCode;
	}

	public String getvCode() {
		return vCode;
	}

	public void setvCode(String vCode) {
		this.vCode = vCode;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
}
