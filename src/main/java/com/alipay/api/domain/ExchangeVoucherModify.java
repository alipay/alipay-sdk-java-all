package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换券修改
 *
 * @author auto create
 * @since 1.0, 2022-05-27 14:51:27
 */
public class ExchangeVoucherModify extends AlipayObject {

	private static final long serialVersionUID = 7285928755645473196L;

	/**
	 * 领(购)券详情页链接，从支付宝公域跳转到服务商(商户)自定义领(购)券详情页。
限制:
1、若活动已报名中心化会场则该值不能修改，活动从中心化会场下线后该值可以继续修改
	 */
	@ApiField("voucher_detail_url")
	private String voucherDetailUrl;

	/**
	 * 对消费者展示的券(商品)名称。
限制:
1、若活动已报名中心化会场则该值不能修改，活动从中心化会场下线后该值可以继续修改
	 */
	@ApiField("voucher_name")
	private String voucherName;

	public String getVoucherDetailUrl() {
		return this.voucherDetailUrl;
	}
	public void setVoucherDetailUrl(String voucherDetailUrl) {
		this.voucherDetailUrl = voucherDetailUrl;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}
