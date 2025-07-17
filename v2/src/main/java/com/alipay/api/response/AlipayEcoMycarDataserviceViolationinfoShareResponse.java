package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.dataservice.violationinfo.share response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:54
 */
public class AlipayEcoMycarDataserviceViolationinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 2628215628559923245L;

	/** 
	 * 车架号
	 */
	@ApiField("body_num")
	private String bodyNum;

	/** 
	 * 发动机号
	 */
	@ApiField("engine_num")
	private String engineNum;

	/** 
	 * 车辆id
	 */
	@ApiField("vehicle_id")
	private String vehicleId;

	/** 
	 * 车牌
	 */
	@ApiField("vi_number")
	private String viNumber;

	public void setBodyNum(String bodyNum) {
		this.bodyNum = bodyNum;
	}
	public String getBodyNum( ) {
		return this.bodyNum;
	}

	public void setEngineNum(String engineNum) {
		this.engineNum = engineNum;
	}
	public String getEngineNum( ) {
		return this.engineNum;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleId( ) {
		return this.vehicleId;
	}

	public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}
	public String getViNumber( ) {
		return this.viNumber;
	}

}
