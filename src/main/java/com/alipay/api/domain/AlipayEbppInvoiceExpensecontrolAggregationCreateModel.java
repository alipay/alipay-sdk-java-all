package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 费控聚合关系创建
 *
 * @author auto create
 * @since 1.0, 2021-09-29 21:47:24
 */
public class AlipayEbppInvoiceExpensecontrolAggregationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2439166775928482149L;

	/**
	 * 企业签约企业合花ID-共同账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 聚合关系名称
	 */
	@ApiField("aggregation_name")
	private String aggregationName;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 规则ID列表
	 */
	@ApiListField("standard_id_list")
	@ApiField("string")
	private List<String> standardIdList;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAggregationName() {
		return this.aggregationName;
	}
	public void setAggregationName(String aggregationName) {
		this.aggregationName = aggregationName;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public List<String> getStandardIdList() {
		return this.standardIdList;
	}
	public void setStandardIdList(List<String> standardIdList) {
		this.standardIdList = standardIdList;
	}

}
