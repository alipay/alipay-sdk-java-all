package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗导诊卡片数据
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:59:02
 */
public class MedicalGuideCardData extends AlipayObject {

	private static final long serialVersionUID = 4623571357574715153L;

	/**
	 * 是否为手动输入
	 */
	@ApiField("manual_input")
	private Boolean manualInput;

	/**
	 * 选项
	 */
	@ApiListField("options")
	@ApiField("string")
	private List<String> options;

	/**
	 * 选项类型
	 */
	@ApiField("options_choice_type")
	private String optionsChoiceType;

	/**
	 * 对话是否刷新
	 */
	@ApiField("refresh")
	private Boolean refresh;

	/**
	 * 特殊选项
	 */
	@ApiListField("special_options")
	@ApiField("string")
	private List<String> specialOptions;

	/**
	 * 症状部位信息
	 */
	@ApiListField("symptom_part_infos")
	@ApiField("symptom_part_info")
	private List<SymptomPartInfo> symptomPartInfos;

	/**
	 * 医疗导诊结果标签
	 */
	@ApiListField("tabs")
	@ApiField("medical_guide_tab")
	private List<MedicalGuideTab> tabs;

	public Boolean getManualInput() {
		return this.manualInput;
	}
	public void setManualInput(Boolean manualInput) {
		this.manualInput = manualInput;
	}

	public List<String> getOptions() {
		return this.options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getOptionsChoiceType() {
		return this.optionsChoiceType;
	}
	public void setOptionsChoiceType(String optionsChoiceType) {
		this.optionsChoiceType = optionsChoiceType;
	}

	public Boolean getRefresh() {
		return this.refresh;
	}
	public void setRefresh(Boolean refresh) {
		this.refresh = refresh;
	}

	public List<String> getSpecialOptions() {
		return this.specialOptions;
	}
	public void setSpecialOptions(List<String> specialOptions) {
		this.specialOptions = specialOptions;
	}

	public List<SymptomPartInfo> getSymptomPartInfos() {
		return this.symptomPartInfos;
	}
	public void setSymptomPartInfos(List<SymptomPartInfo> symptomPartInfos) {
		this.symptomPartInfos = symptomPartInfos;
	}

	public List<MedicalGuideTab> getTabs() {
		return this.tabs;
	}
	public void setTabs(List<MedicalGuideTab> tabs) {
		this.tabs = tabs;
	}

}
