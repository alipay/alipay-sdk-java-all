package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsOffilneProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.product.offline.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsCooperationProductOfflineBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7641867779157178255L;

	/** 
	 * 返回给机构的线下产品信息列表
	 */
	@ApiListField("product_list")
	@ApiField("ins_offilne_product")
	private List<InsOffilneProduct> productList;

	public void setProductList(List<InsOffilneProduct> productList) {
		this.productList = productList;
	}
	public List<InsOffilneProduct> getProductList( ) {
		return this.productList;
	}

}
