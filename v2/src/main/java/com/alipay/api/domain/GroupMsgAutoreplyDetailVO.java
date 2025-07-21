package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自动回复详情
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:29
 */
public class GroupMsgAutoreplyDetailVO extends AlipayObject {

	private static final long serialVersionUID = 6394388243364186514L;

	/**
	 * 自动回复id
	 */
	@ApiField("autoreply_id")
	private String autoreplyId;

	/**
	 * 是否全局生效
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
	@ApiListField("rule_config_list")
	@ApiField("group_msg_autoreply_rule_v_o")
	private List<GroupMsgAutoreplyRuleVO> ruleConfigList;

	/**
	 * 状态  0 删除，2 启用，3 停用
	 */
	@ApiField("status")
	private Long status;

	public String getAutoreplyId() {
		return this.autoreplyId;
	}
	public void setAutoreplyId(String autoreplyId) {
		this.autoreplyId = autoreplyId;
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

	public List<GroupMsgAutoreplyRuleVO> getRuleConfigList() {
		return this.ruleConfigList;
	}
	public void setRuleConfigList(List<GroupMsgAutoreplyRuleVO> ruleConfigList) {
		this.ruleConfigList = ruleConfigList;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
