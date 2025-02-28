package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠查询信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:19
 */
public class AppItemVoucherQueryDeductInfo extends AlipayObject {

	private static final long serialVersionUID = 5534339546798552923L;

	/**
	 * 满减券优惠
	 */
	@ApiField("app_item_fix_voucher_info")
	private AppItemFixQueryVoucherInfo appItemFixVoucherInfo;

	/**
	 * 优惠类型
	 */
	@ApiField("promo_type")
	private String promoType;

	public AppItemFixQueryVoucherInfo getAppItemFixVoucherInfo() {
		return this.appItemFixVoucherInfo;
	}
	public void setAppItemFixVoucherInfo(AppItemFixQueryVoucherInfo appItemFixVoucherInfo) {
		this.appItemFixVoucherInfo = appItemFixVoucherInfo;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

}
