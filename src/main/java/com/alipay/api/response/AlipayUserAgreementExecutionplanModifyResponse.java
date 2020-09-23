package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.executionplan.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-18 18:52:02
 */
public class AlipayUserAgreementExecutionplanModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7279798775529864666L;

	/** 
	 * 周期性扣款产品，授权免密支付协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 商户下一次扣款时间
	 */
	@ApiField("deduct_time")
	private Date deductTime;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setDeductTime(Date deductTime) {
		this.deductTime = deductTime;
	}
	public Date getDeductTime( ) {
		return this.deductTime;
	}

}
