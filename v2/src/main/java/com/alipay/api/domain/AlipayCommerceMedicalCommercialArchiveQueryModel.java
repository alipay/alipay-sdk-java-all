package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业查询会员受益人列表
 *
 * @author auto create
 * @since 1.0, 2025-11-19 10:57:54
 */
public class AlipayCommerceMedicalCommercialArchiveQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8163159587259214127L;

	/**
	 * 业务身份
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 会员卡id 当前字段已废弃(会员卡id，参数废弃)
	 */
	@ApiField("card_id")
	@Deprecated
	private String cardId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizIdentity() {
		return this.bizIdentity;
	}
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
