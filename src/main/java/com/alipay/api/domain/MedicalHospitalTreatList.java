package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医院诊疗明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class MedicalHospitalTreatList extends AlipayObject {

	private static final long serialVersionUID = 2451854964219622567L;

	/**
	 * 该类诊疗的资金总额，精确到元。
单位：元
	 */
	@ApiField("treat_amount")
	private String treatAmount;

	/**
	 * CHECK_FEE 检查费
EXAM_FEE 检验费
MEDICAL_FEE 药品费
TREAT_FEE 诊疗费
	 */
	@ApiField("treat_amount_type")
	private String treatAmountType;

	/**
	 * 诊疗项目明细
	 */
	@ApiListField("treat_project_list")
	@ApiField("medical_hospital_treat_project_list")
	private List<MedicalHospitalTreatProjectList> treatProjectList;

	public String getTreatAmount() {
		return this.treatAmount;
	}
	public void setTreatAmount(String treatAmount) {
		this.treatAmount = treatAmount;
	}

	public String getTreatAmountType() {
		return this.treatAmountType;
	}
	public void setTreatAmountType(String treatAmountType) {
		this.treatAmountType = treatAmountType;
	}

	public List<MedicalHospitalTreatProjectList> getTreatProjectList() {
		return this.treatProjectList;
	}
	public void setTreatProjectList(List<MedicalHospitalTreatProjectList> treatProjectList) {
		this.treatProjectList = treatProjectList;
	}

}
