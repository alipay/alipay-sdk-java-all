package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券包咨询结果
 *
 * @author auto create
 * @since 1.0, 2022-07-19 18:55:06
 */
public class VoucherPackageConsultResult extends AlipayObject {

	private static final long serialVersionUID = 8851857349361568571L;

	/**
	 * 券包购买咨询结果code：
SUCCESS：可以领取；
PRODUCT_NOT_ENABLE：产品不可用；
NOT_IN_SELL_TIME：不在销售时间内；
PRODUCT_SOLD_OUT：产品售罄；
USER_PURCHASE_LIMIT：用户购买上限；
OTHER：不可购买，未知原因
	 */
	@ApiField("consult_result_code")
	private String consultResultCode;

	/**
	 * 券包id
	 */
	@ApiField("voucher_package_id")
	private String voucherPackageId;

	public String getConsultResultCode() {
		return this.consultResultCode;
	}
	public void setConsultResultCode(String consultResultCode) {
		this.consultResultCode = consultResultCode;
	}

	public String getVoucherPackageId() {
		return this.voucherPackageId;
	}
	public void setVoucherPackageId(String voucherPackageId) {
		this.voucherPackageId = voucherPackageId;
	}

}
