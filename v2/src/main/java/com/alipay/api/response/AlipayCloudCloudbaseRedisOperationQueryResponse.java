package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperationList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.redis.operation.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-09 11:17:31
 */
public class AlipayCloudCloudbaseRedisOperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1489937721426963124L;

	/** 
	 * 缓存任务列表
	 */
	@ApiListField("data")
	@ApiField("operation_list")
	private List<OperationList> data;

	public void setData(List<OperationList> data) {
		this.data = data;
	}
	public List<OperationList> getData( ) {
		return this.data;
	}

}
