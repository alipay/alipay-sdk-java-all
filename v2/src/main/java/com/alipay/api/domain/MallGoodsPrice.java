package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品价格信息
 *
 * @author auto create
 * @since 1.0, 2025-06-30 20:23:03
 */
public class MallGoodsPrice extends AlipayObject {

	private static final long serialVersionUID = 3736495444272455785L;

	/**
	 * 商品报价对应sku的属性属性值信息
	 */
	@ApiListField("attr_value_list")
	@ApiField("mall_sku_attr_value")
	private List<MallSkuAttrValue> attrValueList;

	/**
	 * 合同的编码，商品关联的合同
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 价格币种
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 商品规格报价有效开始日期
	 */
	@ApiField("effective_date")
	private Date effectiveDate;

	/**
	 * 商品价格有效结束日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 商品Id，对应商品的唯一标识
	 */
	@ApiField("goods_id")
	private Long goodsId;

	/**
	 * 商品报价ID,商品报价单唯一Id
	 */
	@ApiField("goods_quotation_id")
	private Long goodsQuotationId;

	/**
	 * 是否阶梯价，如果为 y则为阶梯价，n代表非阶梯价格
	 */
	@ApiField("is_ladder_price")
	private String isLadderPrice;

	/**
	 * 阶梯价格列表中存在多个价格
	 */
	@ApiListField("ladder_price_list")
	@ApiField("mall_ladder_price_d_t_o")
	private List<MallLadderPriceDTO> ladderPriceList;

	/**
	 * 产品名称等同于商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 商品规格报价的SKUID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 供应商编码唯一标识
	 */
	@ApiField("supplier_code")
	private String supplierCode;

	/**
	 * 供应商唯一标识Id
	 */
	@ApiField("supplier_id")
	private Long supplierId;

	/**
	 * 商品价格的税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 商品单价,对应价格单位 取字段 currency_code（如CNY，USD）
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public List<MallSkuAttrValue> getAttrValueList() {
		return this.attrValueList;
	}
	public void setAttrValueList(List<MallSkuAttrValue> attrValueList) {
		this.attrValueList = attrValueList;
	}

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Long getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Long getGoodsQuotationId() {
		return this.goodsQuotationId;
	}
	public void setGoodsQuotationId(Long goodsQuotationId) {
		this.goodsQuotationId = goodsQuotationId;
	}

	public String getIsLadderPrice() {
		return this.isLadderPrice;
	}
	public void setIsLadderPrice(String isLadderPrice) {
		this.isLadderPrice = isLadderPrice;
	}

	public List<MallLadderPriceDTO> getLadderPriceList() {
		return this.ladderPriceList;
	}
	public void setLadderPriceList(List<MallLadderPriceDTO> ladderPriceList) {
		this.ladderPriceList = ladderPriceList;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSupplierCode() {
		return this.supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
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

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
