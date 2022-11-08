package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.session.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-03 13:46:35
 */
public class AlipayUserSessionGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1894167973723723536L;

	/** 
	 * 用户在应用下的唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 用户在应用分组下的唯一用户标识
	 */
	@ApiField("union_id")
	private String unionId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	public String getUnionId( ) {
		return this.unionId;
	}

}
