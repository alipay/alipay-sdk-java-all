package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物档案查询
 *
 * @author auto create
 * @since 1.0, 2023-01-09 14:30:01
 */
public class AlipayCommercePetFileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8429548255682918556L;

	/**
	 * 宠物档案id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
