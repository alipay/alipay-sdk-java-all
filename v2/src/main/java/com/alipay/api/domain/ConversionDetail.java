package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转化事件
 *
 * @author auto create
 * @since 1.0, 2021-05-11 14:59:20
 */
public class ConversionDetail extends AlipayObject {

	private static final long serialVersionUID = 7281583278121642881L;

	/**
	 * 转化事件id
	 */
	@ApiField("conversion_id")
	private String conversionId;

	/**
	 * 转化事件名称
	 */
	@ApiField("conversion_name")
	private String conversionName;

	/**
	 * 转化事件类型代码
	 */
	@ApiField("conversion_type")
	private String conversionType;

	/**
	 * 转化事件类型名称
	 */
	@ApiField("conversion_type_name")
	private String conversionTypeName;

	/**
	 * 状态: ENABLE( "生效"); DISABLE( "失效"); DELETE("删除")
	 */
	@ApiField("status")
	private String status;

	public String getConversionId() {
		return this.conversionId;
	}
	public void setConversionId(String conversionId) {
		this.conversionId = conversionId;
	}

	public String getConversionName() {
		return this.conversionName;
	}
	public void setConversionName(String conversionName) {
		this.conversionName = conversionName;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
