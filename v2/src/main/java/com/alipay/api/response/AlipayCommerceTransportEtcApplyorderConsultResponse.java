package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.applyorder.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-13 15:21:46
 */
public class AlipayCommerceTransportEtcApplyorderConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2864558395464414224L;

	/** 
	 * 用户有未完成的行程，不能注销，结合consult_result判断
	 */
	@ApiField("consult_desc")
	private String consultDesc;

	/** 
	 * 注销咨询-可以注销
	 */
	@ApiField("consult_result")
	private Boolean consultResult;

	/** 
	 * 注销咨询
	 */
	@ApiField("consult_scene")
	private String consultScene;

	public void setConsultDesc(String consultDesc) {
		this.consultDesc = consultDesc;
	}
	public String getConsultDesc( ) {
		return this.consultDesc;
	}

	public void setConsultResult(Boolean consultResult) {
		this.consultResult = consultResult;
	}
	public Boolean getConsultResult( ) {
		return this.consultResult;
	}

	public void setConsultScene(String consultScene) {
		this.consultScene = consultScene;
	}
	public String getConsultScene( ) {
		return this.consultScene;
	}

}
