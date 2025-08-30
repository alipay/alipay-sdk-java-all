package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.updateapimodel.rainys.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 17:07:22
 */
public class AlipayDataDataserviceUpdateapimodelRainysQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3728662558667212722L;

	/** 
	 * boolean
	 */
	@ApiListField("out_array_tc_1")
	@ApiField("boolean")
	private List<Boolean> outArrayTc1;

	public void setOutArrayTc1(List<Boolean> outArrayTc1) {
		this.outArrayTc1 = outArrayTc1;
	}
	public List<Boolean> getOutArrayTc1( ) {
		return this.outArrayTc1;
	}

}
