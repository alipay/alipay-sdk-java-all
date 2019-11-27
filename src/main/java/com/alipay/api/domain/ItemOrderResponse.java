package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商品子订单
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ItemOrderResponse extends AlipayObject {

	private static final long serialVersionUID = 2125886974286897781L;

	/**
	 * 总金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 外部商品id
	 */
	@ApiField("external_item_id")
	private String externalItemId;

	/**
	 * 外部手艺人id
	 */
	@ApiField("external_sp_id")
	private String externalSpId;

	/**
	 * 商品订单生成时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 商品子订单修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品子订单id
	 */
	@ApiField("item_order_no")
	private String itemOrderNo;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 已付金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 付款时间
	 */
	@ApiField("payment_time")
	private String paymentTime;

	/**
	 * 商品单价，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 购买数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 实际金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款时间
	 */
	@ApiField("refund_time")
	private String refundTime;

	/**
	 * 计量单位
	 */
	@ApiField("unit")
	private String unit;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExternalItemId() {
		return this.externalItemId;
	}
	public void setExternalItemId(String externalItemId) {
		this.externalItemId = externalItemId;
	}

	public String getExternalSpId() {
		return this.externalSpId;
	}
	public void setExternalSpId(String externalSpId) {
		this.externalSpId = externalSpId;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemOrderNo() {
		return this.itemOrderNo;
	}
	public void setItemOrderNo(String itemOrderNo) {
		this.itemOrderNo = itemOrderNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
