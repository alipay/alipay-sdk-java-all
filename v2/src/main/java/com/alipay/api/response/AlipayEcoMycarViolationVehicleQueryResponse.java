package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.violation.vehicle.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayEcoMycarViolationVehicleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7834323322653144661L;

	/** 
	 * 用户车辆发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/** 
	 * 用户车辆ID,支付宝系统唯一
	 */
	@ApiField("vi_id")
	private String viId;

	/** 
	 * 用户车辆车牌号
	 */
	@ApiField("vi_number")
	private String viNumber;

	/** 
	 * 用户车辆识别码
	 */
	@ApiField("vin_no")
	private String vinNo;

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getEngineNo( ) {
		return this.engineNo;
	}

	public void setViId(String viId) {
		this.viId = viId;
	}
	public String getViId( ) {
		return this.viId;
	}

	public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}
	public String getViNumber( ) {
		return this.viNumber;
	}

	public void setVinNo(String vinNo) {
		this.vinNo = vinNo;
	}
	public String getVinNo( ) {
		return this.vinNo;
	}

}
