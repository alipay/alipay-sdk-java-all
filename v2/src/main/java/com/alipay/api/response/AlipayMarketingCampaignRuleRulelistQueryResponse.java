package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CrowdRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.rulelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:02:42
 */
public class AlipayMarketingCampaignRuleRulelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2823931321591914495L;

	/** 
	 * [{"ruledesc":"圈人规则0","ruleid":"230291","status":"ENABLE"},
{"ruledesc":"圈人规则1","ruleid":"230292","status":"ENABLE"}]
说明:
ruledesc:规则描述信息
ruleid：规则id（唯一）
status：ENABLE（规则可使用），DISABLE（不可用）
	 */
	@ApiListField("rulelist")
	@ApiField("crowd_rule_info")
	private List<CrowdRuleInfo> rulelist;

	public void setRulelist(List<CrowdRuleInfo> rulelist) {
		this.rulelist = rulelist;
	}
	public List<CrowdRuleInfo> getRulelist( ) {
		return this.rulelist;
	}

}
