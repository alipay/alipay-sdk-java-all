package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 编辑自动回复
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:28
 */
public class AlipayMerchantGroupAutoreplyCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 8566561942888182178L;

	/**
	 * 修改操作必填
	 */
	@ApiField("autoreply_id")
	private String autoreplyId;

	/**
	 * 是否全局生效
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
	@ApiListField("rule_config_list")
	@ApiField("group_msg_autoreply_rule_v_o")
	private List<GroupMsgAutoreplyRuleVO> ruleConfigList;

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

}
