package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣任务创建
 *
 * @author auto create
 * @since 1.0, 2024-12-12 16:21:37
 */
public class AlipayCommerceWithholdTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7733468325722128338L;

	/**
	 * 代扣协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 扣款金额，单位为分
	 */
	@ApiField("deduct")
	private Long deduct;

	/**
	 * 代扣任务结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号，用作幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("uid")
	private String uid;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public Long getDeduct() {
		return this.deduct;
	}
	public void setDeduct(Long deduct) {
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

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
