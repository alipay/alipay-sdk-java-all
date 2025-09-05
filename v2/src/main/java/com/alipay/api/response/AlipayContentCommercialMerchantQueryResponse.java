package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperatorData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.commercial.merchant.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-12 18:07:19
 */
public class AlipayContentCommercialMerchantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8174273298886426876L;

	/** 
	 * 返回操作人列表
	 */
	@ApiListField("operator_data")
	@ApiField("operator_data")
	private List<OperatorData> operatorData;

	public void setOperatorData(List<OperatorData> operatorData) {
		this.operatorData = operatorData;
	}
	public List<OperatorData> getOperatorData( ) {
		return this.operatorData;
	}

}
