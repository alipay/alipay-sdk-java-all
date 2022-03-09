package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 明焕open测试
 *
 * @author auto create
 * @since 1.0, 2020-02-07 17:44:13
 */
public class AlipayBossProdMyTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8547437118954961826L;

	/**
	 * 区.
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
