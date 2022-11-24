package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 参与人
 *
 * @author auto create
 * @since 1.0, 2020-05-25 09:43:10
 */
public class ContractManagerParticipantsSyncRequest extends AlipayObject {

	private static final long serialVersionUID = 1155648348884681124L;

	/**
	 * 参与人名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 参与人主体名称
	 */
	@ApiField("principal_name")
	private String principalName;

	/**
	 * 参与人主体类型：1-个人,2-企业
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 用户角色, 1-发起人,2-签署人,3-抄送人
	 */
	@ApiField("role")
	private String role;

	/**
	 * 签署状态, 0-待签, 1-未签, 2-已签 3-待审批 4-拒签 5-无需签署
	 */
	@ApiField("sign_status")
	private String signStatus;

	/**
	 * 签署时间
	 */
	@ApiField("sign_time")
	private String signTime;

	/**
	 * 支付宝账号Id,数组关联多个支付宝账号 （如果未注册支付宝账号 则为空）
	 */
	@ApiListField("user_ids")
	@ApiField("string")
	private List<String> userIds;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrincipalName() {
		return this.principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public String getSignTime() {
		return this.signTime;
	}
	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public List<String> getUserIds() {
		return this.userIds;
	}
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

}
