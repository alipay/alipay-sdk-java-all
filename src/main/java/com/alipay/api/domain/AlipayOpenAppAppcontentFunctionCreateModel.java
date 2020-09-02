package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应用内容服务创建
 *
 * @author auto create
 * @since 1.0, 2020-07-15 13:06:04
 */
public class AlipayOpenAppAppcontentFunctionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8828521683743617375L;

	/**
	 * 服务区域编码；默认值为1，表示全国范围；编码参考高德地图JS API相关下载中的行政区编码与城市编码表：https://lbs.amap.com/api/javascript-api/download/
	 */
	@ApiListField("area_codes")
	@ApiField("string")
	private List<String> areaCodes;

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
	 * 服务地址列表
	 */
	@ApiListField("service_urls")
	@ApiField("service_url")
	private List<ServiceUrl> serviceUrls;

	/**
	 * 短描述
	 */
	@ApiField("short_desc")
	private String shortDesc;

	public List<String> getAreaCodes() {
		return this.areaCodes;
	}
	public void setAreaCodes(List<String> areaCodes) {
		this.areaCodes = areaCodes;
	}

	public List<String> getCategoryIds() {
		return this.categoryIds;
	}
	public void setCategoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<String> getKeyWords() {
		return this.keyWords;
	}
	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceTimeEnd() {
		return this.serviceTimeEnd;
	}
	public void setServiceTimeEnd(String serviceTimeEnd) {
		this.serviceTimeEnd = serviceTimeEnd;
	}

	public String getServiceTimeStart() {
		return this.serviceTimeStart;
	}
	public void setServiceTimeStart(String serviceTimeStart) {
		this.serviceTimeStart = serviceTimeStart;
	}

	public List<ServiceUrl> getServiceUrls() {
		return this.serviceUrls;
	}
	public void setServiceUrls(List<ServiceUrl> serviceUrls) {
		this.serviceUrls = serviceUrls;
	}

	public String getShortDesc() {
		return this.shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

}
