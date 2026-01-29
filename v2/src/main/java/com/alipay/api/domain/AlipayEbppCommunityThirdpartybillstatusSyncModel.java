package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区三方账单状态同步
 *
 * @author auto create
 * @since 1.0, 2025-06-04 14:47:26
 */
public class AlipayEbppCommunityThirdpartybillstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6414411529835973629L;

	/**
	 * 待缴账单通知用户 Uid 
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 待缴账单业务流水号
通过该字段幂等。 相同服务商下传入相同 bizNo 视为相同请求。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 待缴账单通知用户 Uid 对应的openUid
(与alipayUid对应)
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 已缴费金额，正数 单位:分
如缴费 200.20 元，则传入 20020
	 */
	@ApiField("paid_amount")
	private Long paidAmount;

	/**
	 * 支付单号
	 */
	@ApiField("pay_no")
	private String payNo;

	/**
	 * 账单状态
	 */
	@ApiField("status")
	private String status;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPaidAmount() {
		return this.paidAmount;
	}
	public void setPaidAmount(Long paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getPayNo() {
		return this.payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
