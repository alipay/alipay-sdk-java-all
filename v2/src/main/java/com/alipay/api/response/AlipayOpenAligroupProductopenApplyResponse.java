package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CtuErrorInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.aligroup.productopen.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:01
 */
public class AlipayOpenAligroupProductopenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7814866683815825511L;

	/** 
	 * ctu校验结果对象，内部包含校验结果以及错误code与信息
	 */
	@ApiField("ctu_error_info")
	private CtuErrorInfo ctuErrorInfo;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setCtuErrorInfo(CtuErrorInfo ctuErrorInfo) {
		this.ctuErrorInfo = ctuErrorInfo;
	}
	public CtuErrorInfo getCtuErrorInfo( ) {
		return this.ctuErrorInfo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
