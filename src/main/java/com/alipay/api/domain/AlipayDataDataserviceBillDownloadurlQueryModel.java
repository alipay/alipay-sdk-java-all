package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无授权模式的查询对账单下载地址
 *
 * @author auto create
 * @since 1.0, 2019-07-18 16:51:16
 */
public class AlipayDataDataserviceBillDownloadurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1353743815325983673L;

	/**
	 * 账单时间：日账单格式为yyyy-MM-dd，最早可下载2016年1月1日开始的日账单；月账单格式为yyyy-MM，最早可下载2016年1月开始的月账单。
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型：trade、signcustomer；trade指商户基于支付宝交易收单的业务账单；signcustomer是指基于商户支付宝余额收入及支出等资金变动的帐务账单。
	 */
	@ApiField("bill_type")
	private String billType;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

}
