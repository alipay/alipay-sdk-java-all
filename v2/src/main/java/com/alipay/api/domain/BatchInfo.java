package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批次信息
 *
 * @author auto create
 * @since 1.0, 2019-12-20 17:58:55
 */
public class BatchInfo extends AlipayObject {

	private static final long serialVersionUID = 6414337862665119524L;

	/**
	 * 合同号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 参与方列表（包括本方公司和对手方公司）
	 */
	@ApiListField("contract_partners")
	@ApiField("inter_trade_contract_partner")
	private List<InterTradeContractPartner> contractPartners;

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public List<InterTradeContractPartner> getContractPartners() {
		return this.contractPartners;
	}
	public void setContractPartners(List<InterTradeContractPartner> contractPartners) {
		this.contractPartners = contractPartners;
	}

}
