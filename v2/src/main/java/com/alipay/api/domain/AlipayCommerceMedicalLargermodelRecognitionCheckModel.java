package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安诊儿图片识别分类
 *
 * @author auto create
 * @since 1.0, 2025-08-27 18:03:20
 */
public class AlipayCommerceMedicalLargermodelRecognitionCheckModel extends AlipayObject {

	private static final long serialVersionUID = 6655684596246345726L;

	/**
	 * 区分请求来源
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 业务来源类型
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 渠道
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 图片aftsId
	 */
	@ApiField("field_id")
	private String fieldId;

	/**
	 * 用于区分同一个app下的机构
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 外部传参userId，需保证同一用户id唯一性
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 当out_user_id为2088uid时，需将这个值设置为：ALIPAY_UID；当out_user_id为其他值时，可将这个值设置为：OTHER_UID；若是open_id时，设置为ALIPAY_OPENID
	 */
	@ApiField("out_user_type")
	private String outUserType;

	/**
	 * 区分当前对话场景意图 待分配后传入固定值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 图片url
	 */
	@ApiField("url")
	private String url;

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getFieldId() {
		return this.fieldId;
	}
	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
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

	public String getOutUserType() {
		return this.outUserType;
	}
	public void setOutUserType(String outUserType) {
		this.outUserType = outUserType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
