package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店数据_批量门店数据查询
 *
 * @author auto create
 * @since 1.0, 2024-04-12 17:39:03
 */
public class AlipayDataAntsycmShopdataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6418115634258113178L;

	/**
	 * 商户授权码
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * 分页页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 门店得分筛选范围
	 */
	@ApiField("score_range")
	private ScoreRangeInfoDTO scoreRange;

	/**
	 * 获取分数类型
	 */
	@ApiListField("score_type")
	@ApiField("string")
	private List<String> scoreType;

	/**
	 * 见<a href = "https://opendocs.alipay.com/pre-open/0bue7u">省市区维表</a>
	 */
	@ApiListField("shop_area")
	@ApiField("shop_area_info_d_t_o")
	private List<ShopAreaInfoDTO> shopArea;

	/**
	 * 排序名
	 */
	@ApiField("sort_name")
	private String sortName;

	/**
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 查询TOP门店数量，如：top10
	 */
	@ApiField("top_num")
	private Long topNum;

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public ScoreRangeInfoDTO getScoreRange() {
		return this.scoreRange;
	}
	public void setScoreRange(ScoreRangeInfoDTO scoreRange) {
		this.scoreRange = scoreRange;
	}

	public List<String> getScoreType() {
		return this.scoreType;
	}
	public void setScoreType(List<String> scoreType) {
		this.scoreType = scoreType;
	}

	public List<ShopAreaInfoDTO> getShopArea() {
		return this.shopArea;
	}
	public void setShopArea(List<ShopAreaInfoDTO> shopArea) {
		this.shopArea = shopArea;
	}

	public String getSortName() {
		return this.sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Long getTopNum() {
		return this.topNum;
	}
	public void setTopNum(Long topNum) {
		this.topNum = topNum;
	}

}
