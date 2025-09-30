package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 面向租赁商的企业认证状态查询
 *
 * @author auto create
 * @since 1.0, 2024-09-02 15:51:50
 */
public class AlipayCommerceRentEnterpriseCertificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7583668197463132657L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_open_id")
	private String partnerOpenId;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("unified_social_credit_code")
	private String unifiedSocialCreditCode;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerOpenId() {
		return this.partnerOpenId;
	}
	public void setPartnerOpenId(String partnerOpenId) {
		this.partnerOpenId = partnerOpenId;
	}

	public String getUnifiedSocialCreditCode() {
		return this.unifiedSocialCreditCode;
	}
	public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
		this.unifiedSocialCreditCode = unifiedSocialCreditCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
