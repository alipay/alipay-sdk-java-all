package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 采购平台反舞弊查询
 *
 * @author auto create
 * @since 1.0, 2018-09-04 11:40:29
 */
public class AlipaySecurityRiskAntifraudInternalBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5627827253896925463L;

	/**
	 * 采购金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 蚂蚁信息安全平台为接入方分配的业务key，必须正确
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 采购类别
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 涉及采购的员工列表
	 */
	@ApiListField("role_list")
	@ApiField("string")
	private List<String> roleList;

	/**
	 * 蚂蚁信息安全平台为业务方分配的业务密钥，必须正确。
	 */
	@ApiField("secret_key")
	private String secretKey;

	/**
	 * 供应商列表，jsonArray描述。
	 */
	@ApiListField("supplier_list")
	@ApiField("string")
	private List<String> supplierList;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<String> getRoleList() {
		return this.roleList;
	}
	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

	public String getSecretKey() {
		return this.secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public List<String> getSupplierList() {
		return this.supplierList;
	}
	public void setSupplierList(List<String> supplierList) {
		this.supplierList = supplierList;
	}

}
