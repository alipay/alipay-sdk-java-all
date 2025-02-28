package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商保码-垫付申请状态同步
 *
 * @author auto create
 * @since 1.0, 2025-01-06 15:12:54
 */
public class AlipayCommerceMedicalInsuranceAdvancepaySyncModel extends AlipayObject {

	private static final long serialVersionUID = 7341263239615764826L;

	/**
	 * 垫付申请结果描述。垫付申请失败时，需给出失败原因
	 */
	@ApiField("advance_apply_desc")
	private String advanceApplyDesc;

	/**
	 * 唯一标识一次垫付申请，返回最近一次的垫付申请。
	 */
	@ApiField("advance_apply_no")
	private String advanceApplyNo;

	/**
	 * 用户申请垫付后，垫资方返回的垫付申请状态
	 */
	@ApiField("advance_apply_status")
	private String advanceApplyStatus;

	/**
	 * 支付宝垫付申请号
	 */
	@ApiField("ant_apply_no")
	private String antApplyNo;

	/**
	 * 垫资对应的蚂蚁保保单号，蚂蚁保入口发起垫资申请，传入蚂蚁保保单号，垫资方根据垫资申请关联上对应的蚂蚁保保单号
	 */
	@ApiField("ant_policy_no")
	private String antPolicyNo;

	/**
	 * 本次垫付可用的垫付金额，单位：元
	 */
	@ApiField("available_advance_amount")
	private String availableAdvanceAmount;

	/**
	 * 业务流水号
	 */
	@ApiField("business_no")
	private String businessNo;

	/**
	 * 业务进度生效时间（非报文同步时间）
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 证件号，例如：身份证证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户在中国大陆使用的标识个人身份的证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 标识实际赔付的保险公司，由支付宝定义枚举值，垫资的实际理赔保司为众安，那么枚举值为ZHONGAN
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 最近一次授信流水号，进度同步时可空，授信金额回传时传入
	 */
	@ApiField("grant_serial_no")
	private String grantSerialNo;

	/**
	 * 补充材料信息
	 */
	@ApiListField("lack_materials")
	@ApiField("lack_material")
	private List<LackMaterial> lackMaterials;

	/**
	 * 用户真实姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 垫付申请的外部医院id，由保司和垫资方线下同步给支付宝侧绑定
	 */
	@ApiField("out_hospital_id")
	private String outHospitalId;

	/**
	 * 垫资对应保司的用户保单号，如垫资的实际理赔保司为众安，那么该保单号为众安对应的保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 标识垫资方的身份来源，支付宝定义的枚举值，对应到具体的垫资调用方
	 */
	@ApiField("source")
	private String source;

	/**
	 * 标识本笔垫资的状态，0-欠费，1-正常，2-理赔中
	 */
	@ApiField("status")
	private String status;

	/**
	 * 是否可追垫标识（TAG_NO-否，TAG_YES-是）
	 */
	@ApiField("supplement_tag")
	private String supplementTag;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAdvanceApplyDesc() {
		return this.advanceApplyDesc;
	}
	public void setAdvanceApplyDesc(String advanceApplyDesc) {
		this.advanceApplyDesc = advanceApplyDesc;
	}

	public String getAdvanceApplyNo() {
		return this.advanceApplyNo;
	}
	public void setAdvanceApplyNo(String advanceApplyNo) {
		this.advanceApplyNo = advanceApplyNo;
	}

	public String getAdvanceApplyStatus() {
		return this.advanceApplyStatus;
	}
	public void setAdvanceApplyStatus(String advanceApplyStatus) {
		this.advanceApplyStatus = advanceApplyStatus;
	}

	public String getAntApplyNo() {
		return this.antApplyNo;
	}
	public void setAntApplyNo(String antApplyNo) {
		this.antApplyNo = antApplyNo;
	}

	public String getAntPolicyNo() {
		return this.antPolicyNo;
	}
	public void setAntPolicyNo(String antPolicyNo) {
		this.antPolicyNo = antPolicyNo;
	}

	public String getAvailableAdvanceAmount() {
		return this.availableAdvanceAmount;
	}
	public void setAvailableAdvanceAmount(String availableAdvanceAmount) {
		this.availableAdvanceAmount = availableAdvanceAmount;
	}

	public String getBusinessNo() {
		return this.businessNo;
	}
	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	public String getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getGrantSerialNo() {
		return this.grantSerialNo;
	}
	public void setGrantSerialNo(String grantSerialNo) {
		this.grantSerialNo = grantSerialNo;
	}

	public List<LackMaterial> getLackMaterials() {
		return this.lackMaterials;
	}
	public void setLackMaterials(List<LackMaterial> lackMaterials) {
		this.lackMaterials = lackMaterials;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutHospitalId() {
		return this.outHospitalId;
	}
	public void setOutHospitalId(String outHospitalId) {
		this.outHospitalId = outHospitalId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
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

	public String getSupplementTag() {
		return this.supplementTag;
	}
	public void setSupplementTag(String supplementTag) {
		this.supplementTag = supplementTag;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
