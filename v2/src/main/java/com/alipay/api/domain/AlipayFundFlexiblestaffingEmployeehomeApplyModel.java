package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开卡申请
 *
 * @author auto create
 * @since 1.0, 2023-06-12 11:24:57
 */
public class AlipayFundFlexiblestaffingEmployeehomeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1678529424628498826L;

	/**
	 * 授权跳转类型
	 */
	@ApiField("apply_link_type")
	private String applyLinkType;

	/**
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 跳转渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 零工卡信息
	 */
	@ApiField("employee_card_info")
	private EmployeeCardInfo employeeCardInfo;

	/**
	 * 超时时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 主体信息
	 */
	@ApiField("principal_info")
	private ParticipantInfoDTO principalInfo;

	/**
	 * 业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 零工卡租赁信息
	 */
	@ApiField("rent_agreement_info")
	private RentServiceInfo rentAgreementInfo;

	public String getApplyLinkType() {
		return this.applyLinkType;
	}
	public void setApplyLinkType(String applyLinkType) {
		this.applyLinkType = applyLinkType;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public EmployeeCardInfo getEmployeeCardInfo() {
		return this.employeeCardInfo;
	}
	public void setEmployeeCardInfo(EmployeeCardInfo employeeCardInfo) {
		this.employeeCardInfo = employeeCardInfo;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public ParticipantInfoDTO getPrincipalInfo() {
		return this.principalInfo;
	}
	public void setPrincipalInfo(ParticipantInfoDTO principalInfo) {
		this.principalInfo = principalInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public RentServiceInfo getRentAgreementInfo() {
		return this.rentAgreementInfo;
	}
	public void setRentAgreementInfo(RentServiceInfo rentAgreementInfo) {
		this.rentAgreementInfo = rentAgreementInfo;
	}

}
