package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应用内容服务创建
 *
 * @author auto create
 * @since 1.0, 2021-03-29 15:44:16
 */
public class AlipayOpenAppAppcontentFunctionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3859334622384736888L;

	/**
	 * 服务区域编码，默认值为 1，表示全国范围。
更多编码参考 <a href="https://lbs.amap.com/api/javascript-api/download/">高德地图 JS API 相关下载</a>中的行政区编码与城市编码表，填入表格中对应区域 adcode 内容即可。
	 */
	@ApiListField("area_codes")
	@ApiField("string")
	private List<String> areaCodes;

	/**
	 * 类目属性列表
	 */
	@ApiListField("category_attributes")
	@ApiField("app_attribute")
	private List<AppAttribute> categoryAttributes;

	/**
	 * 服务类目 ID。请填入 <a href="https://gw.alipayobjects.com/os/bmw-prod/7ac2b882-2e37-450c-a32e-0353e4f76178.xlsx">服务类目ID表</a> 中三级codeid。
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
	 * 关键字列表；关键词数量最多5个，每个关键词长度在5个字符以内
	 */
	@ApiListField("key_words")
	@ApiField("string")
	private List<String> keyWords;

	/**
	 * 服务名称；长度范围在2到10个字符以内
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
	 * 短描述；长度范围在5到16个字符以内
	 */
	@ApiField("short_desc")
	private String shortDesc;

	public List<String> getAreaCodes() {
		return this.areaCodes;
	}
	public void setAreaCodes(List<String> areaCodes) {
		this.areaCodes = areaCodes;
	}

	public List<AppAttribute> getCategoryAttributes() {
		return this.categoryAttributes;
	}
	public void setCategoryAttributes(List<AppAttribute> categoryAttributes) {
		this.categoryAttributes = categoryAttributes;
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
