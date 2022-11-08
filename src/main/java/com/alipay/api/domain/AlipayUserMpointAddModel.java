package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员积分发放接口（需要用户授权）
 *
 * @author auto create
 * @since 1.0, 2022-08-04 19:14:15
 */
public class AlipayUserMpointAddModel extends AlipayObject {

	private static final long serialVersionUID = 2363769437336544576L;

	/**
	 * 业务子场景，由支付宝侧分配
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
	 * 业务流水号，会用于幂等性校验，所以请保证每次请求的业务流水号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 需要发放的积分数
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
