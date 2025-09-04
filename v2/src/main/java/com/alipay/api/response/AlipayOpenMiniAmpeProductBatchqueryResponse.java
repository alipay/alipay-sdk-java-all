package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AmpeProductInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.product.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-03 11:53:34
 */
public class AlipayOpenMiniAmpeProductBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5252327732151657958L;

	/** 
	 * 用户设备产品列表
	 */
	@ApiListField("product_list")
	@ApiField("ampe_product_info")
	private List<AmpeProductInfo> productList;

	public void setProductList(List<AmpeProductInfo> productList) {
		this.productList = productList;
	}
	public List<AmpeProductInfo> getProductList( ) {
		return this.productList;
	}

}
