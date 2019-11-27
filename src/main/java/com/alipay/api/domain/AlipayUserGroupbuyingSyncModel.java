package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户拼团信息同步接口
 *
 * @author auto create
 * @since 1.0, 2018-11-27 16:06:07
 */
public class AlipayUserGroupbuyingSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1477296384755937115L;

	/**
	 * 拼团结束时间的timestamp
	 */
	@ApiField("group_expire")
	private String groupExpire;

	/**
	 * 相关拼团的Id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 最小成团条件，比如2人成团，则此字段为2
	 */
	@ApiField("group_qualification")
	private String groupQualification;

	/**
	 * SPONSOR表示当前havanaId为拼团发起者，PARTICIPANT表示当前havanaId为拼团参与者
	 */
	@ApiField("group_role")
	private String groupRole;

	/**
	 * 1688处的用户havanaId
	 */
	@ApiField("havana_id")
	private String havanaId;

	/**
	 * 1688处商品Id
	 */
	@ApiField("item_id")
	private String itemId;

	public String getGroupExpire() {
		return this.groupExpire;
	}
	public void setGroupExpire(String groupExpire) {
		this.groupExpire = groupExpire;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupQualification() {
		return this.groupQualification;
	}
	public void setGroupQualification(String groupQualification) {
		this.groupQualification = groupQualification;
	}

	public String getGroupRole() {
		return this.groupRole;
	}
	public void setGroupRole(String groupRole) {
		this.groupRole = groupRole;
	}

	public String getHavanaId() {
		return this.havanaId;
	}
	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
