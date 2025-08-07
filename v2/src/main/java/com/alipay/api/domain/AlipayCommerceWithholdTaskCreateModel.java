package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣任务创建
 *
 * @author auto create
 * @since 1.0, 2025-06-19 13:47:10
 */
public class AlipayCommerceWithholdTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4451599122349274533L;

	/**
	 * 代扣协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 扣款金额，单位为元
	 */
	@ApiField("deduct")
	private String deduct;

	/**
	 * 代扣任务结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识 当前字段已废弃(agreementNo本身带有uid信息)
	 */
	@ApiField("open_id")
	@Deprecated
	private String openId;

	/**
	 * 外部业务号，用作幂等 当前字段已废弃(名称修改，不再使用该字段名参数)
	 */
	@ApiField("out_biz_no")
	@Deprecated
	private String outBizNo;

	/**
	 * 外部业务号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝用户的userId。 当前字段已废弃(agreementNo本身带有uid信息)
	 */
	@ApiField("uid")
	@Deprecated
	private String uid;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getDeduct() {
		return this.deduct;
	}
	public void setDeduct(String deduct) {
		this.deduct = deduct;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
