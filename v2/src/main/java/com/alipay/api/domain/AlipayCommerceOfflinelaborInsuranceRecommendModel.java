package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心登记卡企业投保推荐
 *
 * @author auto create
 * @since 1.0, 2026-07-24 14:17:50
 */
public class AlipayCommerceOfflinelaborInsuranceRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 4543379439381122224L;

	/**
	 * 企业的社会统一信用代码，18位
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 保险模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 企业联系电话
	 */
	@ApiField("phone")
	private String phone;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
