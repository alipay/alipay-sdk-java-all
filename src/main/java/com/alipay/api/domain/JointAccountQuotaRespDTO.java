package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共同账户额度模型
 *
 * @author auto create
 * @since 1.0, 2021-01-25 21:13:32
 */
public class JointAccountQuotaRespDTO extends AlipayObject {

	private static final long serialVersionUID = 3532547165284822821L;

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
	 * 协议额度
	 */
	@ApiField("quota_total")
	private String quotaTotal;

	/**
	 * 已用额度
	 */
	@ApiField("quota_used")
	private String quotaUsed;

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
