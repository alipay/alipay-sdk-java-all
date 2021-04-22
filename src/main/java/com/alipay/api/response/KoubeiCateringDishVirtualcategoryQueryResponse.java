package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishVirtualShopSimplifyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.virtualcategory.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-14 15:05:15
 */
public class KoubeiCateringDishVirtualcategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8666445293953475461L;

	/** 
	 * 是否需要重试，true：需要；false：不需要
	 */
	@ApiField("retry")
	private Boolean retry;

	/** 
	 * 门店下虚拟类目信息
	 */
	@ApiField("shop_info")
	private KbdishVirtualShopSimplifyInfo shopInfo;

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

	public void setShopInfo(KbdishVirtualShopSimplifyInfo shopInfo) {
		this.shopInfo = shopInfo;
	}
	public KbdishVirtualShopSimplifyInfo getShopInfo( ) {
		return this.shopInfo;
	}

}
