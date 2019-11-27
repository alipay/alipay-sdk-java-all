package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品订单查询
 *
 * @author auto create
 * @since 1.0, 2016-10-11 22:04:44
 */
public class AlipayTradeOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6224116587732217948L;

	/**
	 * 买家的支付宝账号ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 外部商户定义的唯一业务标识
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
