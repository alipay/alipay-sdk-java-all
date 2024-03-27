package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.open.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:46:42
 */
public class AntfortuneStockOpenStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6126469427451151722L;

	/** 
	 * 用户在该机构的签约协议号，是支付宝用户在该机构的唯一标识
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 用户在该机构的开绑户状态
	 */
	@ApiField("status")
	private String status;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
