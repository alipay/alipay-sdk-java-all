package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一键登录初始化
 *
 * @author auto create
 * @since 1.0, 2023-06-09 16:14:21
 */
public class DatadigitalFincloudGeneralsaasOneloginInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 4219386875815394685L;

	/**
	 * 客户业务单据号。
	 */
	@ApiField("outer_order_no")
	private String outerOrderNo;

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}
	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
	}

}
