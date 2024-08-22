package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一码通订单创建
 *
 * @author auto create
 * @since 1.0, 2023-12-14 13:59:31
 */
public class AlipayEbppIndustryOnecodepassOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6163711441764197247L;

	/**
	 * 机构编码，接入时由支付宝小二分配。
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 外部交易订单号。由调用方自定义，64个字符以内，仅支持字母、数字、下划线且需保证在调用方端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 一码通码值
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 商家pid
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 订单标题。注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单相对超时时间，单位为秒
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额。单位为元，精确到小数点后两位，取值范围：[0.01,100000000] 。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
