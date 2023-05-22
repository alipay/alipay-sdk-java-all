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
 * @since 1.0, 2023-05-05 02:41:49
 */
public class AlipayEcoMycarVehicleModelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8578182873574284743L;

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
