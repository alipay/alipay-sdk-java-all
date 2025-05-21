package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业关注名单普惠版
 *
 * @author auto create
 * @since 1.0, 2024-12-12 10:41:22
 */
public class ZhimaCreditWatchlistBriefGetModel extends AlipayObject {

	private static final long serialVersionUID = 6514992449198622462L;

	/**
	 * 与参数cert_type对应，分别为：证件号完整值(例：420983190001010001) 或支付宝uid（例：2088102165398450）
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型 目前支持三种IDENTITY_CARD(身份证),PASSPORT(护照),ALIPAY_USER_ID(支付宝uid)
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户姓名 当证件类型为ALIPAY_USER_ID时可以不填
	 */
	@ApiField("name")
	private String name;

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

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
