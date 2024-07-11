package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期扣执行计划修改接口
 *
 * @author auto create
 * @since 1.0, 2024-06-25 15:31:36
 */
public class AlipayUserAgreementCyclepayauthplansModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5622795625435358236L;

	/**
	 * 代扣协议协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 单笔支付金额，单位是元
	 */
	@ApiField("single_amount")
	private String singleAmount;

	/**
	 * 总扣款期数
	 */
	@ApiField("total_payments")
	private String totalPayments;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getSingleAmount() {
		return this.singleAmount;
	}
	public void setSingleAmount(String singleAmount) {
		this.singleAmount = singleAmount;
	}

	public String getTotalPayments() {
		return this.totalPayments;
	}
	public void setTotalPayments(String totalPayments) {
		this.totalPayments = totalPayments;
	}

}
