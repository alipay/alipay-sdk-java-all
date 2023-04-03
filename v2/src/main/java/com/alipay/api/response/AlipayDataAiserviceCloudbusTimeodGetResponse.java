package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CloudbusTimeOdItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.timeod.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:19:12
 */
public class AlipayDataAiserviceCloudbusTimeodGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2136986545472547269L;

	/** 
	 * od分时结果列表
	 */
	@ApiListField("result")
	@ApiField("cloudbus_time_od_item")
	private List<CloudbusTimeOdItem> result;

	public void setResult(List<CloudbusTimeOdItem> result) {
		this.result = result;
	}
	public List<CloudbusTimeOdItem> getResult( ) {
		return this.result;
	}

}
