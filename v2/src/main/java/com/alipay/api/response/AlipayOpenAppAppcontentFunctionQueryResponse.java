package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppAttribute;
import com.alipay.api.domain.ServiceUrl;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.function.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:17:23
 */
public class AlipayOpenAppAppcontentFunctionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6379837246225862824L;

	/** 
	 * 服务区域编码；默认值为1，表示全国范围；编码参考高德地图JS API相关下载中的行政区编码与城市编码表：https://lbs.amap.com/api/javascript-api/download/
	 */
	@ApiListField("area_codes")
	@ApiField("string")
	private List<String> areaCodes;

	/** 
	 * 审核状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 类目属性列表
	 */
	@ApiListField("category_attributes")
	@ApiField("app_attribute")
	private List<AppAttribute> categoryAttributes;

	/** 
	 * 类目
	 */
	@ApiListField("category_ids")
	@ApiField("string")
	private List<String> categoryIds;

	/** 
	 * 服务icon
	 */
	@ApiField("icon")
	private String icon;

	/** 
	 * 关键字列表
	 */
	@ApiListField("key_words")
	@ApiField("string")
	private List<String> keyWords;

	/** 
	 * 服务主状态
	 */
	@ApiField("major_status")
	private String majorStatus;

	/** 
	 * 驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/** 
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/** 
	 * 服务结束时间；默认值：23:59:59
	 */
	@ApiField("service_time_end")
	private String serviceTimeEnd;

	/** 
	 * 服务开始时间；默认值：00:00:00
	 */
	@ApiField("service_time_start")
	private String serviceTimeStart;

	/** 
	 * 服务列表
	 */
	@ApiListField("service_urls")
	@ApiField("service_url")
	private List<ServiceUrl> serviceUrls;

	/** 
	 * 短描述
	 */
	@ApiField("short_desc")
	private String shortDesc;

	public void setAreaCodes(List<String> areaCodes) {
		this.areaCodes = areaCodes;
	}
	public List<String> getAreaCodes( ) {
		return this.areaCodes;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setCategoryAttributes(List<AppAttribute> categoryAttributes) {
		this.categoryAttributes = categoryAttributes;
	}
	public List<AppAttribute> getCategoryAttributes( ) {
		return this.categoryAttributes;
	}

	public void setCategoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
	}
	public List<String> getCategoryIds( ) {
		return this.categoryIds;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getIcon( ) {
		return this.icon;
	}

	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}
	public List<String> getKeyWords( ) {
		return this.keyWords;
	}

	public void setMajorStatus(String majorStatus) {
		this.majorStatus = majorStatus;
	}
	public String getMajorStatus( ) {
		return this.majorStatus;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceName( ) {
		return this.serviceName;
	}

	public void setServiceTimeEnd(String serviceTimeEnd) {
		this.serviceTimeEnd = serviceTimeEnd;
	}
	public String getServiceTimeEnd( ) {
		return this.serviceTimeEnd;
	}

	public void setServiceTimeStart(String serviceTimeStart) {
		this.serviceTimeStart = serviceTimeStart;
	}
	public String getServiceTimeStart( ) {
		return this.serviceTimeStart;
	}

	public void setServiceUrls(List<ServiceUrl> serviceUrls) {
		this.serviceUrls = serviceUrls;
	}
	public List<ServiceUrl> getServiceUrls( ) {
		return this.serviceUrls;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getShortDesc( ) {
		return this.shortDesc;
	}

}
