package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标签圈选项模型，用于返回标签的圈选项列表
 *
 * @author auto create
 * @since 1.0, 2024-06-03 16:16:05
 */
public class OpenCrowdOperationOption extends AlipayObject {

	private static final long serialVersionUID = 7726883929858491394L;

	/**
	 * 每个圈选标签有一个或者多个圈选项，每个圈选项在创建圈选请求时都需要传入圈选值
	 */
	@ApiField("option_code")
	private String optionCode;

	/**
	 * SINGLE_SELECT：当前圈选项只支持1个圈选值，传入标签详情查询返回的圈选值ID
MULTI_SELECT：当前圈选项支持多个圈选值，传入标签详情查询返回的圈选值ID
INPUT_VALUE：自定义输入圈选值
NUMBER_RANGE_VALUE：圈选值为数值范围类型，目前支持介于、大于、大于等于、小于、小于等于几种模式。
	 */
	@ApiField("option_data_type")
	private String optionDataType;

	/**
	 * 当前圈选项下的全部圈选值
	 */
	@ApiListField("option_list")
	@ApiField("open_operation_option")
	private List<OpenOperationOption> optionList;

	/**
	 * 标签圈选项的中文名称
	 */
	@ApiField("option_name")
	private String optionName;

	public String getOptionCode() {
		return this.optionCode;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	public String getOptionDataType() {
		return this.optionDataType;
	}
	public void setOptionDataType(String optionDataType) {
		this.optionDataType = optionDataType;
	}

	public List<OpenOperationOption> getOptionList() {
		return this.optionList;
	}
	public void setOptionList(List<OpenOperationOption> optionList) {
		this.optionList = optionList;
	}

	public String getOptionName() {
		return this.optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

}
