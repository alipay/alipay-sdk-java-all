package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询对应账户是否能够兑换相应的项目
 *
 * @author auto create
 * @since 1.0, 2022-10-12 21:20:15
 */
public class AlipaySocialAntforestPlantConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8321123638386445612L;

	/**
	 * 出账购买树种的账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 兑换类型，默认是ACCOUNT，走account账户扣能量
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 项目id，需要配合其他查询接口，查询到相关的项目之后使用。不限于树种，还包括保护地等
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
