package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.businessbill.goods.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-15 14:37:29
 */
public class AlipayMarketingBusinessbillGoodsAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2489586228275636612L;

	/** 
	 * 商品id，后续修改/删除唯一凭证
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
