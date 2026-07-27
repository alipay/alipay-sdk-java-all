package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心登记卡企业签约保单
 *
 * @author auto create
 * @since 1.0, 2026-07-24 14:14:18
 */
public class AlipayCommerceOfflinelaborInsuranceSignModel extends AlipayObject {

	private static final long serialVersionUID = 4881898217269966882L;

	/**
	 * 保险模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 外部业务登记号，用于业务幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企业的社会信用统一代码，18位
	 */
	@ApiField("social_unified_cert_no")
	private String socialUnifiedCertNo;

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSocialUnifiedCertNo() {
		return this.socialUnifiedCertNo;
	}
	public void setSocialUnifiedCertNo(String socialUnifiedCertNo) {
		this.socialUnifiedCertNo = socialUnifiedCertNo;
	}

}
