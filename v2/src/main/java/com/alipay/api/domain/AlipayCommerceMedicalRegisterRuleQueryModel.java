package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 挂号规则校验
 *
 * @author auto create
 * @since 1.0, 2026-08-24 11:52:50
 */
public class AlipayCommerceMedicalRegisterRuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6528415717263147678L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 挂号频道:CHANNEL_SEARCH_REGISTER
安诊儿:AN_ZHEN_ER_REGISTER
健康管家:HEALTH_BUTLER_REGISTER
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 科室id
	 */
	@ApiField("isv_hos_dept_no")
	private String isvHosDeptNo;

	/**
	 * 服务商医院唯一编码
	 */
	@ApiField("isv_hos_no")
	private String isvHosNo;

	/**
	 * 服务商用户id
	 */
	@ApiField("isv_user_id")
	private String isvUserId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 就诊人信息
	 */
	@ApiField("patient_prop")
	private String patientProp;

	/**
	 * 平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 拓展参数
	 */
	@ApiField("rule_ext_info")
	private String ruleExtInfo;

	/**
	 * 场景编码，枚举值 管家APP: HEALTH_BUTLER_APP 管家小程序：HEALTH_BUTLER 安诊儿APP: AN_ZHEN_ER_APP 安诊儿小程序 AN_ZHEN_ER 挂号频道小程序 CHANNEL_SEARCH_REGISTER SINGLE_HOS_NFYKDZJ_APP_SCENE 珠江医院（扁鹊单院版APP） SINGLE_HOS_NFYKDZJ_SCENE 珠江医院（扁鹊单院版小程序）
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getIsvHosDeptNo() {
		return this.isvHosDeptNo;
	}
	public void setIsvHosDeptNo(String isvHosDeptNo) {
		this.isvHosDeptNo = isvHosDeptNo;
	}

	public String getIsvHosNo() {
		return this.isvHosNo;
	}
	public void setIsvHosNo(String isvHosNo) {
		this.isvHosNo = isvHosNo;
	}

	public String getIsvUserId() {
		return this.isvUserId;
	}
	public void setIsvUserId(String isvUserId) {
		this.isvUserId = isvUserId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPatientProp() {
		return this.patientProp;
	}
	public void setPatientProp(String patientProp) {
		this.patientProp = patientProp;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getRuleExtInfo() {
		return this.ruleExtInfo;
	}
	public void setRuleExtInfo(String ruleExtInfo) {
		this.ruleExtInfo = ruleExtInfo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
