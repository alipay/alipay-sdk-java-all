package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.institution.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:37
 */
public class AlipayUserAccountInstitutionCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4339524319764384984L;

	/** 
	 * 机构是否存在的标示
如果此机构存在，exist返回值为T
如果此机构不存在，exist返回为F
	 */
	@ApiField("match")
	private String match;

	/** 
	 * 该帐号对应的uid
	 */
	@ApiField("user_id")
	private String userId;

	public void setMatch(String match) {
		this.match = match;
	}
	public String getMatch( ) {
		return this.match;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
