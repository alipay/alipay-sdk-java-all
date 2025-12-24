package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditunion.tpp.subscribe response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-07 09:52:17
 */
public class ZhimaCreditEpCreditunionTppSubscribeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8419265997853211235L;

	/** 
	 * 业务单号（唯一的业务单号，商户需要留存，用于关联订阅通知数据）
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 经营者信息（原样返回）
	 */
	@ApiField("business_person")
	private String businessPerson;

	/** 
	 * 企业名称（原样返回）
	 */
	@ApiField("ent_name")
	private String entName;

	/** 
	 * 商户请求ID（原样返回）
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 企业注册号（原样返回）
	 */
	@ApiField("reg_no")
	private String regNo;

	/** 
	 * 入参类型（原样返回）
	 */
	@ApiField("type")
	private String type;

	/** 
	 * 企业统一社会信用代码（原样返回）
	 */
	@ApiField("uscc")
	private String uscc;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setBusinessPerson(String businessPerson) {
		this.businessPerson = businessPerson;
	}
	public String getBusinessPerson( ) {
		return this.businessPerson;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}
	public String getEntName( ) {
		return this.entName;
	}

	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}
	public String getMerchantRequestId( ) {
		return this.merchantRequestId;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getRegNo( ) {
		return this.regNo;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

	public void setUscc(String uscc) {
		this.uscc = uscc;
	}
	public String getUscc( ) {
		return this.uscc;
	}

}
