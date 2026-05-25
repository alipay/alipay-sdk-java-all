package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业所属行业信息
 *
 * @author auto create
 * @since 1.0, 2026-04-27 09:57:34
 */
public class EpIndustryModelClasses extends AlipayObject {

	private static final long serialVersionUID = 7852335681288379582L;

	/**
	 * 所属行业
	 */
	@ApiField("industry_desc")
	private String industryDesc;

	public String getIndustryDesc() {
		return this.industryDesc;
	}
	public void setIndustryDesc(String industryDesc) {
		this.industryDesc = industryDesc;
	}

}
