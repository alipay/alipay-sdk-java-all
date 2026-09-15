package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-08 14:17:54
 */
public class MerchantJobInfo extends AlipayObject {

	private static final long serialVersionUID = 1766977144157557884L;

	/**
	 * 活跃商家标签【是/否】
	 */
	@ApiField("active_tag")
	private Boolean activeTag;

	/**
	 * 作业服务商名称
	 */
	@ApiField("job_group_name")
	private String jobGroupName;

	/**
	 * 作业商家门店名称
	 */
	@ApiField("leads_name")
	private String leadsName;

	/**
	 * 商户openId
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 作业小二姓名
	 */
	@ApiField("woker_name")
	private String wokerName;

	public Boolean getActiveTag() {
		return this.activeTag;
	}
	public void setActiveTag(Boolean activeTag) {
		this.activeTag = activeTag;
	}

	public String getJobGroupName() {
		return this.jobGroupName;
	}
	public void setJobGroupName(String jobGroupName) {
		this.jobGroupName = jobGroupName;
	}

	public String getLeadsName() {
		return this.leadsName;
	}
	public void setLeadsName(String leadsName) {
		this.leadsName = leadsName;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getWokerName() {
		return this.wokerName;
	}
	public void setWokerName(String wokerName) {
		this.wokerName = wokerName;
	}

}
