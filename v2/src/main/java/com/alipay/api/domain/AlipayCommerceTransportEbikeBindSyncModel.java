package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电动车绑定状态同步
 *
 * @author auto create
 * @since 1.0, 2024-11-12 16:36:20
 */
public class AlipayCommerceTransportEbikeBindSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8127278297898644194L;

	/**
	 * 电动车品牌绑定状态列表
	 */
	@ApiListField("ebike_bind_list")
	@ApiField("ebike_bind_info")
	private List<EbikeBindInfo> ebikeBindList;

	/**
	 * 来源
	 */
	@ApiField("ebike_source")
	private String ebikeSource;

	/**
	 * 蚂蚁统一会员ID（对外）
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<EbikeBindInfo> getEbikeBindList() {
		return this.ebikeBindList;
	}
	public void setEbikeBindList(List<EbikeBindInfo> ebikeBindList) {
		this.ebikeBindList = ebikeBindList;
	}

	public String getEbikeSource() {
		return this.ebikeSource;
	}
	public void setEbikeSource(String ebikeSource) {
		this.ebikeSource = ebikeSource;
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
