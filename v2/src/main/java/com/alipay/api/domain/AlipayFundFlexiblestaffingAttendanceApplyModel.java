package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请考勤链接（投保）
 *
 * @author auto create
 * @since 1.0, 2023-09-18 16:49:12
 */
public class AlipayFundFlexiblestaffingAttendanceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6613779424457547664L;

	/**
	 * 授权跳转类型
	 */
	@ApiField("apply_link_type")
	private String applyLinkType;

	/**
	 * 场景码固定值
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
	private EmployeeCardInfoDTO employeeCardInfo;

	/**
	 * 超时时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 当投保模式为直接投保，投保主体信息必选
	 */
	@ApiField("insure_info")
	private InsureInfoDTO insureInfo;

	/**
	 * 投保模式1：审批投 2：直接投
	 */
	@ApiField("insure_type")
	private String insureType;

	/**
	 * 合作商信息,本次为和蚂蚁签约的平台信息，固定值
	 */
	@ApiField("partner_organization")
	private InsurePartnerOrganization partnerOrganization;

	/**
	 * 产品码固定值
	 */
	@ApiField("product_code")
	private String productCode;

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

	public EmployeeCardInfoDTO getEmployeeCardInfo() {
		return this.employeeCardInfo;
	}
	public void setEmployeeCardInfo(EmployeeCardInfoDTO employeeCardInfo) {
		this.employeeCardInfo = employeeCardInfo;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public InsureInfoDTO getInsureInfo() {
		return this.insureInfo;
	}
	public void setInsureInfo(InsureInfoDTO insureInfo) {
		this.insureInfo = insureInfo;
	}

	public String getInsureType() {
		return this.insureType;
	}
	public void setInsureType(String insureType) {
		this.insureType = insureType;
	}

	public InsurePartnerOrganization getPartnerOrganization() {
		return this.partnerOrganization;
	}
	public void setPartnerOrganization(InsurePartnerOrganization partnerOrganization) {
		this.partnerOrganization = partnerOrganization;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
