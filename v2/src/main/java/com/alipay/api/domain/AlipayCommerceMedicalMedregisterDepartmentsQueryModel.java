package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询挂号医院的全科室列表
 *
 * @author auto create
 * @since 1.0, 2024-12-24 15:02:24
 */
public class AlipayCommerceMedicalMedregisterDepartmentsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4736772126676621533L;

	/**
	 * 浙江省人民医院（朝晖院区）
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 浙江省人民医院
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 阿里用户类型
	 */
	@ApiField("out_user_type")
	private String outUserType;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOutUserType() {
		return this.outUserType;
	}
	public void setOutUserType(String outUserType) {
		this.outUserType = outUserType;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
