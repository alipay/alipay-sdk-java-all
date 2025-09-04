package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收订单创建
 *
 * @author auto create
 * @since 1.0, 2025-07-17 13:45:28
 */
public class AlipayCommerceRecycleOutOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1161139274762985336L;

	/**
	 * 地址信息
	 */
	@ApiField("address_info")
	private RecycleAddressInfo addressInfo;

	/**
	 * 回收评估信息
	 */
	@ApiField("assess_info")
	private RecycleOutAssessInfo assessInfo;

	/**
	 * 流量来源
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用于标记订单的来源方
	 */
	@ApiField("from_source")
	private String fromSource;

	/**
	 * 订单备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单渠道，不填写默认ONLINE 线上渠道
	 */
	@ApiField("order_channel")
	private String orderChannel;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public RecycleAddressInfo getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(RecycleAddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}

	public RecycleOutAssessInfo getAssessInfo() {
		return this.assessInfo;
	}
	public void setAssessInfo(RecycleOutAssessInfo assessInfo) {
		this.assessInfo = assessInfo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getFromSource() {
		return this.fromSource;
	}
	public void setFromSource(String fromSource) {
		this.fromSource = fromSource;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderChannel() {
		return this.orderChannel;
	}
	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
