package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联小程序机构动账通知
 *
 * @author auto create
 * @since 1.0, 2022-09-16 15:32:48
 */
public class AlipayMerchantIndirectAccountNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7364735351222836598L;

	/**
	 * 交易金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 间联小程序ID
	 */
	@ApiField("mrchind_app_id")
	private String mrchindAppId;

	/**
	 * 外部唯一流水编号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部商户编号(银行商户号)
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	/**
	 * 支付渠道，参考枚举如下：
ALIPAY:支付宝
WECHAT_PAY:微信支付
UNION_PAY:银联支付
OTHER	其他付款方式
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 商户smid (支付宝进件商户号)
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 当日收款总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 当日收款总笔数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 交易时间
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMrchindAppId() {
		return this.mrchindAppId;
	}
	public void setMrchindAppId(String mrchindAppId) {
		this.mrchindAppId = mrchindAppId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutMerchantNo() {
		return this.outMerchantNo;
	}
	public void setOutMerchantNo(String outMerchantNo) {
		this.outMerchantNo = outMerchantNo;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

}
