package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上拉新结算汇总数据模型
 *
 * @author auto create
 * @since 1.0, 2019-01-17 15:13:01
 */
public class OnlineInviteNewerSummaryInfo extends AlipayObject {

	private static final long serialVersionUID = 8476182744569435952L;

	/**
	 * 返佣的扩展字段
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
	 * 日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 当天有效绑卡数量
	 */
	@ApiField("user_bind_card_count")
	private Long userBindCardCount;

	/**
	 * 可结算实名数
	 */
	@ApiField("user_cert_settle_count")
	private Long userCertSettleCount;

	/**
	 * 可结算新登数
	 */
	@ApiField("user_new_settle_count")
	private Long userNewSettleCount;

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

	public Long getUserCertSettleCount() {
		return this.userCertSettleCount;
	}
	public void setUserCertSettleCount(Long userCertSettleCount) {
		this.userCertSettleCount = userCertSettleCount;
	}

	public Long getUserNewSettleCount() {
		return this.userNewSettleCount;
	}
	public void setUserNewSettleCount(Long userNewSettleCount) {
		this.userNewSettleCount = userNewSettleCount;
	}

}
