package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherPackageActivityInfo;
import com.alipay.api.domain.VoucherPackageBaseInfo;
import com.alipay.api.domain.VoucherPackageSalesInfo;
import com.alipay.api.domain.VoucherPackageUseRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucherpackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-22 10:31:42
 */
public class AlipayMarketingActivityVoucherpackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1244952927683883246L;

	/** 
	 * 券包活动信息
	 */
	@ApiListField("voucher_package_activity_info")
	@ApiField("voucher_package_activity_info")
	private List<VoucherPackageActivityInfo> voucherPackageActivityInfo;

	/** 
	 * 券包基本信息
	 */
	@ApiField("voucher_package_base_info")
	private VoucherPackageBaseInfo voucherPackageBaseInfo;

	/** 
	 * 券包售卖信息
	 */
	@ApiField("voucher_package_sales_info")
	private VoucherPackageSalesInfo voucherPackageSalesInfo;

	/** 
	 * 券包使用规则
	 */
	@ApiField("voucher_package_use_rule")
	private VoucherPackageUseRule voucherPackageUseRule;

	public void setVoucherPackageActivityInfo(List<VoucherPackageActivityInfo> voucherPackageActivityInfo) {
		this.voucherPackageActivityInfo = voucherPackageActivityInfo;
	}
	public List<VoucherPackageActivityInfo> getVoucherPackageActivityInfo( ) {
		return this.voucherPackageActivityInfo;
	}

	public void setVoucherPackageBaseInfo(VoucherPackageBaseInfo voucherPackageBaseInfo) {
		this.voucherPackageBaseInfo = voucherPackageBaseInfo;
	}
	public VoucherPackageBaseInfo getVoucherPackageBaseInfo( ) {
		return this.voucherPackageBaseInfo;
	}

	public void setVoucherPackageSalesInfo(VoucherPackageSalesInfo voucherPackageSalesInfo) {
		this.voucherPackageSalesInfo = voucherPackageSalesInfo;
	}
	public VoucherPackageSalesInfo getVoucherPackageSalesInfo( ) {
		return this.voucherPackageSalesInfo;
	}

	public void setVoucherPackageUseRule(VoucherPackageUseRule voucherPackageUseRule) {
		this.voucherPackageUseRule = voucherPackageUseRule;
	}
	public VoucherPackageUseRule getVoucherPackageUseRule( ) {
		return this.voucherPackageUseRule;
	}

}
