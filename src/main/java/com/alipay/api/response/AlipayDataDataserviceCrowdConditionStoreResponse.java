package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.crowd.condition.store response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceCrowdConditionStoreResponse extends AlipayResponse {

	private static final long serialVersionUID = 1347692987811975587L;

	/** 
	 * 创建完规则组后的系统返回的规则组ID
	 */
	@ApiField("condition_id")
	private Long conditionId;

	public void setConditionId(Long conditionId) {
		this.conditionId = conditionId;
	}
	public Long getConditionId( ) {
		return this.conditionId;
	}

}
