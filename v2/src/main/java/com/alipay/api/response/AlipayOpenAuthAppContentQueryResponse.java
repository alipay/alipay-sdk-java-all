package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Agreement;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.app.content.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOpenAuthAppContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1154425197698357885L;

	/** 
	 * 授权协议列表
	 */
	@ApiListField("agreement")
	@ApiField("agreement")
	private List<Agreement> agreement;

	/** 
	 * 授权范围描述
	 */
	@ApiListField("auth_text")
	@ApiField("string")
	private List<String> authText;

	public void setAgreement(List<Agreement> agreement) {
		this.agreement = agreement;
	}
	public List<Agreement> getAgreement( ) {
		return this.agreement;
	}

	public void setAuthText(List<String> authText) {
		this.authText = authText;
	}
	public List<String> getAuthText( ) {
		return this.authText;
	}

}
