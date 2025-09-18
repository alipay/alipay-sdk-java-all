package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 移动券核销接口参数根节点
 *
 * @author auto create
 * @since 1.0, 2024-11-28 14:26:06
 */
public class ChinaMobileContractRoot extends AlipayObject {

	private static final long serialVersionUID = 2249619963251734975L;

	/**
	 * 移动核销参数Body
	 */
	@ApiField("body")
	private ChinaMobileBody body;

	/**
	 * 移动核销接口Head
	 */
	@ApiField("head")
	private ChinaMobileHead head;

	/**
	 * 支付宝券核销信息
	 */
	@ApiField("voucher")
	private ChinaMobileVoucher voucher;

	public ChinaMobileBody getBody() {
		return this.body;
	}
	public void setBody(ChinaMobileBody body) {
		this.body = body;
	}

	public ChinaMobileHead getHead() {
		return this.head;
	}
	public void setHead(ChinaMobileHead head) {
		this.head = head;
	}

	public ChinaMobileVoucher getVoucher() {
		return this.voucher;
	}
	public void setVoucher(ChinaMobileVoucher voucher) {
		this.voucher = voucher;
	}

}
