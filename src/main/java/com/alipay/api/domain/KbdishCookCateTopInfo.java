package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜谱类目置顶
 *
 * @author auto create
 * @since 1.0, 2020-06-20 01:35:04
 */
public class KbdishCookCateTopInfo extends AlipayObject {

	private static final long serialVersionUID = 4663898744314931918L;

	/**
	 * 口碑类目id
	 */
	@ApiField("catetory_id")
	private String catetoryId;

	/**
	 * 菜谱id
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 创建人
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 操作类型
top：置顶
cancelTop：取消置顶
	 */
	@ApiField("oper_type")
	private String operType;

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

	public String getCookId() {
		return this.cookId;
	}
	public void setCookId(String cookId) {
		this.cookId = cookId;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getOperType() {
		return this.operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
