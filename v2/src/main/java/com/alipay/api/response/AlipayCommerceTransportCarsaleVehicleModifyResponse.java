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
 * @since 1.0, 2024-10-22 10:57:22
 */
public class AlipayCommerceTransportCarsaleVehicleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1639169866327364413L;

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
