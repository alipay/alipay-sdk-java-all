package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 全域营销投放下指定用户是否领券校验
 *
 * @author auto create
 * @since 1.0, 2022-10-13 14:38:16
 */
public class AlipayOpenMiniMarketReceivedConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2478578661468619629L;

	/**
	 * 投放活动id
	 */
	@ApiField("deliver_id")
	private String deliverId;

	/**
	 * 投放活动id集合
	 */
	@ApiListField("deliver_id_list")
	@ApiField("string")
	private List<String> deliverIdList;

	/**
	 * 是否为多个投放，是为true，若是则deliver_id_list必填，若否则deliver_id必填
	 */
	@ApiField("multi_deliver")
	private Boolean multiDeliver;

	/**
	 * 商户小程序中的用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeliverId() {
		return this.deliverId;
	}
	public void setDeliverId(String deliverId) {
		this.deliverId = deliverId;
	}

	public List<String> getDeliverIdList() {
		return this.deliverIdList;
	}
	public void setDeliverIdList(List<String> deliverIdList) {
		this.deliverIdList = deliverIdList;
	}

	public Boolean getMultiDeliver() {
		return this.multiDeliver;
	}
	public void setMultiDeliver(Boolean multiDeliver) {
		this.multiDeliver = multiDeliver;
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
