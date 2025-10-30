package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展位投放反馈接口
 *
 * @author auto create
 * @since 1.0, 2024-12-05 14:54:24
 */
public class AlipayCommerceMedicalLargermodelWelcomecardSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6461396125516372286L;

	/**
	 * 用户城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 反馈内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用于区分同一个app下的机构
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 用户openId
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 当out_user_id为2088uid时，需将这个值设置为：ALIPAY_UID；当out_user_id为其他值时，可将这个值设置为：OTHER_UID；若是open_id时，设置为ALIPAY_OPENID
	 */
	@ApiField("outer_user_type")
	private String outerUserType;

	/**
	 * 区分当前对话场景意图 前缀不同，不做强枚举校验
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOuterUserType() {
		return this.outerUserType;
	}
	public void setOuterUserType(String outerUserType) {
		this.outerUserType = outerUserType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
