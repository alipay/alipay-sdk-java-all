package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付信息对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:26
 */
public class PayInfoBean extends AlipayObject {

	private static final long serialVersionUID = 7579259616738771143L;

	/**
	 * 支付完成时间,格式yyyyMMddHHMMSS，如2009年12月25日9点10分10秒
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 商户名称
	 */
	@ApiField("mer_name")
	private String merName;

	/**
	 * 服务商订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 用户账单上的交易订单号
	 */
	@ApiField("out_trans_id")
	private String outTransId;

	/**
	 * 消费者实付金额，单位：元
	 */
	@ApiField("pay_amt")
	private String payAmt;

	/**
	 * 第三方支付机构商户ID，该字段跟wx_org联动，当前场景为huifu_id
	 */
	@ApiField("thirdpay_mer_id")
	private String thirdpayMerId;

	/**
	 * thirdpay_org
	 */
	@ApiField("thirdpay_org")
	private String thirdpayOrg;

	/**
	 * 交易金额,单位：元
	 */
	@ApiField("trans_amt")
	private String transAmt;

	/**
	 * 交易时间,格式：HHMMSS；示例值：102938
	 */
	@ApiField("trans_time")
	private String transTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMerName() {
		return this.merName;
	}
	public void setMerName(String merName) {
		this.merName = merName;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutTransId() {
		return this.outTransId;
	}
	public void setOutTransId(String outTransId) {
		this.outTransId = outTransId;
	}

	public String getPayAmt() {
		return this.payAmt;
	}
	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}

	public String getThirdpayMerId() {
		return this.thirdpayMerId;
	}
	public void setThirdpayMerId(String thirdpayMerId) {
		this.thirdpayMerId = thirdpayMerId;
	}

	public String getThirdpayOrg() {
		return this.thirdpayOrg;
	}
	public void setThirdpayOrg(String thirdpayOrg) {
		this.thirdpayOrg = thirdpayOrg;
	}

	public String getTransAmt() {
		return this.transAmt;
	}
	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	public String getTransTime() {
		return this.transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

}
