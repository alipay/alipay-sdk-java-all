package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员积分接入预咨询接口
 *
 * @author auto create
 * @since 1.0, 2022-04-07 13:51:12
 */
public class AlipayUserMpointPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 3145511475396944427L;

	/**
	 * 业务子类型，由会员方面分配
	 */
	@ApiField("biz_sub_type")
	private String bizSubType;

	/**
	 * 业务类型，由会员方面分配
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 目标操作的分数
	 */
	@ApiField("point")
	private String point;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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
