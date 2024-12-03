package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序版本查询
 *
 * @author auto create
 * @since 1.0, 2022-08-02 13:58:41
 */
public class AlipayOpenMiniInnerversionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2221197656455387787L;

	/**
	 * 淘宝
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 多个端集合
	 */
	@ApiListField("bundle_ids")
	@ApiField("string")
	private List<String> bundleIds;

	/**
	 * 排序字段
	 */
	@ApiField("first_sort_col")
	private String firstSortCol;

	/**
	 * 排序
	 */
	@ApiField("first_sort_col_order")
	private String firstSortColOrder;

	/**
	 * 组合状态
	 */
	@ApiListField("group_status_list")
	@ApiField("string")
	private List<String> groupStatusList;

	/**
	 * 租户类型
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序ID列表
	 */
	@ApiListField("mini_app_id_list")
	@ApiField("string")
	private List<String> miniAppIdList;

	/**
	 * 页数-从0开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，最大20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 版本列表
	 */
	@ApiListField("version_list")
	@ApiField("string")
	private List<String> versionList;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public List<String> getBundleIds() {
		return this.bundleIds;
	}
	public void setBundleIds(List<String> bundleIds) {
		this.bundleIds = bundleIds;
	}

	public String getFirstSortCol() {
		return this.firstSortCol;
	}
	public void setFirstSortCol(String firstSortCol) {
		this.firstSortCol = firstSortCol;
	}

	public String getFirstSortColOrder() {
		return this.firstSortColOrder;
	}
	public void setFirstSortColOrder(String firstSortColOrder) {
		this.firstSortColOrder = firstSortColOrder;
	}

	public List<String> getGroupStatusList() {
		return this.groupStatusList;
	}
	public void setGroupStatusList(List<String> groupStatusList) {
		this.groupStatusList = groupStatusList;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public List<String> getMiniAppIdList() {
		return this.miniAppIdList;
	}
	public void setMiniAppIdList(List<String> miniAppIdList) {
		this.miniAppIdList = miniAppIdList;
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

	public List<String> getVersionList() {
		return this.versionList;
	}
	public void setVersionList(List<String> versionList) {
		this.versionList = versionList;
	}

}
