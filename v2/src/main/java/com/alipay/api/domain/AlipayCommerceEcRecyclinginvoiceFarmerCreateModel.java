package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反向农户信息创建
 *
 * @author auto create
 * @since 1.0, 2026-04-29 14:58:44
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7318137269441842522L;

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
	 * 农户产粮信息列表
	 */
	@ApiListField("farmer_item_list")
	@ApiField("recycling_farmer_item_request")
	private List<RecyclingFarmerItemRequest> farmerItemList;

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
	 * 代卖人信息
	 */
	@ApiField("recycling_proxy")
	private RecyclingProxyRequest recyclingProxy;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public List<RecyclingFarmerItemRequest> getFarmerItemList() {
		return this.farmerItemList;
	}
	public void setFarmerItemList(List<RecyclingFarmerItemRequest> farmerItemList) {
		this.farmerItemList = farmerItemList;
	}

	public String getFarmerName() {
		return this.farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public List<String> getFarmerTypeList() {
		return this.farmerTypeList;
	}
	public void setFarmerTypeList(List<String> farmerTypeList) {
		this.farmerTypeList = farmerTypeList;
	}

	public String getIsFamilyMaster() {
		return this.isFamilyMaster;
	}
	public void setIsFamilyMaster(String isFamilyMaster) {
		this.isFamilyMaster = isFamilyMaster;
	}

	public RecyclingProxyRequest getRecyclingProxy() {
		return this.recyclingProxy;
	}
	public void setRecyclingProxy(RecyclingProxyRequest recyclingProxy) {
		this.recyclingProxy = recyclingProxy;
	}

}
