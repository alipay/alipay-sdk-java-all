package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员积分接入预咨询接口
 *
 * @author auto create
 * @since 1.0, 2022-08-04 19:13:46
 */
public class AlipayUserMpointPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 1875889828731391928L;

	/**
	 * 业务子场景，由支付宝侧分配，在积分发放场景下要求必传
	 */
	@ApiField("biz_sub_scene")
	private String bizSubScene;

	/**
	 * 业务子类型，由支付宝侧分配
	 */
	@ApiField("biz_sub_type")
	private String bizSubType;

	/**
	 * 业务类型，由支付宝侧分配
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 目标操作的积分数
	 */
	@ApiField("point")
	private String point;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizSubScene() {
		return this.bizSubScene;
	}
	public void setBizSubScene(String bizSubScene) {
		this.bizSubScene = bizSubScene;
	}

	public String getBizSubType() {
		return this.bizSubType;
	}
	public void setBizSubType(String bizSubType) {
		this.bizSubType = bizSubType;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getPoint() {
		return this.point;
	}
	public void setPoint(String point) {
		this.point = point;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
