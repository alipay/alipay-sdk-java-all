package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业工商年报信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:26
 */
public class ZmepAnnualReportInfo extends AlipayObject {

	private static final long serialVersionUID = 1688621762951769886L;

	/**
	 * 企业工商年报基本信息
	 */
	@ApiField("basic_info")
	private ZmepAnnualReportBasicInfo basicInfo;

	/**
	 * 对外投资信息
	 */
	@ApiField("invest_list")
	private ZmepAnnualReportInvestInfo investList;

	/**
	 * 发布日期
	 */
	@ApiField("public_date")
	private String publicDate;

	/**
	 * 报送年度
	 */
	@ApiField("report_year")
	private String reportYear;

	/**
	 * 股东及出资信息
	 */
	@ApiListField("shareholder_list")
	@ApiField("zmep_annual_report_shareholder_info")
	private List<ZmepAnnualReportShareholderInfo> shareholderList;

	/**
	 * 企业工商年报网站信息
	 */
	@ApiListField("website_list")
	@ApiField("zmep_annual_report_website_info")
	private List<ZmepAnnualReportWebsiteInfo> websiteList;

	public ZmepAnnualReportBasicInfo getBasicInfo() {
		return this.basicInfo;
	}
	public void setBasicInfo(ZmepAnnualReportBasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}

	public ZmepAnnualReportInvestInfo getInvestList() {
		return this.investList;
	}
	public void setInvestList(ZmepAnnualReportInvestInfo investList) {
		this.investList = investList;
	}

	public String getPublicDate() {
		return this.publicDate;
	}
	public void setPublicDate(String publicDate) {
		this.publicDate = publicDate;
	}

	public String getReportYear() {
		return this.reportYear;
	}
	public void setReportYear(String reportYear) {
		this.reportYear = reportYear;
	}

	public List<ZmepAnnualReportShareholderInfo> getShareholderList() {
		return this.shareholderList;
	}
	public void setShareholderList(List<ZmepAnnualReportShareholderInfo> shareholderList) {
		this.shareholderList = shareholderList;
	}

	public List<ZmepAnnualReportWebsiteInfo> getWebsiteList() {
		return this.websiteList;
	}
	public void setWebsiteList(List<ZmepAnnualReportWebsiteInfo> websiteList) {
		this.websiteList = websiteList;
	}

}
