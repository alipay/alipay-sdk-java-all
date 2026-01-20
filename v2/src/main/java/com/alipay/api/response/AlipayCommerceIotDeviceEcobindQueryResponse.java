package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.ecobind.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:24:15
 */
public class AlipayCommerceIotDeviceEcobindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4567927256587132566L;

	/** 
	 * 可选项[Y,N]，Y表示有绑定数据，N表示没有绑定数据
	 */
	@ApiField("bind")
	private String bind;

	/** 
	 * 绑定类型，可选项[SUB_MERCHANT,DIRECT_MERCHANT]
	 */
	@ApiField("bind_type")
	private String bindType;

	/** 
	 * 间联商户或者直连商户的用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setBind(String bind) {
		this.bind = bind;
	}
	public String getBind( ) {
		return this.bind;
	}

	public void setBindType(String bindType) {
		this.bindType = bindType;
	}
	public String getBindType( ) {
		return this.bindType;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
