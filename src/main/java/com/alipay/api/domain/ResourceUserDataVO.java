package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨端运营流量位用户画像数据
 *
 * @author auto create
 * @since 1.0, 2021-06-17 15:06:17
 */
public class ResourceUserDataVO extends AlipayObject {

	private static final long serialVersionUID = 5328436646851898845L;

	/**
	 * 用户画像的类别
	 */
	@ApiField("profile_type")
	private String profileType;

	/**
	 * 用户画像值
	 */
	@ApiField("profile_value")
	private String profileValue;

	/**
	 * 统计日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 用户数量，出于隐私考虑，该数据和实际数据有微小的差异，但是不影响总体数据准确度。
	 */
	@ApiField("user_cnt")
	private Long userCnt;

	/**
	 * 用户占比。出于隐私考虑，该数据和实际数据有微小的差异，但是不影响总体数据准确度。
	 */
	@ApiField("user_ratio")
	private String userRatio;

	public String getProfileType() {
		return this.profileType;
	}
	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public String getProfileValue() {
		return this.profileValue;
	}
	public void setProfileValue(String profileValue) {
		this.profileValue = profileValue;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public Long getUserCnt() {
		return this.userCnt;
	}
	public void setUserCnt(Long userCnt) {
		this.userCnt = userCnt;
	}

	public String getUserRatio() {
		return this.userRatio;
	}
	public void setUserRatio(String userRatio) {
		this.userRatio = userRatio;
	}

}
