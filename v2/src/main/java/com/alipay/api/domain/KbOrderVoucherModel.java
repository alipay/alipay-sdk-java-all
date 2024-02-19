package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑订单商品凭证模型
 *
 * @author auto create
 * @since 1.0, 2018-03-08 11:39:18
 */
public class KbOrderVoucherModel extends AlipayObject {

	private static final long serialVersionUID = 1663543565797162227L;

	/**
	 * 商品凭证过期时间
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 商品凭证核销／退款对应的资金流水号
	 */
	@ApiField("funds_voucher_no")
	private String fundsVoucherNo;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 退款理由，由消费者选择或填写内容，系统退款可以为空。
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款类型，ROLE_DAEMON（超期未使用），ROLE_USER（消费者主动）；
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 商品凭证核销门店ID,核销后会存在该字段
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品凭证核销门店外部ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 凭证剩余可核销次数(次卡场景)
	 */
	@ApiField("ticket_effect_count")
	private String ticketEffectCount;

	/**
	 * 凭证已退款次数(次卡场景)
	 */
	@ApiField("ticket_refunded_count")
	private String ticketRefundedCount;

	/**
	 * 凭证已使用次数(次卡场景)
	 */
	@ApiField("ticket_used_count")
	private String ticketUsedCount;

	/**
	 * 商品凭证ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getFundsVoucherNo() {
		return this.fundsVoucherNo;
	}
	public void setFundsVoucherNo(String fundsVoucherNo) {
		this.fundsVoucherNo = fundsVoucherNo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTicketEffectCount() {
		return this.ticketEffectCount;
	}
	public void setTicketEffectCount(String ticketEffectCount) {
		this.ticketEffectCount = ticketEffectCount;
	}

	public String getTicketRefundedCount() {
		return this.ticketRefundedCount;
	}
	public void setTicketRefundedCount(String ticketRefundedCount) {
		this.ticketRefundedCount = ticketRefundedCount;
	}

	public String getTicketUsedCount() {
		return this.ticketUsedCount;
	}
	public void setTicketUsedCount(String ticketUsedCount) {
		this.ticketUsedCount = ticketUsedCount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
