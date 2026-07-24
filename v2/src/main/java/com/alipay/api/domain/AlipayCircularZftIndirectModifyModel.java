package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进件信息修改
 *
 * @author auto create
 * @since 1.0, 2026-03-05 13:42:43
 */
public class AlipayCircularZftIndirectModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3769459219825362187L;

	/**
	 * 默认结算账号
	 */
	@ApiField("default_settle_rule")
	private ZftDefaultSettleRule defaultSettleRule;

	/**
	 * 进件申请单中的二级商户openid
	 */
	@ApiField("relation_openid")
	private String relationOpenid;

	/**
	 * 进件账户id
	 */
	@ApiField("relation_uid")
	private String relationUid;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public ZftDefaultSettleRule getDefaultSettleRule() {
		return this.defaultSettleRule;
	}
	public void setDefaultSettleRule(ZftDefaultSettleRule defaultSettleRule) {
		this.defaultSettleRule = defaultSettleRule;
	}

	public String getRelationOpenid() {
		return this.relationOpenid;
	}
	public void setRelationOpenid(String relationOpenid) {
		this.relationOpenid = relationOpenid;
	}

	public String getRelationUid() {
		return this.relationUid;
	}
	public void setRelationUid(String relationUid) {
		this.relationUid = relationUid;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
