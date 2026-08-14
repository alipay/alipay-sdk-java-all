package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PredictionResultPointDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.energy.prediction.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-14 16:52:50
 */
public class DatadigitalAnttechEnergyPredictionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7236322856192727317L;

	/** 
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("prediction_result_point_d_t_o")
	private List<PredictionResultPointDTO> dataList;

	public void setDataList(List<PredictionResultPointDTO> dataList) {
		this.dataList = dataList;
	}
	public List<PredictionResultPointDTO> getDataList( ) {
		return this.dataList;
	}

}
