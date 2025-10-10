package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FrontProductVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.cloud.app.product.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-16 12:06:14
 */
public class AlipayOpenCloudAppProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3148827874497467829L;

	/** 
	 * 前台产品列表
	 */
	@ApiListField("product_list")
	@ApiField("front_product_v_o")
	private List<FrontProductVO> productList;

	public void setProductList(List<FrontProductVO> productList) {
		this.productList = productList;
	}
	public List<FrontProductVO> getProductList( ) {
		return this.productList;
	}

}
