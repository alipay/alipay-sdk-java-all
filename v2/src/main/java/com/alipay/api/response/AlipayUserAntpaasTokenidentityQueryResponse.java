package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.tokenidentity.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserAntpaasTokenidentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1714453521638467426L;

	/** 
	 * 蚂蚁通行证Id
	 */
	@ApiField("ant_id")
	private String antId;

	/** 
	 * 扩展信息,业务方在创建匿名用户时设置的扩展信息。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 支付宝用户Id，即匿名用户Id
	 */
	@ApiField("user_id")
	private String userId;

	public void setAntId(String antId) {
		this.antId = antId;
	}
	public String getAntId( ) {
		return this.antId;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
