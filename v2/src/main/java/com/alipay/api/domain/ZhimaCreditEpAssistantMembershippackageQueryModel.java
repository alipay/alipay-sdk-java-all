package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信助手会员包查询
 *
 * @author auto create
 * @since 1.0, 2026-01-23 10:17:43
 */
public class ZhimaCreditEpAssistantMembershippackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3532753846893223536L;

	/**
	 * 会员包
	 */
	@ApiField("package_id")
	private String packageId;

	public String getPackageId() {
		return this.packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

}
