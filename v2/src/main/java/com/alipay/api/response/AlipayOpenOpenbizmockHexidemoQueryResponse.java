package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openbizmock.hexidemo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-08 21:04:50
 */
public class AlipayOpenOpenbizmockHexidemoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7799368647835538482L;

	/** 
	 * 调用信息
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
