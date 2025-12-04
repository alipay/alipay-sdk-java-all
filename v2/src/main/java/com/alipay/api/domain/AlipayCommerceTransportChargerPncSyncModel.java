package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即插即充服务状态同步
 *
 * @author auto create
 * @since 1.0, 2025-04-10 12:00:46
 */
public class AlipayCommerceTransportChargerPncSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3186375753118977252L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 开通状态。OPEN（开通）、CLOSE（关闭）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 车架号ID
	 */
	@ApiField("vin")
	private String vin;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
