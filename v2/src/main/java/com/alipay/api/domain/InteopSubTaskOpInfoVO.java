package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体化作业子项任务结果
 *
 * @author auto create
 * @since 1.0, 2025-10-22 17:04:20
 */
public class InteopSubTaskOpInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6523427716715823441L;

	/**
	 * 作业子单取消失败备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 作业子单号
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

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

}
