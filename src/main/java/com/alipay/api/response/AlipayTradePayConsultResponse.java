package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.pay.consult response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-03 10:41:29
 */
public class AlipayTradePayConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6572352675433523288L;

	/** 
	 * 扩展信息，必须是json格式
	 */
	@ApiField("extend_infos")
	private String extendInfos;

	/** 
	 * 参考结果。AVAILABLE：可用；UNAVAILABLE：不可用。针对不关注该字段的商户，返回为空。
	 */
	@ApiField("refer_result")
	private String referResult;

	/** 
	 * 结果代码: refer_result为UNAVAILABLE时，非空。
USER_ZHIMA_AUTH_REFUSED：用户芝麻信用未授权给支付宝；
USER_ZHIMA_SCORE_REFUSED：用户芝麻分不准入；
USER_ENJOYPAY_NOT_SIGNED：用户未签约先享后付；
ENJOYPAY_AVAILABLE_AMOUNT_NOT_ENOUGH：先享后付可用额度不足；
USER_CREDIT_HAD_FREEZEN：用户授信额度被冻结
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果信息: refer_result为UNAVAILABLE时，非空。描述信息与result_code对应。
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setExtendInfos(String extendInfos) {
		this.extendInfos = extendInfos;
	}
	public String getExtendInfos( ) {
		return this.extendInfos;
	}

	public void setReferResult(String referResult) {
		this.referResult = referResult;
	}
	public String getReferResult( ) {
		return this.referResult;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
