package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据条形码获取抬头
 *
 * @author auto create
 * @since 1.0, 2020-05-20 15:51:46
 */
public class AlipayEbppInvoiceTitleDynamicGetModel extends AlipayObject {

	private static final long serialVersionUID = 7842862715339755713L;

	/**
	 * 抬头动态码
	 */
	@ApiField("bar_code")
	private String barCode;

	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

}
