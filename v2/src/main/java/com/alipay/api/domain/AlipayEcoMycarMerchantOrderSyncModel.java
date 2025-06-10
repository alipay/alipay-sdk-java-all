package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车生活商家订单同步
 *
 * @author auto create
 * @since 1.0, 2024-05-23 10:46:53
 */
public class AlipayEcoMycarMerchantOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7526966474597895521L;

	/**
	 * 支付宝交易号。若交易发生在只支付宝端内（pay_channel=ALIPAY）时则必传。
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 请联系车生活解决方案产品同学沟通需要传的字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单支付时间
	 */
	@ApiField("order_pay_time")
	private Date orderPayTime;

	/**
	 * 请联系车生活车生活产品技术确认订单状态枚举
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 接入前请跟车生活产品技术确认订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 商户侧订单号。车生活通过user_id+partner_id+out_order_no作为订单唯一约束
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户侧下单时间
	 */
	@ApiField("out_order_time")
	private Date outOrderTime;

	/**
	 * 商户pid，若不传，则使用请求此openapi接口的商户账号的pid作为订单pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 用户实付金额，单位分
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额，单位分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户手机号
	 */
	@ApiField("user_phone")
	private String userPhone;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getOrderPayTime() {
		return this.orderPayTime;
	}
	public void setOrderPayTime(Date orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Date getOutOrderTime() {
		return this.outOrderTime;
	}
	public void setOutOrderTime(Date outOrderTime) {
		this.outOrderTime = outOrderTime;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
