package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.codec.acode.decode.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:34
 */
public class AlipayPayCodecAcodeDecodeUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6286617248832889573L;

	/** 
	 * 业务身份标识符
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 业务机构代码
	 */
	@ApiField("biz_inst_code")
	private String bizInstCode;

	/** 
	 * 业务信息，默认为空
	 */
	@ApiField("business_info")
	private String businessInfo;

	/** 
	 * 码值产生时间(Long型)
	 */
	@ApiField("create_time")
	private Long createTime;

	/** 
	 * 发码机构代码
	 */
	@ApiField("encode_inst_code")
	private String encodeInstCode;

	/** 
	 * 码值失效时间(Long型)
	 */
	@ApiField("expire_time")
	private Long expireTime;

	/** 
	 * 支付账户
	 */
	@ApiField("pay_account")
	private String payAccount;

	/** 
	 * 支付账户支付授权时间（Long型）
	 */
	@ApiField("pay_account_auth_expire")
	private Long payAccountAuthExpire;

	/** 
	 * 支付金额(单位:元)
	 */
	@ApiField("pay_amount_limit")
	private String payAmountLimit;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setBizInstCode(String bizInstCode) {
		this.bizInstCode = bizInstCode;
	}
	public String getBizInstCode( ) {
		return this.bizInstCode;
	}

	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
	}
	public String getBusinessInfo( ) {
		return this.businessInfo;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getCreateTime( ) {
		return this.createTime;
	}

	public void setEncodeInstCode(String encodeInstCode) {
		this.encodeInstCode = encodeInstCode;
	}
	public String getEncodeInstCode( ) {
		return this.encodeInstCode;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}
	public Long getExpireTime( ) {
		return this.expireTime;
	}

	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}
	public String getPayAccount( ) {
		return this.payAccount;
	}

	public void setPayAccountAuthExpire(Long payAccountAuthExpire) {
		this.payAccountAuthExpire = payAccountAuthExpire;
	}
	public Long getPayAccountAuthExpire( ) {
		return this.payAccountAuthExpire;
	}

	public void setPayAmountLimit(String payAmountLimit) {
		this.payAmountLimit = payAmountLimit;
	}
	public String getPayAmountLimit( ) {
		return this.payAmountLimit;
	}

}
