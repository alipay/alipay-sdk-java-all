package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商保码-差额追偿
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:23:22
 */
public class AlipayCommerceMedicalInsuranceDiffrecoveryPayModel extends AlipayObject {

	private static final long serialVersionUID = 1355359125714795941L;

	/**
	 * 标识一次垫付申请，最近一次的垫付申请。
	 */
	@ApiField("advance_apply_no")
	private String advanceApplyNo;

	/**
	 * 业务类型， 1-快赔追偿 2-欠款追偿
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部交易流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 标识垫资方的身份来源，支付宝定义的枚举值，对应到具体的垫资调用方
	 */
	@ApiField("source")
	private String source;

	/**
	 * 直赔场景的差额代扣发起订单标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 追偿总金额，单位为元，精确到小数点后两位，取值范围[0.01,99999999.99]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAdvanceApplyNo() {
		return this.advanceApplyNo;
	}
	public void setAdvanceApplyNo(String advanceApplyNo) {
		this.advanceApplyNo = advanceApplyNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
