package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * mantestsds
 *
 * @author auto create
 * @since 1.0, 2022-08-16 17:46:46
 */
public class KoubeiShopMantestsdsSendModel extends AlipayObject {

	private static final long serialVersionUID = 3858439745946394559L;

	/**
	 * 1
	 */
	@ApiField("opopo")
	private String opopo;

	public String getOpopo() {
		return this.opopo;
	}
	public void setOpopo(String opopo) {
		this.opopo = opopo;
	}

}
