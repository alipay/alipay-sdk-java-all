package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告屏蔽配置详情
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:42:32
 */
public class GroupControlVO extends AlipayObject {

	private static final long serialVersionUID = 8873486248649979997L;

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
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

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

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

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

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
