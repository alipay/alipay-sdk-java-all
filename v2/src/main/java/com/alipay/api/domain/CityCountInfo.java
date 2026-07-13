package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 省市指标分布
 *
 * @author auto create
 * @since 1.0, 2026-02-04 17:44:37
 */
public class CityCountInfo extends AlipayObject {

	private static final long serialVersionUID = 2443261676317199359L;

	/**
	 * 集团成员地区分布
	 */
	@ApiListField("member_province")
	@ApiField("ep_indicator_city_count_info")
	private List<EpIndicatorCityCountInfo> memberProvince;

	/**
	 * 集团参股20%以上的企业地区分布
	 */
	@ApiListField("nephew_province")
	@ApiField("ep_indicator_city_count_info")
	private List<EpIndicatorCityCountInfo> nephewProvince;

	/**
	 * 集团参股20%以下的企业地区分布
	 */
	@ApiListField("unrelated_province")
	@ApiField("ep_indicator_city_count_info")
	private List<EpIndicatorCityCountInfo> unrelatedProvince;

	public List<EpIndicatorCityCountInfo> getMemberProvince() {
		return this.memberProvince;
	}
	public void setMemberProvince(List<EpIndicatorCityCountInfo> memberProvince) {
		this.memberProvince = memberProvince;
	}

	public List<EpIndicatorCityCountInfo> getNephewProvince() {
		return this.nephewProvince;
	}
	public void setNephewProvince(List<EpIndicatorCityCountInfo> nephewProvince) {
		this.nephewProvince = nephewProvince;
	}

	public List<EpIndicatorCityCountInfo> getUnrelatedProvince() {
		return this.unrelatedProvince;
	}
	public void setUnrelatedProvince(List<EpIndicatorCityCountInfo> unrelatedProvince) {
		this.unrelatedProvince = unrelatedProvince;
	}

}
