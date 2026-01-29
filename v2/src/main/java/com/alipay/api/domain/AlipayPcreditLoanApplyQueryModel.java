package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款申请信息查询
 *
 * @author auto create
 * @since 1.0, 2018-07-18 10:45:56
 */
public class AlipayPcreditLoanApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2866869188313967235L;

	/**
	 * 贷款申请单号，借呗客户申请贷款时系统生成的全局唯一业务流水号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	public String getLoanApplyNo() {
		return this.loanApplyNo;
	}
	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

}
