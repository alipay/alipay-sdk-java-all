package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.info.simple.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:03
 */
public class KoubeiMerchantInfoSimpleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8834889418446556164L;

	/** 
	 * 操作员登录账号前缀，例如cc123@alitest.com#001
	 */
	@ApiField("operator_prefix")
	private String operatorPrefix;

	/** 
	 * 商户id，2088121509924973
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	public void setOperatorPrefix(String operatorPrefix) {
		this.operatorPrefix = operatorPrefix;
	}
	public String getOperatorPrefix( ) {
		return this.operatorPrefix;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
