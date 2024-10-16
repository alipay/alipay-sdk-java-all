package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用信息模型
 *
 * @author auto create
 * @since 1.0, 2024-09-25 10:28:20
 */
public class CreditInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7333383347766496885L;

	/**
	 * 芝麻先享受理台用户开通成功后，商家自定义页面跳转地址
	 */
	@ApiField("acceptance_jump_url")
	private String acceptanceJumpUrl;

	/**
	 * 使用芝麻信用先享服务，是否不需要核身，默认false：表示需要当前订单需要核身
	 */
	@ApiField("no_need_verify_identity")
	private Boolean noNeedVerifyIdentity;

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

	public String getAcceptanceJumpUrl() {
		return this.acceptanceJumpUrl;
	}
	public void setAcceptanceJumpUrl(String acceptanceJumpUrl) {
		this.acceptanceJumpUrl = acceptanceJumpUrl;
	}

	public Boolean getNoNeedVerifyIdentity() {
		return this.noNeedVerifyIdentity;
	}
	public void setNoNeedVerifyIdentity(Boolean noNeedVerifyIdentity) {
		this.noNeedVerifyIdentity = noNeedVerifyIdentity;
	}

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
