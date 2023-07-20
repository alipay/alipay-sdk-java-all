package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 依据请求ID查询生活号ID
 *
 * @author auto create
 * @since 1.0, 2023-06-16 10:23:23
 */
public class AlipayMerchantLifeMiniprogramQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7457354686636369684L;

	/**
	 * request+否+第三方服务商业务流程ID+无+我方生成
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
