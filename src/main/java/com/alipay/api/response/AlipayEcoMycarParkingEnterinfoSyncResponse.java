package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.enterinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-21 09:11:55
 */
public class AlipayEcoMycarParkingEnterinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8716237753976441899L;

	/** 
	 * 当前车辆在支付宝侧的信息，可选返回项为： NORMAL：正常缴费用户 NON-SENSE-PAY：无感支付签约用户
	 */
	@ApiField("car_status")
	private String carStatus;

	/** 
	 * 支付宝业务流水号，用于记录车辆从驶入到驶出的全流程
	 */
	@ApiField("serial_no")
	private String serialNo;

	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}
	public String getCarStatus( ) {
		return this.carStatus;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getSerialNo( ) {
		return this.serialNo;
	}

}
