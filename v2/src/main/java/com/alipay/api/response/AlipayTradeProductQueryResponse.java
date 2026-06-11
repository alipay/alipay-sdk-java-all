package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NexusPayProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.product.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-08 19:47:57
 */
public class AlipayTradeProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7354335575654597572L;

	/** 
	 * null
	 */
	@ApiListField("product_list")
	@ApiField("nexus_pay_product")
	private List<NexusPayProduct> productList;

	public void setProductList(List<NexusPayProduct> productList) {
		this.productList = productList;
	}
	public List<NexusPayProduct> getProductList( ) {
		return this.productList;
	}

}
