package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperationResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.knowledge.append response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-17 17:02:28
 */
public class AlipayCommerceMedicalMedagentKnowledgeAppendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2889535997128149998L;

	/** 
	 * 操作结果
	 */
	@ApiListField("data")
	@ApiField("operation_result")
	private List<OperationResult> data;

	public void setData(List<OperationResult> data) {
		this.data = data;
	}
	public List<OperationResult> getData( ) {
		return this.data;
	}

}
