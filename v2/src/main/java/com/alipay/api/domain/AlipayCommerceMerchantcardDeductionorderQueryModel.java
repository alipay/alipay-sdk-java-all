package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款单详情
 *
 * @author auto create
 * @since 1.0, 2025-07-07 09:47:37
 */
public class AlipayCommerceMerchantcardDeductionorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2668262316284438531L;

	/**
	 * 售卖订单id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 核销订单id
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

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

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
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
