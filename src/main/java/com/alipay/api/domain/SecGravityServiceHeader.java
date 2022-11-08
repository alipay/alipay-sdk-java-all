package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多方安全风控标准接口服务入参、出参头信息，用于标识异构系统间traceId、是否压测等内容
 *
 * @author auto create
 * @since 1.0, 2022-06-17 14:18:45
 */
public class SecGravityServiceHeader extends AlipayObject {

	private static final long serialVersionUID = 3666917263191325877L;

	/**
	 * 用于追踪异构系统间唯一服务调用的traceId
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
