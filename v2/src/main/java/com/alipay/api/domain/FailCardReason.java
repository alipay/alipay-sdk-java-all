package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起转移失败原因
 *
 * @author auto create
 * @since 1.0, 2024-12-11 13:59:05
 */
public class FailCardReason extends AlipayObject {

	private static final long serialVersionUID = 6389659164232774481L;

	/**
	 * 卡id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 发起转移失败原因
	 */
	@ApiField("reason")
	private String reason;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
