package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 代用户查询回收订单详情
 *
 * @author auto create
 * @since 1.0, 2025-07-23 11:12:37
 */
public class AlipayCommerceRecycleOrderDelegateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6729842572794314563L;

	/**
	 * 淘宝品牌店铺：BRAND
	 */
	@ApiField("delegate_type")
	private String delegateType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 回收主订单状态。详见回收订单状态机 当前字段已废弃(调整字段为数组类型调整字段为数组类型)
	 */
	@ApiField("order_status")
	@Deprecated
	private String orderStatus;

	/**
	 * 过滤的回收状态
	 */
	@ApiListField("order_status_list")
	@ApiField("string")
	private List<String> orderStatusList;

	/**
	 * 起始页码为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小，最大限制20条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 不传入则不进行行业类目过滤. 行业类目详见回收行业类目枚举
	 */
	@ApiListField("recycle_category_list")
	@ApiField("string")
	private List<String> recycleCategoryList;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getDelegateType() {
		return this.delegateType;
	}
	public void setDelegateType(String delegateType) {
		this.delegateType = delegateType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<String> getOrderStatusList() {
		return this.orderStatusList;
	}
	public void setOrderStatusList(List<String> orderStatusList) {
		this.orderStatusList = orderStatusList;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getRecycleCategoryList() {
		return this.recycleCategoryList;
	}
	public void setRecycleCategoryList(List<String> recycleCategoryList) {
		this.recycleCategoryList = recycleCategoryList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
