package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusSubmitPredictItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.predictbusline.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 19:53:47
 */
public class AlipayDataAiserviceCloudbusPredictbuslineSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6772951366917865483L;

	/** 
	 * 预测任务提交返回
	 */
	@ApiField("result")
	private CloudbusSubmitPredictItem result;

	public void setResult(CloudbusSubmitPredictItem result) {
		this.result = result;
	}
	public CloudbusSubmitPredictItem getResult( ) {
		return this.result;
	}

}
