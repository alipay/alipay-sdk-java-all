package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心账单查询
 *
 * @author auto create
 * @since 1.0, 2025-07-30 11:54:26
 */
public class AnttechBlockchainFinanceTvpBillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4171566744873632521L;

	/**
	 * 分页查询，页码。从 0 开始
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 收款方账号
	 */
	@ApiField("payee_account")
	private TrustAccountInfo payeeAccount;

	/**
	 * 收款方主体
	 */
	@ApiField("payee_entity")
	private TrustEntityInfo payeeEntity;

	/**
	 * 付款方
	 */
	@ApiField("payer_entity")
	private TrustEntityInfo payerEntity;

	/**
	 * 可信价值中心产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 查询日期
	 */
	@ApiField("query_date")
	private Date queryDate;

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public TrustAccountInfo getPayeeAccount() {
		return this.payeeAccount;
	}
	public void setPayeeAccount(TrustAccountInfo payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public TrustEntityInfo getPayeeEntity() {
		return this.payeeEntity;
	}
	public void setPayeeEntity(TrustEntityInfo payeeEntity) {
		this.payeeEntity = payeeEntity;
	}

	public TrustEntityInfo getPayerEntity() {
		return this.payerEntity;
	}
	public void setPayerEntity(TrustEntityInfo payerEntity) {
		this.payerEntity = payerEntity;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Date getQueryDate() {
		return this.queryDate;
	}
	public void setQueryDate(Date queryDate) {
		this.queryDate = queryDate;
	}

}
