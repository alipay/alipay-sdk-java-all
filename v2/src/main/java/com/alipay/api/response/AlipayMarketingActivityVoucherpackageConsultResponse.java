package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherPackageConsultResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucherpackage.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 14:03:09
 */
public class AlipayMarketingActivityVoucherpackageConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5356851916777876937L;

	/** 
	 * 券包购买咨询结果
	 */
	@ApiListField("voucher_package_consult_result")
	@ApiField("voucher_package_consult_result")
	private List<VoucherPackageConsultResult> voucherPackageConsultResult;

	public void setVoucherPackageConsultResult(List<VoucherPackageConsultResult> voucherPackageConsultResult) {
		this.voucherPackageConsultResult = voucherPackageConsultResult;
	}
	public List<VoucherPackageConsultResult> getVoucherPackageConsultResult( ) {
		return this.voucherPackageConsultResult;
	}

}
