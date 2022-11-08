package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO模板权利配置
 *
 * @author auto create
 * @since 1.0, 2022-08-26 10:00:46
 */
public class ZMGORightConfig extends AlipayObject {

	private static final long serialVersionUID = 6496814666651254247L;

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
