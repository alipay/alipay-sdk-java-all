package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益日期信息
 *
 * @author auto create
 * @since 1.0, 2020-05-28 18:55:14
 */
public class BenefitDateInfo extends AlipayObject {

	private static final long serialVersionUID = 3864143552782413591L;

	/**
	 * 激活时间
	 */
	@ApiField("benefit_active_time")
	private Date benefitActiveTime;

	/**
	 * 过期时间
	 */
	@ApiField("benefit_expired_time")
	private Date benefitExpiredTime;

	/**
	 * 发放时间
	 */
	@ApiField("benefit_issue_time")
	private Date benefitIssueTime;

	public Date getBenefitActiveTime() {
		return this.benefitActiveTime;
	}
	public void setBenefitActiveTime(Date benefitActiveTime) {
		this.benefitActiveTime = benefitActiveTime;
	}

	public Date getBenefitExpiredTime() {
		return this.benefitExpiredTime;
	}
	public void setBenefitExpiredTime(Date benefitExpiredTime) {
		this.benefitExpiredTime = benefitExpiredTime;
	}

	public Date getBenefitIssueTime() {
		return this.benefitIssueTime;
	}
	public void setBenefitIssueTime(Date benefitIssueTime) {
		this.benefitIssueTime = benefitIssueTime;
	}

}
