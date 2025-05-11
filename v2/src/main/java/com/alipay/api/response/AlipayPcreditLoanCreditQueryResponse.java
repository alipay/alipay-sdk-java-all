package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SchemaVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.credit.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:07:23
 */
public class AlipayPcreditLoanCreditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7847736385691949193L;

	/** 
	 * 用户授信额度
	 */
	@ApiField("credit_amt")
	private String creditAmt;

	/** 
	 * 用户可用额度
	 */
	@ApiField("loanable_amt")
	private String loanableAmt;

	/** 
	 * 授信申请拒绝码
	 */
	@ApiField("reject_code")
	private String rejectCode;

	/** 
	 * 授信申请拒绝说明
	 */
	@ApiField("reject_message")
	private String rejectMessage;

	/** 
	 * 用户还款日
	 */
	@ApiField("repay_day")
	private Long repayDay;

	/** 
	 * 贷款产品方案
	 */
	@ApiField("schema")
	private SchemaVO schema;

	/** 
	 * 用户准入与授信状态，取值范围{PASS, REJECT, PENDING, PROCESSING}：PASS-通过; REJECT-拒绝; PENDING-待申请; PROCESSING-申请处理中;
	 */
	@ApiField("status")
	private String status;

	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}
	public String getCreditAmt( ) {
		return this.creditAmt;
	}

	public void setLoanableAmt(String loanableAmt) {
		this.loanableAmt = loanableAmt;
	}
	public String getLoanableAmt( ) {
		return this.loanableAmt;
	}

	public void setRejectCode(String rejectCode) {
		this.rejectCode = rejectCode;
	}
	public String getRejectCode( ) {
		return this.rejectCode;
	}

	public void setRejectMessage(String rejectMessage) {
		this.rejectMessage = rejectMessage;
	}
	public String getRejectMessage( ) {
		return this.rejectMessage;
	}

	public void setRepayDay(Long repayDay) {
		this.repayDay = repayDay;
	}
	public Long getRepayDay( ) {
		return this.repayDay;
	}

	public void setSchema(SchemaVO schema) {
		this.schema = schema;
	}
	public SchemaVO getSchema( ) {
		return this.schema;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
