package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pid加白接口
 *
 * @author auto create
 * @since 1.0, 2022-10-25 19:38:18
 */
public class AlipayOpenOpenbizmockPidwhiteModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2819624684734932324L;

	/**
	 * APPID
	 */
	@ApiField("app_number")
	private String appNumber;

	public String getAppNumber() {
		return this.appNumber;
	}
	public void setAppNumber(String appNumber) {
		this.appNumber = appNumber;
	}

}
