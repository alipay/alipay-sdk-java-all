package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券可用范围
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:46:12
 */
public class VoucherAvailableScopeInfo extends AlipayObject {

	private static final long serialVersionUID = 2456474644581296438L;

	/**
	 * 券可用账号。
	 */
	@ApiField("voucher_available_account_info")
	private VoucherAvailableAccountInfo voucherAvailableAccountInfo;

	/**
	 * 券可用小程序。
	 */
	@ApiField("voucher_available_app_info")
	private VoucherAvailableAppInfo voucherAvailableAppInfo;

	/**
	 * 券可用地理位置。
	 */
	@ApiField("voucher_available_geography_scope_info")
	private VoucherAvailableGeographyScopeInfo voucherAvailableGeographyScopeInfo;

	/**
	 * 券可用商品。
	 */
	@ApiField("voucher_available_goods_info")
	private VoucherAvailableGoodsInfo voucherAvailableGoodsInfo;

	/**
	 * 券可用商品信息
	 */
	@ApiField("voucher_available_item_info")
	private VoucherAvailableItemInfo voucherAvailableItemInfo;

	public VoucherAvailableAccountInfo getVoucherAvailableAccountInfo() {
		return this.voucherAvailableAccountInfo;
	}
	public void setVoucherAvailableAccountInfo(VoucherAvailableAccountInfo voucherAvailableAccountInfo) {
		this.voucherAvailableAccountInfo = voucherAvailableAccountInfo;
	}

	public VoucherAvailableAppInfo getVoucherAvailableAppInfo() {
		return this.voucherAvailableAppInfo;
	}
	public void setVoucherAvailableAppInfo(VoucherAvailableAppInfo voucherAvailableAppInfo) {
		this.voucherAvailableAppInfo = voucherAvailableAppInfo;
	}

	public VoucherAvailableGeographyScopeInfo getVoucherAvailableGeographyScopeInfo() {
		return this.voucherAvailableGeographyScopeInfo;
	}
	public void setVoucherAvailableGeographyScopeInfo(VoucherAvailableGeographyScopeInfo voucherAvailableGeographyScopeInfo) {
		this.voucherAvailableGeographyScopeInfo = voucherAvailableGeographyScopeInfo;
	}

	public VoucherAvailableGoodsInfo getVoucherAvailableGoodsInfo() {
		return this.voucherAvailableGoodsInfo;
	}
	public void setVoucherAvailableGoodsInfo(VoucherAvailableGoodsInfo voucherAvailableGoodsInfo) {
		this.voucherAvailableGoodsInfo = voucherAvailableGoodsInfo;
	}

	public VoucherAvailableItemInfo getVoucherAvailableItemInfo() {
		return this.voucherAvailableItemInfo;
	}
	public void setVoucherAvailableItemInfo(VoucherAvailableItemInfo voucherAvailableItemInfo) {
		this.voucherAvailableItemInfo = voucherAvailableItemInfo;
	}

}
