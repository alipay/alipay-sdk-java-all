package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.withhold.task.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-23 16:44:13
 */
public class AlipayCommerceWithholdTaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2165122824173171316L;

	/** 
	 * 代扣协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 代扣任务号
	 */
	@ApiField("withhold_no")
	private String withholdNo;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setWithholdNo(String withholdNo) {
		this.withholdNo = withholdNo;
	}
	public String getWithholdNo( ) {
		return this.withholdNo;
	}

}
