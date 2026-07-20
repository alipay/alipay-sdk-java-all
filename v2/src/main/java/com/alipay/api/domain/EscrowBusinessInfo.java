package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家经营信息
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:11:54
 */
public class EscrowBusinessInfo extends AlipayObject {

	private static final long serialVersionUID = 1442482961488388964L;

	/**
	 * 网站类型，取值：PC_WEB、MOBILE_WEB
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 图片ID
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 经营地址
	 */
	@ApiField("mrch_biz_address")
	private String mrchBizAddress;

	/**
	 * ONLINE_WEBAPP  在线web应用
	 */
	@ApiField("place_type")
	private String placeType;

	/**
	 * 经营场所url
	 */
	@ApiField("place_url")
	private String placeUrl;

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getMrchBizAddress() {
		return this.mrchBizAddress;
	}
	public void setMrchBizAddress(String mrchBizAddress) {
		this.mrchBizAddress = mrchBizAddress;
	}

	public String getPlaceType() {
		return this.placeType;
	}
	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	public String getPlaceUrl() {
		return this.placeUrl;
	}
	public void setPlaceUrl(String placeUrl) {
		this.placeUrl = placeUrl;
	}

}
