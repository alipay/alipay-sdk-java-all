package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OU查询2
 *
 * @author auto create
 * @since 1.0, 2021-11-15 11:49:47
 */
public class AlipayBossProdCompanyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2558969268651683499L;

	/**
	 * 请求id
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 公司名称
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 当前系统名称
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
