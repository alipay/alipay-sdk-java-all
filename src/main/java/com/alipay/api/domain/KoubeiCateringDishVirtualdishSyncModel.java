package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜品虚拟类目菜品同步
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:24:00
 */
public class KoubeiCateringDishVirtualdishSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6552689661579184697L;

	/**
	 * 创建人
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 虚拟分类菜设置
	 */
	@ApiListField("kbdish_virtual_dish_info_list")
	@ApiField("kb_virtual_shop_info")
	private List<KbVirtualShopInfo> kbdishVirtualDishInfoList;

	/**
	 * 更新人
	 */
	@ApiField("update_user")
	private String updateUser;

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public List<KbVirtualShopInfo> getKbdishVirtualDishInfoList() {
		return this.kbdishVirtualDishInfoList;
	}
	public void setKbdishVirtualDishInfoList(List<KbVirtualShopInfo> kbdishVirtualDishInfoList) {
		this.kbdishVirtualDishInfoList = kbdishVirtualDishInfoList;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
