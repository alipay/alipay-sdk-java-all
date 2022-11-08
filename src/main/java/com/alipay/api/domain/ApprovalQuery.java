package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据查询接口请求入参
 *
 * @author auto create
 * @since 1.0, 2022-08-22 14:18:09
 */
public class ApprovalQuery extends AlipayObject {

	private static final long serialVersionUID = 1831722963349134435L;

	/**
	 * 请求Id，与app_name组成唯一健，保证业务请求幂等性，同时在请求完毕后，获取业务风险详情信息结果使用
	 */
	@ApiField("request_id")
	private String requestId;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
