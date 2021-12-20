package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.asset.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:41:48
 */
public class AlipayCommerceIotMdeviceprodAssetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4632277344511237284L;

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

	/** 
	 * 物料类型
	 */
	@ApiField("item_type")
	private String itemType;

	/** 
	 * 设备型号
	 */
	@ApiField("model_number")
	private String modelNumber;

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

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemType( ) {
		return this.itemType;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getModelNumber( ) {
		return this.modelNumber;
	}

}
