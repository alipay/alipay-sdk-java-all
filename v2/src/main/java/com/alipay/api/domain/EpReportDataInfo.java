package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于企信接收商户上传数据，例如招投标报告相关附件信息等
 *
 * @author auto create
 * @since 1.0, 2024-11-05 10:27:13
 */
public class EpReportDataInfo extends AlipayObject {

	private static final long serialVersionUID = 2887427266874387735L;

	/**
	 * 上传数据所属业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 商户上传的数据内容，支持csv链接、png、pdf格式
	 */
	@ApiField("biz_value")
	private String bizValue;

	/**
	 * 上传企业相关业务数据的相关状态，例如数据是企业无风险截图，如果企业有风险，则上报为QUERY_HAVE_RISK
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 商户上传的数据类型
	 */
	@ApiField("value_type")
	private String valueType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizValue() {
		return this.bizValue;
	}
	public void setBizValue(String bizValue) {
		this.bizValue = bizValue;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getValueType() {
		return this.valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

}
