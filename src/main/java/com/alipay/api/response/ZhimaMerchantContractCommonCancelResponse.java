package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.common.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-09 10:50:17
 */
public class ZhimaMerchantContractCommonCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7885493657258213573L;

	/** 
	 * 业务结果返回值
	 */
	@ApiField("biz_data")
	private String bizData;

	/** 
	 * 业务结果，成功或失败
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 错误描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	public void setBizData(String bizData) {
		this.bizData = bizData;
	}
	public String getBizData( ) {
		return this.bizData;
	}

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

}
