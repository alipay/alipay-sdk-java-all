package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付卡延期单信息
 *
 * @author auto create
 * @since 1.0, 2026-01-16 11:21:55
 */
public class CardExpandOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 2738271542438799887L;

	/**
	 * 延期单id
	 */
	@ApiField("card_expand_order_id")
	private String cardExpandOrderId;

	/**
	 * CUSTOMER_CONFIRMING("CUSTOMER_CONFIRMING：待购卡用户确认
  CUSTOMER_REJECT("CUSTOMER_REJECT：购卡用户拒绝延期
  INVALID("INVALID：延期单失效
  SUCCESS("SUCCESS：延期成功
	 */
	@ApiField("card_expand_order_status")
	private String cardExpandOrderStatus;

	/**
	 * 安心付卡id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 延期单购卡用户超时时间，超时后系统自动确认
	 */
	@ApiField("customer_confirm_timeout")
	private Date customerConfirmTimeout;

	/**
	 * 延期后新的过期时间
	 */
	@ApiField("expand_expire_date")
	private Date expandExpireDate;

	/**
	 * 延期原因
	 */
	@ApiField("expand_reason")
	private String expandReason;

	/**
	 * 购买用户拒绝延期原因
	 */
	@ApiField("expand_reject_reason")
	private String expandRejectReason;

	/**
	 * 延期前的过期时间
	 */
	@ApiField("original_expire_date")
	private Date originalExpireDate;

	public String getCardExpandOrderId() {
		return this.cardExpandOrderId;
	}
	public void setCardExpandOrderId(String cardExpandOrderId) {
		this.cardExpandOrderId = cardExpandOrderId;
	}

	public String getCardExpandOrderStatus() {
		return this.cardExpandOrderStatus;
	}
	public void setCardExpandOrderStatus(String cardExpandOrderStatus) {
		this.cardExpandOrderStatus = cardExpandOrderStatus;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Date getCustomerConfirmTimeout() {
		return this.customerConfirmTimeout;
	}
	public void setCustomerConfirmTimeout(Date customerConfirmTimeout) {
		this.customerConfirmTimeout = customerConfirmTimeout;
	}

	public Date getExpandExpireDate() {
		return this.expandExpireDate;
	}
	public void setExpandExpireDate(Date expandExpireDate) {
		this.expandExpireDate = expandExpireDate;
	}

	public String getExpandReason() {
		return this.expandReason;
	}
	public void setExpandReason(String expandReason) {
		this.expandReason = expandReason;
	}

	public String getExpandRejectReason() {
		return this.expandRejectReason;
	}
	public void setExpandRejectReason(String expandRejectReason) {
		this.expandRejectReason = expandRejectReason;
	}

	public Date getOriginalExpireDate() {
		return this.originalExpireDate;
	}
	public void setOriginalExpireDate(Date originalExpireDate) {
		this.originalExpireDate = originalExpireDate;
	}

}
