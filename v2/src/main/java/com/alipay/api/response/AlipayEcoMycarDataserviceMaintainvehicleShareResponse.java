package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MaintainVehicleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.dataservice.maintainvehicle.share response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:45:54
 */
public class AlipayEcoMycarDataserviceMaintainvehicleShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 1319548569426374484L;

	/** 
	 * 车辆详细信息
	 */
	@ApiField("info")
	private MaintainVehicleInfo info;

	public void setInfo(MaintainVehicleInfo info) {
		this.info = info;
	}
	public MaintainVehicleInfo getInfo( ) {
		return this.info;
	}

}
