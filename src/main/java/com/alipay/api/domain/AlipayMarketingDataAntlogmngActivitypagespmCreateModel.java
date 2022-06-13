package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凤蝶H5应用申请SPM
 *
 * @author auto create
 * @since 1.0, 2021-01-06 16:28:25
 */
public class AlipayMarketingDataAntlogmngActivitypagespmCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7749152461123748466L;

	/**
	 * 活动Id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 负责人的工号
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * spma位
	 */
	@ApiField("spma")
	private String spma;

	/**
	 * 页面的spmb值code
	 */
	@ApiField("spmb")
	private String spmb;

	/**
	 * 名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 凤蝶页面的url
	 */
	@ApiField("url")
	private String url;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSpma() {
		return this.spma;
	}
	public void setSpma(String spma) {
		this.spma = spma;
	}

	public String getSpmb() {
		return this.spmb;
	}
	public void setSpmb(String spmb) {
		this.spmb = spmb;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
