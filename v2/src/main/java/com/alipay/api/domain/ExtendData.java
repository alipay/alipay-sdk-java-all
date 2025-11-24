package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保结算
 *
 * @author auto create
 * @since 1.0, 2025-04-18 21:11:15
 */
public class ExtendData extends AlipayObject {

	private static final long serialVersionUID = 4461124336166998781L;

	/**
	 * 医保结算
	 */
	@ApiField("mi_settle_ext")
	private String miSettleExt;

	public String getMiSettleExt() {
		return this.miSettleExt;
	}
	public void setMiSettleExt(String miSettleExt) {
		this.miSettleExt = miSettleExt;
	}

}
