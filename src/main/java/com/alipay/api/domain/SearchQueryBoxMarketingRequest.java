package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动分页查询入参
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:02:06
 */
public class SearchQueryBoxMarketingRequest extends AlipayObject {

	private static final long serialVersionUID = 5671144776382489815L;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 是否模糊匹配
	 */
	@ApiField("fuzzy_matching")
	private Boolean fuzzyMatching;

	/**
	 * 工单id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 当前页
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页显示条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 用户id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 查询上一个版本
	 */
	@ApiField("query_last_version")
	private Boolean queryLastVersion;

	/**
	 * 查询关联服务的信息
	 */
	@ApiField("query_serv_info")
	private Boolean queryServInfo;

	/**
	 * 状态
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public Boolean getFuzzyMatching() {
		return this.fuzzyMatching;
	}
	public void setFuzzyMatching(Boolean fuzzyMatching) {
		this.fuzzyMatching = fuzzyMatching;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public Boolean getQueryLastVersion() {
		return this.queryLastVersion;
	}
	public void setQueryLastVersion(Boolean queryLastVersion) {
		this.queryLastVersion = queryLastVersion;
	}

	public Boolean getQueryServInfo() {
		return this.queryServInfo;
	}
	public void setQueryServInfo(Boolean queryServInfo) {
		this.queryServInfo = queryServInfo;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

}
