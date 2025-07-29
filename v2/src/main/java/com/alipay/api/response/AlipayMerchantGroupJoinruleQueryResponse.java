package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupJoinRuleVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.joinrule.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-31 16:17:22
 */
public class AlipayMerchantGroupJoinruleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1768431655413249227L;

	/** 
	 * 入群规则列表
	 */
	@ApiListField("group_join_rules")
	@ApiField("group_join_rule_v_o")
	private List<GroupJoinRuleVO> groupJoinRules;

	public void setGroupJoinRules(List<GroupJoinRuleVO> groupJoinRules) {
		this.groupJoinRules = groupJoinRules;
	}
	public List<GroupJoinRuleVO> getGroupJoinRules( ) {
		return this.groupJoinRules;
	}

}
