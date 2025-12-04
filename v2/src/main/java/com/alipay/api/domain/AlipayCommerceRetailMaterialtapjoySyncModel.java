package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 触享素材同步接口
 *
 * @author auto create
 * @since 1.0, 2025-07-31 15:33:06
 */
public class AlipayCommerceRetailMaterialtapjoySyncModel extends AlipayObject {

	private static final long serialVersionUID = 6477621687773948894L;

	/**
	 * 广告id标识
	 */
	@ApiField("ad_id")
	private String adId;

	/**
	 * 素材关联的品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 素材图片url地址
	 */
	@ApiField("material_url")
	private String materialUrl;

	public String getAdId() {
		return this.adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getMaterialUrl() {
		return this.materialUrl;
	}
	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
	}

}
