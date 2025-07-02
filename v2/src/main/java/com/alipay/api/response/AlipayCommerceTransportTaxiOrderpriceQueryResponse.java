package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.orderprice.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 16:29:35
 */
public class AlipayCommerceTransportTaxiOrderpriceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1692176547115471664L;

	/** 
	 * 调度费(单位:分)
	 */
	@ApiField("dispatch_amount")
	private String dispatchAmount;

	/** 
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/** 
	 * 返回结果编码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 返回结果描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 里程数
	 */
	@ApiField("mileage")
	private String mileage;

	/** 
	 * 燃油附加费(单位:分)
	 */
	@ApiField("oil_amount")
	private String oilAmount;

	/** 
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/** 
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/** 
	 * 行程金额(单位:分)
	 */
	@ApiField("trip_amount")
	private String tripAmount;

	public void setDispatchAmount(String dispatchAmount) {
		this.dispatchAmount = dispatchAmount;
	}
	public String getDispatchAmount( ) {
		return this.dispatchAmount;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getMileage( ) {
		return this.mileage;
	}

	public void setOilAmount(String oilAmount) {
		this.oilAmount = oilAmount;
	}
	public String getOilAmount( ) {
		return this.oilAmount;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getPlateNo( ) {
		return this.plateNo;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime( ) {
		return this.startTime;
	}

	public void setTripAmount(String tripAmount) {
		this.tripAmount = tripAmount;
	}
	public String getTripAmount( ) {
		return this.tripAmount;
	}

}
