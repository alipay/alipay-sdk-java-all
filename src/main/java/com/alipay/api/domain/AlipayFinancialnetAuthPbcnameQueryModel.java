package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模糊查询联行号信息
 *
 * @author auto create
 * @since 1.0, 2022-11-14 10:13:22
 */
public class AlipayFinancialnetAuthPbcnameQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8377537949286691138L;

	/**
	 * 联行号数据
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 支行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/**
	 * 城市信息
	 */
	@ApiField("city")
	private String city;

	/**
	 * 是否精确匹配
	 */
	@ApiField("exact")
	private Boolean exact;

	/**
	 * 顶级机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 顶级机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 省份信息
	 */
	@ApiField("provice")
	private String provice;

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Boolean getExact() {
		return this.exact;
	}
	public void setExact(Boolean exact) {
		this.exact = exact;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getProvice() {
		return this.provice;
	}
	public void setProvice(String provice) {
		this.provice = provice;
	}

}
