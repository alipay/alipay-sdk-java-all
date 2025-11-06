package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询创意列表
 *
 * @author auto create
 * @since 1.0, 2025-09-28 20:36:38
 */
public class AlipayDataDataserviceAdcampaignCreativeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7786986836321551943L;

	/**
	 * 创意状态
	 */
	@ApiListField("creative_status_list")
	@ApiField("string")
	private List<String> creativeStatusList;

	/**
	 * 当前页 最小值1
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 一级营销目标code（如要查询当前场景下所有数据，入参为‘ALL’字段）
	 */
	@ApiField("first_market_target_code")
	private String firstMarketTargetCode;

	/**
	 * 单元id
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 二级营销目标code
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/**
	 * 每页数量[1,100]闭区间单页最大值限制
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 计划id
	 */
	@ApiField("plan_id")
	private Long planId;

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
	 * 搜索关键词(支持创意id/名称模糊搜索)
	 */
	@ApiField("search_keywords")
	private String searchKeywords;

	public List<String> getCreativeStatusList() {
		return this.creativeStatusList;
	}
	public void setCreativeStatusList(List<String> creativeStatusList) {
		this.creativeStatusList = creativeStatusList;
	}

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

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getMarketTargetCode() {
		return this.marketTargetCode;
	}
	public void setMarketTargetCode(String marketTargetCode) {
		this.marketTargetCode = marketTargetCode;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPlanId() {
		return this.planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
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
