package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡包优惠券使用信息
 *
 * @author auto create
 * @since 1.0, 2023-11-23 15:48:25
 */
public class VoucherUsageInfo extends AlipayObject {

	private static final long serialVersionUID = 3469665522351177374L;

	/**
	 * 点击优惠券「去使用」按钮，可以使用优惠券的地址。一般为小程序页面地址。
	 */
	@ApiField("goto_use_url")
	private String gotoUseUrl;

	/**
	 * 优惠券使用记录的跳转地址
	 */
	@ApiField("use_record_url")
	private String useRecordUrl;

	public String getGotoUseUrl() {
		return this.gotoUseUrl;
	}
	public void setGotoUseUrl(String gotoUseUrl) {
		this.gotoUseUrl = gotoUseUrl;
	}

	public String getUseRecordUrl() {
		return this.useRecordUrl;
	}
	public void setUseRecordUrl(String useRecordUrl) {
		this.useRecordUrl = useRecordUrl;
	}

}
