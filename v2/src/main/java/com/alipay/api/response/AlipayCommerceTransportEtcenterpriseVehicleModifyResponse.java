package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.vehicle.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-20 11:16:59
 */
public class AlipayCommerceTransportEtcenterpriseVehicleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6156118692371936267L;

	/** 
	 * SUCCESS：订单申请成功； FAIL:申请失败
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
