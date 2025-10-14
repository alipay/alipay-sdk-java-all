package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家群广告屏蔽编辑
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:37:36
 */
public class AlipayMerchantGroupGroupcontrolCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 5293596972821277368L;

	/**
	 * 命中处理方式
	 */
	@ApiField("action")
	private GroupControlActionVO action;

	/**
	 * 是否全部群组
	 */
	@ApiField("global_valid")
	private Boolean globalValid;

	/**
	 * null
	 */
	@ApiListField("group_id_list")
	@ApiField("string")
	private List<String> groupIdList;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * null
	 */
	@ApiListField("role_list")
	@ApiField("string")
	private List<String> roleList;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * null
	 */
	@ApiListField("rule_list")
	@ApiField("group_control_rule_v_o")
	private List<GroupControlRuleVO> ruleList;

	public GroupControlActionVO getAction() {
		return this.action;
	}
	public void setAction(GroupControlActionVO action) {
		this.action = action;
	}

	public Boolean getGlobalValid() {
		return this.globalValid;
	}
	public void setGlobalValid(Boolean globalValid) {
		this.globalValid = globalValid;
	}

	public List<String> getGroupIdList() {
		return this.groupIdList;
	}
	public void setGroupIdList(List<String> groupIdList) {
		this.groupIdList = groupIdList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getRoleList() {
		return this.roleList;
	}
	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public List<GroupControlRuleVO> getRuleList() {
		return this.ruleList;
	}
	public void setRuleList(List<GroupControlRuleVO> ruleList) {
		this.ruleList = ruleList;
	}

}
