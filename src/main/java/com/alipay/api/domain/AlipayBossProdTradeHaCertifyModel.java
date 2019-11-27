package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营认证
 *
 * @author auto create
 * @since 1.0, 2019-01-30 09:47:03
 */
public class AlipayBossProdTradeHaCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 5497792798669389536L;

	/**
	 * 座机号码，0511-26888888
	 */
	@ApiField("phone")
	private Date phone;

	public Date getPhone() {
		return this.phone;
	}
	public void setPhone(Date phone) {
		this.phone = phone;
	}

}
