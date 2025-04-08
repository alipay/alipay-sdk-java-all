package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.user.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:37
 */
public class AlipayDataDataserviceAdUserCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6117994997449756948L;

	/** 
	 * 商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	/** 
	 * 账户id
	 */
	@ApiField("user_id")
	private Long userId;

	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}
	public Long getPrincipalId( ) {
		return this.principalId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getUserId( ) {
		return this.userId;
	}

}
