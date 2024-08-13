package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告投放转化数据
 *
 * @author auto create
 * @since 1.0, 2023-10-26 09:59:42
 */
public class AdReportConversionDataDetail extends AlipayObject {

	private static final long serialVersionUID = 8737364972912918121L;

	/**
	 * 转化事件结果
	 */
	@ApiField("conversion_result")
	private String conversionResult;

	/**
	 * 转化事件类型
	 */
	@ApiField("conversion_type")
	private String conversionType;

	/**
	 * 转化事件类型名称
	 */
	@ApiField("conversion_type_name")
	private String conversionTypeName;

	public String getConversionResult() {
		return this.conversionResult;
	}
	public void setConversionResult(String conversionResult) {
		this.conversionResult = conversionResult;
	}

	public String getConversionType() {
		return this.conversionType;
	}
	public void setConversionType(String conversionType) {
		this.conversionType = conversionType;
	}

	public String getConversionTypeName() {
		return this.conversionTypeName;
	}
	public void setConversionTypeName(String conversionTypeName) {
		this.conversionTypeName = conversionTypeName;
	}

}
