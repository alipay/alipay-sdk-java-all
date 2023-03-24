package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot服务商查询自己写入数据
 *
 * @author auto create
 * @since 1.0, 2023-02-13 17:44:31
 */
public class AlipayOpenIotmbsIsvdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7686936367529662142L;

	/**
	 * 参数名：condition_id+使用场景：根据condition_type，输入相应的查询条件+枚举值：
无
	 */
	@ApiField("condition_id")
	private String conditionId;

	/**
	 * 参数名：condition_type+使用场景：选择条件查询维度+枚举值：1、isvpid 2、酒店id 3、设备sn
	 */
	@ApiField("condition_type")
	private String conditionType;

	/**
	 * 参数名:page_num+使用场景:分页查询的页码+枚举值:无
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 参数名:page_size+使用场景：分页查询一页数据的最大条数+枚举值：无
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 参数名：query_type+使用场景：选择需要查询的数据类型+枚举值：1：isv绑定的酒店id 2：设备sn 3：设备sn绑定的人脸
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
