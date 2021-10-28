package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报名规则数据
 *
 * @author auto create
 * @since 1.0, 2021-09-26 17:34:05
 */
public class RecruitEnrollRuleData extends AlipayObject {

	private static final long serialVersionUID = 6226523586384378817L;

	/**
	 * 招商方案可提报的券的规则列表，不同的券有不同的规则。
	 */
	@ApiListField("recruit_voucher_rules")
	@ApiField("recruit_voucher_rule")
	private List<RecruitVoucherRule> recruitVoucherRules;

	/**
	 * 素材的要求，json字符串，使用时需要把此字符串解析成json对象
	 */
	@ApiField("schema")
	private String schema;

	public List<RecruitVoucherRule> getRecruitVoucherRules() {
		return this.recruitVoucherRules;
	}
	public void setRecruitVoucherRules(List<RecruitVoucherRule> recruitVoucherRules) {
		this.recruitVoucherRules = recruitVoucherRules;
	}

	public String getSchema() {
		return this.schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}

}
