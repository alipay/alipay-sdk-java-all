package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘圈选标签圈选项请求类
 *
 * @author auto create
 * @since 1.0, 2024-06-04 15:07:55
 */
public class OpenCrowdOperationOptionRequest extends AlipayObject {

	private static final long serialVersionUID = 2524761287932276191L;

	/**
	 * 当前圈选项数据类型为「NUMBER_RANGE_VALUE 数值范围类型」，需要单独传入圈选范围值。
不需要传入具体数值单位，如果是金额数值范围，传入金额范围单位是「元」。
	 */
	@ApiField("number_range_option_value")
	private OpenNumberRangeValue numberRangeOptionValue;

	/**
	 * 每个圈选标签有一个或者多个圈选项，每个圈选项在创建圈选请求时都需要传入圈选值
	 */
	@ApiField("option_code")
	private String optionCode;

	/**
	 * 标签圈选请求中，当前圈选项的圈选值ID，如果圈选项的数据类型为「MULTI_SELECT」代表支持多个圈选值ID，用逗号分割，其他数据类型只支持传入1个圈选值ID
	 */
	@ApiField("option_value_id_list")
	private String optionValueIdList;

	/**
	 * 标签圈选请求中，当前圈选项的圈选值，如果圈选项的数据类型为「MULTI_SELECT」代表支持多个圈选值，用逗号分割，其他数据类型只支持传入1个圈选值
	 */
	@ApiField("option_value_list")
	private String optionValueList;

	public OpenNumberRangeValue getNumberRangeOptionValue() {
		return this.numberRangeOptionValue;
	}
	public void setNumberRangeOptionValue(OpenNumberRangeValue numberRangeOptionValue) {
		this.numberRangeOptionValue = numberRangeOptionValue;
	}

	public String getOptionCode() {
		return this.optionCode;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	public String getOptionValueIdList() {
		return this.optionValueIdList;
	}
	public void setOptionValueIdList(String optionValueIdList) {
		this.optionValueIdList = optionValueIdList;
	}

	public String getOptionValueList() {
		return this.optionValueList;
	}
	public void setOptionValueList(String optionValueList) {
		this.optionValueList = optionValueList;
	}

}
