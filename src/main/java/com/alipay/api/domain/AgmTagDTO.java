package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签
 *
 * @author auto create
 * @since 1.0, 2022-09-19 19:07:59
 */
public class AgmTagDTO extends AlipayObject {

	private static final long serialVersionUID = 6868417731533256147L;

	/**
	 * 标签名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 标签编码
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
