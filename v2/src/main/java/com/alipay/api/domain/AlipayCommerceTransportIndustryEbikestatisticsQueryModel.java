package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 两轮车服务统计数据查询接口
 *
 * @author auto create
 * @since 1.0, 2025-09-17 15:37:26
 */
public class AlipayCommerceTransportIndustryEbikestatisticsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6614358474236732162L;

	/**
	 * 品牌编码，如雅迪传YD
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * query_type=month，入参date_str格式为yyyyMM；
query_type=day，入参date_str格式为yyyyMMdd
	 */
	@ApiField("date_str")
	private String dateStr;

	/**
	 * 页码，默认值1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页大小，默认值50
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询类型（month/day）
month：查询月数据
day：查询日数据
	 */
	@ApiField("query_type")
	private String queryType;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getDateStr() {
		return this.dateStr;
	}
	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
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

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

}
