package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增非标品牌
 *
 * @author auto create
 * @since 1.0, 2025-04-01 11:32:51
 */
public class AntMerchantExpandBrandCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8174577453569248476L;

	/**
	 * 品牌中文名，中文名与英文名至少填写一个。
	 */
	@ApiField("brand_chs_name")
	private String brandChsName;

	/**
	 * 品牌英文名，中文名与英文名至少填写一个。
	 */
	@ApiField("brand_eng_name")
	private String brandEngName;

	/**
	 * 品牌运营主体的pid
	 */
	@ApiField("carrier_id")
	private String carrierId;

	/**
	 * 需传入ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。
	 */
	@ApiField("logo_url")
	private String logoUrl;

	public String getBrandChsName() {
		return this.brandChsName;
	}
	public void setBrandChsName(String brandChsName) {
		this.brandChsName = brandChsName;
	}

	public String getBrandEngName() {
		return this.brandEngName;
	}
	public void setBrandEngName(String brandEngName) {
		this.brandEngName = brandEngName;
	}

	public String getCarrierId() {
		return this.carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

}
