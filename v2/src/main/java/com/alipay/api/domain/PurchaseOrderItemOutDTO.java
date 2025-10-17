package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单明细
 *
 * @author auto create
 * @since 1.0, 2023-09-15 09:58:58
 */
public class PurchaseOrderItemOutDTO extends AlipayObject {

	private static final long serialVersionUID = 4358438476868239686L;

	/**
	 * 地址扩展信息
	 */
	@ApiField("address_ext")
	private String addressExt;

	/**
	 * 收货地址
	 */
	@ApiField("address_id")
	private String addressId;

	/**
	 * 收货地址信息
	 */
	@ApiField("address_info")
	private String addressInfo;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 采购类目code
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 采购用途
	 */
	@ApiField("category_use")
	private String categoryUse;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 数据来源（内部字段）
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 需求方
	 */
	@ApiField("demander")
	private String demander;

	/**
	 * 汇率
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/**
	 * ext_object 当前字段已废弃(不支持json字段数据)
	 */
	@ApiField("ext_object")
	@Deprecated
	private String extObject;

	/**
	 * 商品报价ID
	 */
	@ApiField("goods_quotation_id")
	private String goodsQuotationId;

	/**
	 * 订单行ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 国际贸易术语
	 */
	@ApiField("incoterm")
	private String incoterm;

	/**
	 * 已开票金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 是否按资产管理
	 */
	@ApiField("is_detail_by_asset_management")
	private Boolean isDetailByAssetManagement;

	/**
	 * 是否按照明细下单
	 */
	@ApiField("is_po_by_detail")
	private Boolean isPoByDetail;

	/**
	 * 物品描述
	 */
	@ApiField("item_description")
	private String itemDescription;

	/**
	 * 物品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 行号
	 */
	@ApiField("line_num")
	private Long lineNum;

	/**
	 * 寻源修改的类目
	 */
	@ApiField("modified_category_code")
	private String modifiedCategoryCode;

	/**
	 * 期望交付日期终
	 */
	@ApiField("need_by_date_end")
	private Date needByDateEnd;

	/**
	 * 期望交付日期始
	 */
	@ApiField("need_by_date_start")
	private Date needByDateStart;

	/**
	 * 购买方式
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 原始含税金额
	 */
	@ApiField("origin_tax_amount")
	private String originTaxAmount;

	/**
	 * 原始含税单价
	 */
	@ApiField("origin_tax_unit_price")
	private String originTaxUnitPrice;

	/**
	 * 采购申请单行编号
	 */
	@ApiField("pr_item_number")
	private String prItemNumber;

	/**
	 * 申请单编号
	 */
	@ApiField("pr_number")
	private String prNumber;

	/**
	 * 产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 项目编号
	 */
	@ApiField("project_number")
	private String projectNumber;

	/**
	 * 采购订单id
	 */
	@ApiField("purchase_order_id")
	private String purchaseOrderId;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 接收已使用（计算公式：已接收+接收中-已退货）
	 */
	@ApiField("quantity_received")
	private String quantityReceived;

	/**
	 * 报价单行编码
	 */
	@ApiField("quotation_item_number")
	private String quotationItemNumber;

	/**
	 * 已接收金额
	 */
	@ApiField("received")
	private String received;

	/**
	 * 接收人员工编码
	 */
	@ApiField("receiver")
	private String receiver;

	/**
	 * 产品SKU的ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 规格属性
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 需求表单号
	 */
	@ApiField("sr_number")
	private String srNumber;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 含税金额
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 税码
	 */
	@ApiField("tax_code")
	private String taxCode;

	/**
	 * 税码描述
	 */
	@ApiField("tax_code_desc")
	private String taxCodeDesc;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 含税单价
	 */
	@ApiField("tax_unit_price")
	private String taxUnitPrice;

	/**
	 * 单位
	 */
	@ApiField("uom")
	private String uom;

