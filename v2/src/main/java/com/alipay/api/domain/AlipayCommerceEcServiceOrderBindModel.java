package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业码服务选择绑定
 *
 * @author auto create
 * @since 1.0, 2023-03-28 16:54:22
 */
public class AlipayCommerceEcServiceOrderBindModel extends AlipayObject {

	private static final long serialVersionUID = 1764245878754381346L;

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
	 * 订购角色类型
	 */
	@ApiField("buyer_role_type")
	private String buyerRoleType;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 选择服务关联的服务ID
	 */
	@ApiField("related_service_id")
	private String relatedServiceId;

	/**
	 * 选择的服务能力列表
	 */
	@ApiListField("service_ability_info_list")
	@ApiField("service_ability")
	private List<ServiceAbility> serviceAbilityInfoList;

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

	public String getBuyerRoleType() {
		return this.buyerRoleType;
	}
	public void setBuyerRoleType(String buyerRoleType) {
		this.buyerRoleType = buyerRoleType;
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

	public List<ServiceAbility> getServiceAbilityInfoList() {
		return this.serviceAbilityInfoList;
	}
	public void setServiceAbilityInfoList(List<ServiceAbility> serviceAbilityInfoList) {
		this.serviceAbilityInfoList = serviceAbilityInfoList;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
