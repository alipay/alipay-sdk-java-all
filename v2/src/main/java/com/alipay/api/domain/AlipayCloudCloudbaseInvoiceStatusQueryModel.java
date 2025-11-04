package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询发票状态
 *
 * @author auto create
 * @since 1.0, 2025-06-16 15:35:58
 */
public class AlipayCloudCloudbaseInvoiceStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1362936782928178596L;

	/**
	 * 开票记录uuid
	 */
	@ApiField("open_api_id")
	private String openApiId;

	public String getOpenApiId() {
		return this.openApiId;
	}
	public void setOpenApiId(String openApiId) {
		this.openApiId = openApiId;
	}

}
