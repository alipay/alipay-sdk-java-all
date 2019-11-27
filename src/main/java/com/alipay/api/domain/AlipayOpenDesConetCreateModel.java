package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openexpord系统验证
 *
 * @author auto create
 * @since 1.0, 2019-03-05 17:08:10
 */
public class AlipayOpenDesConetCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7878413924299563551L;

	/**
	 * 1
	 */
	@ApiField("des")
	private String des;

	public String getDes() {
		return this.des;
	}
	public void setDes(String des) {
		this.des = des;
	}

}
