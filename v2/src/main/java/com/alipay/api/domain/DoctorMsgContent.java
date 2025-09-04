package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生验资消息内容
 *
 * @author auto create
 * @since 1.0, 2025-03-19 13:45:07
 */
public class DoctorMsgContent extends AlipayObject {

	private static final long serialVersionUID = 8432418465391736264L;

	/**
	 * 外部医生ID
	 */
	@ApiField("ext_doctor_id")
	private String extDoctorId;

	/**
	 * 外部平台编码，由支付宝分配给isv
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 资质核验状态
通过:pass
不通过:rejected
待人工确认:uncertain
	 */
	@ApiField("qualification_status")
	private String qualificationStatus;

	/**
	 * 资质核验不通过原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 时间戳，单位：毫秒
	 */
	@ApiField("time_stamp")
	private String timeStamp;

	public String getExtDoctorId() {
		return this.extDoctorId;
	}
	public void setExtDoctorId(String extDoctorId) {
		this.extDoctorId = extDoctorId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getQualificationStatus() {
		return this.qualificationStatus;
	}
	public void setQualificationStatus(String qualificationStatus) {
		this.qualificationStatus = qualificationStatus;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
