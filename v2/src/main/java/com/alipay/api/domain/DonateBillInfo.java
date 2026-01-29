package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝公益用户捐赠流水信息
 *
 * @author auto create
 * @since 1.0, 2024-09-13 13:32:09
 */
public class DonateBillInfo extends AlipayObject {

	private static final long serialVersionUID = 5223473149137392674L;

	/**
	 * 日期格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("donate_date")
	private Date donateDate;

	/**
	 * true 表示超过门槛，false表示没超过门槛
	 */
	@ApiField("donate_doorsill")
	private Boolean donateDoorsill;

	/**
	 * 用户捐赠支付宝公益项目的id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 用户捐赠支付宝公益项目的名称
	 */
	@ApiField("project_title")
	private String projectTitle;

	public Date getDonateDate() {
		return this.donateDate;
	}
	public void setDonateDate(Date donateDate) {
		this.donateDate = donateDate;
	}

	public Boolean getDonateDoorsill() {
		return this.donateDoorsill;
	}
	public void setDonateDoorsill(Boolean donateDoorsill) {
		this.donateDoorsill = donateDoorsill;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectTitle() {
		return this.projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

}
