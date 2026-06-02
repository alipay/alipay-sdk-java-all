package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业指标分布
 *
 * @author auto create
 * @since 1.0, 2026-02-04 17:44:37
 */
public class IndustryCountInfo extends AlipayObject {

	private static final long serialVersionUID = 2363672643251333588L;

	/**
	 * 集团成员行业分布
	 */
	@ApiListField("member_industry")
	@ApiField("ep_indicator_industry_count_info")
	private List<EpIndicatorIndustryCountInfo> memberIndustry;

	/**
	 * 集团参股20%以上的企业行业分布
	 */
	@ApiListField("nephew_industry")
	@ApiField("ep_indicator_industry_count_info")
	private List<EpIndicatorIndustryCountInfo> nephewIndustry;

	/**
	 * 集团参股20%以下的企业行业分布
	 */
	@ApiListField("unrelated_industry")
	@ApiField("ep_indicator_industry_count_info")
	private List<EpIndicatorIndustryCountInfo> unrelatedIndustry;

	public List<EpIndicatorIndustryCountInfo> getMemberIndustry() {
		return this.memberIndustry;
	}
	public void setMemberIndustry(List<EpIndicatorIndustryCountInfo> memberIndustry) {
		this.memberIndustry = memberIndustry;
	}

	public List<EpIndicatorIndustryCountInfo> getNephewIndustry() {
		return this.nephewIndustry;
	}
	public void setNephewIndustry(List<EpIndicatorIndustryCountInfo> nephewIndustry) {
		this.nephewIndustry = nephewIndustry;
	}

	public List<EpIndicatorIndustryCountInfo> getUnrelatedIndustry() {
		return this.unrelatedIndustry;
	}
	public void setUnrelatedIndustry(List<EpIndicatorIndustryCountInfo> unrelatedIndustry) {
		this.unrelatedIndustry = unrelatedIndustry;
	}

}
