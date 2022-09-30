package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CatalogNodeData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.brandcatalog.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-19 19:57:38
 */
public class AlipayOpenSearchBrandcatalogBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1344225362961395831L;

	/** 
	 * 品牌下可用类目
	 */
	@ApiListField("data")
	@ApiField("catalog_node_data")
	private List<CatalogNodeData> data;

	public void setData(List<CatalogNodeData> data) {
		this.data = data;
	}
	public List<CatalogNodeData> getData( ) {
		return this.data;
	}

}
