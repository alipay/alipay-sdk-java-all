package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 融合额度同步
 *
 * @author auto create
 * @since 1.0, 2024-11-02 00:35:50
 */
public class ZhimaCreditPayafteruseFusionquotaSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6399423448733297978L;

	/**
	 * 商家外部类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 芝麻开通协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 融合额度
	 */
	@ApiField("total_quota")
	private CreditMoney totalQuota;

	/**
	 * 芝麻信用服务ID
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCreditAgreementId() {
		return this.creditAgreementId;
	}
	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CreditMoney getTotalQuota() {
		return this.totalQuota;
	}
	public void setTotalQuota(CreditMoney totalQuota) {
		this.totalQuota = totalQuota;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}
