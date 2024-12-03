package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO模板权利配置
 *
 * @author auto create
 * @since 1.0, 2022-11-24 10:55:47
 */
public class ZMGORightConfig extends AlipayObject {

	private static final long serialVersionUID = 1529931594399269738L;

	/**
	 * 芝麻GO管理页已享优惠进度的重定向链接
	 */
	@ApiField("cumulative_preferential_redirect_schema")
	private String cumulativePreferentialRedirectSchema;

	/**
	 * 权益描述
	 */
	@ApiField("custom_benefit_desc")
	private String customBenefitDesc;

	/**
	 * 权益描述子标题
	 */
	@ApiField("custom_sub_benefit_desc")
	private String customSubBenefitDesc;

	public String getCumulativePreferentialRedirectSchema() {
		return this.cumulativePreferentialRedirectSchema;
	}
	public void setCumulativePreferentialRedirectSchema(String cumulativePreferentialRedirectSchema) {
		this.cumulativePreferentialRedirectSchema = cumulativePreferentialRedirectSchema;
	}

	public String getCustomBenefitDesc() {
		return this.customBenefitDesc;
	}
	public void setCustomBenefitDesc(String customBenefitDesc) {
		this.customBenefitDesc = customBenefitDesc;
	}

	public String getCustomSubBenefitDesc() {
		return this.customSubBenefitDesc;
	}
	public void setCustomSubBenefitDesc(String customSubBenefitDesc) {
		this.customSubBenefitDesc = customSubBenefitDesc;
	}

}
