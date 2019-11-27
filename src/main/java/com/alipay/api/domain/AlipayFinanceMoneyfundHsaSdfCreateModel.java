package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 是的电风扇
 *
 * @author auto create
 * @since 1.0, 2019-06-28 16:54:39
 */
public class AlipayFinanceMoneyfundHsaSdfCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1323678757129944974L;

	/**
	 * 区县编码，国标码
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
