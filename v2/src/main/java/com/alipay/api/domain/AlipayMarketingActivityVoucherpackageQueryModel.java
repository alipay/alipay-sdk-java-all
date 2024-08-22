package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券包详情查询
 *
 * @author auto create
 * @since 1.0, 2023-06-16 10:04:24
 */
public class AlipayMarketingActivityVoucherpackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6323381472345739789L;

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
