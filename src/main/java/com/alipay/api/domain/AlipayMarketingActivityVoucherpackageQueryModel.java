package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券包详情查询
 *
 * @author auto create
 * @since 1.0, 2022-07-21 22:26:19
 */
public class AlipayMarketingActivityVoucherpackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8898898814815363292L;

	/**
	 * 券包id
	 */
	@ApiField("voucher_package_id")
	private String voucherPackageId;

	public String getVoucherPackageId() {
		return this.voucherPackageId;
	}
	public void setVoucherPackageId(String voucherPackageId) {
		this.voucherPackageId = voucherPackageId;
	}

}
