package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TransferCarResultResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.carsale.vehicle.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-21 18:28:35
 */
public class AlipayCommerceTransportCarsaleVehicleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1886736542245763979L;

	/** 
	 * 车辆处理结果
	 */
	@ApiListField("car_result")
	@ApiField("transfer_car_result_resp")
	private List<TransferCarResultResp> carResult;

	public void setCarResult(List<TransferCarResultResp> carResult) {
		this.carResult = carResult;
	}
	public List<TransferCarResultResp> getCarResult( ) {
		return this.carResult;
	}

}
