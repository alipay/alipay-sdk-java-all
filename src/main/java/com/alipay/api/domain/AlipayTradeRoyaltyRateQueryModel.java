package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账比例查询
 *
 * @author auto create
 * @since 1.0, 2022-09-14 19:39:09
 */
public class AlipayTradeRoyaltyRateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5628725147658939644L;

	/**
	 * 外部请求号，由商家自定义。32个字符以内，仅可包含字母、数字、下划线。需保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
