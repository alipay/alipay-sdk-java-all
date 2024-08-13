package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ServiceAssistantDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.assistant.service.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-13 16:37:06
 */
public class AlipayMerchantGroupAssistantServiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8278213744429498276L;

	/** 
	 * 小助手快捷服务详情
	 */
	@ApiField("assistant_detail")
	private ServiceAssistantDetailVO assistantDetail;

	public void setAssistantDetail(ServiceAssistantDetailVO assistantDetail) {
		this.assistantDetail = assistantDetail;
	}
	public ServiceAssistantDetailVO getAssistantDetail( ) {
		return this.assistantDetail;
	}

}
