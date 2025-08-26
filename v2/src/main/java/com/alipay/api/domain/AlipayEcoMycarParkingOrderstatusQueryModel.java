package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单状态查询接口
 *
 * @author auto create
 * @since 1.0, 2023-08-28 11:43:33
 */
public class AlipayEcoMycarParkingOrderstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1694223257137762418L;

	/**
	 * 如果商户订单号为空，停车场id和车牌号不能为空，商户订单号优先查询
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 如果商户订单号为空，停车场id和车牌号不能为空，商户订单号优先查询
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 查询订单时间（不传值为当日时间），格式"yyyy-MM-dd “
	 */
	@ApiField("sel_time")
	private String selTime;

	/**
	 * 车主平台交易号，不能跟停车场编号和车牌号同时为空
	 */
	@ApiField("transaction_no")
	private String transactionNo;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getSelTime() {
		return this.selTime;
	}
	public void setSelTime(String selTime) {
		this.selTime = selTime;
	}

	public String getTransactionNo() {
		return this.transactionNo;
	}
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

}
