package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直连商户信息
格式为json
 *
 * @author auto create
 * @since 1.0, 2022-04-13 11:00:51
 */
public class TradePrecreateConfirmTradeMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 4765961487763235286L;

	/**
	 * 商户所在的城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 商户所在城市简体中文名
	 */
	@ApiField("city_name_sc")
	private String cityNameSc;

	/**
	 * 直连商户ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 直连商户MCC
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户类型

企业取值：ENTERPRISE

个人取值：

PERSONAL

个体工商户取值：

PERSONAL_BUSINESS
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 直连商户名称
	 */
	@ApiField("name")
	private String name;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityNameSc() {
		return this.cityNameSc;
	}
	public void setCityNameSc(String cityNameSc) {
		this.cityNameSc = cityNameSc;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
