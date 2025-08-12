package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报名规则数据
 *
 * @author auto create
 * @since 1.0, 2022-02-23 11:50:46
 */
public class RecruitEnrollRuleData extends AlipayObject {

	private static final long serialVersionUID = 2537988143662245364L;

	/**
	 * 招商方案可提报的券的规则列表，不同的券有不同的规则。
	 */
	@ApiListField("recruit_voucher_rules")
	@ApiField("recruit_voucher_rule")
	private List<RecruitVoucherRule> recruitVoucherRules;

	/**
	 * 素材的要求，json字符串，使用时需要把此字符串解析成json对象。
field：提报的字段key
label：字段说明
required：是否必填
type：字段类型。包含：图片（IMAGE）、文本（TEXT）、数据源（DATASOURCE）等
rules：字段约束规则
  图片（IMAGE）：
    image_size：图片宽高，单位是PX
    file_type：图片类型
    file_size：表示图片大小的最大值，单位是KB
    image_aspect_ratio: 图片宽高比例
  文本（TEXT）：
    unicode_length：文本长度，单位为Byte
  数据源（DATASOURCE）：
    unicode_length：文本长度，单位为Byte
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
