package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农户产量查询接口
 *
 * @author auto create
 * @since 1.0, 2026-06-16 16:50:43
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerproductionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2173943915366347368L;

	/**
	 * 农户身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 农户ID
	 */
	@ApiField("farmer_id")
	private String farmerId;

	/**
	 * 产粮记录ID
	 */
	@ApiField("farmer_item_id")
	private String farmerItemId;

	/**
	 * 页码，默认1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页条数，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 有效期止（查询范围截止）
	 */
	@ApiField("sale_end_date")
	private String saleEndDate;

	/**
	 * 有效期起（查询范围起始）
	 */
	@ApiField("sale_start_date")
	private String saleStartDate;

	/**
	 * 产品税收编码
	 */
	@ApiField("tax_code")
	private String taxCode;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getFarmerId() {
		return this.farmerId;
	}
	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}

	public String getFarmerItemId() {
		return this.farmerItemId;
	}
	public void setFarmerItemId(String farmerItemId) {
		this.farmerItemId = farmerItemId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSaleEndDate() {
		return this.saleEndDate;
	}
	public void setSaleEndDate(String saleEndDate) {
		this.saleEndDate = saleEndDate;
	}

	public String getSaleStartDate() {
		return this.saleStartDate;
	}
	public void setSaleStartDate(String saleStartDate) {
		this.saleStartDate = saleStartDate;
	}

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

}
