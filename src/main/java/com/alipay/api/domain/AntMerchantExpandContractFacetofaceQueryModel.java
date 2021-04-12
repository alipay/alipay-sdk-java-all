package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当面付申请查询接口
 *
 * @author auto create
 * @since 1.0, 2017-06-14 12:06:49
 */
public class AntMerchantExpandContractFacetofaceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5828536949353155339L;

	/**
	 * 支付宝端商户入驻申请单据号，通过调用ant.merchant.expand.contract.facetoface.sign接口返回的参数中获取
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部入驻申请单据号，必须跟ant.merchant.expand.contract.facetoface.sign中的out_biz_no值保持一致
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
