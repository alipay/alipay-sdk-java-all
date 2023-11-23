package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 端权限检测报告-敏感信息使用总览DTO
 *
 * @author auto create
 * @since 1.0, 2023-06-27 13:51:55
 */
public class ApmobileAppApiUsedOverviewDTO extends AlipayObject {

	private static final long serialVersionUID = 3812747616884524497L;

	/**
	 * api信息名称
	 */
	@ApiField("info_name")
	private String infoName;

	/**
	 * api信息类型
	 */
	@ApiField("info_type")
	private String infoType;

	public String getInfoName() {
		return this.infoName;
	}
	public void setInfoName(String infoName) {
		this.infoName = infoName;
	}

	public String getInfoType() {
		return this.infoType;
	}
	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}

}
