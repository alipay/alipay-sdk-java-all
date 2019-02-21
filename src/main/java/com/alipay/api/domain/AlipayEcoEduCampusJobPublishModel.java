package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实习生职位刷新接口
 *
 * @author auto create
 * @since 1.0, 2017-06-01 14:55:55
 */
public class AlipayEcoEduCampusJobPublishModel extends AlipayObject {

	private static final long serialVersionUID = 3468314673838491112L;

	/**
	 * 过期时间(毫秒数)
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 刷新时间(毫秒数)
	 */
	@ApiField("gmt_refresh")
	private String gmtRefresh;

	/**
	 * 职位来源方编码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 职位在合作方的ID
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getGmtRefresh() {
		return this.gmtRefresh;
	}
	public void setGmtRefresh(String gmtRefresh) {
		this.gmtRefresh = gmtRefresh;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
