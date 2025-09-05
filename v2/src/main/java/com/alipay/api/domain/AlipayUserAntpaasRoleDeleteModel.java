package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁通行证角色解绑
 *
 * @author auto create
 * @since 1.0, 2022-10-17 20:16:21
 */
public class AlipayUserAntpaasRoleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2814734168211511396L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 角色Id
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 被动建立关系的 会员来源业务平台类型。104-金融云平台，103-淘宝平台，102-保险平台
	 */
	@ApiField("join_rel_role_biz_platform")
	private String joinRelRoleBizPlatform;

	/**
	 * 主操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 角色关系类型，1-保险业务，2-金融云业务
	 */
	@ApiField("rel_biz_typ")
	private String relBizTyp;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getJoinRelRoleBizPlatform() {
		return this.joinRelRoleBizPlatform;
	}
	public void setJoinRelRoleBizPlatform(String joinRelRoleBizPlatform) {
		this.joinRelRoleBizPlatform = joinRelRoleBizPlatform;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getRelBizTyp() {
		return this.relBizTyp;
	}
	public void setRelBizTyp(String relBizTyp) {
		this.relBizTyp = relBizTyp;
	}

}
