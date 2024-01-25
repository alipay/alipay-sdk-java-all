package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家券退券
 *
 * @author auto create
 * @since 1.0, 2023-10-30 19:19:11
 */
public class AlipayMarketingActivityOrdervoucherRefundModel extends AlipayObject {

	private static final long serialVersionUID = 3846292227653919795L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 当前订单的退券时间。



格式为：yyyy-MM-dd HH:mm:ss
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
