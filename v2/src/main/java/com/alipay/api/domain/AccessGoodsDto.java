package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品对象
 *
 * @author auto create
 * @since 1.0, 2023-05-11 10:00:45
 */
public class AccessGoodsDto extends AlipayObject {

	private static final long serialVersionUID = 3519746159791115135L;

	/**
	 * contract_code，用于商品同步，由调用方传入
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * data_source，用于商品同步，由调用方传入
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * is_apply_directory_mall，用于商品同步，由调用方传入
	 */
	@ApiField("is_apply_directory_mall")
	private String isApplyDirectoryMall;

	/**
	 * minimum_purchase_quantity，用于商品同步，由调用方传入
	 */
	@ApiField("minimum_purchase_quantity")
	private String minimumPurchaseQuantity;

	/**
	 * quotation_list，用于商品同步，由调用方传入
	 */
	@ApiListField("quotation_list")
	@ApiField("access_quotation_dto")
	private List<AccessQuotationDto> quotationList;

	/**
	 * source_value，用于商品同步，由调用方传入
	 */
	@ApiField("source_value")
	private String sourceValue;

	/**
	 * supplier_id，用于商品同步，由调用方传入
	 */
	@ApiField("supplier_id")
	private Long supplierId;

	/**
	 * 税率，如6%则为6.00
	 */
	@ApiField("tax_rate")
	private String taxRate;

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getIsApplyDirectoryMall() {
		return this.isApplyDirectoryMall;
	}
	public void setIsApplyDirectoryMall(String isApplyDirectoryMall) {
		this.isApplyDirectoryMall = isApplyDirectoryMall;
	}

	public String getMinimumPurchaseQuantity() {
		return this.minimumPurchaseQuantity;
	}
	public void setMinimumPurchaseQuantity(String minimumPurchaseQuantity) {
		this.minimumPurchaseQuantity = minimumPurchaseQuantity;
	}

	public List<AccessQuotationDto> getQuotationList() {
		return this.quotationList;
	}
	public void setQuotationList(List<AccessQuotationDto> quotationList) {
		this.quotationList = quotationList;
	}

	public String getSourceValue() {
		return this.sourceValue;
	}
	public void setSourceValue(String sourceValue) {
		this.sourceValue = sourceValue;
	}

	public Long getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
