package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.historygeo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 13:26:09
 */
public class AlipayDataAiserviceCloudbusHistorygeoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2791644553528945444L;

	/** 
	 * 地图问题geo hash码
	 */
	@ApiListField("result")
	@ApiField("string")
	private List<String> result;

	public void setResult(List<String> result) {
		this.result = result;
	}
	public List<String> getResult( ) {
		return this.result;
	}

}
