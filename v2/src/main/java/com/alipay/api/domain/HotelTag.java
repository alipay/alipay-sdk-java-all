package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店标签
 *
 * @author auto create
 * @since 1.0, 2024-01-24 18:55:28
 */
public class HotelTag extends AlipayObject {

	private static final long serialVersionUID = 2273379611434312127L;

	/**
	 * 是否支持早餐
	 */
	@ApiField("support_breakfast")
	private Boolean supportBreakfast;

	/**
	 * 是否支持免费取消
	 */
	@ApiField("support_free_cancel")
	private Boolean supportFreeCancel;

	/**
	 * 是否支持预付
	 */
	@ApiField("support_prepay")
	private Boolean supportPrepay;

	/**
	 * 是否支持预付发票
	 */
	@ApiField("support_prepay_invoice")
	private Boolean supportPrepayInvoice;

	/**
	 * 是否支持到店付
	 */
	@ApiField("support_self_pay")
	private Boolean supportSelfPay;

	/**
	 * 是否支持专票
	 */
	@ApiField("support_special_invoice")
	private Boolean supportSpecialInvoice;

	public Boolean getSupportBreakfast() {
		return this.supportBreakfast;
	}
	public void setSupportBreakfast(Boolean supportBreakfast) {
		this.supportBreakfast = supportBreakfast;
	}

	public Boolean getSupportFreeCancel() {
		return this.supportFreeCancel;
	}
	public void setSupportFreeCancel(Boolean supportFreeCancel) {
		this.supportFreeCancel = supportFreeCancel;
	}

	public Boolean getSupportPrepay() {
		return this.supportPrepay;
	}
	public void setSupportPrepay(Boolean supportPrepay) {
		this.supportPrepay = supportPrepay;
	}

	public Boolean getSupportPrepayInvoice() {
		return this.supportPrepayInvoice;
	}
	public void setSupportPrepayInvoice(Boolean supportPrepayInvoice) {
		this.supportPrepayInvoice = supportPrepayInvoice;
	}

	public Boolean getSupportSelfPay() {
		return this.supportSelfPay;
	}
	public void setSupportSelfPay(Boolean supportSelfPay) {
		this.supportSelfPay = supportSelfPay;
	}

	public Boolean getSupportSpecialInvoice() {
		return this.supportSpecialInvoice;
	}
	public void setSupportSpecialInvoice(Boolean supportSpecialInvoice) {
		this.supportSpecialInvoice = supportSpecialInvoice;
	}

}
