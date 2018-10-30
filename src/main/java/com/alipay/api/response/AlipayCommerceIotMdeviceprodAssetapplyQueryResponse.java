package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.assetapply.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-09-11 15:30:21
 */
public class AlipayCommerceIotMdeviceprodAssetapplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4131899715595721195L;

	/** 
	 * 申请的服务商名称；
内部接口，给供应商系统调用
	 */
	@ApiField("apply_isv_name")
	private String applyIsvName;

	/** 
	 * 申请的服务商的PID
	 */
	@ApiField("apply_isv_pid")
	private String applyIsvPid;

	/** 
	 * 申请商户的手机
内部接口，给供应商系统使用
	 */
	@ApiField("apply_merchant_mobile")
	private String applyMerchantMobile;

	/** 
	 * 申请商户的名称;
内部接口，给供应商系统调用
	 */
	@ApiField("apply_merchant_name")
	private String applyMerchantName;

	/** 
	 * 申请商户的PID
	 */
	@ApiField("apply_merchant_pid")
	private String applyMerchantPid;

	/** 
	 * 物料申请人手机号；
内部接口，给供应商使用；
	 */
	@ApiField("apply_person_mobile")
	private String applyPersonMobile;

	/** 
	 * 物料申请人的名字；
内部使用接口，给供应商平台调用，需要展示申请人姓名
	 */
	@ApiField("apply_person_name")
	private String applyPersonName;

	public void setApplyIsvName(String applyIsvName) {
		this.applyIsvName = applyIsvName;
	}
	public String getApplyIsvName( ) {
		return this.applyIsvName;
	}

	public void setApplyIsvPid(String applyIsvPid) {
		this.applyIsvPid = applyIsvPid;
	}
	public String getApplyIsvPid( ) {
		return this.applyIsvPid;
	}

	public void setApplyMerchantMobile(String applyMerchantMobile) {
		this.applyMerchantMobile = applyMerchantMobile;
	}
	public String getApplyMerchantMobile( ) {
		return this.applyMerchantMobile;
	}

	public void setApplyMerchantName(String applyMerchantName) {
		this.applyMerchantName = applyMerchantName;
	}
	public String getApplyMerchantName( ) {
		return this.applyMerchantName;
	}

	public void setApplyMerchantPid(String applyMerchantPid) {
		this.applyMerchantPid = applyMerchantPid;
	}
	public String getApplyMerchantPid( ) {
		return this.applyMerchantPid;
	}

	public void setApplyPersonMobile(String applyPersonMobile) {
		this.applyPersonMobile = applyPersonMobile;
	}
	public String getApplyPersonMobile( ) {
		return this.applyPersonMobile;
	}

	public void setApplyPersonName(String applyPersonName) {
		this.applyPersonName = applyPersonName;
	}
	public String getApplyPersonName( ) {
		return this.applyPersonName;
	}

}
