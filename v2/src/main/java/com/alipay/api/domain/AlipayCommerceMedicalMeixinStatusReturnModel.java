package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 状态回传
 *
 * @author auto create
 * @since 1.0, 2025-09-10 11:28:07
 */
public class AlipayCommerceMedicalMeixinStatusReturnModel extends AlipayObject {

	private static final long serialVersionUID = 6273238991542333241L;

	/**
	 * 案件号
	 */
	@ApiField("case_no")
	private String caseNo;

	/**
	 * 保司名称
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 回传事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 药品列表
	 */
	@ApiListField("medicine_list")
	@ApiField("medicine_info")
	private List<MedicineInfo> medicineList;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 已生成待核销：GENERATED
部分核销：PART_VERIFIED
已核销：VERIFIED
	 */
	@ApiField("status")
	private String status;

	/**
	 * user_id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCaseNo() {
		return this.caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public List<MedicineInfo> getMedicineList() {
		return this.medicineList;
	}
	public void setMedicineList(List<MedicineInfo> medicineList) {
		this.medicineList = medicineList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
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
