package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 火车票扫描模型
 *
 * @author auto create
 * @since 1.0, 2024-03-13 14:08:36
 */
public class OcrTrainScanInfo extends AlipayObject {

	private static final long serialVersionUID = 3298965727953329426L;

	/**
	 * 目的地
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 乘车日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 出发地
	 */
	@ApiField("origin")
	private String origin;

	/**
	 * 乘客
	 */
	@ApiField("passenger")
	private String passenger;

	/**
	 * 金额（元）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 明细事由
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 座次
	 */
	@ApiField("seat_class")
	private String seatClass;

	/**
	 * 车次
	 */
	@ApiField("train_no")
	private String trainNo;

	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
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

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSeatClass() {
		return this.seatClass;
	}
	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

	public String getTrainNo() {
		return this.trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

}
