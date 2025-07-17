package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LandingTypeDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.product.landinginfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-13 17:26:28
 */
public class AlipayDataDataserviceProductLandinginfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6744133257219836962L;

	/** 
	 * 请求成功时返回该字段；支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID。
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 请求成功时返回该字段
	 */
	@ApiField("landing")
	private LandingTypeDto landing;

	/** 
	 * 请求成功时返回该字段；商家侧商品ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setLanding(LandingTypeDto landing) {
		this.landing = landing;
	}
	public LandingTypeDto getLanding( ) {
		return this.landing;
	}

	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}
	public String getOutItemId( ) {
		return this.outItemId;
	}

}
