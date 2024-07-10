package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VehModelDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.vehicle.model.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayEcoMycarVehicleModelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5775196456219918338L;

	/** 
	 * 支付宝车型列表
	 */
	@ApiListField("veh_model_list")
	@ApiField("veh_model_dto")
	private List<VehModelDto> vehModelList;

	public void setVehModelList(List<VehModelDto> vehModelList) {
		this.vehModelList = vehModelList;
	}
	public List<VehModelDto> getVehModelList( ) {
		return this.vehModelList;
	}

}
