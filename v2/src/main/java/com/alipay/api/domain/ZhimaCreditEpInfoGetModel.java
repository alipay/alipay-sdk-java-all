package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业工商综合信息查询
 *
 * @author auto create
 * @since 1.0, 2021-03-30 15:11:30
 */
public class ZhimaCreditEpInfoGetModel extends AlipayObject {

	private static final long serialVersionUID = 8528181682539948275L;

	/**
	 * 入参类型。枚举值：1-社会信用代码；2-企业名称；3-企业注册号；4-组织机构代码。
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 入参的数据值。比如data_type=2,则输入企业名称，如阿里巴巴网络技术有限公司。
	 */
	@ApiField("data_value")
	private String dataValue;

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

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDataValue() {
		return this.dataValue;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
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
