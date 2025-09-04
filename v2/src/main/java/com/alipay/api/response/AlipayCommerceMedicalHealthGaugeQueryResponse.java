package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GaugeTypeListDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.health.gauge.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-17 15:52:23
 */
public class AlipayCommerceMedicalHealthGaugeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2314635236288247672L;

	/** 
	 * 自测量表列表
	 */
	@ApiListField("data")
	@ApiField("gauge_type_list_d_t_o")
	private List<GaugeTypeListDTO> data;

	public void setData(List<GaugeTypeListDTO> data) {
		this.data = data;
	}
	public List<GaugeTypeListDTO> getData( ) {
		return this.data;
	}

}
