package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人信息验证
 *
 * @author auto create
 * @since 1.0, 2020-09-02 13:36:15
 */
public class ZhimaCreditRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6364658921861528698L;

	/**
	 * 申请人证件号，中国大陆18或者15位合法身份号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 芝麻平台服务商模式下的二级商户标识，如果是直连商户调用该接口，不需要设置
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

	/**
	 * 申请人证件姓名，简体中文，长度不超过64，姓名中不含",","/u0001"，"|","&","^","\\"等特殊字符
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码，标记商户接入的具体产品；直接使用每个接口入参中示例值即可
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 申请人与联系人之间关系类型，目前支持4类关系，family(亲友)、workmate(同事)、schoolmate(同学)、friend(朋友)
	 */
	@ApiField("relation")
	private String relation;

	/**
	 * 联系人姓名，简体中文，长度不超过64，姓名中不含",","/u0001"，"|","&","^","\\"等特殊字符
	 */
	@ApiField("relation_name")
	private String relationName;

	/**
	 * 手机号码。中国大陆合法手机号，长度11位，不含国家代码
	 */
	@ApiField("relation_phone")
	private String relationPhone;

	/**
	 * 商户请求的唯一标志，长度64位以内字符串，仅限字母数字下划线组合。该标识作为业务调用的唯一标识，商户要保证其业务唯一性，使用相同transaction_id的查询，芝麻在一段时间内（一般为1天）返回首次查询结果，超过有效期的查询即为无效并返回异常，有效期内的重复查询不重新计费
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getLinkedMerchantId() {
		return this.linkedMerchantId;
	}
	public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
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

	public String getRelation() {
		return this.relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getRelationName() {
		return this.relationName;
	}
	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

	public String getRelationPhone() {
		return this.relationPhone;
	}
	public void setRelationPhone(String relationPhone) {
		this.relationPhone = relationPhone;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
