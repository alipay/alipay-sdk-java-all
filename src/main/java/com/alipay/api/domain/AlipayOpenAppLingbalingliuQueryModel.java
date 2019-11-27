package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * yufayanzheng
 *
 * @author auto create
 * @since 1.0, 2018-08-22 15:07:59
 */
public class AlipayOpenAppLingbalingliuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2536342512157746954L;

	/**
	 * 12
	 */
	@ApiField("canshu")
	private String canshu;

	public String getCanshu() {
		return this.canshu;
	}
	public void setCanshu(String canshu) {
		this.canshu = canshu;
	}

}
