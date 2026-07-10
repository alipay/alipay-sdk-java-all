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
 * @since 1.0, 2026-06-30 22:32:55
 */
public class AlipayTradeProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8537482292644134992L;

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
