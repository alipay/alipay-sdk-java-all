package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚源获取异步执行结果
 *
 * @author auto create
 * @since 1.0, 2024-03-01 10:36:02
 */
public class AntfortuneFinresearchAgentframeworkWarrenqGetModel extends AlipayObject {

	private static final long serialVersionUID = 4391318676757952131L;

	/**
	 * 查询结果需要的requst_id
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
