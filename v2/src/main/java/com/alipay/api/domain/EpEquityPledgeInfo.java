package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业股权出质明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:28:14
 */
public class EpEquityPledgeInfo extends AlipayObject {

	private static final long serialVersionUID = 7582459675257692269L;

	/**
	 * 企业股权出质标的
	 */
	@ApiField("czbd")
	private String czbd;

	/**
	 * 出质股权数额，单位万元
	 */
	@ApiField("czgqe")
	private String czgqe;

	/**
	 * 出质人
	 */
	@ApiField("czr")
	private String czr;

	/**
	 * 登记日期
	 */
	@ApiField("dj_time")
	private String djTime;

	/**
	 * 登记编号
	 */
	@ApiField("djbh")
	private String djbh;

	/**
	 * 发布时间
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 质权人
	 */
	@ApiField("zqr")
	private String zqr;

	public String getCzbd() {
		return this.czbd;
	}
	public void setCzbd(String czbd) {
		this.czbd = czbd;
	}

	public String getCzgqe() {
		return this.czgqe;
	}
	public void setCzgqe(String czgqe) {
		this.czgqe = czgqe;
	}

	public String getCzr() {
		return this.czr;
	}
	public void setCzr(String czr) {
		this.czr = czr;
	}

	public String getDjTime() {
		return this.djTime;
	}
	public void setDjTime(String djTime) {
		this.djTime = djTime;
	}

	public String getDjbh() {
		return this.djbh;
	}
	public void setDjbh(String djbh) {
		this.djbh = djbh;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getZqr() {
		return this.zqr;
	}
	public void setZqr(String zqr) {
		this.zqr = zqr;
	}

}
