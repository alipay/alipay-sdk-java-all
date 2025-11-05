package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solcreditserviceprod.product.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-14 20:02:20
 */
public class AlipayMerchantSolcreditserviceprodProductCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3129557111562138162L;

	/** 
	 * 系统生成的商品编号
	 */
	@ApiField("product_no")
	private String productNo;

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductNo( ) {
		return this.productNo;
	}

}
