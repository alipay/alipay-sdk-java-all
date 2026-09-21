package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopProductPriceModifyResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.shop.productprice.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-17 14:22:56
 */
public class AlipayCommerceEcShopProductpriceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6213111617229788357L;

	/** 
	 * null
	 */
	@ApiListField("fail_list")
	@ApiField("shop_product_price_modify_result")
	private List<ShopProductPriceModifyResult> failList;

	/** 
	 * null
	 */
	@ApiListField("success_list")
	@ApiField("shop_product_price_modify_result")
	private List<ShopProductPriceModifyResult> successList;

	public void setFailList(List<ShopProductPriceModifyResult> failList) {
		this.failList = failList;
	}
	public List<ShopProductPriceModifyResult> getFailList( ) {
		return this.failList;
	}

	public void setSuccessList(List<ShopProductPriceModifyResult> successList) {
		this.successList = successList;
	}
	public List<ShopProductPriceModifyResult> getSuccessList( ) {
		return this.successList;
	}

}
