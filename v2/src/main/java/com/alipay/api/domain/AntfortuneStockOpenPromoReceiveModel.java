package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 证券活动领奖
 *
 * @author auto create
 * @since 1.0, 2023-09-15 16:56:43
 */
public class AntfortuneStockOpenPromoReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 5287941959344856371L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 奖品发放参数
	 */
	@ApiListField("target_send_order_list")
	@ApiField("target_send_order_param")
	private List<TargetSendOrderParam> targetSendOrderList;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<TargetSendOrderParam> getTargetSendOrderList() {
		return this.targetSendOrderList;
	}
	public void setTargetSendOrderList(List<TargetSendOrderParam> targetSendOrderList) {
		this.targetSendOrderList = targetSendOrderList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
