package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多云财资子户结果查询
 *
 * @author auto create
 * @since 1.0, 2024-01-08 16:38:09
 */
public class AnttechOceanbaseSubaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8342547439741335741L;

	/**
	 * 财资子户查询入参模型
	 */
	@ApiField("sub_account_query_request")
	private SubAccountQueryRequest subAccountQueryRequest;

	public SubAccountQueryRequest getSubAccountQueryRequest() {
		return this.subAccountQueryRequest;
	}
	public void setSubAccountQueryRequest(SubAccountQueryRequest subAccountQueryRequest) {
		this.subAccountQueryRequest = subAccountQueryRequest;
	}

}
