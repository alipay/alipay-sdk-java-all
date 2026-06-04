package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * nps卡片状态查询
 *
 * @author auto create
 * @since 1.0, 2026-03-17 11:01:42
 */
public class AlipayCommerceMedicalNpsStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5154165988585627536L;

	/**
	 * 用于区分请求的入口，由调用方传入
	 */
	@ApiField("entrance_type")
	private String entranceType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 智能体所属机构id，由调用方传入
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 场景信息
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getEntranceType() {
		return this.entranceType;
	}
	public void setEntranceType(String entranceType) {
		this.entranceType = entranceType;
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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
