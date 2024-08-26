package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.historygeo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:49
 */
public class AlipayDataAiserviceCloudbusHistorygeoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7156486133893916725L;

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
