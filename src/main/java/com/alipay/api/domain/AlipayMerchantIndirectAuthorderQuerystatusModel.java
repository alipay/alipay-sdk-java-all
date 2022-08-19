package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询意愿申请单审核结果
 *
 * @author auto create
 * @since 1.0, 2022-08-04 21:09:14
 */
public class AlipayMerchantIndirectAuthorderQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 1384233912813667331L;

	/**
	 * 商家认证申请单号，参数二选一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部业务号，参数二选一，业务自定义，保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
