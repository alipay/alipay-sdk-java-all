package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SignContentBodyResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innercontent.sign response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-07 19:06:42
 */
public class AlipayOpenMiniInnercontentSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1327376538325685172L;

	/** 
	 * 加签后cert.json内容
	 */
	@ApiField("cert_json")
	private String certJson;

	/** 
	 * 逐项rsa加签内容
	 */
	@ApiListField("sign_content_list")
	@ApiField("sign_content_body_response")
	private List<SignContentBodyResponse> signContentList;

	/** 
	 * 加签后sign.json内容
	 */
	@ApiField("sign_json")
	private String signJson;

	public void setCertJson(String certJson) {
		this.certJson = certJson;
	}
	public String getCertJson( ) {
		return this.certJson;
	}

	public void setSignContentList(List<SignContentBodyResponse> signContentList) {
		this.signContentList = signContentList;
	}
	public List<SignContentBodyResponse> getSignContentList( ) {
		return this.signContentList;
	}

	public void setSignJson(String signJson) {
		this.signJson = signJson;
	}
	public String getSignJson( ) {
		return this.signJson;
	}

}
