package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.creditrisk.dsdd.admit.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:39:56
 */
public class MybankCreditCreditriskDsddAdmitConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6447242891643434613L;

	/** 
	 * 在status为ADMIT时，此字段必填。
表示准入额度对应的等级，等级越高，额度越大。
目前值为1-3。
	 */
	@ApiField("amt_grade")
	private String amtGrade;

	/** 
	 * 表示准入查询结果的状态信息。
ADMIT：准入
NO_ADMIT：不准入
	 */
	@ApiField("status")
	private String status;

	public void setAmtGrade(String amtGrade) {
		this.amtGrade = amtGrade;
	}
	public String getAmtGrade( ) {
		return this.amtGrade;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
