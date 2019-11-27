package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 微博支付宝交易明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class WeiboTradeRecord extends AlipayObject {

	private static final long serialVersionUID = 4153936288387758911L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单最后修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 对方支付宝登录号，需要隐藏
	 */
	@ApiField("opposite_logon_id")
	private String oppositeLogonId;

	/**
	 * 对方姓名，需要隐藏
	 */
	@ApiField("opposite_name")
	private String oppositeName;

	/**
	 * 对方支付宝账号，已加密
	 */
	@ApiField("opposite_user_id")
	private String oppositeUserId;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单的名称，描述订单的摘要信息，如交易的商品名称
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 本方支付宝登录号，需要隐藏
	 */
	@ApiField("owner_logon_id")
	private String ownerLogonId;

	/**
	 * 本方姓名，需要隐藏
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 本方支付宝账号，已加密
	 */
	@ApiField("owner_user_id")
	private String ownerUserId;

	/**
	 * 订单服务费
	 */
	@ApiField("service_charge")
	private String serviceCharge;

	/**
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	public String getOppositeLogonId() {
		return this.oppositeLogonId;
	}
	public void setOppositeLogonId(String oppositeLogonId) {
		this.oppositeLogonId = oppositeLogonId;
	}

	public String getOppositeName() {
		return this.oppositeName;
	}
	public void setOppositeName(String oppositeName) {
		this.oppositeName = oppositeName;
	}

	public String getOppositeUserId() {
		return this.oppositeUserId;
	}
	public void setOppositeUserId(String oppositeUserId) {
		this.oppositeUserId = oppositeUserId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOwnerLogonId() {
		return this.ownerLogonId;
	}
	public void setOwnerLogonId(String ownerLogonId) {
		this.ownerLogonId = ownerLogonId;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerUserId() {
		return this.ownerUserId;
	}
	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public String getServiceCharge() {
		return this.serviceCharge;
	}
	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
