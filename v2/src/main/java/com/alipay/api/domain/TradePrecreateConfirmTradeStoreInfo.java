package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺信息
 *
 * @author auto create
 * @since 1.0, 2019-07-23 11:48:15
 */
public class TradePrecreateConfirmTradeStoreInfo extends AlipayObject {

	private static final long serialVersionUID = 1662848752525514374L;

	/**
	 * 店铺所在城市id
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 店铺所在城市简体中文名
	 */
	@ApiField("city_name_sc")
	private String cityNameSc;

	/**
	 * 店铺ID(外标)
	 */
	@ApiField("id")
	private String id;

	/**
	 * 店铺MCC
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 店铺名称
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
