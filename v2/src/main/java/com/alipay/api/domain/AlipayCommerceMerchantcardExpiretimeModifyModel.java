package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起卡过期时间延期修改
 *
 * @author auto create
 * @since 1.0, 2025-12-15 13:52:42
 */
public class AlipayCommerceMerchantcardExpiretimeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5459431664436389836L;

	/**
	 * 安心付卡id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 延期后的过期时间
	 */
	@ApiField("expand_expire_time")
	private Date expandExpireTime;

	/**
	 * 延期原因
	 */
	@ApiField("expand_reason")
	private String expandReason;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Date getExpandExpireTime() {
		return this.expandExpireTime;
	}
	public void setExpandExpireTime(Date expandExpireTime) {
		this.expandExpireTime = expandExpireTime;
	}

	public String getExpandReason() {
		return this.expandReason;
	}
	public void setExpandReason(String expandReason) {
		this.expandReason = expandReason;
	}

}
