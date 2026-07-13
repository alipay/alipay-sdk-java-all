package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收质检报告选项信息
 *
 * @author auto create
 * @since 1.0, 2026-03-27 10:50:56
 */
public class RecycleQcReportOptionVO extends AlipayObject {

	private static final long serialVersionUID = 5714967346857856112L;

	/**
	 * 是否缺陷项
	 */
	@ApiField("defect_option")
	private Boolean defectOption;

	/**
	 * 问题选项编码
	 */
	@ApiField("option_code")
	private String optionCode;

	/**
	 * 问题选项图片Id列表
	 */
	@ApiListField("option_image_id_list")
	@ApiField("string")
	private List<String> optionImageIdList;

	/**
	 * 问题选项图片url列表
	 */
	@ApiListField("option_image_url_list")
	@ApiField("string")
	private List<String> optionImageUrlList;

	/**
	 * 问题选项名称
	 */
	@ApiField("option_name")
	private String optionName;

	public Boolean getDefectOption() {
		return this.defectOption;
	}
	public void setDefectOption(Boolean defectOption) {
		this.defectOption = defectOption;
	}

	public String getOptionCode() {
		return this.optionCode;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	public List<String> getOptionImageIdList() {
		return this.optionImageIdList;
	}
	public void setOptionImageIdList(List<String> optionImageIdList) {
		this.optionImageIdList = optionImageIdList;
	}

	public List<String> getOptionImageUrlList() {
		return this.optionImageUrlList;
	}
	public void setOptionImageUrlList(List<String> optionImageUrlList) {
		this.optionImageUrlList = optionImageUrlList;
	}

	public String getOptionName() {
		return this.optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

}
