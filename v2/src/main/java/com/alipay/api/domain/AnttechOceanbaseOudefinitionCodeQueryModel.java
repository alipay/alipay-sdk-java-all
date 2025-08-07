package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据ouCode查询ou定义
 *
 * @author auto create
 * @since 1.0, 2025-07-22 14:53:19
 */
public class AnttechOceanbaseOudefinitionCodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8545478267661174563L;

	/**
	 * ouCode查询请求体
	 */
	@ApiField("ou_code_query_request")
	private OuCodeQueryRequest ouCodeQueryRequest;

	public OuCodeQueryRequest getOuCodeQueryRequest() {
		return this.ouCodeQueryRequest;
	}
	public void setOuCodeQueryRequest(OuCodeQueryRequest ouCodeQueryRequest) {
		this.ouCodeQueryRequest = ouCodeQueryRequest;
	}

}
