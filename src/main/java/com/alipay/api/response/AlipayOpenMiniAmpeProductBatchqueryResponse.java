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
 * @since 1.0, 2021-07-14 10:13:46
 */
public class AlipayOpenMiniAmpeProductBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4421974921244487517L;

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
