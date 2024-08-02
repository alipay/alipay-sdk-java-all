package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用信息模型
 *
 * @author auto create
 * @since 1.0, 2024-01-08 10:37:50
 */
public class CreditInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5581689774111553926L;

	/**
	 * 商户外部协议号，不同的支付宝用户需要传递不同的外部单号,使用芝麻先享能力必传
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 传smid在芝麻侧生成的信用服务id,使用芝麻先享能力必传
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}
