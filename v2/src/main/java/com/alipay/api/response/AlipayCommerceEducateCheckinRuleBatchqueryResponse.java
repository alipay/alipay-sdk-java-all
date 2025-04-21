package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduCheckInRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.checkin.rule.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:52
 */
public class AlipayCommerceEducateCheckinRuleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6538586217243499961L;

	/** 
	 * 签到规则列表
	 */
	@ApiListField("rule_info_list")
	@ApiField("edu_check_in_rule")
	private List<EduCheckInRule> ruleInfoList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setRuleInfoList(List<EduCheckInRule> ruleInfoList) {
		this.ruleInfoList = ruleInfoList;
	}
	public List<EduCheckInRule> getRuleInfoList( ) {
		return this.ruleInfoList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
