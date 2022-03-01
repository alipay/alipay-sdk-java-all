package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * pos账单支付渠道信息
 *
 * @author auto create
 * @since 1.0, 2021-01-19 14:21:46
 */
public class PosBillPayChannel extends AlipayObject {

	private static final long serialVersionUID = 8595651635462723297L;

	/**
	 * 支付渠道类型:
ALIPAY：ALIPAY内部渠道支付
WECHAT：WECHAT外部渠道支付
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 账单支付渠道维度优惠明细
	 */
	@ApiListField("discount_details")
	@ApiField("pos_discount_detail")
	private List<PosDiscountDetail> discountDetails;

	/**
	 * 扩展信息，json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 收银员ID
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 外部支付订单号,唯一标识本次支付的requestID
	 */
	@ApiField("out_pay_no")
	private String outPayNo;

	/**
	 * 支付抵扣金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付渠道本身自己的支付订单号
	 */
	@ApiField("pay_no")
	private String payNo;

	/**
	 * 付款时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 支付实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/**
	 * 支付渠道交易号，对于支付宝是支付宝交易号，对于微信是微信交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 用户身份标识：手机号码、userId等
	 */
	@ApiField("user_identity")
	private String userIdentity;

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public List<PosDiscountDetail> getDiscountDetails() {
		return this.discountDetails;
	}
	public void setDiscountDetails(List<PosDiscountDetail> discountDetails) {
		this.discountDetails = discountDetails;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutPayNo() {
		return this.outPayNo;
	}
	public void setOutPayNo(String outPayNo) {
		this.outPayNo = outPayNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayNo() {
		return this.payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getReceiptAmount() {
		return this.receiptAmount;
	}
	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserIdentity() {
		return this.userIdentity;
	}
	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

}
