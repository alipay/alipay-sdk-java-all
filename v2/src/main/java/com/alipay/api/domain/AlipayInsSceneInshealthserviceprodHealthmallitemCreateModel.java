package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品录入
 *
 * @author auto create
 * @since 1.0, 2026-08-10 11:24:09
 */
public class AlipayInsSceneInshealthserviceprodHealthmallitemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7576536572569234623L;

	/**
	 * 商品录入请求
	 */
	@ApiField("item_import_request")
	private ExternalItemImportRequest itemImportRequest;

	public ExternalItemImportRequest getItemImportRequest() {
		return this.itemImportRequest;
	}
	public void setItemImportRequest(ExternalItemImportRequest itemImportRequest) {
		this.itemImportRequest = itemImportRequest;
	}

}
