package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车场业务归属模型
 *
 * @author auto create
 * @since 1.0, 2024-08-12 14:48:17
 */
public class BusinessItem extends AlipayObject {

	private static final long serialVersionUID = 8151429732185952812L;

	/**
	 * 业务归属appid
	 */
	@ApiField("business_appid")
	private String businessAppid;

	/**
	 * 业务收款pid，business_type为AGREEMENT_PAY时，此参数必传
	 */
	@ApiField("business_payee_id")
	private String businessPayeeId;

	/**
	 * 业务归属pid
	 */
	@ApiField("business_pid")
	private String businessPid;

	/**
	 * 业务类型ONLINE_PAY(在线缴费) 、AGREEMENT_PAY(无感停车)
DEVICE_ONLINE_PAY(车机在线缴费)
	 */
	@ApiField("business_type")
	private String businessType;

	public String getBusinessAppid() {
		return this.businessAppid;
	}
	public void setBusinessAppid(String businessAppid) {
		this.businessAppid = businessAppid;
	}

	public String getBusinessPayeeId() {
		return this.businessPayeeId;
	}
	public void setBusinessPayeeId(String businessPayeeId) {
		this.businessPayeeId = businessPayeeId;
	}

	public String getBusinessPid() {
		return this.businessPid;
	}
	public void setBusinessPid(String businessPid) {
		this.businessPid = businessPid;
	}

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

}
