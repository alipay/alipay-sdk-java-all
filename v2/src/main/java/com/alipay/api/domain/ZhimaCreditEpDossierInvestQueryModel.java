package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业对外投资查询
 *
 * @author auto create
 * @since 1.0, 2024-12-24 14:22:18
 */
public class ZhimaCreditEpDossierInvestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6254726588811156738L;

	/**
	 * 企业注册号或统一社会信用代码，一般为18位
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 分页用参数，代表请求结果的起始位置，默认1
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 返回 size 条记录，默认值为10，最大值为50
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 企业对外投资产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
