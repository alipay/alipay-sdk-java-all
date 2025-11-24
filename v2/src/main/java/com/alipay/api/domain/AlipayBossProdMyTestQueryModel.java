package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 明焕open测试
 *
 * @author auto create
 * @since 1.0, 2022-07-08 20:28:19
 */
public class AlipayBossProdMyTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7212879783895826142L;

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
