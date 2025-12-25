package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用服务订阅接口
 *
 * @author auto create
 * @since 1.0, 2025-12-16 10:25:45
 */
public class ZhimaCreditEpPackSubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 8762112175366795261L;

	/**
	 * 合作方用户编号
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 订阅结束时间。格式yyyy-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 套餐类别
	 */
	@ApiField("pack_type")
	private String packType;

	/**
	 * 订阅额度。单位个、次
	 */
	@ApiField("quota")
	private Long quota;

	/**
	 * 订阅价格
	 */
	@ApiField("report_amount")
	private String reportAmount;

	/**
	 * 订阅开始时间。格式yyyy-MM-dd
	 */
	@ApiField("start_date")
	private String startDate;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPackType() {
		return this.packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}

	public Long getQuota() {
		return this.quota;
	}
	public void setQuota(Long quota) {
		this.quota = quota;
	}

	public String getReportAmount() {
		return this.reportAmount;
	}
	public void setReportAmount(String reportAmount) {
		this.reportAmount = reportAmount;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
