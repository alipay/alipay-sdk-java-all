package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单据创建
 *
 * @author auto create
 * @since 1.0, 2020-08-04 14:36:25
 */
public class AlipayPcreditHuabeiEnterpriseReimburseSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4176838635826814538L;

	/**
	 * 企业单据id
	 */
	@ApiField("biz_reimburse_id")
	private String bizReimburseId;

	/**
	 * 单据结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 单据开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 单据状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 若有途径城市，填写途径城市，没有填写单据名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizReimburseId() {
		return this.bizReimburseId;
	}
	public void setBizReimburseId(String bizReimburseId) {
		this.bizReimburseId = bizReimburseId;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
