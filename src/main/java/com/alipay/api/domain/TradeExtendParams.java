package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国标移动支付间连下单扩展字段
 *
 * @author auto create
 * @since 1.0, 2022-06-29 15:54:09
 */
public class TradeExtendParams extends AlipayObject {

	private static final long serialVersionUID = 7676595484367135274L;

	/**
	 * 渠道标识
	 */
	@ApiField("chinfo")
	private String chinfo;

	/**
	 * 医保补充计算金额(在insurance_subsidy_mode不为空时该字段也不能为空）
	 */
	@ApiField("insurance_subsidy_amount")
	private String insuranceSubsidyAmount;

	/**
	 * 医保补充计算方式
	 */
	@ApiField("insurance_subsidy_mode")
	private String insuranceSubsidyMode;

	/**
	 * 医保补充计算说明
	 */
	@ApiField("insurance_subsidy_type")
	private String insuranceSubsidyType;

	/**
	 * 用户卡信息中机构内卡号,用户授权成功时返回
	 */
	@ApiField("medical_card_id")
	private String medicalCardId;

	/**
	 * 用户卡信息中机构编码,用户授权成功时返回
	 */
	@ApiField("medical_ins_card_id")
	private String medicalInsCardId;

	/**
	 * 医保数据结构体,各地透传参数详见"医保透传参数说明"
	 */
	@ApiField("request_content")
	private String requestContent;

	/**
	 * 使用场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 系统商编号，该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	public String getChinfo() {
		return this.chinfo;
	}
	public void setChinfo(String chinfo) {
		this.chinfo = chinfo;
	}

	public String getInsuranceSubsidyAmount() {
		return this.insuranceSubsidyAmount;
	}
	public void setInsuranceSubsidyAmount(String insuranceSubsidyAmount) {
		this.insuranceSubsidyAmount = insuranceSubsidyAmount;
	}

	public String getInsuranceSubsidyMode() {
		return this.insuranceSubsidyMode;
	}
	public void setInsuranceSubsidyMode(String insuranceSubsidyMode) {
		this.insuranceSubsidyMode = insuranceSubsidyMode;
	}

	public String getInsuranceSubsidyType() {
		return this.insuranceSubsidyType;
	}
	public void setInsuranceSubsidyType(String insuranceSubsidyType) {
		this.insuranceSubsidyType = insuranceSubsidyType;
	}

	public String getMedicalCardId() {
		return this.medicalCardId;
	}
	public void setMedicalCardId(String medicalCardId) {
		this.medicalCardId = medicalCardId;
	}

	public String getMedicalInsCardId() {
		return this.medicalInsCardId;
	}
	public void setMedicalInsCardId(String medicalInsCardId) {
		this.medicalInsCardId = medicalInsCardId;
	}

	public String getRequestContent() {
		return this.requestContent;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
