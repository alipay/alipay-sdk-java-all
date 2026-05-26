package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺装修信息同步
 *
 * @author auto create
 * @since 1.0, 2026-05-11 15:17:48
 */
public class AlipayCommerceLifeserviceShopdecorationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7522861876447334868L;

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
	 * 门店logo头像文件id 来源于alipay.open.file.upload支付宝文件上传接口
	 */
	@ApiField("shop_logo")
	private String shopLogo;

	/**
	 * null
	 */
	@ApiListField("shop_vibes_images")
	@ApiField("string")
	private List<String> shopVibesImages;

	public List<LifeServiceShopBusinessTime> getShopBusinessTime() {
		return this.shopBusinessTime;
	}
	public void setShopBusinessTime(List<LifeServiceShopBusinessTime> shopBusinessTime) {
		this.shopBusinessTime = shopBusinessTime;
	}

	public List<String> getShopCommercialTags() {
		return this.shopCommercialTags;
	}
	public void setShopCommercialTags(List<String> shopCommercialTags) {
		this.shopCommercialTags = shopCommercialTags;
	}

	public List<LifeServiceAttr> getShopDecorationAttrs() {
		return this.shopDecorationAttrs;
	}
	public void setShopDecorationAttrs(List<LifeServiceAttr> shopDecorationAttrs) {
		this.shopDecorationAttrs = shopDecorationAttrs;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopLogo() {
		return this.shopLogo;
	}
	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}

	public List<String> getShopVibesImages() {
		return this.shopVibesImages;
	}
	public void setShopVibesImages(List<String> shopVibesImages) {
		this.shopVibesImages = shopVibesImages;
	}

}
