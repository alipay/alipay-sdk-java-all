package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * yufayanzheng
 *
 * @author auto create
 * @since 1.0, 2018-08-16 12:02:08
 */
public class AlipayOpenAppLingbalingliuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4592955846119363339L;

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
