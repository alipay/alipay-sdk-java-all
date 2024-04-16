package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.vehicle.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:32
 */
public class AlipayCommerceTransportEtcenterpriseVehicleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2278813317571124857L;

	/** 
	 * SUCCESS：订单申请成功； FAIL:申请失败原因
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 其他业务异常信息描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * 支付宝车辆id
	 */
	@ApiField("vehicle_id")
	private String vehicleId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleId( ) {
		return this.vehicleId;
	}

}
