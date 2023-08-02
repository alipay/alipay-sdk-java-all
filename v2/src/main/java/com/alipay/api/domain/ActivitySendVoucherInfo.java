package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家券活动需要发券的信息
 *
 * @author auto create
 * @since 1.0, 2022-11-22 11:47:41
 */
public class ActivitySendVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 6155989358281363921L;

	/**
	 * 商家券活动id。 在配券时，服务商配置的voucher_type 为 EXCHANGE_VOUCHER的活动。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 用户领券之后在服务商(商户)侧提供的券详情展示页面。在支付宝卡包中展示链接，用户点击可以跳转到服务商券详情页。 限制: 该字段在兑换券场景下必传。 链接必须是alipays开头的小程序链接，详见《小程序scheme链接介绍》https://opendocs.alipay.com/support/01rb18 其中[pagePath]参数必须进行encode编码
	 */
	@ApiField("merchant_order_url")
	private String merchantOrderUrl;

	/**
	 * 批量发放多张券时每一张券独立的发奖业务单号。幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务商发奖的券码列表. 限制： 单个code最长64位。 商户上传的券code列表，code允许包含的字符有0-9、a-z、A-Z、-、_、+、=、|。 如果发生券码后校验不通过.支付宝内部不会进行发奖。针对这种case会通知服务商进行整改，该笔交易支付宝内部不会发奖成功。
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	/**
	 * 发奖后返回的与券码对应的券码使用链接，在支付宝卡包-券详情以二维码方式展示 注意: 该链接审核不通过，将继续使用券码生成二维码
	 */
	@ApiField("voucher_code_url")
	private String voucherCodeUrl;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getMerchantOrderUrl() {
		return this.merchantOrderUrl;
	}
	public void setMerchantOrderUrl(String merchantOrderUrl) {
		this.merchantOrderUrl = merchantOrderUrl;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public String getVoucherCodeUrl() {
		return this.voucherCodeUrl;
	}
	public void setVoucherCodeUrl(String voucherCodeUrl) {
		this.voucherCodeUrl = voucherCodeUrl;
	}

}
