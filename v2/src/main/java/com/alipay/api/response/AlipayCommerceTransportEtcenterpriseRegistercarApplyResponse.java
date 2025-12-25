package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FailCarInfos;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.registercar.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:06
 */
public class AlipayCommerceTransportEtcenterpriseRegistercarApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7713431332449976232L;

	/** 
	 * 未备案成功车辆列表
	 */
	@ApiField("car_infos")
	private FailCarInfos carInfos;

	public void setCarInfos(FailCarInfos carInfos) {
		this.carInfos = carInfos;
	}
	public FailCarInfos getCarInfos( ) {
		return this.carInfos;
	}

}
