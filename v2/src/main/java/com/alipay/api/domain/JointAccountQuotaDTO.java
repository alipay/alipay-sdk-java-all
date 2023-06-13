package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度模型
 *
 * @author auto create
 * @since 1.0, 2022-11-30 16:35:54
 */
public class JointAccountQuotaDTO extends AlipayObject {

	private static final long serialVersionUID = 2297178486151122445L;

	/**
	 * 自定义周期起始日期，精确到分钟，yyyy-MM-dd HH:mm
	 */
	@ApiField("custom_begin_date")
	private String customBeginDate;

	/**
	 * 自定义周期结束日期，精确到分钟，yyyy-MM-dd HH:mm
	 */
	@ApiField("custom_end_date")
	private String customEndDate;

	/**
	 * 额度维度
单笔上限：ONCE
日：DAY
月：MONTH
季度：QUARTER
年：YEAR
终身：LIFETIME
一次性使用额度：ONLYONE
	 */
	@ApiField("quota_dimension")
	private String quotaDimension;

	/**
	 * 协议额度
	 */
	@ApiField("quota_total")
	private String quotaTotal;

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

	public String getQuotaTotal() {
		return this.quotaTotal;
	}
	public void setQuotaTotal(String quotaTotal) {
		this.quotaTotal = quotaTotal;
	}

}
