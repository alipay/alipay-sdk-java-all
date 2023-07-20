package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据证券签约协议号查询用户支付宝userid
 *
 * @author auto create
 * @since 1.0, 2023-06-30 14:10:45
 */
public class AntfortuneStockOpenUseridQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7746279342452583538L;

	/**
	 * 用户证券签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

}
