package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构数据链上查询处理器
 *
 * @author auto create
 * @since 1.0, 2022-09-19 15:42:51
 */
public class MybankCreditLoanapplyBlockchainOpenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2716495551641923571L;

	/**
	 * 业务类型,BLOCKCHAIN_QUERY_EVENT,机构数据链上查询,SDK枚举获取 业务类型
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 业务字段，暂时不需要，后续考虑到不同机构的差异性，预留。
	 */
	@ApiField("data_object")
	private String dataObject;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getDataObject() {
		return this.dataObject;
	}
	public void setDataObject(String dataObject) {
		this.dataObject = dataObject;
	}

}
