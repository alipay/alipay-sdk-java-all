package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业挂号单回流接口
 *
 * @author auto create
 * @since 1.0, 2024-02-05 10:33:53
 */
public class AlipayCommerceMedicalAppointmentorderUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7616544955454692587L;

	/**
	 * 订单金额（元，两位小数）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 就诊人用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 就诊人openId
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private MedicalAppointmentOrderUploadExtInfo extInfo;

	/**
	 * 订单状态
	 */
	@ApiField("merchant_order_status")
	private String merchantOrderStatus;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单修改时间
	 */
	@ApiField("order_modified_time")
	private Date orderModifiedTime;

	/**
	 * 订单类型，固定值
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 医院预约单订单号唯一不重复（同一家ISV接入的所有医院的挂号单、检查号、医药单都不可重复）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部订单类型，固定值
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 实际支付金额（元，两位小数）
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 平台名称
	 */
	@ApiField("platform_name")
	private String platformName;

	/**
	 * 平台类型
	 */
	@ApiField("platform_type")
	private String platformType;

	/**
	 * 在平台上实际下单的来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 小程序APPID
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	/**
	 * 支付宝支付之后传入，非支付宝交易不传入
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public MedicalAppointmentOrderUploadExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(MedicalAppointmentOrderUploadExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantOrderStatus() {
		return this.merchantOrderStatus;
	}
	public void setMerchantOrderStatus(String merchantOrderStatus) {
		this.merchantOrderStatus = merchantOrderStatus;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(Date orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPlatformName() {
		return this.platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformType() {
		return this.platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTinyAppId() {
		return this.tinyAppId;
	}
	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
