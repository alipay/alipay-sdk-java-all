package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 约定详情查询
 *
 * @author auto create
 * @since 1.0, 2021-05-17 10:40:08
 */
public class ZhimaCustomerContractDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5528197988378441725L;

	/**
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 发约单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	/**
	 * 主体id，一般是user_id
	 */
	@ApiField("principal_id")
	private String principalId;

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getOfferNo() {
		return this.offerNo;
	}
	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

}
