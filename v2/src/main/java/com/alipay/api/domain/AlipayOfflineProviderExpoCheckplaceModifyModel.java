package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * nfc展会碰一下打卡点位编辑接口
 *
 * @author auto create
 * @since 1.0, 2026-05-25 18:02:50
 */
public class AlipayOfflineProviderExpoCheckplaceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4163183474226973952L;

	/**
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 卡面破形底图
	 */
	@ApiField("card_edge_bg_image")
	private String cardEdgeBgImage;

	/**
	 * 卡面破形图
	 */
	@ApiField("card_edge_image")
	private String cardEdgeImage;

	/**
	 * 卡片名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 卡面底图URL
	 */
	@ApiField("card_url")
	private String cardUrl;

	/**
	 * 打卡点类型：pay=支付，simple=普通
	 */
	@ApiField("check_place_type")
	private String checkPlaceType;

	/**
	 * 设备SN，pay类型必填，多个SN用英文逗号分隔
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 自定义打卡点标记
	 */
	@ApiField("external_place_mark")
	private String externalPlaceMark;

	/**
	 * 打卡点id
	 */
	@ApiField("place_id")
	private String placeId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getCardEdgeBgImage() {
		return this.cardEdgeBgImage;
	}
	public void setCardEdgeBgImage(String cardEdgeBgImage) {
		this.cardEdgeBgImage = cardEdgeBgImage;
	}

	public String getCardEdgeImage() {
		return this.cardEdgeImage;
	}
	public void setCardEdgeImage(String cardEdgeImage) {
		this.cardEdgeImage = cardEdgeImage;
	}

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardUrl() {
		return this.cardUrl;
	}
	public void setCardUrl(String cardUrl) {
		this.cardUrl = cardUrl;
	}

	public String getCheckPlaceType() {
		return this.checkPlaceType;
	}
	public void setCheckPlaceType(String checkPlaceType) {
		this.checkPlaceType = checkPlaceType;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getExternalPlaceMark() {
		return this.externalPlaceMark;
	}
	public void setExternalPlaceMark(String externalPlaceMark) {
		this.externalPlaceMark = externalPlaceMark;
	}

	public String getPlaceId() {
		return this.placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

}
