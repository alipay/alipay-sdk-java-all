package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建aa收款付款单据
 *
 * @author auto create
 * @since 1.0, 2018-07-20 12:10:18
 */
public class AlipayFundTransAacollectPayorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1455816299146631571L;

	/**
	 * 批次号，创建批次返回
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 创建批次返回的batchToken
	 */
	@ApiField("batch_token")
	private String batchToken;

	/**
	 * 调用方扩充参数，json格式map
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 当前支付宝userId，即付款方支付宝用户uid
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/**
	 * 进入付款来源，仅记录
    吱口令：shakeCode
    二维码：qrCode
    小程序：mini
    其他来源（包括正常流程）：null
	 */
	@ApiField("source")
	private String source;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getBatchToken() {
		return this.batchToken;
	}
	public void setBatchToken(String batchToken) {
		this.batchToken = batchToken;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayerUserId() {
		return this.payerUserId;
	}
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
