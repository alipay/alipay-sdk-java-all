package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenCrowdOperationTag;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qipan.tag.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-04 15:27:03
 */
public class AlipayMarketingQipanTagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1263332671936571782L;

	/** 
	 * 圈选标签的圈选项、圈选值详情，创建标签圈选请求时，需要传入每个圈选项对应的圈选值
	 */
	@ApiField("operation_tag")
	private OpenCrowdOperationTag operationTag;

	public void setOperationTag(OpenCrowdOperationTag operationTag) {
		this.operationTag = operationTag;
	}
	public OpenCrowdOperationTag getOperationTag( ) {
		return this.operationTag;
	}

}
