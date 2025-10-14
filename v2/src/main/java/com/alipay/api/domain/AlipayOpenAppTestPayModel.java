package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ytt
 *
 * @author auto create
 * @since 1.0, 2024-11-14 20:07:16
 */
public class AlipayOpenAppTestPayModel extends AlipayObject {

	private static final long serialVersionUID = 5884454514934822886L;

	/**
	 * desc
	 */
	@ApiField("body_date")
	private Date bodyDate;

	public Date getBodyDate() {
		return this.bodyDate;
	}
	public void setBodyDate(Date bodyDate) {
		this.bodyDate = bodyDate;
	}

}
