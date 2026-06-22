package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ProductInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.common.singleproduct.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-22 16:22:45
 */
public class AlipayInsSceneCommonSingleproductConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1136133678926487594L;

	/** 
	 * 产品信息
	 */
	@ApiField("product_info")
	private ProductInfoDTO productInfo;

	public void setProductInfo(ProductInfoDTO productInfo) {
		this.productInfo = productInfo;
	}
	public ProductInfoDTO getProductInfo( ) {
		return this.productInfo;
	}

}
