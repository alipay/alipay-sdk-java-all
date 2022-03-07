package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 若用户使用花呗分期支付，且商家开通返回此通知参数，则会返回花呗分期信息。
 *
 * @author auto create
 * @since 1.0, 2022-03-03 16:35:38
 */
public class HbFqPayInfo extends AlipayObject {

	private static final long serialVersionUID = 4132148974864843932L;

	/**
	 * 用户使用花呗分期支付的分期数
	 */
	@ApiField("user_install_num")
	private String userInstallNum;

	public String getUserInstallNum() {
		return this.userInstallNum;
	}
	public void setUserInstallNum(String userInstallNum) {
		this.userInstallNum = userInstallNum;
	}

}
