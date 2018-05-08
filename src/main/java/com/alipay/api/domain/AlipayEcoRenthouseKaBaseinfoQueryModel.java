package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ka基础信息获取
 *
 * @author auto create
 * @since 1.0, 2017-07-28 10:25:25
 */
public class AlipayEcoRenthouseKaBaseinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2551222727443529197L;

	/**
	 * kaCode唯一标识
	 */
	@ApiField("ka_code")
	private String kaCode;

	public String getKaCode() {
		return this.kaCode;
	}
	public void setKaCode(String kaCode) {
		this.kaCode = kaCode;
	}

}
