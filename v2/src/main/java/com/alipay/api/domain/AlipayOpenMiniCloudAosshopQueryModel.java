package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * aos店铺搜索
 *
 * @author auto create
 * @since 1.0, 2024-06-25 11:15:17
 */
public class AlipayOpenMiniCloudAosshopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2149827954115965225L;

	/**
	 * 用户唯一标识id，可以是支付宝userid、商家自定义的userid，目前是用户user_id的映射
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 排序字段，"+"对应字段名 按字段正序，"-"对应字段名 按字段降序，支持指定多个。
	 */
	@ApiListField("orders")
	@ApiField("string")
	private List<String> orders;

	/**
	 * 当前页码，第一页是1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页的大小，取值范围是1~100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家在蚂蚁搜索引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 搜索的关键词
	 */
	@ApiField("query")
	private String query;

	/**
	 * 用户唯一标识id，可以是支付宝userid、商家自定义的userid等
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id的类型，可选值：ALIPAY（支付宝userid）、CUSTOM（商家自定义的userid）
	 */
	@ApiField("user_id_type")
	private String userIdType;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getOrders() {
		return this.orders;
	}
	public void setOrders(List<String> orders) {
		this.orders = orders;
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

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdType() {
		return this.userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

}
