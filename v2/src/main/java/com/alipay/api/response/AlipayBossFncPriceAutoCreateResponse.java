package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.price.auto.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:52
 */
public class AlipayBossFncPriceAutoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8454496948615144359L;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 价格创建的返回结果
	 */
	@ApiField("result_detail")
	private String resultDetail;

	/** 
	 * 结果信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDetail(String resultDetail) {
		this.resultDetail = resultDetail;
	}
	public String getResultDetail( ) {
		return this.resultDetail;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
