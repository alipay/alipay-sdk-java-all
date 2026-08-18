package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量商品录入
 *
 * @author auto create
 * @since 1.0, 2026-08-10 11:25:02
 */
public class AlipayInsSceneInshealthserviceprodMallitembatchCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4758978766117437238L;

	/**
	 * 商品批量录入请求
	 */
	@ApiListField("item_batch_import_request")
	@ApiField("external_item_import_request")
	private List<ExternalItemImportRequest> itemBatchImportRequest;

	public List<ExternalItemImportRequest> getItemBatchImportRequest() {
		return this.itemBatchImportRequest;
	}
	public void setItemBatchImportRequest(List<ExternalItemImportRequest> itemBatchImportRequest) {
		this.itemBatchImportRequest = itemBatchImportRequest;
	}

}
