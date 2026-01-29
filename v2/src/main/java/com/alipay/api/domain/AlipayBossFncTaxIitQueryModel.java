package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 税务个税查询
 *
 * @author auto create
 * @since 1.0, 2026-01-21 10:12:42
 */
public class AlipayBossFncTaxIitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5671579572298275524L;

	/**
	 * 参数
	 */
	@ApiField("iit_request")
	private IitBizDetailBillQueryPageOpenApiDTO iitRequest;

	public IitBizDetailBillQueryPageOpenApiDTO getIitRequest() {
		return this.iitRequest;
	}
	public void setIitRequest(IitBizDetailBillQueryPageOpenApiDTO iitRequest) {
		this.iitRequest = iitRequest;
	}

}
