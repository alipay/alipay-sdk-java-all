package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员积分支付接口（需要用户授权）
 *
 * @author auto create
 * @since 1.0, 2023-12-05 19:23:16
 */
public class AlipayUserMpointPayModel extends AlipayObject {

	private static final long serialVersionUID = 3734323251964734171L;

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
	 * 业务流水号，会用于幂等性校验，所以请保证每次请求的业务流水号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 需要扣减的积分数
	 */
	@ApiField("point")
	private String point;

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

}
