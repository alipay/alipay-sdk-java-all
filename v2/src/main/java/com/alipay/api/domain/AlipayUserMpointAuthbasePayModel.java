package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员积分扣减接口
 *
 * @author auto create
 * @since 1.0, 2023-09-20 13:25:18
 */
public class AlipayUserMpointAuthbasePayModel extends AlipayObject {

	private static final long serialVersionUID = 1492141987335855935L;

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
	 * 积分扣减订单详情
	 */
	@ApiField("deduct_order_detail")
	private DeductOrderDetail deductOrderDetail;

	/**
	 * 用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 目标扣减积分数
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

	public DeductOrderDetail getDeductOrderDetail() {
		return this.deductOrderDetail;
	}
	public void setDeductOrderDetail(DeductOrderDetail deductOrderDetail) {
		this.deductOrderDetail = deductOrderDetail;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
