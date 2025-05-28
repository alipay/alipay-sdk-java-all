package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AMPE情景推荐服务查询
 *
 * @author auto create
 * @since 1.0, 2025-05-23 14:37:27
 */
public class AlipayOpenMiniAmpeRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1643553752633585789L;

	/**
	 * 业务场景，由支付宝统一分配，用于指定推荐的内容。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * AMPE设备ID，用于标记唯一的一台设备。
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 运行时的设备、卡片信息
	 */
	@ApiField("device_info")
	private AmpeDeviceInfo deviceInfo;

	/**
	 * 支付宝用户openId 当前字段已废弃(通过accessToken获取userId)
	 */
	@ApiField("open_id")
	@Deprecated
	private String openId;

	/**
	 * AMPE产品ID，在开放平台注册后可获取。
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 请求流水号。
	 */
	@ApiField("req_no")
	private String reqNo;

	/**
	 * 支付宝用户userId 当前字段已废弃(通过accessToken获取userId)
	 */
	@ApiField("user_id")
	@Deprecated
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public AmpeDeviceInfo getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(AmpeDeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getReqNo() {
		return this.reqNo;
	}
	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
