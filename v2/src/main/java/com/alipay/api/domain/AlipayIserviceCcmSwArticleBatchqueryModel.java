package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识库-问答-查询
 *
 * @author auto create
 * @since 1.0, 2022-10-26 14:35:14
 */
public class AlipayIserviceCcmSwArticleBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7121216475986954984L;

	/**
	 * 所属类目ID，如果search_all_category为true则不用填
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 结束时间，并且开始时间不能为空
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 文章ID集合
	 */
	@ApiListField("ids")
	@ApiField("number")
	private List<Long> ids;

	/**
	 * 关键字
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 标签
	 */
	@ApiListField("keywords")
	@ApiField("string")
	private List<String> keywords;

	/**
	 * 知识库ID
	 */
	@ApiField("library_id")
	private Long libraryId;

	/**
	 * 页数，page_size不能为空
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小，page_num不能为空
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 是否搜索所有类目，如果为true则不用填写category_id值
	 */
	@ApiField("search_all_category")
	private Boolean searchAllCategory;

	/**
	 * Current（搜索当前节点）；
Children（搜索当前节点以及子节点）
	 */
	@ApiField("search_category_type")
	private String searchCategoryType;

	/**
	 * 开始时间，并且结束时间不能为空
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 状态，PUBLISHED（已发布），UNPUBLISH（未发布），EXPIRED（失效），DELETED（已删除）
	 */
	@ApiField("status")
	private String status;

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<Long> getIds() {
		return this.ids;
	}
	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<String> getKeywords() {
		return this.keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public Long getLibraryId() {
		return this.libraryId;
	}
	public void setLibraryId(Long libraryId) {
		this.libraryId = libraryId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getSearchAllCategory() {
		return this.searchAllCategory;
	}
	public void setSearchAllCategory(Boolean searchAllCategory) {
		this.searchAllCategory = searchAllCategory;
	}

	public String getSearchCategoryType() {
		return this.searchCategoryType;
	}
	public void setSearchCategoryType(String searchCategoryType) {
		this.searchCategoryType = searchCategoryType;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
