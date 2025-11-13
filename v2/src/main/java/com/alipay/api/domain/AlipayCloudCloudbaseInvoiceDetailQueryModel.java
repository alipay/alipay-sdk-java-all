package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票详情
 *
 * @author auto create
 * @since 1.0, 2025-06-16 15:37:42
 */
public class AlipayCloudCloudbaseInvoiceDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6734325744593847855L;

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
