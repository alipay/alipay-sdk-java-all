package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SupplierSkuInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.product.sku.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 14:45:10
 */
public class AntProdpaasProductSkuListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2388632566375573786L;

	/** 
	 * 状态码(success|failure)
	 */
	@ApiField("flag")
	private String flag;

	/** 
	 * 商品信息
	 */
	@ApiField("item")
	private SupplierSkuInfo item;

	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getFlag( ) {
		return this.flag;
	}

	public void setItem(SupplierSkuInfo item) {
		this.item = item;
	}
	public SupplierSkuInfo getItem( ) {
		return this.item;
	}

}
