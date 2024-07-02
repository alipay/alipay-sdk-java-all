package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车票扫描模型
 *
 * @author auto create
 * @since 1.0, 2024-03-13 14:08:36
 */
public class OcrTaxiScanInfo extends AlipayObject {

	private static final long serialVersionUID = 2271921141399471293L;

	/**
	 * 下车时间
	 */
	@ApiField("get_off_time")
	private String getOffTime;

	/**
	 * 上车时间
	 */
	@ApiField("get_on_time")
	private String getOnTime;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票时间
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 乘客人
	 */
	@ApiField("passenger")
	private String passenger;

	/**
	 * 金额（元）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 乘车距离
	 */
	@ApiField("travel_dist")
	private String travelDist;

	public String getGetOffTime() {
		return this.getOffTime;
	}
	public void setGetOffTime(String getOffTime) {
		this.getOffTime = getOffTime;
	}

	public String getGetOnTime() {
		return this.getOnTime;
	}
	public void setGetOnTime(String getOnTime) {
		this.getOnTime = getOnTime;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getPassenger() {
		return this.passenger;
	}
	public void setPassenger(String passenger) {
		this.passenger = passenger;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getTravelDist() {
		return this.travelDist;
	}
	public void setTravelDist(String travelDist) {
		this.travelDist = travelDist;
	}

}
