package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 若用户使用花呗分期支付，且商家开通返回此通知参数，则会返回花呗分期信息。
 *
 * @author auto create
 * @since 1.0, 2025-08-14 16:29:25
 */
public class HbFqPayInfo extends AlipayObject {

	private static final long serialVersionUID = 4397819266786923889L;

	/**
	 * 用户使用花呗分期支付的金额数
	 */
	@ApiField("fq_amount")
	private String fqAmount;

	/**
	 * 提供分期服务的机构ID
	 */
	@ApiField("fq_inst_id")
	private String fqInstId;

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

	public String getFqInstId() {
		return this.fqInstId;
	}
	public void setFqInstId(String fqInstId) {
		this.fqInstId = fqInstId;
	}

	public String getUserInstallNum() {
		return this.userInstallNum;
	}
	public void setUserInstallNum(String userInstallNum) {
		this.userInstallNum = userInstallNum;
	}

}
