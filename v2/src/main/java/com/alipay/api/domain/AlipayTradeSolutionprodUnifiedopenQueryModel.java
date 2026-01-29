package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C2C个人收款方聚合开通进度查询
 *
 * @author auto create
 * @since 1.0, 2025-11-18 20:45:47
 */
public class AlipayTradeSolutionprodUnifiedopenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5773691272541124611L;

	/**
	 * 外部请求流水号，调用alipay.trade.solutionprod.unifiedopen.apply接口时传入
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 调用alipay.merchant.ctoc.unifiedopen.apply
返回的聚合开通申请单号
	 */
	@ApiField("uniopen_order_id")
	private String uniopenOrderId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUniopenOrderId() {
		return this.uniopenOrderId;
	}
	public void setUniopenOrderId(String uniopenOrderId) {
		this.uniopenOrderId = uniopenOrderId;
	}

}
