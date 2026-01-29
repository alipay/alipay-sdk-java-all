package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询对应已上线资源列表
 *
 * @author auto create
 * @since 1.0, 2025-11-04 10:42:56
 */
public class AlipayIserviceIcontrolOnlineresorcesbycodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5339521332814821974L;

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
