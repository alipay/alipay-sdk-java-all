package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户拼团信息同步接口
 *
 * @author auto create
 * @since 1.0, 2018-11-22 16:52:17
 */
public class AlipayUserGroupbuyingSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2864689468167813451L;

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
