package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果返回自定义内容
 *
 * @author auto create
 * @since 1.0, 2023-08-04 17:52:14
 */
public class IotPaymentCustomInfo extends AlipayObject {

	private static final long serialVersionUID = 8374444593424139637L;

	/**
	 * 金额类展示内容，可在实际金额前置附加单位或其他自定义前置字段，title为餐补，amountShow 为￥5.00，
即展示内容为 餐补 ￥5.00
	 */
	@ApiField("amount_show")
	private String amountShow;

	/**
	 * 用于支付结果页展示，该字段为左侧标题
	 */
	@ApiField("title")
	private String title;

	public String getAmountShow() {
		return this.amountShow;
	}
	public void setAmountShow(String amountShow) {
		this.amountShow = amountShow;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
