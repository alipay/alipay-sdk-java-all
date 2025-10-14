package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.applyorder.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-09 18:40:44
 */
public class AlipayCommerceTransportEtcApplyorderConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3259332386886753221L;

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
