package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业商标查询明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 11:28:16
 */
public class EpTrademarkInfo extends AlipayObject {

	private static final long serialVersionUID = 6471165267235855837L;

	/**
	 * 申请人地址中文
	 */
	@ApiField("address_cn")
	private String addressCn;

	/**
	 * 代理/办理机构
	 */
	@ApiField("agent")
	private String agent;

	/**
	 * 初审公告日期
	 */
	@ApiField("announcement_date")
	private String announcementDate;

	/**
	 * 初审公告期号
	 */
	@ApiField("announcement_issue")
	private String announcementIssue;

	/**
	 * 申请日期
	 */
	@ApiField("app_date")
	private String appDate;

	/**
	 * 申请人名称中文
	 */
	@ApiField("applicant_cn")
	private String applicantCn;

	/**
	 * 商标类型
	 */
	@ApiField("category")
	private String category;

	/**
	 * 国际分类
	 */
	@ApiField("intl_cls")
	private String intlCls;

	/**
	 * 是否共有商标
	 */
	@ApiField("jointly_owned_trademark")
	private Boolean jointlyOwnedTrademark;

	/**
	 * 商标名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 专有权期限结束日期
	 */
	@ApiField("private_date_end")
	private String privateDateEnd;

	/**
	 * 专有权期限开始日期
	 */
	@ApiField("private_date_start")
	private String privateDateStart;

	/**
	 * 注册公告日期
	 */
	@ApiField("reg_date")
	private String regDate;

	/**
	 * 注册公告期号
	 */
	@ApiField("reg_issue")
	private String regIssue;

	/**
	 * 申请或注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 商品/服务项目
	 */
	@ApiListField("second_class_code")
	@ApiField("ep_trademark_second_class_code_info")
	private List<EpTrademarkSecondClassCodeInfo> secondClassCode;

	/**
	 * 商标状态
	 */
	@ApiField("status")
	private String status;

	public String getAddressCn() {
		return this.addressCn;
	}
	public void setAddressCn(String addressCn) {
		this.addressCn = addressCn;
	}

	public String getAgent() {
		return this.agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getAnnouncementDate() {
		return this.announcementDate;
	}
	public void setAnnouncementDate(String announcementDate) {
		this.announcementDate = announcementDate;
	}

	public String getAnnouncementIssue() {
		return this.announcementIssue;
	}
	public void setAnnouncementIssue(String announcementIssue) {
		this.announcementIssue = announcementIssue;
	}

	public String getAppDate() {
		return this.appDate;
	}
	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public String getApplicantCn() {
		return this.applicantCn;
	}
	public void setApplicantCn(String applicantCn) {
		this.applicantCn = applicantCn;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getIntlCls() {
		return this.intlCls;
	}
	public void setIntlCls(String intlCls) {
		this.intlCls = intlCls;
	}

	public Boolean getJointlyOwnedTrademark() {
		return this.jointlyOwnedTrademark;
	}
	public void setJointlyOwnedTrademark(Boolean jointlyOwnedTrademark) {
		this.jointlyOwnedTrademark = jointlyOwnedTrademark;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrivateDateEnd() {
		return this.privateDateEnd;
	}
	public void setPrivateDateEnd(String privateDateEnd) {
		this.privateDateEnd = privateDateEnd;
	}

	public String getPrivateDateStart() {
		return this.privateDateStart;
	}
	public void setPrivateDateStart(String privateDateStart) {
		this.privateDateStart = privateDateStart;
	}

	public String getRegDate() {
		return this.regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getRegIssue() {
		return this.regIssue;
	}
	public void setRegIssue(String regIssue) {
		this.regIssue = regIssue;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public List<EpTrademarkSecondClassCodeInfo> getSecondClassCode() {
		return this.secondClassCode;
	}
	public void setSecondClassCode(List<EpTrademarkSecondClassCodeInfo> secondClassCode) {
		this.secondClassCode = secondClassCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
