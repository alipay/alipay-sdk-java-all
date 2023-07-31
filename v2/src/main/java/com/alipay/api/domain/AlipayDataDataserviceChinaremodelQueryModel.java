package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中再核保结果查询
 *
 * @author auto create
 * @since 1.0, 2019-08-13 16:29:50
 */
public class AlipayDataDataserviceChinaremodelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1245524312978714234L;

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

	public String getTransId() {
		return this.transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}

}
