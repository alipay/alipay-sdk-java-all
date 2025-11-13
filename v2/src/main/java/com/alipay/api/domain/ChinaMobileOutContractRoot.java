package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 移动核销接口出参
 *
 * @author auto create
 * @since 1.0, 2024-11-28 14:26:06
 */
public class ChinaMobileOutContractRoot extends AlipayObject {

	private static final long serialVersionUID = 8372649444169915161L;

	/**
	 * 移动核销出参Body
	 */
	@ApiField("body")
	private ChinaMobileOutBody body;

	/**
	 * 移动核销出参Head
	 */
	@ApiField("head")
	private ChinaMobileHead head;

	public ChinaMobileOutBody getBody() {
		return this.body;
	}
	public void setBody(ChinaMobileOutBody body) {
		this.body = body;
	}

	public ChinaMobileHead getHead() {
		return this.head;
	}
	public void setHead(ChinaMobileHead head) {
		this.head = head;
	}

}
