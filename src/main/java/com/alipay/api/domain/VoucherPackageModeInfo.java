package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券包玩法
 *
 * @author auto create
 * @since 1.0, 2022-09-27 13:22:21
 */
public class VoucherPackageModeInfo extends AlipayObject {

	private static final long serialVersionUID = 3685297252663971323L;

	/**
	 * 券包id，对应alipay.marketing.activity.voucherpackage.query中voucher_package_id。
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
