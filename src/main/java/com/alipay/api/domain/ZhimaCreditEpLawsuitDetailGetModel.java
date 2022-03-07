package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业涉诉详情查询
 *
 * @author auto create
 * @since 1.0, 2021-03-30 15:09:43
 */
public class ZhimaCreditEpLawsuitDetailGetModel extends AlipayObject {

	private static final long serialVersionUID = 4839135533653726349L;

	/**
	 * 涉诉id
	 */
	@ApiField("lawsuit_id")
	private String lawsuitId;

	/**
	 * 涉诉类型。枚举值：cpws-裁判文书; zxgg-执行公告; sxgg-失信公告; ktgg-开庭公告; fygg-法院公告; ajlc-案件流程信息; bgt-曝光台
	 */
	@ApiField("lawsuit_type")
	private String lawsuitType;

	/**
	 * 产品码，直接使用［示例］给出的值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性，对于用户使用相同transaction_id的查询，芝麻在一天（86400秒）内返回首次查询数据，超过有效期的查询即为无效并返回异常，有效期内的重复查询不重新计费
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getLawsuitId() {
		return this.lawsuitId;
	}
	public void setLawsuitId(String lawsuitId) {
		this.lawsuitId = lawsuitId;
	}

	public String getLawsuitType() {
		return this.lawsuitType;
	}
	public void setLawsuitType(String lawsuitType) {
		this.lawsuitType = lawsuitType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