	public String getAddressExt() {
		return this.addressExt;
	}
	public void setAddressExt(String addressExt) {
		this.addressExt = addressExt;
	}

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryUse() {
		return this.categoryUse;
	}
	public void setCategoryUse(String categoryUse) {
		this.categoryUse = categoryUse;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDemander() {
		return this.demander;
	}
	public void setDemander(String demander) {
		this.demander = demander;
	}

	public String getExchangeRate() {
		return this.exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getExtObject() {
		return this.extObject;
	}
	public void setExtObject(String extObject) {
		this.extObject = extObject;
	}

	public String getGoodsQuotationId() {
		return this.goodsQuotationId;
	}
	public void setGoodsQuotationId(String goodsQuotationId) {
		this.goodsQuotationId = goodsQuotationId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIncoterm() {
		return this.incoterm;
	}
	public void setIncoterm(String incoterm) {
		this.incoterm = incoterm;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public Boolean getIsDetailByAssetManagement() {
		return this.isDetailByAssetManagement;
	}
	public void setIsDetailByAssetManagement(Boolean isDetailByAssetManagement) {
		this.isDetailByAssetManagement = isDetailByAssetManagement;
	}

	public Boolean getIsPoByDetail() {
		return this.isPoByDetail;
	}
	public void setIsPoByDetail(Boolean isPoByDetail) {
		this.isPoByDetail = isPoByDetail;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getLineNum() {
		return this.lineNum;
	}
	public void setLineNum(Long lineNum) {
		this.lineNum = lineNum;
	}

	public String getModifiedCategoryCode() {
		return this.modifiedCategoryCode;
	}
	public void setModifiedCategoryCode(String modifiedCategoryCode) {
		this.modifiedCategoryCode = modifiedCategoryCode;
	}

	public Date getNeedByDateEnd() {
		return this.needByDateEnd;
	}
	public void setNeedByDateEnd(Date needByDateEnd) {
		this.needByDateEnd = needByDateEnd;
	}

	public Date getNeedByDateStart() {
		return this.needByDateStart;
	}
	public void setNeedByDateStart(Date needByDateStart) {
		this.needByDateStart = needByDateStart;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOriginTaxAmount() {
		return this.originTaxAmount;
	}
	public void setOriginTaxAmount(String originTaxAmount) {
		this.originTaxAmount = originTaxAmount;
	}

	public String getOriginTaxUnitPrice() {
		return this.originTaxUnitPrice;
	}
	public void setOriginTaxUnitPrice(String originTaxUnitPrice) {
		this.originTaxUnitPrice = originTaxUnitPrice;
	}

	public String getPrItemNumber() {
		return this.prItemNumber;
	}
	public void setPrItemNumber(String prItemNumber) {
		this.prItemNumber = prItemNumber;
	}

	public String getPrNumber() {
		return this.prNumber;
	}
	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProjectNumber() {
		return this.projectNumber;
	}
	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getPurchaseOrderId() {
		return this.purchaseOrderId;
	}
	public void setPurchaseOrderId(String purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getQuantityReceived() {
		return this.quantityReceived;
	}
	public void setQuantityReceived(String quantityReceived) {
		this.quantityReceived = quantityReceived;
	}

	public String getQuotationItemNumber() {
		return this.quotationItemNumber;
	}
	public void setQuotationItemNumber(String quotationItemNumber) {
		this.quotationItemNumber = quotationItemNumber;
	}

	public String getReceived() {
		return this.received;
	}
	public void setReceived(String received) {
		this.received = received;
	}

	public String getReceiver() {
		return this.receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getSrNumber() {
		return this.srNumber;
	}
	public void setSrNumber(String srNumber) {
		this.srNumber = srNumber;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getTaxCodeDesc() {
		return this.taxCodeDesc;
	}
	public void setTaxCodeDesc(String taxCodeDesc) {
		this.taxCodeDesc = taxCodeDesc;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxUnitPrice() {
		return this.taxUnitPrice;
	}
	public void setTaxUnitPrice(String taxUnitPrice) {
		this.taxUnitPrice = taxUnitPrice;
	}

	public String getUom() {
		return this.uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}

}
