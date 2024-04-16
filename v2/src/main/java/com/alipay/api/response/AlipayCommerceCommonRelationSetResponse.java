package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.relation.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-05 11:26:57
 */
public class AlipayCommerceCommonRelationSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8471357866417374535L;

	/** 
	 * 解绑/绑定操作结果
	 */
	@ApiField("operation_result")
	private Boolean operationResult;

	/** 
	 * 绑定/解绑时间
	 */
	@ApiField("operation_time")
	private Date operationTime;

	public void setOperationResult(Boolean operationResult) {
		this.operationResult = operationResult;
	}
	public Boolean getOperationResult( ) {
		return this.operationResult;
	}

	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}
	public Date getOperationTime( ) {
		return this.operationTime;
	}

}
