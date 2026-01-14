package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业行政许可明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:27:38
 */
public class EpAdminLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 8368428396462246388L;

	/**
	 * 当事人
	 */
	@ApiField("dsr")
	private String dsr;

	/**
	 * 发布时间
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 许可表格
	 */
	@ApiField("xkbg")
	private EpAdminLicensePermissionTableInfo xkbg;

	/**
	 * 许可机关
	 */
	@ApiField("xkjg")
	private String xkjg;

	/**
	 * 许可内容
	 */
	@ApiField("xknr")
	private String xknr;

	/**
	 * 许可事项名称
	 */
	@ApiField("xksxmc")
	private String xksxmc;

	public String getDsr() {
		return this.dsr;
	}
	public void setDsr(String dsr) {
		this.dsr = dsr;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public EpAdminLicensePermissionTableInfo getXkbg() {
		return this.xkbg;
	}
	public void setXkbg(EpAdminLicensePermissionTableInfo xkbg) {
		this.xkbg = xkbg;
	}

	public String getXkjg() {
		return this.xkjg;
	}
	public void setXkjg(String xkjg) {
		this.xkjg = xkjg;
	}

	public String getXknr() {
		return this.xknr;
	}
	public void setXknr(String xknr) {
		this.xknr = xknr;
	}

	public String getXksxmc() {
		return this.xksxmc;
	}
	public void setXksxmc(String xksxmc) {
		this.xksxmc = xksxmc;
	}

}
