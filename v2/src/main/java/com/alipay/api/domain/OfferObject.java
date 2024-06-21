package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Offer导入的数据结构
 *
 * @author auto create
 * @since 1.0, 2018-05-17 21:31:50
 */
public class OfferObject extends AlipayObject {

	private static final long serialVersionUID = 4588398745615865742L;

	/**
	 * 服务编码
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 分类编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 展台ID，这个是唯一主键，这个最重要，作为我方的source_offer_id存在表里，而且是唯一的
	 */
	@ApiField("displayapp_id")
	private String displayappId;

	/**
	 * 展台操作备注
	 */
	@ApiField("displayapp_memo")
	private String displayappMemo;

	/**
	 * 展台名称
	 */
	@ApiField("displayapp_name")
	private String displayappName;

	/**
	 * 状态
	 */
	@ApiField("displayapp_status")
	private String displayappStatus;

	/**
	 * URL
	 */
	@ApiField("displayapp_url")
	private String displayappUrl;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 图片地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 实际的URL
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDisplayappId() {
		return this.displayappId;
	}
	public void setDisplayappId(String displayappId) {
		this.displayappId = displayappId;
	}

	public String getDisplayappMemo() {
		return this.displayappMemo;
	}
	public void setDisplayappMemo(String displayappMemo) {
		this.displayappMemo = displayappMemo;
	}

	public String getDisplayappName() {
		return this.displayappName;
	}
	public void setDisplayappName(String displayappName) {
		this.displayappName = displayappName;
	}

	public String getDisplayappStatus() {
		return this.displayappStatus;
	}
	public void setDisplayappStatus(String displayappStatus) {
		this.displayappStatus = displayappStatus;
	}

	public String getDisplayappUrl() {
		return this.displayappUrl;
	}
	public void setDisplayappUrl(String displayappUrl) {
		this.displayappUrl = displayappUrl;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}
