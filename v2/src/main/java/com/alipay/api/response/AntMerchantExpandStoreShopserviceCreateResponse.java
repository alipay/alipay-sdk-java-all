package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.store.shopservice.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:17
 */
public class AntMerchantExpandStoreShopserviceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1494914548494439989L;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 场景服务ID
	 */
	@ApiField("shop_service_id")
	private String shopServiceId;

	/** 
	 * 规格ID
	 */
	@ApiField("sku_id")
	private String skuId;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setShopServiceId(String shopServiceId) {
		this.shopServiceId = shopServiceId;
	}
	public String getShopServiceId( ) {
		return this.shopServiceId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getSkuId( ) {
		return this.skuId;
	}

}
