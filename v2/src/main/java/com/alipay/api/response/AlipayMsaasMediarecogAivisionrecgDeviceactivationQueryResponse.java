package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ScalesActivationCodeDeviceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.aivisionrecg.deviceactivation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-15 17:17:14
 */
public class AlipayMsaasMediarecogAivisionrecgDeviceactivationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6884814577251343922L;

	/** 
	 * 激活状态结果
	 */
	@ApiListField("ret_result")
	@ApiField("scales_activation_code_device_info")
	private List<ScalesActivationCodeDeviceInfo> retResult;

	public void setRetResult(List<ScalesActivationCodeDeviceInfo> retResult) {
		this.retResult = retResult;
	}
	public List<ScalesActivationCodeDeviceInfo> getRetResult( ) {
		return this.retResult;
	}

}
