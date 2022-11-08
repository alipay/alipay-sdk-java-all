package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业地址查询
 *
 * @author auto create
 * @since 1.0, 2022-08-17 18:48:25
 */
public class AlipayCommerceEcEnterpriseAddressQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6124437339727463338L;

	/**
	 * 共同账户id和enterprise_id二选一
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 地址id
	 */
	@ApiField("address_id")
	private String addressId;

	/**
	 * 协议号，如果填共同账户id，则该字段必填
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 企业id和account_id二选一
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 页码从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数据
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
