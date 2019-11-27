package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构核销用户账单
 *
 * @author auto create
 * @since 1.0, 2017-08-30 17:02:42
 */
public class AlipayPcreditLoanBillVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2657763971122971395L;

	/**
	 * 贷款申请单号，客户申请贷款时借呗系统生成的全局唯一业务流水号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/**
	 * 外部业务订单号，请求的幂等字段，销用户账时机构生成的唯一交易订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 申请销账金额，机构销用户账金额，元为单位，精确到小数点后两位
	 */
	@ApiField("repay_amt")
	private String repayAmt;

	public String getLoanApplyNo() {
		return this.loanApplyNo;
	}
	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRepayAmt() {
		return this.repayAmt;
	}
	public void setRepayAmt(String repayAmt) {
		this.repayAmt = repayAmt;
	}

}
