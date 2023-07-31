package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻约定查询发约单详情接口
 *
 * @author auto create
 * @since 1.0, 2021-05-17 10:40:37
 */
public class ZhimaMerchantContractOfferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8233664521632834964L;

	/**
	 * 发约单单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	public String getOfferNo() {
		return this.offerNo;
	}
	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}

}
