package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代卖人收购单查询接口
 *
 * @author auto create
 * @since 1.0, 2026-09-20 10:52:17
 */
public class AlipayCommerceEcRecyclinginvoiceProxyorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1317586926583584843L;

	/**
	 * 服务商请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 代卖人收购单ID，推荐作为查询键。
	 */
	@ApiField("proxy_order_id")
	private String proxyOrderId;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProxyOrderId() {
		return this.proxyOrderId;
	}
	public void setProxyOrderId(String proxyOrderId) {
		this.proxyOrderId = proxyOrderId;
	}

}
