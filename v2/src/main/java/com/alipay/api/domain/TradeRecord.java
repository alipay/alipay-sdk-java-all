package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝交易明细
 *
 * @author auto create
 * @since 1.0, 2023-02-03 14:51:36
 */
public class TradeRecord extends AlipayObject {

	private static final long serialVersionUID = 6594199812644558328L;

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
	 * 资金流入流程类型,in表示收入,out表示支出
	 */
	@ApiField("in_out_type")
	private String inOutType;

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
	 * 对手方openid
	 */
	@ApiField("opposite_open_id")
	private String oppositeOpenId;

	/**
	 * 对方支付宝账号
	 */
	@ApiField("opposite_user_id")
	private String oppositeUserId;

	/**
	 * 订单来源，为空查询所有来源。淘宝(taobao)，支付宝(alipay)，其它(other)
	 */
	@ApiField("order_from")
	private String orderFrom;

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
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

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
	 * 本方支付宝账号OPOENID
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * 本方支付宝账号
	 */
	@ApiField("owner_user_id")
	private String ownerUserId;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

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

	public String getInOutType() {
		return this.inOutType;
	}
	public void setInOutType(String inOutType) {
		this.inOutType = inOutType;
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

	public String getOppositeOpenId() {
		return this.oppositeOpenId;
	}
	public void setOppositeOpenId(String oppositeOpenId) {
		this.oppositeOpenId = oppositeOpenId;
	}

	public String getOppositeUserId() {
		return this.oppositeUserId;
	}
	public void setOppositeUserId(String oppositeUserId) {
		this.oppositeUserId = oppositeUserId;
	}

	public String getOrderFrom() {
		return this.orderFrom;
	}
	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
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

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
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

	public String getOwnerOpenId() {
		return this.ownerOpenId;
	}
	public void setOwnerOpenId(String ownerOpenId) {
		this.ownerOpenId = ownerOpenId;
	}

	public String getOwnerUserId() {
		return this.ownerUserId;
	}
	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
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
