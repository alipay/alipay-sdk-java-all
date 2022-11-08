package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 封面氛围容器
 *
 * @author auto create
 * @since 1.0, 2022-09-01 21:02:48
 */
public class GiftTemplateAtmosphereBox extends AlipayObject {

	private static final long serialVersionUID = 8179221257732486183L;

	/**
	 * 封面氛围的gif资源
	 */
	@ApiField("atmosphere_gif_url")
	private String atmosphereGifUrl;

	/**
	 * 封面氛围全屏展示用
	 */
	@ApiField("atmosphere_plus_url")
	private String atmospherePlusUrl;

	/**
	 * 封面氛围类型
	 */
	@ApiField("atmosphere_type")
	private String atmosphereType;

	/**
	 * 封面氛围
	 */
	@ApiField("atmosphere_url")
	private String atmosphereUrl;

	public String getAtmosphereGifUrl() {
		return this.atmosphereGifUrl;
	}
	public void setAtmosphereGifUrl(String atmosphereGifUrl) {
		this.atmosphereGifUrl = atmosphereGifUrl;
	}

	public String getAtmospherePlusUrl() {
		return this.atmospherePlusUrl;
	}
	public void setAtmospherePlusUrl(String atmospherePlusUrl) {
		this.atmospherePlusUrl = atmospherePlusUrl;
	}

	public String getAtmosphereType() {
		return this.atmosphereType;
	}
	public void setAtmosphereType(String atmosphereType) {
		this.atmosphereType = atmosphereType;
	}

	public String getAtmosphereUrl() {
		return this.atmosphereUrl;
	}
	public void setAtmosphereUrl(String atmosphereUrl) {
		this.atmosphereUrl = atmosphereUrl;
	}

}
