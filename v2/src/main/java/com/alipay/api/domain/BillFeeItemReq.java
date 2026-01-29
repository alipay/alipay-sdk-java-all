package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费用明细对象
 *
 * @author auto create
 * @since 1.0, 2025-12-12 10:22:53
 */
public class BillFeeItemReq extends AlipayObject {

	private static final long serialVersionUID = 1645856813791328996L;

	/**
	 * 费用金额，单位分
	 */
	@ApiField("fee_amount")
	private Long feeAmount;

	/**
	 * 费用真实描述，注意和feeTitle区分开，此描述长度请保持在16个字以内 此字段直接显示在费用明细页面中
	 */
	@ApiField("fee_desc")
	private String feeDesc;

	/**
	 * 费用类型标识,枚举值,参考线下文档
	 */
	@ApiField("fee_id")
	private String feeId;

	/**
	 * 费用标题
	 */
	@ApiField("fee_title")
	private String feeTitle;

	public Long getFeeAmount() {
		return this.feeAmount;
	}
	public void setFeeAmount(Long feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFeeDesc() {
		return this.feeDesc;
	}
	public void setFeeDesc(String feeDesc) {
		this.feeDesc = feeDesc;
	}

	public String getFeeId() {
		return this.feeId;
	}
	public void setFeeId(String feeId) {
		this.feeId = feeId;
	}

	public String getFeeTitle() {
		return this.feeTitle;
	}
	public void setFeeTitle(String feeTitle) {
		this.feeTitle = feeTitle;
	}

}
