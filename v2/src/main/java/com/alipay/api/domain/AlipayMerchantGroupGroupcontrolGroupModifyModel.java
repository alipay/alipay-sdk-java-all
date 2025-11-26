package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改广告屏蔽群组
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:37:36
 */
public class AlipayMerchantGroupGroupcontrolGroupModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7465664844291344463L;

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
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

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

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

}
