package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券包信息
 *
 * @author auto create
 * @since 1.0, 2022-07-19 17:57:28
 */
public class VoucherPackageInfo extends AlipayObject {

	private static final long serialVersionUID = 3755659771962763134L;

	/**
	 * 券包基本信息
	 */
	@ApiField("voucher_package_base_info")
	private VoucherPackageBaseInfo voucherPackageBaseInfo;

	/**
	 * 券包售卖信息轻量版
	 */
	@ApiField("voucher_package_sales_lite_info")
	private VoucherPackageSalesLiteInfo voucherPackageSalesLiteInfo;

	public VoucherPackageBaseInfo getVoucherPackageBaseInfo() {
		return this.voucherPackageBaseInfo;
	}
	public void setVoucherPackageBaseInfo(VoucherPackageBaseInfo voucherPackageBaseInfo) {
		this.voucherPackageBaseInfo = voucherPackageBaseInfo;
	}

	public VoucherPackageSalesLiteInfo getVoucherPackageSalesLiteInfo() {
		return this.voucherPackageSalesLiteInfo;
	}
	public void setVoucherPackageSalesLiteInfo(VoucherPackageSalesLiteInfo voucherPackageSalesLiteInfo) {
		this.voucherPackageSalesLiteInfo = voucherPackageSalesLiteInfo;
	}

}
