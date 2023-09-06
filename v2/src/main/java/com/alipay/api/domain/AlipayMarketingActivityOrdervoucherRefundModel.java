package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家券退券
 *
 * @author auto create
 * @since 1.0, 2023-06-20 20:54:17
 */
public class AlipayMarketingActivityOrdervoucherRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1778248832266491935L;

	/**
	 * 优惠券活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 当前订单的退券时间。



格式为：yyyy-MM-dd HH:mm:ss



特别说明：

支付宝的退款时间按照外部退款的时间为准。
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 商户接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 外部业务单号，用作幂等控制。



幂等作用：

参数不变的情况下，再次请求返回与上一次相同的结果。



外部接入方需保证业务单号唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 当前订单的退款总金额(包含优惠券金额)，单位为元。

限制：

该笔订单的资金总额，取值范围[0.01,100000000]，精确到小数点后2位。
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 已核销待退券的券码
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	/**
	 * 券取消核销详情
	 */
	@ApiField("voucher_refund_detail_info")
	private VoucherRefundDetailInfo voucherRefundDetailInfo;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public VoucherRefundDetailInfo getVoucherRefundDetailInfo() {
		return this.voucherRefundDetailInfo;
	}
	public void setVoucherRefundDetailInfo(VoucherRefundDetailInfo voucherRefundDetailInfo) {
		this.voucherRefundDetailInfo = voucherRefundDetailInfo;
	}

}
