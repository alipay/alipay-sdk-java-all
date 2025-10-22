package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 计划列表查询
 *
 * @author auto create
 * @since 1.0, 2025-09-28 20:36:45
 */
public class AlipayDataDataserviceAdcampaignPlanBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3559724761764151829L;

	/**
	 * 当前页（最小为1）
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 一级营销目标code（如要查询当前场景下所有数据，入参为‘ALL’字段）
	 */
	@ApiField("first_market_target_code")
	private String firstMarketTargetCode;

	/**
	 * 二级营销目标code（不传时查询全量）
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/**
	 * 每页数量[1,100]闭区间单页最大值限制
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 计划状态
	 */
	@ApiListField("plan_status_list")
	@ApiField("string")
	private List<String> planStatusList;

	/**
	 * 商家tag
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 搜索关键词(支持计划id/名称模糊搜索)
	 */
	@ApiField("search_keywords")
	private String searchKeywords;

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public String getFirstMarketTargetCode() {
		return this.firstMarketTargetCode;
	}
	public void setFirstMarketTargetCode(String firstMarketTargetCode) {
		this.firstMarketTargetCode = firstMarketTargetCode;
	}

	public String getMarketTargetCode() {
		return this.marketTargetCode;
	}
	public void setMarketTargetCode(String marketTargetCode) {
		this.marketTargetCode = marketTargetCode;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getPlanStatusList() {
		return this.planStatusList;
	}
	public void setPlanStatusList(List<String> planStatusList) {
		this.planStatusList = planStatusList;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSearchKeywords() {
		return this.searchKeywords;
	}
	public void setSearchKeywords(String searchKeywords) {
		this.searchKeywords = searchKeywords;
	}

}
