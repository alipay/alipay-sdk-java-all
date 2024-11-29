package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心账单查询
 *
 * @author auto create
 * @since 1.0, 2024-10-23 17:07:23
 */
public class AnttechBlockchainFinanceTvpBillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5783994139879174245L;

	/**
	 * 分页查询，页码。默认 1
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 分页大小，默认500
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 收款方
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
