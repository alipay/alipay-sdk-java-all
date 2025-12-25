package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 与客户建立联系的情况
 *
 * @author auto create
 * @since 1.0, 2025-11-14 15:56:03
 */
public class DecorationLeadsFeedbackContact extends AlipayObject {

	private static final long serialVersionUID = 3271355488165872413L;

	/**
	 * true客户电话可用；false客户电话不可用
	 */
	@ApiField("contact_result")
	private Boolean contactResult;

	/**
	 * 与客户建立联系的具体时间
	 */
	@ApiField("contact_time")
	private Date contactTime;

	/**
	 * true：客户可到店；false：客户暂不到店
	 */
	@ApiField("in_store")
	private Boolean inStore;

	/**
	 * true：客户有意向；false：客户暂无意向
	 */
	@ApiField("interest")
	private Boolean interest;

	public Boolean getContactResult() {
		return this.contactResult;
	}
	public void setContactResult(Boolean contactResult) {
		this.contactResult = contactResult;
	}

	public Date getContactTime() {
		return this.contactTime;
	}
	public void setContactTime(Date contactTime) {
		this.contactTime = contactTime;
	}

	public Boolean getInStore() {
		return this.inStore;
	}
	public void setInStore(Boolean inStore) {
		this.inStore = inStore;
	}

	public Boolean getInterest() {
		return this.interest;
	}
	public void setInterest(Boolean interest) {
		this.interest = interest;
	}

}
