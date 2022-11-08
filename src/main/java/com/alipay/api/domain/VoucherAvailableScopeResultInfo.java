package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可用范围结果详情
 *
 * @author auto create
 * @since 1.0, 2022-08-24 16:22:26
 */
public class VoucherAvailableScopeResultInfo extends AlipayObject {

	private static final long serialVersionUID = 7798884635115389181L;

	/**
	 * 可用地理位置。
	 */
	@ApiField("voucher_available_geography_scope_result_info")
	private VoucherAvailableGeographyScopeResultInfo voucherAvailableGeographyScopeResultInfo;

	public VoucherAvailableGeographyScopeResultInfo getVoucherAvailableGeographyScopeResultInfo() {
		return this.voucherAvailableGeographyScopeResultInfo;
	}
	public void setVoucherAvailableGeographyScopeResultInfo(VoucherAvailableGeographyScopeResultInfo voucherAvailableGeographyScopeResultInfo) {
		this.voucherAvailableGeographyScopeResultInfo = voucherAvailableGeographyScopeResultInfo;
	}

}
