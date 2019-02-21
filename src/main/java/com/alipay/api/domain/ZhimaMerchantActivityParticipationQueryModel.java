package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用承诺消费用户参加活动信息查询
 *
 * @author auto create
 * @since 1.0, 2018-11-22 22:02:46
 */
public class ZhimaMerchantActivityParticipationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1677548753934841966L;

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
