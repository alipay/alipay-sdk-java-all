package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码月对账单账期修改
 *
 * @author auto create
 * @since 1.0, 2022-11-04 14:36:42
 */
public class AlipayCommerceEcBalancePeriodModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1488698774181217984L;

	/**
	 * 共同账户id - 适用于在企业码小程序创建的共同账户，和agreement_no搭配使用
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 月账单账期
	 */
	@ApiField("bill_day")
	private Long billDay;

	/**
	 * 企业ID - 适用于在企业码PC端创建的企业账号
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public Long getBillDay() {
		return this.billDay;
	}
	public void setBillDay(Long billDay) {
		this.billDay = billDay;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
