package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询对应空闲资源列表
 *
 * @author auto create
 * @since 1.0, 2025-11-04 10:42:50
 */
public class AlipayIserviceIcontrolFreeresourcesbycodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5639863336345632641L;

	/**
	 * 业务包code
	 */
	@ApiField("biz_package_code")
	private String bizPackageCode;

	public String getBizPackageCode() {
		return this.bizPackageCode;
	}
	public void setBizPackageCode(String bizPackageCode) {
		this.bizPackageCode = bizPackageCode;
	}

}
