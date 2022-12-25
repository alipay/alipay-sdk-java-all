package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码支付页面数据录入
 *
 * @author auto create
 * @since 1.0, 2021-10-14 15:52:47
 */
public class AlipayCommerceEducateTuitioncodePagedataSendModel extends AlipayObject {

	private static final long serialVersionUID = 5657299561984371199L;

	/**
	 * 商户名称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 结课月份
	 */
	@ApiField("course_end_month")
	private String courseEndMonth;

	/**
	 * 课程名称
	 */
	@ApiField("course_name")
	private String courseName;

	/**
	 * 开课月份。开课月份必须早于结课月份，课程最大跨度时间为12个月
	 */
	@ApiField("course_start_month")
	private String courseStartMonth;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 学费码创单扩展参数
	 */
	@ApiField("ext_param")
	private TuitionOrderExtendParam extParam;

	/**
	 * 商户logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 外部业务编号。课程类信息传递课程编号，用于计算订单的打款规则
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付金额，格式为0.00
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 打款周期数。如果某个业务的打款周期由交易数据指定，而非业务的固定统一，则该字段必传
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 课程周期类型,固定写MONTH
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 商户smid，间联必传
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 学员姓名
	 */
	@ApiField("user_display_name")
	private String userDisplayName;

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getCourseEndMonth() {
		return this.courseEndMonth;
	}
	public void setCourseEndMonth(String courseEndMonth) {
		this.courseEndMonth = courseEndMonth;
	}

	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseStartMonth() {
		return this.courseStartMonth;
	}
	public void setCourseStartMonth(String courseStartMonth) {
		this.courseStartMonth = courseStartMonth;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public TuitionOrderExtendParam getExtParam() {
		return this.extParam;
	}
	public void setExtParam(TuitionOrderExtendParam extParam) {
		this.extParam = extParam;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getUserDisplayName() {
		return this.userDisplayName;
	}
	public void setUserDisplayName(String userDisplayName) {
		this.userDisplayName = userDisplayName;
	}

}
