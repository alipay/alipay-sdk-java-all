package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码服务的取消选择
 *
 * @author auto create
 * @since 1.0, 2023-03-28 16:55:15
 */
public class AlipayCommerceEcServiceOrderUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 1853113745989794845L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 订购主体Id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 服务选择关联的服务ID
	 */
	@ApiField("related_service_id")
	private String relatedServiceId;

	/**
	 * 服务ID
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getRelatedServiceId() {
		return this.relatedServiceId;
	}
	public void setRelatedServiceId(String relatedServiceId) {
		this.relatedServiceId = relatedServiceId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
