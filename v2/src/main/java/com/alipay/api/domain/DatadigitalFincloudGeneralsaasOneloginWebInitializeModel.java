package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * H5一键登录初始化
 *
 * @author auto create
 * @since 1.0, 2023-07-26 09:44:19
 */
public class DatadigitalFincloudGeneralsaasOneloginWebInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 8786295911446318877L;

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
