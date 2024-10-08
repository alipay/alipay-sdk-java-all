package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TransferCarResultResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.carsale.vehicle.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-23 09:47:27
 */
public class AlipayCommerceTransportCarsaleVehicleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5563582283117297183L;

	/** 
	 * 车辆处理结果返回
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
