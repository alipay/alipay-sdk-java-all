package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店数据-批量门店数据查询
 *
 * @author auto create
 * @since 1.0, 2023-08-03 15:19:48
 */
public class AnttechMorseMarketingShopDataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5395341799183712994L;

	/**
	 * 商户授权码
	 */
	@ApiField("bussiness_code")
	private String bussinessCode;

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
	 * 门店得分筛选范围
	 */
	@ApiField("score_range")
	private ScoreRangeInfo scoreRange;

	/**
	 * 获取分数类型
	 */
	@ApiListField("score_type")
	@ApiField("string")
	private List<String> scoreType;

	/**
	 * 见<a href="https://opendocs.alipay.com/pre-open/08mjwq" target="_blank">空间商业智能省市区信息表</a>
	 */
	@ApiListField("shop_area")
	@ApiField("shop_area_info")
	private List<ShopAreaInfo> shopArea;

	/**
	 * 排序名
	 */
	@ApiField("sort_name")
	private String sortName;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 查询TOP门店数量，如：top10
	 */
	@ApiField("top_num")
	private Long topNum;

	public String getBussinessCode() {
		return this.bussinessCode;
	}
	public void setBussinessCode(String bussinessCode) {
		this.bussinessCode = bussinessCode;
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

	public ScoreRangeInfo getScoreRange() {
		return this.scoreRange;
	}
	public void setScoreRange(ScoreRangeInfo scoreRange) {
		this.scoreRange = scoreRange;
	}

	public List<String> getScoreType() {
		return this.scoreType;
	}
	public void setScoreType(List<String> scoreType) {
		this.scoreType = scoreType;
	}

	public List<ShopAreaInfo> getShopArea() {
		return this.shopArea;
	}
	public void setShopArea(List<ShopAreaInfo> shopArea) {
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
