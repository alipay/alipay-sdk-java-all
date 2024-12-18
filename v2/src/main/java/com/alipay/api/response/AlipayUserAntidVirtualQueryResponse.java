package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antid.virtual.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:13
 */
public class AlipayUserAntidVirtualQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2596887516243195836L;

	/** 
	 * 蚂蚁通行证ID
	 */
	@ApiField("ant_id")
	private String antId;

	/** 
	 * 额外附加信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 蚂蚁虚拟账户ID
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
