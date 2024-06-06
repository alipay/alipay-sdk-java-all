package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产负债报表数据
 *
 * @author auto create
 * @since 1.0, 2018-08-24 10:54:36
 */
public class AlmReportData extends AlipayObject {

	private static final long serialVersionUID = 3553414565952427978L;

	/**
	 * 数据大类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 期限类别
	 */
	@ApiField("date_type")
	private String dateType;

	/**
	 * 数据日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 报表名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报表数据，只支持整数（可为负），详细见下面描述。
金额单位：分，1万即传 1000000
百分比：乘以1万后的值。例如：50%，则提供 0.5*10000即：5000
偏离度bp：bp*1万提供。例如：30.5bp，提供值：305000
	 */
	@ApiField("report_value")
	private Long reportValue;

	/**
	 * 报表小类
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDateType() {
		return this.dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getReportName() {
		return this.reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public Long getReportValue() {
		return this.reportValue;
	}
	public void setReportValue(Long reportValue) {
		this.reportValue = reportValue;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
