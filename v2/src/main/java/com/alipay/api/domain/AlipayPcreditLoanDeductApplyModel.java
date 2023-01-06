package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款强扣申请
 *
 * @author auto create
 * @since 1.0, 2018-07-27 23:08:17
 */
public class AlipayPcreditLoanDeductApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2114162272562433474L;

	/**
	 * 贷款申请单号，客户申请贷款时借呗系统生成的全局唯一业务流水号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/**
	 * 备注信息，机构填写的发起强扣申请的原因，要求尽量详细
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作人名称，机构操作发起强扣人员姓名，用于信息追溯
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 外部请求幂等流水号，请求的幂等字段，申请用户贷款强扣时由机构生成的唯一请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getLoanApplyNo() {
		return this.loanApplyNo;
	}
	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
