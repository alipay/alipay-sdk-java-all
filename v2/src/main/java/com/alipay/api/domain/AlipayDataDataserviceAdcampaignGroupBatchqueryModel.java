package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询单元列表
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:15:00
 */
public class AlipayDataDataserviceAdcampaignGroupBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3114172148531285181L;

	/**
	 * 出价方式类型
	 */
	@ApiField("bid_type")
	private String bidType;

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
	 * 单元状态
	 */
	@ApiListField("group_status_list")
	@ApiField("string")
	private List<String> groupStatusList;

	/**
	 * 二级营销目标code。
注意事项：层级关系和投放平台层级关系保持一致。
1.销售线索收集（一级）:tag000001，销售线索收集（二级）tag200600
2.自定义投放（一级）tag000004，自定义投放（二级）tag902001
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/**
	 * 每页数量[1,100]闭区间
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 商家tag
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 搜索关键词(列表-支持单元id/名称模糊搜索)
	 */
	@ApiField("search_keywords")
	private String searchKeywords;

	public String getBidType() {
		return this.bidType;
	}
	public void setBidType(String bidType) {
		this.bidType = bidType;
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

	public List<String> getGroupStatusList() {
		return this.groupStatusList;
	}
	public void setGroupStatusList(List<String> groupStatusList) {
		this.groupStatusList = groupStatusList;
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

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
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
