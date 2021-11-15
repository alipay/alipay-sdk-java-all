package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 部门门店关系调整
 *
 * @author auto create
 * @since 1.0, 2021-10-27 14:08:27
 */
public class KoubeiMerchantDepartmentShopModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3692684884471932936L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 需要调整的部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 部门类型，5为非叶子节点部门即商户创建的部门；6为叶子节点部门即门店，门店在业务上被当成是类型为6的部门
	 */
	@ApiField("dept_type")
	private String deptType;

	/**
	 * 商户调整部门，门店关系时当前部门需要新增的门店列表，包括门店id和门店名称
	 */
	@ApiListField("shop_list_to_add")
	@ApiField("simple_shop_model")
	private List<SimpleShopModel> shopListToAdd;

	/**
	 * 商户调整部门，门店关联关系，需要解除关系的门店列表，包括门店id和门店名称
	 */
	@ApiListField("shop_list_to_remove")
	@ApiField("simple_shop_model")
	private List<SimpleShopModel> shopListToRemove;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getDeptId() {
		return this.deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptType() {
		return this.deptType;
	}
	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

	public List<SimpleShopModel> getShopListToAdd() {
		return this.shopListToAdd;
	}
	public void setShopListToAdd(List<SimpleShopModel> shopListToAdd) {
		this.shopListToAdd = shopListToAdd;
	}

	public List<SimpleShopModel> getShopListToRemove() {
		return this.shopListToRemove;
	}
	public void setShopListToRemove(List<SimpleShopModel> shopListToRemove) {
		this.shopListToRemove = shopListToRemove;
	}

}
