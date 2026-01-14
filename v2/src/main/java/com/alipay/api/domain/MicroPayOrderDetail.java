package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小额支付冻结订单详情
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class MicroPayOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 8436368651625126967L;

	/**
	 * 支付宝订单号，此订单号作为后续支付冻结金以及转账的订单标识
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 支付方的支付宝userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 可用于支付的金额（除去服务费）
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 冻结资金的到期自动解冻时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 冻结金额（不包含服务费）
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户订单号,这个是调用传入的
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单的最近修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 订单状态：I：初始，S：成功
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付的金额（含服务费）
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 冻结资金支付确认方式， NO_CONFIRM：不需要付款确认，调用接口直接扣款 PAY_PASSWORD: 在转账需要付款方用支付密码确认，才可以转账成功
	 */
	@ApiField("pay_confirm")
	private String payConfirm;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayConfirm() {
		return this.payConfirm;
	}
	public void setPayConfirm(String payConfirm) {
		this.payConfirm = payConfirm;
	}

}
