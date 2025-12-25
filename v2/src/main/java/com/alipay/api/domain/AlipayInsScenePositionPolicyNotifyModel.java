package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁保阵地投保成功消息
 *
 * @author auto create
 * @since 1.0, 2025-11-17 11:10:28
 */
public class AlipayInsScenePositionPolicyNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7118494714364299741L;

	/**
	 * 设备SN码
	 */
	@ApiField("device_serial_number")
	private String deviceSerialNumber;

	/**
	 * 保司编码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 外部用户ID
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 合作商编码
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 机构产品码
	 */
	@ApiField("prod_no")
	private String prodNo;

	public String getDeviceSerialNumber() {
		return this.deviceSerialNumber;
	}
	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

}
