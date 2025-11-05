package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ScalesActivationCodeDeviceRelationInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.aivisionrecg.deviceoperate.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-15 17:17:14
 */
public class AlipayMsaasMediarecogAivisionrecgDeviceoperateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8499312763323773648L;

	/** 
	 * 操作记录结果
	 */
	@ApiListField("ret_result")
	@ApiField("scales_activation_code_device_relation_info")
	private List<ScalesActivationCodeDeviceRelationInfo> retResult;

	public void setRetResult(List<ScalesActivationCodeDeviceRelationInfo> retResult) {
		this.retResult = retResult;
	}
	public List<ScalesActivationCodeDeviceRelationInfo> getRetResult( ) {
		return this.retResult;
	}

}
