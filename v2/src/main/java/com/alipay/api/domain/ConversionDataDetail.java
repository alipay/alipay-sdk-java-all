package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放转化数据
 *
 * @author auto create
 * @since 1.0, 2020-02-28 21:14:36
 */
public class ConversionDataDetail extends AlipayObject {

	private static final long serialVersionUID = 3233165641731644921L;

	/**
	 * 转化事件id
	 */
	@ApiField("conversion_id")
	private String conversionId;

	/**
	 * 转化事件结果
	 */
	@ApiField("conversion_result")
	private String conversionResult;

	public String getConversionId() {
		return this.conversionId;
	}
	public void setConversionId(String conversionId) {
		this.conversionId = conversionId;
	}

	public String getConversionResult() {
		return this.conversionResult;
	}
	public void setConversionResult(String conversionResult) {
		this.conversionResult = conversionResult;
	}

}
