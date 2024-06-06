package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusTotalOdItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.totalod.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:12:47
 */
public class AlipayDataAiserviceCloudbusTotalodQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4879613298935341561L;

	/** 
	 * 客流总量结果
	 */
	@ApiField("result")
	private CloudbusTotalOdItem result;

	public void setResult(CloudbusTotalOdItem result) {
		this.result = result;
	}
	public CloudbusTotalOdItem getResult( ) {
		return this.result;
	}

}
