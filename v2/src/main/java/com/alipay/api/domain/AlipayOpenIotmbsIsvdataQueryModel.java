package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot服务商查询自己写入数据
 *
 * @author auto create
 * @since 1.0, 2025-01-02 16:58:09
 */
public class AlipayOpenIotmbsIsvdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8813922235555944385L;

	/**
	 * 根据condition_type，输入相应的查询条件。
	 */
	@ApiField("condition_id")
	private String conditionId;

	/**
	 * 选择条件查询维度。此参数代表，condition_id的数据类型，请与conditon_id配合一起使用。
	 */
	@ApiField("condition_type")
	private String conditionType;

	/**
	 * 分页查询的页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页查询一页数据的最大条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 选择需要查询的数据类型，注意：不同的请求参数，会影响返回结果格式。
	 */
	@ApiField("query_type")
	private String queryType;

	public String getConditionId() {
		return this.conditionId;
	}
	public void setConditionId(String conditionId) {
		this.conditionId = conditionId;
	}

	public String getConditionType() {
		return this.conditionType;
	}
	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

}
