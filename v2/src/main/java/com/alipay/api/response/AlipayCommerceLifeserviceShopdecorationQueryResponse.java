package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeServiceShopBusinessTime;
import com.alipay.api.domain.LifeServiceAttr;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shopdecoration.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-16 17:37:44
 */
public class AlipayCommerceLifeserviceShopdecorationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8414774633637931711L;

	/** 
	 * null
	 */
	@ApiListField("shop_business_time")
	@ApiField("life_service_shop_business_time")
	private List<LifeServiceShopBusinessTime> shopBusinessTime;

	/** 
	 * null
	 */
	@ApiListField("shop_commercial_tags")
	@ApiField("string")
	private List<String> shopCommercialTags;

	/** 
	 * null
	 */
	@ApiListField("shop_decoration_attrs")
	@ApiField("life_service_attr")
	private List<LifeServiceAttr> shopDecorationAttrs;

	/** 
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 门店logo头像url
	 */
	@ApiField("shop_logo")
	private String shopLogo;

	/** 
	 * null
	 */
	@ApiListField("shop_vibes_images")
	@ApiField("string")
	private List<String> shopVibesImages;

	public void setShopBusinessTime(List<LifeServiceShopBusinessTime> shopBusinessTime) {
		this.shopBusinessTime = shopBusinessTime;
	}
	public List<LifeServiceShopBusinessTime> getShopBusinessTime( ) {
		return this.shopBusinessTime;
	}

	public void setShopCommercialTags(List<String> shopCommercialTags) {
		this.shopCommercialTags = shopCommercialTags;
	}
	public List<String> getShopCommercialTags( ) {
		return this.shopCommercialTags;
	}

	public void setShopDecorationAttrs(List<LifeServiceAttr> shopDecorationAttrs) {
		this.shopDecorationAttrs = shopDecorationAttrs;
	}
	public List<LifeServiceAttr> getShopDecorationAttrs( ) {
		return this.shopDecorationAttrs;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}
	public String getShopLogo( ) {
		return this.shopLogo;
	}

	public void setShopVibesImages(List<String> shopVibesImages) {
		this.shopVibesImages = shopVibesImages;
	}
	public List<String> getShopVibesImages( ) {
		return this.shopVibesImages;
	}

}
