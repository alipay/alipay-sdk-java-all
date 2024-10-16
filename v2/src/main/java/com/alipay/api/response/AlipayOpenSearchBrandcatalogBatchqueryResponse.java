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
 * @since 1.0, 2024-07-04 17:41:23
 */
public class AlipayOpenSearchBrandcatalogBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3616354421815955929L;

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
