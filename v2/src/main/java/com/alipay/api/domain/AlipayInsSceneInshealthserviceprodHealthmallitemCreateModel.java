package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品录入
 *
 * @author auto create
 * @since 1.0, 2026-08-18 22:03:51
 */
public class AlipayInsSceneInshealthserviceprodHealthmallitemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1339269637751524698L;

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
