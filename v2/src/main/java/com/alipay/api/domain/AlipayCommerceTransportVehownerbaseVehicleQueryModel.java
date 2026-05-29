package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车档案查询
 *
 * @author auto create
 * @since 1.0, 2026-05-26 10:22:51
 */
public class AlipayCommerceTransportVehownerbaseVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2621257968287321862L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 车辆 ID
	 */
	@ApiField("vi_id")
	private String viId;

	/**
	 * 车牌号
	 */
	@ApiField("vi_number")
	private String viNumber;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getViId() {
		return this.viId;
	}
	public void setViId(String viId) {
		this.viId = viId;
	}

	public String getViNumber() {
		return this.viNumber;
	}
	public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}

}
