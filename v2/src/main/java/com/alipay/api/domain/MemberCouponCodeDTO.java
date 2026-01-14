package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换的券码列表
 *
 * @author auto create
 * @since 1.0, 2025-07-09 16:36:39
 */
public class MemberCouponCodeDTO extends AlipayObject {

	private static final long serialVersionUID = 2121887849738174853L;

	/**
	 * 会员卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 券码号码
	 */
	@ApiField("member_code")
	private String memberCode;

	/**
	 * 跳转链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 会员卡有效期
	 */
	@ApiField("validity_period")
	private String validityPeriod;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getMemberCode() {
		return this.memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getValidityPeriod() {
		return this.validityPeriod;
	}
	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

}
