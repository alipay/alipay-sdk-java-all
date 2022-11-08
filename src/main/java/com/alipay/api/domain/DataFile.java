package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据返回结果里的文件信息参数
 *
 * @author auto create
 * @since 1.0, 2022-04-08 14:15:56
 */
public class DataFile extends AlipayObject {

	private static final long serialVersionUID = 3137137798285793287L;

	/**
	 * 文件访问地址
	 */
	@ApiField("access_url")
	private String accessUrl;

	/**
	 * 文件包含的数据类型。比如TAXRECEIPT代表税票
	 */
	@ApiField("data_type")
	private String dataType;

	public String getAccessUrl() {
		return this.accessUrl;
	}
	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

}
