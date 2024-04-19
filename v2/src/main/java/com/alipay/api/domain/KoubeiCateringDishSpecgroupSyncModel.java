package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品规格组的同步
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:25:08
 */
public class KoubeiCateringDishSpecgroupSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6184465444399773863L;

	/**
	 * 创建者
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 规格标签
	 */
	@ApiField("kbdish_spec_group")
	private KbdishSpecGroup kbdishSpecGroup;

	/**
	 * 同步类型: add 新增,del 删除,update 更新
	 */
	@ApiField("syn_type")
	private String synType;

	/**
	 * 修改人
	 */
	@ApiField("update_user")
	private String updateUser;

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public KbdishSpecGroup getKbdishSpecGroup() {
		return this.kbdishSpecGroup;
	}
	public void setKbdishSpecGroup(KbdishSpecGroup kbdishSpecGroup) {
		this.kbdishSpecGroup = kbdishSpecGroup;
	}

	public String getSynType() {
		return this.synType;
	}
	public void setSynType(String synType) {
		this.synType = synType;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
