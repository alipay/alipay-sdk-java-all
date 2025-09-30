package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用电用户信息列表
 *
 * @author auto create
 * @since 1.0, 2025-01-21 09:54:45
 */
public class AnttechBlockchainFinanceElectricUserBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2616518922974957736L;

	/**
	 * 合约码
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 分页参数页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 分页参数查询页实例数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAgreementCode() {
		return this.agreementCode;
	}
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}

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

}
