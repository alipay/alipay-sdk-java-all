package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用药指导生成接口
 *
 * @author auto create
 * @since 1.0, 2025-11-19 15:22:37
 */
public class AlipayCommerceHdfaitransferMedicationguidanceGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 3261388189523378824L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private String age;

	/**
	 * 过敏史
	 */
	@ApiField("allergic_history")
	private String allergicHistory;

	/**
	 * 病情描述
	 */
	@ApiField("condition_description")
	private String conditionDescription;

	/**
	 * 处方诊断
	 */
	@ApiField("diagnosis")
	private String diagnosis;

	/**
	 * 是否怀孕
	 */
	@ApiField("gestation_str")
	private String gestationStr;

	/**
	 * null
	 */
	@ApiListField("guidance_use_drug_list")
	@ApiField("guidance_use_drug_item")
	private List<GuidanceUseDrugItem> guidanceUseDrugList;

	/**
	 * 同时使用
	 */
	@ApiField("need_same_time")
	private String needSameTime;

	/**
	 * 注意事项
	 */
	@ApiField("precautions")
	private String precautions;

	/**
	 * 服药期间复查信息
	 */
	@ApiField("recheck_str")
	private String recheckStr;

	/**
	 * 性别
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 服用期间特殊叮嘱
	 */
	@ApiField("use_drug_warn_str")
	private String useDrugWarnStr;

	/**
	 * 体重，单位固定是kg，作为字符串使用
	 */
	@ApiField("weight")
	private String weight;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getAllergicHistory() {
		return this.allergicHistory;
	}
	public void setAllergicHistory(String allergicHistory) {
		this.allergicHistory = allergicHistory;
	}

	public String getConditionDescription() {
		return this.conditionDescription;
	}
	public void setConditionDescription(String conditionDescription) {
		this.conditionDescription = conditionDescription;
	}

	public String getDiagnosis() {
		return this.diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getGestationStr() {
		return this.gestationStr;
	}
	public void setGestationStr(String gestationStr) {
		this.gestationStr = gestationStr;
	}

	public List<GuidanceUseDrugItem> getGuidanceUseDrugList() {
		return this.guidanceUseDrugList;
	}
	public void setGuidanceUseDrugList(List<GuidanceUseDrugItem> guidanceUseDrugList) {
		this.guidanceUseDrugList = guidanceUseDrugList;
	}

	public String getNeedSameTime() {
		return this.needSameTime;
	}
	public void setNeedSameTime(String needSameTime) {
		this.needSameTime = needSameTime;
	}

	public String getPrecautions() {
		return this.precautions;
	}
	public void setPrecautions(String precautions) {
		this.precautions = precautions;
	}

	public String getRecheckStr() {
		return this.recheckStr;
	}
	public void setRecheckStr(String recheckStr) {
		this.recheckStr = recheckStr;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getUseDrugWarnStr() {
		return this.useDrugWarnStr;
	}
	public void setUseDrugWarnStr(String useDrugWarnStr) {
		this.useDrugWarnStr = useDrugWarnStr;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
