package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CarResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.pnc.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-25 17:41:58
 */
public class AlipayCommerceTransportChargerPncQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7579249614132824894L;

	/** 
	 * 开通车辆
	 */
	@ApiListField("cars")
	@ApiField("car_response")
	private List<CarResponse> cars;

	/** 
	 * 即插即充服务开通状态（true/false）
	 */
	@ApiField("status")
	private Boolean status;

	public void setCars(List<CarResponse> cars) {
		this.cars = cars;
	}
	public List<CarResponse> getCars( ) {
		return this.cars;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
