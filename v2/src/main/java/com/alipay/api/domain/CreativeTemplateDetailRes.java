package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创意模块元素详情
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:59
 */
public class CreativeTemplateDetailRes extends AlipayObject {

	private static final long serialVersionUID = 8333771514822566723L;

	/**
	 * 该模板元素描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 元素可选值信息集合,针对一些特殊的key只能选择配置上的可选值
	 */
	@ApiListField("enum_rules")
	@ApiField("infra_template_enum_rule_resp")
	private List<InfraTemplateEnumRuleResp> enumRules;

	/**
	 * 展示元素英文名称
	 */
	@ApiField("key")
	private String key;

	/**
	 * 该创意模板元素可支持传入最大个数,相同key下可传入value值的最大数目(如果该值不存在,则默认最多传入1个)
	 */
	@ApiField("max_num")
	private Long maxNum;

	/**
	 * 金额限制规则集合
	 */
	@ApiListField("money_rules")
	@ApiField("infra_template_money_rule_resp")
	private List<InfraTemplateMoneyRuleResp> moneyRules;

	/**
	 * 是否必须(true代表必填,false代表非必填)
	 */
	@ApiField("need")
	private Boolean need;

	/**
	 * 创意模板元素限制规则集合
	 */
	@ApiListField("rules")
	@ApiField("infra_template_rule_resp")
	private List<InfraTemplateRuleResp> rules;

	/**
	 * 元素展示中文名称
	 */
	@ApiField("show_name")
	private String showName;

	/**
	 * 当前模版元素类型
	 */
	@ApiField("type")
	private String type;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<InfraTemplateEnumRuleResp> getEnumRules() {
		return this.enumRules;
	}
	public void setEnumRules(List<InfraTemplateEnumRuleResp> enumRules) {
		this.enumRules = enumRules;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public Long getMaxNum() {
		return this.maxNum;
	}
	public void setMaxNum(Long maxNum) {
		this.maxNum = maxNum;
	}

	public List<InfraTemplateMoneyRuleResp> getMoneyRules() {
		return this.moneyRules;
	}
	public void setMoneyRules(List<InfraTemplateMoneyRuleResp> moneyRules) {
		this.moneyRules = moneyRules;
	}

	public Boolean getNeed() {
		return this.need;
	}
	public void setNeed(Boolean need) {
		this.need = need;
	}

	public List<InfraTemplateRuleResp> getRules() {
		return this.rules;
	}
	public void setRules(List<InfraTemplateRuleResp> rules) {
		this.rules = rules;
	}

	public String getShowName() {
		return this.showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
