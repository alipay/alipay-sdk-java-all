package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下拉新结算汇总数据模型
 *
 * @author auto create
 * @since 1.0, 2019-01-24 14:32:33
 */
public class OfflineInviteNewerSummaryInfo extends AlipayObject {

	private static final long serialVersionUID = 2526816994185939539L;

	/**
	 * 返佣扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 二级渠道
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 一级渠道
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 结算日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 绑卡数量
	 */
	@ApiField("user_bind_card_count")
	private Long userBindCardCount;

	/**
	 * 可结算的绑卡数量
	 */
	@ApiField("user_bind_card_settle_count")
	private Long userBindCardSettleCount;

	/**
	 * 实名用户数
	 */
	@ApiField("user_cert_count")
	private Long userCertCount;

	/**
	 * 可结算实名用户数
	 */
	@ApiField("user_cert_settle_count")
	private Long userCertSettleCount;

	/**
	 * 权益核销用户数
	 */
	@ApiField("user_consume_count")
	private Long userConsumeCount;

	/**
	 * 可结算核销用户数
	 */
	@ApiField("user_consume_settle_count")
	private Long userConsumeSettleCount;

	/**
	 * 权益领取用户数
	 */
	@ApiField("user_prize_count")
	private Long userPrizeCount;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public Long getUserBindCardCount() {
		return this.userBindCardCount;
	}
	public void setUserBindCardCount(Long userBindCardCount) {
		this.userBindCardCount = userBindCardCount;
	}

	public Long getUserBindCardSettleCount() {
		return this.userBindCardSettleCount;
	}
	public void setUserBindCardSettleCount(Long userBindCardSettleCount) {
		this.userBindCardSettleCount = userBindCardSettleCount;
	}

	public Long getUserCertCount() {
		return this.userCertCount;
	}
	public void setUserCertCount(Long userCertCount) {
		this.userCertCount = userCertCount;
	}

	public Long getUserCertSettleCount() {
		return this.userCertSettleCount;
	}
	public void setUserCertSettleCount(Long userCertSettleCount) {
		this.userCertSettleCount = userCertSettleCount;
	}

	public Long getUserConsumeCount() {
		return this.userConsumeCount;
	}
	public void setUserConsumeCount(Long userConsumeCount) {
		this.userConsumeCount = userConsumeCount;
	}

	public Long getUserConsumeSettleCount() {
		return this.userConsumeSettleCount;
	}
	public void setUserConsumeSettleCount(Long userConsumeSettleCount) {
		this.userConsumeSettleCount = userConsumeSettleCount;
	}

	public Long getUserPrizeCount() {
		return this.userPrizeCount;
	}
	public void setUserPrizeCount(Long userPrizeCount) {
		this.userPrizeCount = userPrizeCount;
	}

}
