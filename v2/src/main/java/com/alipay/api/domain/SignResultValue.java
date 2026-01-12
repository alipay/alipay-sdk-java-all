package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已生效的销账或出账机构
 *
 * @author auto create
 * @since 1.0, 2016-12-27 10:52:19
 */
public class SignResultValue extends AlipayObject {

	private static final long serialVersionUID = 5762384668173315836L;

	/**
	 * 已生效的销账/出账机构
	 */
	@ApiField("effect_biz_value")
	private String effectBizValue;

	public String getEffectBizValue() {
		return this.effectBizValue;
	}
	public void setEffectBizValue(String effectBizValue) {
		this.effectBizValue = effectBizValue;
	}

}
