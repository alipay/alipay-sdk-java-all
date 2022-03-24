package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构积分流水信息
 *
 * @author auto create
 * @since 1.0, 2019-05-01 11:19:29
 */
public class PointTransInfo extends AlipayObject {

	private static final long serialVersionUID = 2165659341872854715L;

	/**
	 * 流水发生业务时间。发放流水为发放时间，兑换流水为兑换扣减流水的时间
	 */
	@ApiField("op_time")
	private String opTime;

	/**
	 * 积分变更值
	 */
	@ApiField("point")
	private Long point;

	/**
	 * 流水产生业务标准，说明流水产生原因
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 积分流水编号
	 */
	@ApiField("trans_no")
	private String transNo;

	/**
	 * 流水类型，参考入参trans_type
	 */
	@ApiField("trans_type")
	private String transType;

	public String getOpTime() {
		return this.opTime;
	}
	public void setOpTime(String opTime) {
		this.opTime = opTime;
	}

	public Long getPoint() {
		return this.point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTransNo() {
		return this.transNo;
	}
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	public String getTransType() {
		return this.transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}

}
