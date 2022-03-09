package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基础工单详情数据信息
 *
 * @author auto create
 * @since 1.0, 2021-11-04 10:06:40
 */
public class SearchOrderDetailDataBaseItems extends AlipayObject {

	private static final long serialVersionUID = 3659949242695863925L;

	/**
	 * 搜索可见性
	 */
	@ApiField("can_search")
	private String canSearch;

	/**
	 * 描述信息
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
	 * 应用名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 基础工单详情region
	 */
	@ApiField("region")
	private String region;

	/**
	 * 搜索可见性
	 */
	@ApiField("serv_can_search")
	private String servCanSearch;

	/**
	 * 搜索关键词
	 */
	@ApiField("serv_search_keywords")
	private String servSearchKeywords;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 跳转url链接
	 */
	@ApiField("url")
	private String url;

	public String getCanSearch() {
		return this.canSearch;
	}
	public void setCanSearch(String canSearch) {
		this.canSearch = canSearch;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getServCanSearch() {
		return this.servCanSearch;
	}
	public void setServCanSearch(String servCanSearch) {
		this.servCanSearch = servCanSearch;
	}

	public String getServSearchKeywords() {
		return this.servSearchKeywords;
	}
	public void setServSearchKeywords(String servSearchKeywords) {
		this.servSearchKeywords = servSearchKeywords;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
