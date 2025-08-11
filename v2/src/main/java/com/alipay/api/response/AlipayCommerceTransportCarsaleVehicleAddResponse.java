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
 * @since 1.0, 2025-04-02 10:17:26
 */
public class AlipayCommerceTransportCarsaleVehicleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3779254384222463157L;

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
