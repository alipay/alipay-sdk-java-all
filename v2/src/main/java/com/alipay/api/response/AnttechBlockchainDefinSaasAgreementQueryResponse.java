package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.saas.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-22 14:50:18
 */
public class AnttechBlockchainDefinSaasAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7672239995764518766L;

	/** 
	 * 是否有效
	 */
	@ApiField("active_flag")
	private Boolean activeFlag;

	/** 
	 * 到期时间
	 */
	@ApiField("end_time")
	private String endTime;

	/** 
	 * 外部业务平台的用户ID
	 */
	@ApiField("out_member_id")
	private String outMemberId;

	/** 
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	/** 
	 * 签约产品的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 签约产品的产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/** 
	 * 签约的产品类型
	 */
	@ApiField("product_type")
	private String productType;

	/** 
	 * 签约时间
	 */
	@ApiField("signing_time")
	private String signingTime;

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	public Boolean getActiveFlag( ) {
		return this.activeFlag;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setOutMemberId(String outMemberId) {
		this.outMemberId = outMemberId;
	}
	public String getOutMemberId( ) {
		return this.outMemberId;
	}

	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}
	public String getPlatformMemberId( ) {
		return this.platformMemberId;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName( ) {
		return this.productName;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductType( ) {
		return this.productType;
	}

	public void setSigningTime(String signingTime) {
		this.signingTime = signingTime;
	}
	public String getSigningTime( ) {
		return this.signingTime;
	}

}
