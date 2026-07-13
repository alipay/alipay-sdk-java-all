package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 补充类别信息
 *
 * @author auto create
 * @since 1.0, 2026-05-06 10:54:15
 */
public class SupplementCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 3222259597128739912L;

	/**
	 * 需要补充信息的类别
	 */
	@ApiField("supplement_category")
	private String supplementCategory;

	/**
	 * 当补充项为“其他资料”时，需细化返回相应的其他资料内容
	 */
	@ApiListField("supplement_details_list")
	@ApiField("string")
	private List<String> supplementDetailsList;

	/**
	 * 需要补充的流水金额，单位分。
	 */
	@ApiField("supplement_payment_amt")
	private Long supplementPaymentAmt;

	/**
	 * 给坐席看的回退原因
	 */
	@ApiField("supplement_reason_for_customer_service")
	private String supplementReasonForCustomerService;

	public String getSupplementCategory() {
		return this.supplementCategory;
	}
	public void setSupplementCategory(String supplementCategory) {
		this.supplementCategory = supplementCategory;
	}

	public List<String> getSupplementDetailsList() {
		return this.supplementDetailsList;
	}
	public void setSupplementDetailsList(List<String> supplementDetailsList) {
		this.supplementDetailsList = supplementDetailsList;
	}

	public Long getSupplementPaymentAmt() {
		return this.supplementPaymentAmt;
	}
	public void setSupplementPaymentAmt(Long supplementPaymentAmt) {
		this.supplementPaymentAmt = supplementPaymentAmt;
	}

	public String getSupplementReasonForCustomerService() {
		return this.supplementReasonForCustomerService;
	}
	public void setSupplementReasonForCustomerService(String supplementReasonForCustomerService) {
		this.supplementReasonForCustomerService = supplementReasonForCustomerService;
	}

}
