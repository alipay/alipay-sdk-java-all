package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-23 13:42:55
 */
public class BianqueConfigItem extends AlipayObject {

	private static final long serialVersionUID = 4486437519547122246L;

	/**
	 * 阿福端免订阅消息打开
	 */
	@ApiField("afu_no_subscribe_msg_enabled")
	private HospitalConfigItem afuNoSubscribeMsgEnabled;

	/**
	 * 检查预约是否接入
	 */
	@ApiField("check_appointment_enabled")
	private HospitalConfigItem checkAppointmentEnabled;

	/**
	 * 云陪诊服务进阿福
	 */
	@ApiField("cloud_consult_afu_enabled")
	private HospitalConfigItem cloudConsultAfuEnabled;

	/**
	 * 机构来源
	 */
	@ApiField("institutional_source")
	private String institutionalSource;

	/**
	 * 在线取号是否接入
	 */
	@ApiField("online_register_enabled")
	private HospitalConfigItem onlineRegisterEnabled;

	/**
	 * null
	 */
	@ApiListField("online_sign_in_enabled")
	@ApiField("hospital_config_item")
	private List<HospitalConfigItem> onlineSignInEnabled;

	/**
	 * 缴费是否接入
	 */
	@ApiField("payment_access_enabled")
	private HospitalConfigItem paymentAccessEnabled;

	/**
	 * 缴费接入模式
	 */
	@ApiField("payment_access_mode")
	private String paymentAccessMode;

	/**
	 * null
	 */
	@ApiListField("payment_jump_config")
	@ApiField("bianque_jump_chain_config")
	private List<BianqueJumpChainConfig> paymentJumpConfig;

	/**
	 * 缴费跳链是否支持医保
	 */
	@ApiField("payment_jump_support_medical")
	private HospitalConfigItem paymentJumpSupportMedical;

	/**
	 * 缴费是否支持医保
	 */
	@ApiField("payment_medical_enabled")
	private HospitalConfigItem paymentMedicalEnabled;

	/**
	 * 挂号是否接入
	 */
	@ApiField("register_access_enabled")
	private HospitalConfigItem registerAccessEnabled;

	/**
	 * 挂号接入模式
	 */
	@ApiField("register_access_mode")
	private String registerAccessMode;

	/**
	 * null
	 */
	@ApiListField("report_access_enabled")
	@ApiField("hospital_config_item")
	private List<HospitalConfigItem> reportAccessEnabled;

	/**
	 * null
	 */
	@ApiListField("report_access_mode")
	@ApiField("hospital_config_item")
	private List<HospitalConfigItem> reportAccessMode;

	/**
	 * 是	统一社会信用编码（18位）
	 */
	@ApiField("unified_social_credit_code")
	private String unifiedSocialCreditCode;

	public HospitalConfigItem getAfuNoSubscribeMsgEnabled() {
		return this.afuNoSubscribeMsgEnabled;
	}
	public void setAfuNoSubscribeMsgEnabled(HospitalConfigItem afuNoSubscribeMsgEnabled) {
		this.afuNoSubscribeMsgEnabled = afuNoSubscribeMsgEnabled;
	}

	public HospitalConfigItem getCheckAppointmentEnabled() {
		return this.checkAppointmentEnabled;
	}
	public void setCheckAppointmentEnabled(HospitalConfigItem checkAppointmentEnabled) {
		this.checkAppointmentEnabled = checkAppointmentEnabled;
	}

	public HospitalConfigItem getCloudConsultAfuEnabled() {
		return this.cloudConsultAfuEnabled;
	}
	public void setCloudConsultAfuEnabled(HospitalConfigItem cloudConsultAfuEnabled) {
		this.cloudConsultAfuEnabled = cloudConsultAfuEnabled;
	}

	public String getInstitutionalSource() {
		return this.institutionalSource;
	}
	public void setInstitutionalSource(String institutionalSource) {
		this.institutionalSource = institutionalSource;
	}

	public HospitalConfigItem getOnlineRegisterEnabled() {
		return this.onlineRegisterEnabled;
	}
	public void setOnlineRegisterEnabled(HospitalConfigItem onlineRegisterEnabled) {
		this.onlineRegisterEnabled = onlineRegisterEnabled;
	}

	public List<HospitalConfigItem> getOnlineSignInEnabled() {
		return this.onlineSignInEnabled;
	}
	public void setOnlineSignInEnabled(List<HospitalConfigItem> onlineSignInEnabled) {
		this.onlineSignInEnabled = onlineSignInEnabled;
	}

	public HospitalConfigItem getPaymentAccessEnabled() {
		return this.paymentAccessEnabled;
	}
	public void setPaymentAccessEnabled(HospitalConfigItem paymentAccessEnabled) {
		this.paymentAccessEnabled = paymentAccessEnabled;
	}

	public String getPaymentAccessMode() {
		return this.paymentAccessMode;
	}
	public void setPaymentAccessMode(String paymentAccessMode) {
		this.paymentAccessMode = paymentAccessMode;
	}

	public List<BianqueJumpChainConfig> getPaymentJumpConfig() {
		return this.paymentJumpConfig;
	}
	public void setPaymentJumpConfig(List<BianqueJumpChainConfig> paymentJumpConfig) {
		this.paymentJumpConfig = paymentJumpConfig;
	}

	public HospitalConfigItem getPaymentJumpSupportMedical() {
		return this.paymentJumpSupportMedical;
	}
	public void setPaymentJumpSupportMedical(HospitalConfigItem paymentJumpSupportMedical) {
		this.paymentJumpSupportMedical = paymentJumpSupportMedical;
	}

	public HospitalConfigItem getPaymentMedicalEnabled() {
		return this.paymentMedicalEnabled;
	}
	public void setPaymentMedicalEnabled(HospitalConfigItem paymentMedicalEnabled) {
		this.paymentMedicalEnabled = paymentMedicalEnabled;
	}

	public HospitalConfigItem getRegisterAccessEnabled() {
		return this.registerAccessEnabled;
	}
	public void setRegisterAccessEnabled(HospitalConfigItem registerAccessEnabled) {
		this.registerAccessEnabled = registerAccessEnabled;
	}

	public String getRegisterAccessMode() {
		return this.registerAccessMode;
	}
	public void setRegisterAccessMode(String registerAccessMode) {
		this.registerAccessMode = registerAccessMode;
	}

	public List<HospitalConfigItem> getReportAccessEnabled() {
		return this.reportAccessEnabled;
	}
	public void setReportAccessEnabled(List<HospitalConfigItem> reportAccessEnabled) {
		this.reportAccessEnabled = reportAccessEnabled;
	}

	public List<HospitalConfigItem> getReportAccessMode() {
		return this.reportAccessMode;
	}
	public void setReportAccessMode(List<HospitalConfigItem> reportAccessMode) {
		this.reportAccessMode = reportAccessMode;
	}

	public String getUnifiedSocialCreditCode() {
		return this.unifiedSocialCreditCode;
	}
	public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
		this.unifiedSocialCreditCode = unifiedSocialCreditCode;
	}

}
