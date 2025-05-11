package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款信息对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:21
 */
public class RefundInfoBean extends AlipayObject {

	private static final long serialVersionUID = 5458244862976751772L;

	/**
	 * 实际退款金额，单位：元
	 */
	@ApiField("actual_ref_amt")
	private String actualRefAmt;

	/**
	 * 商户名称
	 */
	@ApiField("mer_name")
	private String merName;

	/**
	 * 申请退款金额，单元：元
	 */
	@ApiField("ord_amt")
	private String ordAmt;

	/**
	 * 原交易请求流水号
	 */
	@ApiField("org_req_seq_id")
	private String orgReqSeqId;

	/**
	 * 请求流水号
	 */
	@ApiField("req_seq_id")
	private String reqSeqId;

	/**
	 * 当前场景，此处填写huifu_id，跟thirdpay_org联动
	 */
	@ApiField("thirdpay_mer_id")
	private String thirdpayMerId;

	/**
	 * 第三方支付机构，当前场景为huifu
	 */
	@ApiField("thirdpay_org")
	private String thirdpayOrg;

	/**
	 * 退款交易完成时间，格式yyyyMMddHHmmss；示例值：20091225091010
	 */
	@ApiField("trans_finish_time")
	private String transFinishTime;

	/**
	 * 退款交易发生时间,格式：HHMMSS
	 */
	@ApiField("trans_time")
	private String transTime;

	public String getActualRefAmt() {
		return this.actualRefAmt;
	}
	public void setActualRefAmt(String actualRefAmt) {
		this.actualRefAmt = actualRefAmt;
	}

	public String getMerName() {
		return this.merName;
	}
	public void setMerName(String merName) {
		this.merName = merName;
	}

	public String getOrdAmt() {
		return this.ordAmt;
	}
	public void setOrdAmt(String ordAmt) {
		this.ordAmt = ordAmt;
	}

	public String getOrgReqSeqId() {
		return this.orgReqSeqId;
	}
	public void setOrgReqSeqId(String orgReqSeqId) {
		this.orgReqSeqId = orgReqSeqId;
	}

	public String getReqSeqId() {
		return this.reqSeqId;
	}
	public void setReqSeqId(String reqSeqId) {
		this.reqSeqId = reqSeqId;
	}

	public String getThirdpayMerId() {
		return this.thirdpayMerId;
	}
	public void setThirdpayMerId(String thirdpayMerId) {
		this.thirdpayMerId = thirdpayMerId;
	}

	public String getThirdpayOrg() {
		return this.thirdpayOrg;
	}
	public void setThirdpayOrg(String thirdpayOrg) {
		this.thirdpayOrg = thirdpayOrg;
	}

	public String getTransFinishTime() {
		return this.transFinishTime;
	}
	public void setTransFinishTime(String transFinishTime) {
		this.transFinishTime = transFinishTime;
	}

	public String getTransTime() {
		return this.transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

}
