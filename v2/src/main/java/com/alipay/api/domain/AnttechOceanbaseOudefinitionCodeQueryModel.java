package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据ouCode查询ou定义
 *
 * @author auto create
 * @since 1.0, 2026-05-07 15:57:28
 */
public class AnttechOceanbaseOudefinitionCodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7736568122589515489L;

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
