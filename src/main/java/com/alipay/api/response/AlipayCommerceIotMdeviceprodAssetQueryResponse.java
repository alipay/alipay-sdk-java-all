package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.asset.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-06-28 17:03:49
 */
public class AlipayCommerceIotMdeviceprodAssetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2359384385525155154L;

	/** 
	 * 物料模板的图片url
	 */
	@ApiField("image_url")
	private String imageUrl;

	/** 
	 * 物料模板的名称
	 */
	@ApiField("item_name")
	private String itemName;

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageUrl( ) {
		return this.imageUrl;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemName( ) {
		return this.itemName;
	}

}
