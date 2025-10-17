package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益账户查询
 *
 * @author auto create
 * @since 1.0, 2025-08-29 11:06:17
 */
public class AlipayMarketingBenefitaccountAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6172584751121479331L;

	/**
	 * 权益账户账户号
	 */
	@ApiField("benefit_account_no")
	private String benefitAccountNo;

	/**
	 * 创建人用户ID
	 */
	@ApiField("publisher_user_id")
	private String publisherUserId;

	public String getBenefitAccountNo() {
		return this.benefitAccountNo;
	}
	public void setBenefitAccountNo(String benefitAccountNo) {
		this.benefitAccountNo = benefitAccountNo;
	}

	public String getPublisherUserId() {
		return this.publisherUserId;
	}
	public void setPublisherUserId(String publisherUserId) {
		this.publisherUserId = publisherUserId;
	}

}
