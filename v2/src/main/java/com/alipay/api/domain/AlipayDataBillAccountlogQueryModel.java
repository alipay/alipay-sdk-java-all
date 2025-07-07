package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商家账户账务明细查询
 *
 * @author auto create
 * @since 1.0, 2025-06-26 21:12:45
 */
public class AlipayDataBillAccountlogQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4817741566889424235L;

	/**
	 * 协议授权码，特殊场景下使用
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 协议产品码。特殊场景下使用
	 */
	@ApiField("agreement_product_code")
	private String agreementProductCode;

	/**
	 * 支付宝订单号，通过支付宝订单号精确查询相关的流水明细，商户订单号与支付宝订单号互斥
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 指定用户做账单查询
	 */
	@ApiField("bill_user_id")
	private String billUserId;

	/**
	 * 账务流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间。精确查询不需要指定
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 商户订单号，通过商户订单号精确查询相关的流水明细，商户订单号与支付宝订单号互斥
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分页号，从1开始
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小1000-2000，默认2000
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 账务流水创建时间的起始范围。只能查询一年内的记录。精确查询不需要指定
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 账务的类型代码，特殊场景下使用
	 */
	@ApiField("trans_code")
	private String transCode;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAgreementProductCode() {
		return this.agreementProductCode;
	}
	public void setAgreementProductCode(String agreementProductCode) {
		this.agreementProductCode = agreementProductCode;
	}

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getBillUserId() {
		return this.billUserId;
	}
	public void setBillUserId(String billUserId) {
		this.billUserId = billUserId;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTransCode() {
		return this.transCode;
	}
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

}
