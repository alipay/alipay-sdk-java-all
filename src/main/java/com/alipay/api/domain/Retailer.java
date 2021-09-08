package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零售商信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class Retailer extends AlipayObject {

	private static final long serialVersionUID = 3867436519154979876L;

	/**
	 * 零售商名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 零售商pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
