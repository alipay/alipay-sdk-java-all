package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 浦发银行特定场景参数
 *
 * @author auto create
 * @since 1.0, 2026-02-26 14:16:32
 */
public class FreightFlowSpdbSpecParams extends AlipayObject {

	private static final long serialVersionUID = 5173615639358848373L;

	/**
	 * 交易地区代码
	 */
	@ApiField("area_code")
	private String areaCode;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

}
