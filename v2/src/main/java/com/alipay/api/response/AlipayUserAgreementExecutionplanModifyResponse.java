package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.executionplan.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:12
 */
public class AlipayUserAgreementExecutionplanModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4788794259458892272L;

	/** 
	 * 周期性扣款产品，授权免密支付协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 商户下一次扣款时间，格式 "yyyy-MM-dd"。
例如：用户在1月1日开通了连续包月，使用了10天又另行购买了“季度包”，如果此时商户希望“季度包”立即优先生效，在季度包结束后能继续使用连续包月，那么原定的周期就被延后了。此时可以通过本接口将预计扣款时间推后“季度包”的时长。
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
