package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版归属商户信息
 *
 * @author auto create
 * @since 1.0, 2023-06-25 15:16:28
 */
public class TemplateMerchantDTO extends AlipayObject {

	private static final long serialVersionUID = 6742895533256493947L;

	/**
	 * 卡券所属品牌ID，支持支付宝品牌库与淘宝品牌库录入的品牌，当从对应品牌库录入卡券品牌信息后可获得品牌ID。支持自定义动态参数传值，但动态参数需定义为：$_r_brand_id$。
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌ID来源，当brand_id有值时本字段必填。TAOBAO：代表来自淘宝品牌库，ALIPAY：代表来自支付宝品牌库。支持自定义动态参数传值，但动态参数需定义为：$_r_brand_id_source$。
	 */
	@ApiField("brand_id_source")
	private String brandIdSource;

	/**
	 * 卡券品牌名称，建议9个字符以内。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 卡券所属商户生活号，可用于卡券详情页下方快速跳转商户生活号。生活号创建见生活号API服务（alipay.open.public.life.agent.create）。支持自定义动态参数传值，但动态参数需定义为：$_r_life_code$。
	 */
	@ApiField("life_code")
	private String lifeCode;

	/**
	 * 卡券所属商户名称。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户的服务电话。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("merchant_tel")
	private String merchantTel;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandIdSource() {
		return this.brandIdSource;
	}
	public void setBrandIdSource(String brandIdSource) {
		this.brandIdSource = brandIdSource;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getLifeCode() {
		return this.lifeCode;
	}
	public void setLifeCode(String lifeCode) {
		this.lifeCode = lifeCode;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantTel() {
		return this.merchantTel;
	}
	public void setMerchantTel(String merchantTel) {
		this.merchantTel = merchantTel;
	}

}
