package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AQ用户医生签约状态同步接口
 *
 * @author auto create
 * @since 1.0, 2025-10-22 11:17:40
 */
public class AlipayCommerceMedicalUserDoctorSignModel extends AlipayObject {

	private static final long serialVersionUID = 2588751264686842998L;

	/**
	 * 医生Id（机构签约为对应负责人）
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 签约对象类型下的唯一ID
	 */
	@ApiField("sign_biz_id")
	private String signBizId;

	/**
	 * 签约对象类型
	 */
	@ApiField("sign_biz_type")
	private String signBizType;

	/**
	 * 签约来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 签约内容
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSignBizId() {
		return this.signBizId;
	}
	public void setSignBizId(String signBizId) {
		this.signBizId = signBizId;
	}

	public String getSignBizType() {
		return this.signBizType;
	}
	public void setSignBizType(String signBizType) {
		this.signBizType = signBizType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
