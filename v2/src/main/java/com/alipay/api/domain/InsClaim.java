package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 赔案
 *
 * @author auto create
 * @since 1.0, 2022-03-28 17:20:21
 */
public class InsClaim extends AlipayObject {

	private static final long serialVersionUID = 6891822999399462148L;

	/**
	 * 理赔因子;标准json 格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 实际赔付金额 ;单位分
	 */
	@ApiField("claim_fee")
	private Long claimFee;

	/**
	 * 赔案号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 赔付时间
	 */
	@ApiField("claim_pay_time")
	private Date claimPayTime;

	/**
	 * 赔案进度;根据更新时间倒序
	 */
	@ApiListField("claim_progress")
	@ApiField("claim_progress")
	private List<ClaimProgress> claimProgress;

	/**
	 * 赔案状态.ACCEPTED:已受理;REJECTED:已拒赔;PAID:已赔付
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 商户生成的外部理赔请求单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 当状态是拒赔时给出拒赔原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public Long getClaimFee() {
		return this.claimFee;
	}
	public void setClaimFee(Long claimFee) {
		this.claimFee = claimFee;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public Date getClaimPayTime() {
		return this.claimPayTime;
	}
	public void setClaimPayTime(Date claimPayTime) {
		this.claimPayTime = claimPayTime;
	}

	public List<ClaimProgress> getClaimProgress() {
		return this.claimProgress;
	}
	public void setClaimProgress(List<ClaimProgress> claimProgress) {
		this.claimProgress = claimProgress;
	}

	public String getClaimStatus() {
		return this.claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
