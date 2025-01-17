package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步卡包优惠券-主体模型
 *
 * @author auto create
 * @since 1.0, 2023-11-23 15:48:38
 */
public class VoucherPrincipalInfo extends AlipayObject {

	private static final long serialVersionUID = 1677525729976537569L;

	/**
	 * 1、商户传入商户品牌id，由支付宝内部进行品牌映射关联
2、如传入此字段，请先行和支付宝联系。
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 商户品牌的logo图片地址
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 商户品牌的中文名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 发券小程序id
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getTinyAppId() {
		return this.tinyAppId;
	}
	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}

}
