package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-20 21:22:47
 */
public class NfcExpoCheckPlaceItemVO extends AlipayObject {

	private static final long serialVersionUID = 8827876628864189681L;

	/**
	 * 打卡小程序URL
	 */
	@ApiField("check_app_url")
	private String checkAppUrl;

	/**
	 * 是否打卡
	 */
	@ApiField("checked")
	private Boolean checked;

	/**
	 * 外部自定义标识
	 */
	@ApiField("external_place_mark")
	private String externalPlaceMark;

	/**
	 * 打卡点全称
	 */
	@ApiField("place_full_name")
	private String placeFullName;

	/**
	 * 打卡点id
	 */
	@ApiField("place_id")
	private String placeId;

	/**
	 * 打卡点名称
	 */
	@ApiField("place_name")
	private String placeName;

	/**
	 * 打卡点位置
	 */
	@ApiField("position")
	private String position;

	public String getCheckAppUrl() {
		return this.checkAppUrl;
	}
	public void setCheckAppUrl(String checkAppUrl) {
		this.checkAppUrl = checkAppUrl;
	}

	public Boolean getChecked() {
		return this.checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public String getExternalPlaceMark() {
		return this.externalPlaceMark;
	}
	public void setExternalPlaceMark(String externalPlaceMark) {
		this.externalPlaceMark = externalPlaceMark;
	}

	public String getPlaceFullName() {
		return this.placeFullName;
	}
	public void setPlaceFullName(String placeFullName) {
		this.placeFullName = placeFullName;
	}

	public String getPlaceId() {
		return this.placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return this.placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}
