package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.benefit.purchase.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-23 15:52:29
 */
public class AlipayCommerceMedicalBenefitPurchaseCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 1124314779315961319L;

	/** 
	 * 业务码
	 */
	@ApiField("res_code")
	private String resCode;

	/** 
	 * true：校验通过，false：校验失败
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
