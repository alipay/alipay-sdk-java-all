package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安诊儿agent欢迎页查询
 *
 * @author auto create
 * @since 1.0, 2024-10-10 19:18:47
 */
public class AlipayCommerceMedicalLargermodelAgentwelcomecardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1824758817658962621L;

	/**
	 * 智能体名称
	 */
	@ApiField("agent_code")
	private String agentCode;

	/**
	 * 外部用户id映射openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 组织id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 外部用户类型
	 */
	@ApiField("outer_user_type")
	private String outerUserType;

	/**
	 * 该接口的使用场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAgentCode() {
		return this.agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
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
