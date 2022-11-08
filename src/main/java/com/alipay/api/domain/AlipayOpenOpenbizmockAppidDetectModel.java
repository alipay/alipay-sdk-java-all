package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检测appid
 *
 * @author auto create
 * @since 1.0, 2022-10-25 19:34:47
 */
public class AlipayOpenOpenbizmockAppidDetectModel extends AlipayObject {

	private static final long serialVersionUID = 1851618673146339883L;

	/**
	 * APPID值
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
