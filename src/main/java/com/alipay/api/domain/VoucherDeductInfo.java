package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券优惠抵扣信息
 *
 * @author auto create
 * @since 1.0, 2022-11-03 16:33:13
 */
public class VoucherDeductInfo extends AlipayObject {

	private static final long serialVersionUID = 2521278236867884798L;

	/**
	 * 自定义券类型
	 */
	@ApiField("customer_define_voucher_info")
	private CustomerDefineVoucherInfo customerDefineVoucherInfo;

	/**
	 * 折扣券详情。
	 */
	@ApiField("discount_voucher_info")
	private DiscountVoucherInfo discountVoucherInfo;

	/**
	 * 兑换券详情。
	 */
	@ApiField("exchange_voucher_info")
	private ExchangeVoucherInfo exchangeVoucherInfo;

	/**
	 * 满减券详情。
	 */
	@ApiField("fix_voucher_info")
	private FixVoucherInfo fixVoucherInfo;

	/**
	 * 特价券详情。
	 */
	@ApiField("special_voucher_info")
	private SpecialVoucherInfo specialVoucherInfo;

	/**
	 * 券类型。
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public CustomerDefineVoucherInfo getCustomerDefineVoucherInfo() {
		return this.customerDefineVoucherInfo;
	}
	public void setCustomerDefineVoucherInfo(CustomerDefineVoucherInfo customerDefineVoucherInfo) {
		this.customerDefineVoucherInfo = customerDefineVoucherInfo;
	}

	public DiscountVoucherInfo getDiscountVoucherInfo() {
		return this.discountVoucherInfo;
	}
	public void setDiscountVoucherInfo(DiscountVoucherInfo discountVoucherInfo) {
		this.discountVoucherInfo = discountVoucherInfo;
	}

	public ExchangeVoucherInfo getExchangeVoucherInfo() {
		return this.exchangeVoucherInfo;
	}
	public void setExchangeVoucherInfo(ExchangeVoucherInfo exchangeVoucherInfo) {
		this.exchangeVoucherInfo = exchangeVoucherInfo;
	}

	public FixVoucherInfo getFixVoucherInfo() {
		return this.fixVoucherInfo;
	}
	public void setFixVoucherInfo(FixVoucherInfo fixVoucherInfo) {
		this.fixVoucherInfo = fixVoucherInfo;
	}

	public SpecialVoucherInfo getSpecialVoucherInfo() {
		return this.specialVoucherInfo;
	}
	public void setSpecialVoucherInfo(SpecialVoucherInfo specialVoucherInfo) {
		this.specialVoucherInfo = specialVoucherInfo;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
