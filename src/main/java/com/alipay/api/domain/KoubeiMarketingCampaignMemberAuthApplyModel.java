package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑会员授权
 *
 * @author auto create
 * @since 1.0, 2022-07-05 17:42:34
 */
public class KoubeiMarketingCampaignMemberAuthApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5686812994111564979L;

	/**
	 * token
	 */
	@ApiField("auth_token")
	private String authToken;

	public String getAuthToken() {
		return this.authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

}
