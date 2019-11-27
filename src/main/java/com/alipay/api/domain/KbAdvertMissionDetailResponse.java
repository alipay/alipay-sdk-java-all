package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分佣任务详情信息
 *
 * @author auto create
 * @since 1.0, 2017-07-05 16:26:34
 */
public class KbAdvertMissionDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 7568791173276481721L;

	/**
	 * 分佣条款信息
	 */
	@ApiField("commission_clause")
	private KbAdvertCommissionClauseDetailResponse commissionClause;

	/**
	 * 任务领取时间
	 */
	@ApiField("gmt_claimed")
	private String gmtClaimed;

	/**
	 * 任务结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 任务开始时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 任务ID
	 */
	@ApiField("mission_id")
	private String missionId;

	/**
	 * 推广状态
EFFECTIVE-有效
INVALID-无效
	 */
	@ApiField("promote_status")
	private String promoteStatus;

	/**
	 * 标的类型
voucher-券
	 */
	@ApiField("subject_type")
	private String subjectType;

	/**
	 * 券信息
	 */
	@ApiField("voucher")
	private KbAdvertSubjectVoucherDetailResponse voucher;

	public KbAdvertCommissionClauseDetailResponse getCommissionClause() {
		return this.commissionClause;
	}
	public void setCommissionClause(KbAdvertCommissionClauseDetailResponse commissionClause) {
		this.commissionClause = commissionClause;
	}

	public String getGmtClaimed() {
		return this.gmtClaimed;
	}
	public void setGmtClaimed(String gmtClaimed) {
		this.gmtClaimed = gmtClaimed;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getMissionId() {
		return this.missionId;
	}
	public void setMissionId(String missionId) {
		this.missionId = missionId;
	}

	public String getPromoteStatus() {
		return this.promoteStatus;
	}
	public void setPromoteStatus(String promoteStatus) {
		this.promoteStatus = promoteStatus;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public KbAdvertSubjectVoucherDetailResponse getVoucher() {
		return this.voucher;
	}
	public void setVoucher(KbAdvertSubjectVoucherDetailResponse voucher) {
		this.voucher = voucher;
	}

}
