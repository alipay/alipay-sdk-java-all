package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭芝麻GO协议查询
 *
 * @author auto create
 * @since 1.0, 2023-01-03 10:56:59
 */
public class AlipayUserFamilyShareZmgoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4777572694176569822L;

	/**
	 * 默认未false。设置为true时同时查询个人版协议
	 */
	@ApiField("enable_personal")
	private Boolean enablePersonal;

	/**
	 * 共享关系接入场景，例如健康卡family_health
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 芝麻GO模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getEnablePersonal() {
		return this.enablePersonal;
	}
	public void setEnablePersonal(Boolean enablePersonal) {
		this.enablePersonal = enablePersonal;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
