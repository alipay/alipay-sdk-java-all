package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.promo.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-19 18:42:25
 */
public class AlipayCommerceMedicalPromoOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6247235579133631174L;

	/** 
	 * 业务处理码
	 */
	@ApiField("res_code")
	private String resCode;

	/** 
	 * 业务处理标识
	 */
	@ApiField("res_flag")
	private Boolean resFlag;

	/** 
	 * 业务处理描述
	 */
	@ApiField("res_msg")
	private String resMsg;

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getResCode( ) {
		return this.resCode;
	}

	public void setResFlag(Boolean resFlag) {
		this.resFlag = resFlag;
	}
	public Boolean getResFlag( ) {
		return this.resFlag;
	}

	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	public String getResMsg( ) {
		return this.resMsg;
	}

}
