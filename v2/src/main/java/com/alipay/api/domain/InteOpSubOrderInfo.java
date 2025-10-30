package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体化作业项订单结构信息
 *
 * @author auto create
 * @since 1.0, 2025-09-02 15:07:52
 */
public class InteOpSubOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 4366925331378255891L;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 一体化作业子项单号
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	/**
	 * 一体化作业子项状态
	 */
	@ApiField("sub_order_status")
	private String subOrderStatus;

	/**
	 * 一体化作业子项类型
	 */
	@ApiField("type")
	private String type;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getSubOrderNo() {
		return this.subOrderNo;
	}
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

	public String getSubOrderStatus() {
		return this.subOrderStatus;
	}
	public void setSubOrderStatus(String subOrderStatus) {
		this.subOrderStatus = subOrderStatus;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
