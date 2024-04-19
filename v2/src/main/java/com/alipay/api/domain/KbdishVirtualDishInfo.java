package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑虚拟类目菜品模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:14:32
 */
public class KbdishVirtualDishInfo extends AlipayObject {

	private static final long serialVersionUID = 7887745539321193445L;

	/**
	 * 虚拟分类id
	 */
	@ApiField("catetory_id")
	private String catetoryId;

	/**
	 * 创建
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 扩展定制
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 菜品在虚拟类目下的排序值
	 */
	@ApiField("sort")
	private String sort;

	/**
	 * 修改人
	 */
	@ApiField("update_user")
	private String updateUser;

	public String getCatetoryId() {
		return this.catetoryId;
	}
	public void setCatetoryId(String catetoryId) {
		this.catetoryId = catetoryId;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
