package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用承诺消费用户参加活动信息查询
 *
 * @author auto create
 * @since 1.0, 2019-12-21 12:06:22
 */
public class ZhimaMerchantActivityParticipationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6873917477296989135L;

	/**
	 * 承诺消费合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

}
