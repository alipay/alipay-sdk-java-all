package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecyclingFarmerItemResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.farmer.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-29 15:12:48
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1571686441822279138L;

	/** 
	 * 支付宝账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 支付宝账号类型
	 */
	@ApiField("account_type")
	private String accountType;

	/** 
	 * 农户身份证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 农户代卖人关系确认状态
	 */
	@ApiField("confirm_status")
	private String confirmStatus;

	/** 
	 * 农户授权链接
	 */
	@ApiField("farmer_auth_url")
	private String farmerAuthUrl;

	/** 
	 * 农户ID
	 */
	@ApiField("farmer_id")
	private String farmerId;

	/** 
	 * 农户产粮信息列表
	 */
	@ApiListField("farmer_item_list")
	@ApiField("recycling_farmer_item_result")
	private List<RecyclingFarmerItemResult> farmerItemList;

	/** 
	 * 农户姓名
	 */
	@ApiField("farmer_name")
	private String farmerName;

	/** 
	 * 农户类型
	 */
	@ApiListField("farmer_type_list")
	@ApiField("string")
	private List<String> farmerTypeList;

	/** 
	 * 是否为家庭主人/家庭主导者
	 */
	@ApiField("is_family_master")
	private String isFamilyMaster;

	/** 
	 * 代卖人身份证件号
	 */
	@ApiField("proxy_cert_no")
	private String proxyCertNo;

	/** 
	 * 代卖人姓名
	 */
	@ApiField("proxy_name")
	private String proxyName;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType( ) {
		return this.accountType;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}
	public String getConfirmStatus( ) {
		return this.confirmStatus;
	}

	public void setFarmerAuthUrl(String farmerAuthUrl) {
		this.farmerAuthUrl = farmerAuthUrl;
	}
	public String getFarmerAuthUrl( ) {
		return this.farmerAuthUrl;
	}

	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}
	public String getFarmerId( ) {
		return this.farmerId;
	}

	public void setFarmerItemList(List<RecyclingFarmerItemResult> farmerItemList) {
		this.farmerItemList = farmerItemList;
	}
	public List<RecyclingFarmerItemResult> getFarmerItemList( ) {
		return this.farmerItemList;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getFarmerName( ) {
		return this.farmerName;
	}

	public void setFarmerTypeList(List<String> farmerTypeList) {
		this.farmerTypeList = farmerTypeList;
	}
	public List<String> getFarmerTypeList( ) {
		return this.farmerTypeList;
	}

	public void setIsFamilyMaster(String isFamilyMaster) {
		this.isFamilyMaster = isFamilyMaster;
	}
	public String getIsFamilyMaster( ) {
		return this.isFamilyMaster;
	}

	public void setProxyCertNo(String proxyCertNo) {
		this.proxyCertNo = proxyCertNo;
	}
	public String getProxyCertNo( ) {
		return this.proxyCertNo;
	}

	public void setProxyName(String proxyName) {
		this.proxyName = proxyName;
	}
	public String getProxyName( ) {
		return this.proxyName;
	}

}
