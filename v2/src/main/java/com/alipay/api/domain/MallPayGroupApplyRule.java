package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈商场付业务规则数据结构
 *
 * @author auto create
 * @since 1.0, 2023-08-08 15:37:36
 */
public class MallPayGroupApplyRule extends AlipayObject {

	private static final long serialVersionUID = 8546969548986478576L;

	/**
	 * 业务规则Id
	 */
	@ApiField("biz_rule_id")
	private String bizRuleId;

	/**
	 * 业务规则名称
	 */
	@ApiField("biz_rule_name")
	private String bizRuleName;

	/**
	 * 规则范围类型，ALL：全场，SHOP_LIMIT：门店范围
	 */
	@ApiField("biz_rule_type")
	private String bizRuleType;

	/**
	 * VALID：有效  INVALID：无效
	 */
	@ApiField("status")
	private String status;

	public String getBizRuleId() {
		return this.bizRuleId;
	}
	public void setBizRuleId(String bizRuleId) {
		this.bizRuleId = bizRuleId;
	}

	public String getBizRuleName() {
		return this.bizRuleName;
	}
	public void setBizRuleName(String bizRuleName) {
		this.bizRuleName = bizRuleName;
	}

	public String getBizRuleType() {
		return this.bizRuleType;
	}
	public void setBizRuleType(String bizRuleType) {
		this.bizRuleType = bizRuleType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
