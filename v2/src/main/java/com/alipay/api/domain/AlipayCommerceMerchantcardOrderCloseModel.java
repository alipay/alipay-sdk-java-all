package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订购单关闭
 *
 * @author auto create
 * @since 1.0, 2025-04-09 11:04:54
 */
public class AlipayCommerceMerchantcardOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 8336154267611395953L;

	/**
	 * 售卖订单ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 违约金场景里，代表商户期望收到的违约金，注意不要大于售卖订单详情接口的返回值card_order_info.damages_consult.damages_cash，单位：分
	 */
	@ApiField("damages_cash")
	private Long damagesCash;

	/**
	 * 扣款类型
	 */
	@ApiField("deduction_type")
	private String deductionType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 违约金场景，需要传入订单剩余金额用于做幂等，字段来源是售卖订单详情接口的返回值card_order_info.damages_consult.refund_cash，单位：分
	 */
	@ApiField("total_cash")
	private Long totalCash;

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

	public Long getDamagesCash() {
		return this.damagesCash;
	}
	public void setDamagesCash(Long damagesCash) {
		this.damagesCash = damagesCash;
	}

	public String getDeductionType() {
		return this.deductionType;
	}
	public void setDeductionType(String deductionType) {
		this.deductionType = deductionType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getTotalCash() {
		return this.totalCash;
	}
	public void setTotalCash(Long totalCash) {
		this.totalCash = totalCash;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
