package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 若用户使用花呗分期支付，且商家开通返回此通知参数，则会返回花呗分期信息。
 *
 * @author auto create
 * @since 1.0, 2024-09-26 18:30:35
 */
public class IndustryHbFqPayInfo extends AlipayObject {

	private static final long serialVersionUID = 5681194327517449964L;

	/**
	 * 用户使用花呗分期支付的金额数
	 */
	@ApiField("fq_amount")
	private String fqAmount;

	/**
	 * 用户使用花呗分期支付的分期数
	 */
	@ApiField("user_install_num")
	private String userInstallNum;

	public String getFqAmount() {
		return this.fqAmount;
	}
	public void setFqAmount(String fqAmount) {
		this.fqAmount = fqAmount;
	}

	public String getUserInstallNum() {
		return this.userInstallNum;
	}
	public void setUserInstallNum(String userInstallNum) {
		this.userInstallNum = userInstallNum;
	}

}
