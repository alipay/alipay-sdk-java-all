package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展参数
 *
 * @author auto create
 * @since 1.0, 2019-07-23 11:48:15
 */
public class TradePrecreateConfirmExtendParam extends AlipayObject {

	private static final long serialVersionUID = 8357947836761249713L;

	/**
	 * 发码站点
	 */
	@ApiField("precreate_code_from")
	private String precreateCodeFrom;

	public String getPrecreateCodeFrom() {
		return this.precreateCodeFrom;
	}
	public void setPrecreateCodeFrom(String precreateCodeFrom) {
		this.precreateCodeFrom = precreateCodeFrom;
	}

}
