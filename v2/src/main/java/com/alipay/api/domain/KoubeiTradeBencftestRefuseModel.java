package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * koubei.trade.
 *
 * @author auto create
 * @since 1.0, 2023-04-19 19:57:00
 */
public class KoubeiTradeBencftestRefuseModel extends AlipayObject {

	private static final long serialVersionUID = 4531634514854331152L;

	/**
	 * 1
	 */
	@ApiField("wp")
	private String wp;

	public String getWp() {
		return this.wp;
	}
	public void setWp(String wp) {
		this.wp = wp;
	}

}
