package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付条款
 *
 * @author auto create
 * @since 1.0, 2022-12-12 19:24:15
 */
public class OpenApiPaymentTermsDTO extends AlipayObject {

	private static final long serialVersionUID = 2415318518375592478L;

	/**
	 * 合同Id
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 合同支付条款头ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 是否默认，y:是；n:否
	 */
	@ApiField("is_default")
	private String isDefault;

	/**
	 * 其他条款
	 */
	@ApiField("other_terms")
	private String otherTerms;

	/**
	 * 是否按已支付比例为准
	 */
	@ApiField("pay_on_percent")
	private String payOnPercent;

	/**
	 * 支付条款名称，货到付款,阶段付款,阶段付款(工程版)
	 */
	@ApiField("payment_name")
	private String paymentName;

	/**
	 * 合同支付条款行表
	 */
	@ApiListField("payment_terms_item_list")
	@ApiField("open_api_payment_terms_item_d_t_o")
	private List<OpenApiPaymentTermsItemDTO> paymentTermsItemList;

	/**
	 * 付款类型
     *      * 货到付款：PAY_AFTER_RECEIPT 对应原来的：PAY_ON_DELIVERY
     *      * 阶段支付：MILESTONE 对应原来的：PAY_ON_MILESTONE
     *      * 阶段支付（工程版）：MILESTONE_COST
     *      * 混合型：MIX
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 支付条款顺序
	 */
	@ApiField("sort")
	private String sort;

	/**
	 * 条款来源
	 */
	@ApiField("term_source")
	private String termSource;

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIsDefault() {
		return this.isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public String getOtherTerms() {
		return this.otherTerms;
	}
	public void setOtherTerms(String otherTerms) {
		this.otherTerms = otherTerms;
	}

	public String getPayOnPercent() {
		return this.payOnPercent;
	}
	public void setPayOnPercent(String payOnPercent) {
		this.payOnPercent = payOnPercent;
	}

	public String getPaymentName() {
		return this.paymentName;
	}
	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public List<OpenApiPaymentTermsItemDTO> getPaymentTermsItemList() {
		return this.paymentTermsItemList;
	}
	public void setPaymentTermsItemList(List<OpenApiPaymentTermsItemDTO> paymentTermsItemList) {
		this.paymentTermsItemList = paymentTermsItemList;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getTermSource() {
		return this.termSource;
	}
	public void setTermSource(String termSource) {
		this.termSource = termSource;
	}

}
