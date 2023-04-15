package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务工单详情数据信息
 *
 * @author auto create
 * @since 1.0, 2021-11-04 10:06:40
 */
public class SearchOrderDetailDataServiceItems extends AlipayObject {

	private static final long serialVersionUID = 8346417187529595135L;

	/**
	 * 服务工单详情area_codes
	 */
	@ApiField("area_codes")
	private String areaCodes;

	/**
	 * carrier_code
	 */
	@ApiField("carrier_code")
	private String carrierCode;

	/**
	 * 服务工单数据carrier_list
	 */
	@ApiField("carrier_list")
	private String carrierList;

	/**
	 * 服务工单category_attribute_value
	 */
	@ApiField("category_attribute_value")
	private String categoryAttributeValue;

	/**
	 * 类目id
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 类目id
	 */
	@ApiField("category_ids")
	private String categoryIds;

	/**
	 * 渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * img地址
	 */
	@ApiField("img")
	private String img;

	/**
	 * 关键词
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 关键词列表
	 */
	@ApiField("key_word_list")
	private String keyWordList;

	/**
	 * logo图片地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 应用名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务编码
	 */
	@ApiField("parent_service_code")
	private String parentServiceCode;

	/**
	 * 服务工单详情region
	 */
	@ApiField("region")
	private String region;

	/**
	 * serv_search_catalogs
	 */
	@ApiField("serv_search_catalogs")
	private String servSearchCatalogs;

	/**
	 * 关键词
	 */
	@ApiField("serv_search_keywords")
	private String servSearchKeywords;

	/**
	 * 2020112321000021082348
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务结束时间
	 */
	@ApiField("service_time_end")
	private String serviceTimeEnd;

	/**
	 * 服务开始时间
	 */
	@ApiField("service_time_start")
	private String serviceTimeStart;

	/**
	 * 服务短描述
	 */
	@ApiField("short_desc")
	private String shortDesc;

	/**
	 * 应用标识
	 */
	@ApiField("spec_code")
	private String specCode;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAreaCodes() {
		return this.areaCodes;
	}
	public void setAreaCodes(String areaCodes) {
		this.areaCodes = areaCodes;
	}

	public String getCarrierCode() {
		return this.carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getCarrierList() {
		return this.carrierList;
	}
	public void setCarrierList(String carrierList) {
		this.carrierList = carrierList;
	}

	public String getCategoryAttributeValue() {
		return this.categoryAttributeValue;
	}
	public void setCategoryAttributeValue(String categoryAttributeValue) {
		this.categoryAttributeValue = categoryAttributeValue;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryIds() {
		return this.categoryIds;
	}
	public void setCategoryIds(String categoryIds) {
		this.categoryIds = categoryIds;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImg() {
		return this.img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getKeyWordList() {
		return this.keyWordList;
	}
	public void setKeyWordList(String keyWordList) {
		this.keyWordList = keyWordList;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentServiceCode() {
		return this.parentServiceCode;
	}
	public void setParentServiceCode(String parentServiceCode) {
		this.parentServiceCode = parentServiceCode;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getServSearchCatalogs() {
		return this.servSearchCatalogs;
	}
	public void setServSearchCatalogs(String servSearchCatalogs) {
		this.servSearchCatalogs = servSearchCatalogs;
	}

	public String getServSearchKeywords() {
		return this.servSearchKeywords;
	}
	public void setServSearchKeywords(String servSearchKeywords) {
		this.servSearchKeywords = servSearchKeywords;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
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

	public String getShortDesc() {
		return this.shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
