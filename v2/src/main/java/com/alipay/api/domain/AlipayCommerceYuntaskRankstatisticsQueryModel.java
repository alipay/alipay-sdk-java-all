package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云店排名数据统计查询
 *
 * @author auto create
 * @since 1.0, 2024-04-24 10:06:53
 */
public class AlipayCommerceYuntaskRankstatisticsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3696571763421597988L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 商家pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 页码，默认为1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 页面大小，默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 排名范围（公司/门店），只有当店员查看排名时需要指定
	 */
	@ApiField("rank_range")
	private String rankRange;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 排序方式
	 */
	@ApiField("sort_type")
	private String sortType;

	/**
	 * 任务id
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getHunterOpenId() {
		return this.hunterOpenId;
	}
	public void setHunterOpenId(String hunterOpenId) {
		this.hunterOpenId = hunterOpenId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRankRange() {
		return this.rankRange;
	}
	public void setRankRange(String rankRange) {
		this.rankRange = rankRange;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSortType() {
		return this.sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
