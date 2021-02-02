package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑会员授权
 *
 * @author auto create
 * @since 1.0, 2019-03-06 15:53:38
 */
public class KoubeiMarketingCampaignMemberAuthApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8424953149554122682L;

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
