package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 组合菜的对象
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:37:52
 */
public class PosDishGroupModel extends AlipayObject {

	private static final long serialVersionUID = 2214185163556595693L;

	/**
	 * 创建的用户名，请输入有效的用户ID，类型是新增时候，必填
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 组合菜的详情，类型是删除时候可选，否则必填
	 */
	@ApiListField("detail_list")
	@ApiField("pos_dish_group_detail_model")
	private List<PosDishGroupDetailModel> detailList;

	/**
	 * 组合菜的ID，除了新增时候，必传
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 组合菜的名称, 类型是删除时候可选，否则必填
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 查询时候返回的详情列表
	 */
	@ApiListField("query_detail_list")
	@ApiField("pos_dish_group_detail_model")
	private List<PosDishGroupDetailModel> queryDetailList;

	/**
	 * 门店ID，类型是删除时候可选，否则必填
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 套餐的排序号，只在查询套餐下组合菜的时候才会有这个值
	 */
	@ApiField("sort")
	private Long sort;

	/**
	 * 状态，类型是删除时候可选，否则必填
	 */
	@ApiField("status")
	private String status;

	/**
	 * 操作的类型，add新增 update更新 del删除
	 */
	@ApiField("sync_type")
	private String syncType;

	/**
	 * 组合菜中最多可点份数，类型是删除时候可选，否则必填
	 */
	@ApiField("unit_count_limit")
	private Long unitCountLimit;

	/**
	 * 更新的用户名，请输入有效的用户ID，类型是新增时候可选，否则必填
	 */
	@ApiField("update_user")
	private String updateUser;

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public List<PosDishGroupDetailModel> getDetailList() {
		return this.detailList;
	}
	public void setDetailList(List<PosDishGroupDetailModel> detailList) {
		this.detailList = detailList;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<PosDishGroupDetailModel> getQueryDetailList() {
		return this.queryDetailList;
	}
	public void setQueryDetailList(List<PosDishGroupDetailModel> queryDetailList) {
		this.queryDetailList = queryDetailList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

	public Long getUnitCountLimit() {
		return this.unitCountLimit;
	}
	public void setUnitCountLimit(Long unitCountLimit) {
		this.unitCountLimit = unitCountLimit;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
