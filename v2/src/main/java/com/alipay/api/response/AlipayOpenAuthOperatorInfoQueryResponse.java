package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OperatorBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.operator.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOpenAuthOperatorInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2736173542489624175L;

	/** 
	 * 操作员基础信息
	 */
	@ApiField("operator_info")
	private OperatorBasicInfo operatorInfo;

	public void setOperatorInfo(OperatorBasicInfo operatorInfo) {
		this.operatorInfo = operatorInfo;
	}
	public OperatorBasicInfo getOperatorInfo( ) {
		return this.operatorInfo;
	}

}
