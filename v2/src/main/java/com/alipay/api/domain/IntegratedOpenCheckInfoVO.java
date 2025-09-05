package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体化开通作业的校验返回模型
 *
 * @author auto create
 * @since 1.0, 2025-09-02 15:07:03
 */
public class IntegratedOpenCheckInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3695215514315685796L;

	/**
	 * 作业预校验备注信息
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
