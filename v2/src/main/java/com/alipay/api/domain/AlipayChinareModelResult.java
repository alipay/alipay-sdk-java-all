package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中再核保查询结果
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:52:15
 */
public class AlipayChinareModelResult extends AlipayObject {

	private static final long serialVersionUID = 8898489421444741756L;

	/**
	 * 体检记录id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 核保结果
	 */
	@ApiField("rule_result")
	private String ruleResult;

	/**
	 * 交易流水记录id
	 */
	@ApiField("trans_id")
	private String transId;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleResult() {
		return this.ruleResult;
	}
	public void setRuleResult(String ruleResult) {
		this.ruleResult = ruleResult;
	}

	public String getTransId() {
		return this.transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}

}
