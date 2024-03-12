package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询门店码类目
 *
 * @author auto create
 * @since 1.0, 2020-12-11 14:19:46
 */
public class AlipayMerchantShopcodeCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5583336422825944853L;

	/**
	 * 请求流水号，调用者可自定义传入，平台仅作为请求调用记录
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
