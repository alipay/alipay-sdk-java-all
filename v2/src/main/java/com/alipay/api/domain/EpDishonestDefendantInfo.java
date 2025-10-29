package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业失信被执行人明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:26:47
 */
public class EpDishonestDefendantInfo extends AlipayObject {

	private static final long serialVersionUID = 4273554134946524589L;

	/**
	 * 被执行人的履行情况
	 */
	@ApiField("bzxrdlxqk")
	private String bzxrdlxqk;

	/**
	 * 案号
	 */
	@ApiField("case_no")
	private String caseNo;

	/**
	 * 立案时间
	 */
	@ApiField("case_register_date")
	private String caseRegisterDate;

	/**
	 * 执行法院
	 */
	@ApiField("execution_court")
	private String executionCourt;

	/**
	 * 法定代表人或者负责人姓名
	 */
	@ApiField("fddbr")
	private String fddbr;

	/**
	 * 发布时间
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 被执行人姓名/名称
	 */
	@ApiField("sxbzxrmc")
	private String sxbzxrmc;

	/**
	 * 失信被执行人行为具体情形
	 */
	@ApiField("sxbzxrxw")
	private String sxbzxrxw;

	/**
	 * 生效法律文书确定的义务
	 */
	@ApiField("sxflwsyw")
	private String sxflwsyw;

	/**
	 * 做出执行依据单位
	 */
	@ApiField("zczxyjdw")
	private String zczxyjdw;

	/**
	 * 执行依据文号
	 */
	@ApiField("zxyjwh")
	private String zxyjwh;

	public String getBzxrdlxqk() {
		return this.bzxrdlxqk;
	}
	public void setBzxrdlxqk(String bzxrdlxqk) {
		this.bzxrdlxqk = bzxrdlxqk;
	}

	public String getCaseNo() {
		return this.caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getCaseRegisterDate() {
		return this.caseRegisterDate;
	}
	public void setCaseRegisterDate(String caseRegisterDate) {
		this.caseRegisterDate = caseRegisterDate;
	}

	public String getExecutionCourt() {
		return this.executionCourt;
	}
	public void setExecutionCourt(String executionCourt) {
		this.executionCourt = executionCourt;
	}

	public String getFddbr() {
		return this.fddbr;
	}
	public void setFddbr(String fddbr) {
		this.fddbr = fddbr;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getSxbzxrmc() {
		return this.sxbzxrmc;
	}
	public void setSxbzxrmc(String sxbzxrmc) {
		this.sxbzxrmc = sxbzxrmc;
	}

	public String getSxbzxrxw() {
		return this.sxbzxrxw;
	}
	public void setSxbzxrxw(String sxbzxrxw) {
		this.sxbzxrxw = sxbzxrxw;
	}

	public String getSxflwsyw() {
		return this.sxflwsyw;
	}
	public void setSxflwsyw(String sxflwsyw) {
		this.sxflwsyw = sxflwsyw;
	}

	public String getZczxyjdw() {
		return this.zczxyjdw;
	}
	public void setZczxyjdw(String zczxyjdw) {
		this.zczxyjdw = zczxyjdw;
	}

	public String getZxyjwh() {
		return this.zxyjwh;
	}
	public void setZxyjwh(String zxyjwh) {
		this.zxyjwh = zxyjwh;
	}

}
