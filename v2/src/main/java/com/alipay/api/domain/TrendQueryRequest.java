package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 趋势数据查询参数
 *
 * @author auto create
 * @since 1.0, 2023-01-17 11:13:37
 */
public class TrendQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 5362712213674876141L;

	/**
	 * 时间维度的聚合会对用户去重。
	 */
	@ApiField("dim")
	private String dim;

	/**
	 * 趋势图结束时间，格式yyyyMMdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 是否排除在棋盘导入的用户，导入方式包括文件上传和接口上传。只适用于总用户资产趋势的查询（index_key=total_users），设true则可查询访问、互动和支付用户的三大类总用户趋势。
	 */
	@ApiField("exclude_import")
	private Boolean excludeImport;

	/**
	 * 用户资产关系类型，查询单日行为用户趋势（index_key=new_user_num）和查询支付占比趋势（index_key=pay_users_perc）时必填。
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 趋势图开始时间，格式yyyyMMdd
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 用户指标趋势查询（index_key=user_indications）时必填。
	 */
	@ApiField("user_key")
	private String userKey;

	public String getDim() {
		return this.dim;
	}
	public void setDim(String dim) {
		this.dim = dim;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Boolean getExcludeImport() {
		return this.excludeImport;
	}
	public void setExcludeImport(Boolean excludeImport) {
		this.excludeImport = excludeImport;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getUserKey() {
		return this.userKey;
	}
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

}
