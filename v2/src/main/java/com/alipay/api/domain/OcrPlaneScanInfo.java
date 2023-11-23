package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 飞机票扫描模型
 *
 * @author auto create
 * @since 1.0, 2023-06-25 10:05:25
 */
public class OcrPlaneScanInfo extends AlipayObject {

	private static final long serialVersionUID = 3416242858611785369L;

	/**
	 * 目的地
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 航班号
	 */
	@ApiField("flight_no")
	private String flightNo;

	/**
	 * 乘机日期
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
	 * 飞机舱位
	 */
	@ApiField("seat_class")
	private String seatClass;

	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNo() {
		return this.flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
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

}
