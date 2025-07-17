package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益账户充值
 *
 * @author auto create
 * @since 1.0, 2025-05-25 11:07:10
 */
public class AlipayMarketingBenefitaccountAccountPayModel extends AlipayObject {

	private static final long serialVersionUID = 6282212653324547619L;

	/**
	 * 充值金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 权益账户号
	 */
	@ApiField("benefit_account_no")
	private String benefitAccountNo;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 业务当本次充值唯一号，用于幂等
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 扩展字段，用于风控参数透传
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 出资账号用户ID
	 */
	@ApiField("fund_user_id")
	private String fundUserId;

	/**
	 * 创建人用户ID
	 */
	@ApiField("publisher_user_id")
	private String publisherUserId;

	/**
	 * 支付成功跳转url
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBenefitAccountNo() {
		return this.benefitAccountNo;
	}
	public void setBenefitAccountNo(String benefitAccountNo) {
		this.benefitAccountNo = benefitAccountNo;
	}

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getFundUserId() {
		return this.fundUserId;
	}
	public void setFundUserId(String fundUserId) {
		this.fundUserId = fundUserId;
	}

	public String getPublisherUserId() {
		return this.publisherUserId;
	}
	public void setPublisherUserId(String publisherUserId) {
		this.publisherUserId = publisherUserId;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
