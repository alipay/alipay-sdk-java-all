package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用承诺消费用户参加活动信息查询
 *
 * @author auto create
 * @since 1.0, 2018-10-25 15:24:31
 */
public class ZhimaMerchantActivityParticipationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1312859828416557335L;

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
