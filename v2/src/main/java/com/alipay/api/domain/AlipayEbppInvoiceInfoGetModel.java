package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子发票查询接口
 *
 * @author auto create
 * @since 1.0, 2022-11-22 20:23:32
 */
public class AlipayEbppInvoiceInfoGetModel extends AlipayObject {

	private static final long serialVersionUID = 2178599917545923567L;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 用户id，当用户发起发票查询时，可以先通过用户授权获取当前访问用户的userId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户id，当用户发起发票查询时，可以先通过用户授权获取当前访问用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
