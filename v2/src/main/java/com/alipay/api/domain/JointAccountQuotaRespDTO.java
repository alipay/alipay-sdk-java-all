package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共同账户额度模型
 *
 * @author auto create
 * @since 1.0, 2023-02-07 10:10:36
 */
public class JointAccountQuotaRespDTO extends AlipayObject {

	private static final long serialVersionUID = 8753254615196225994L;

	/**
	 * 额度生效起始日期，精确到分钟。
格式：yyyy-MM-dd HH:mm
	 */
	@ApiField("custom_begin_date")
	private String customBeginDate;

	/**
	 * 额度失效结束日期，精确到分钟。
格式：yyyy-MM-dd HH:mm
	 */
	@ApiField("custom_end_date")
	private String customEndDate;

	/**
	 * 额度维度
	 */
	@ApiField("quota_dimension")
	private String quotaDimension;

	/**
	 * 剩余额度
	 */
	@ApiField("quota_remain")
	private String quotaRemain;

	/**
	 * 展示额度剩余可用次数，-1表示无限次
	 */
	@ApiField("quota_remain_count")
	private String quotaRemainCount;

	/**
	 * 协议额度
	 */
	@ApiField("quota_total")
	private String quotaTotal;

	/**
	 * 已用额度
	 */
	@ApiField("quota_used")
	private String quotaUsed;

	public String getCustomBeginDate() {
		return this.customBeginDate;
	}
	public void setCustomBeginDate(String customBeginDate) {
		this.customBeginDate = customBeginDate;
	}

	public String getCustomEndDate() {
		return this.customEndDate;
	}
	public void setCustomEndDate(String customEndDate) {
		this.customEndDate = customEndDate;
	}

	public String getQuotaDimension() {
		return this.quotaDimension;
	}
	public void setQuotaDimension(String quotaDimension) {
		this.quotaDimension = quotaDimension;
	}

	public String getQuotaRemain() {
		return this.quotaRemain;
	}
	public void setQuotaRemain(String quotaRemain) {
		this.quotaRemain = quotaRemain;
	}

	public String getQuotaRemainCount() {
		return this.quotaRemainCount;
	}
	public void setQuotaRemainCount(String quotaRemainCount) {
		this.quotaRemainCount = quotaRemainCount;
	}

	public String getQuotaTotal() {
		return this.quotaTotal;
	}
	public void setQuotaTotal(String quotaTotal) {
		this.quotaTotal = quotaTotal;
	}

	public String getQuotaUsed() {
		return this.quotaUsed;
	}
	public void setQuotaUsed(String quotaUsed) {
		this.quotaUsed = quotaUsed;
	}

}
