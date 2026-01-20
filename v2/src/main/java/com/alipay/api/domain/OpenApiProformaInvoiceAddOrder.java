package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 国际新增发票OpenApiOrder
 *
 * @author auto create
 * @since 1.0, 2025-11-12 16:35:55
 */
public class OpenApiProformaInvoiceAddOrder extends AlipayObject {

	private static final long serialVersionUID = 1132596156547262211L;

	/**
	 * 调用方身份识别标记, 一般为系统名, 与业务单据号联合唯一
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务单据号 必填
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 可选, 购方邮箱地址, 会放在开出发票的拓展信息, 后续邮寄使用,多个邮箱使用英文逗号连接
	 */
	@ApiField("buyer_contact_email")
	private String buyerContactEmail;

	/**
	 * 可选, 购买方国家/地区, ISO 3166的两位英文编码
	 */
	@ApiField("buyer_country")
	private String buyerCountry;

	/**
	 * 购方信息
	 */
	@ApiField("buyer_info")
	private OpenApiBuyerInvoiceInfoOrder buyerInfo;

	/**
	 * 可选, 购方OU, 关交场景查询收款账户时使用
	 */
	@ApiField("buyer_inst_id")
	private String buyerInstId;

	/**
	 * 可选, 是否免税 默认N
TaxInvoice+0税率+免税 = debitNote, 即票面不展示税额行
TaxInvoice+0税率+不免税, 票面会展示0税额行
	 */
	@ApiField("duty_free")
	private String dutyFree;

	/**
	 * 费用结束日期  格式(yyyyMMdd)
	 */
	@ApiField("fee_end_dt")
	private String feeEndDt;

	/**
	 * 外部单据传入的用于票面显示的费用期间, 多区间格式化字符串, 使用空格连接
与费用开始结束时间二选一
	 */
	@ApiField("fee_interval_format_str")
	private String feeIntervalFormatStr;

	/**
	 * 费用开始日期  格式(yyyyMMdd), 若传入则与费用结束日期必须同时存在
与外部的格式化费用期间二选一
	 */
	@ApiField("fee_start_dt")
	private String feeStartDt;

	/**
	 * 开票日期, 格式(yyyyMMdd), 不传默认当天
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 可选, 展示在票面的备注
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 发票类型code
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 当地本地, 计价币种与当地币种不一致的时候, 需要进行汇率换算, 符合条件的OU会展示税金折算在票面上
	 */
	@ApiField("local_ccy")
	private String localCcy;

	/**
	 * 可选, 申请原因, 保存在申请表中, 不展示在票面
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 可选, 申请开票方式, 默认为02, InvoiceOrderWayEnum的code
	 */
	@ApiField("order_way")
	private String orderWay;

	/**
	 * 可选, 销方收款账号信息, 不传则以下面的信息进行查询:
销方OU
价格币种
购方国家地区
购方OU(关交)
	 */
	@ApiField("payment_method_order")
	private OpenApiPaymentMethodOrder paymentMethodOrder;

	/**
	 * 商品计价币种, 多币种类MultiCurrencyMoney的currencyValue
	 */
	@ApiField("price_ccy")
	private String priceCcy;

	/**
	 * 商品信息
	 */
	@ApiListField("product_info_orders")
	@ApiField("open_api_product_info_order")
	private List<OpenApiProductInfoOrder> productInfoOrders;

	/**
	 * 可选, 资金是否收回 默认N
未收回才会在票面展示付款银行账户信息
	 */
	@ApiField("received")
	private String received;

	/**
	 * 销方信息
	 */
	@ApiField("seller_info")
	private OpenApiSellerInvoiceInfoOrder sellerInfo;

	/**
	 * 税率, 小于1的两位小数字符串, 例如0.06 0.08, 不带有如%之类的符号
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 可选, 传具体税种如GST/VAT, 不传则默认填充01后台进行税种匹配. 本字段并非可拓展字段设计, 只是用于国际无账单开票的票面展示, 而这种场景税种的填写比较自由, 比如企业所得税corporate income tax, 可以直接填也可以缩写为CIT, 也可以是EIT, 所以无法全部枚举列出.
	 */
	@ApiField("tax_type")
	private String taxType;

	/**
	 * 可选, 是否无账单, 默认Y
	 */
	@ApiField("without_bill")
	private String withoutBill;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBuyerContactEmail() {
		return this.buyerContactEmail;
	}
	public void setBuyerContactEmail(String buyerContactEmail) {
		this.buyerContactEmail = buyerContactEmail;
	}

	public String getBuyerCountry() {
		return this.buyerCountry;
	}
	public void setBuyerCountry(String buyerCountry) {
		this.buyerCountry = buyerCountry;
	}

	public OpenApiBuyerInvoiceInfoOrder getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(OpenApiBuyerInvoiceInfoOrder buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public String getBuyerInstId() {
		return this.buyerInstId;
	}
	public void setBuyerInstId(String buyerInstId) {
		this.buyerInstId = buyerInstId;
	}

	public String getDutyFree() {
		return this.dutyFree;
	}
	public void setDutyFree(String dutyFree) {
		this.dutyFree = dutyFree;
	}

	public String getFeeEndDt() {
		return this.feeEndDt;
	}
	public void setFeeEndDt(String feeEndDt) {
		this.feeEndDt = feeEndDt;
	}

	public String getFeeIntervalFormatStr() {
		return this.feeIntervalFormatStr;
	}
	public void setFeeIntervalFormatStr(String feeIntervalFormatStr) {
		this.feeIntervalFormatStr = feeIntervalFormatStr;
	}

	public String getFeeStartDt() {
		return this.feeStartDt;
	}
	public void setFeeStartDt(String feeStartDt) {
		this.feeStartDt = feeStartDt;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNote() {
		return this.invoiceNote;
	}
	public void setInvoiceNote(String invoiceNote) {
		this.invoiceNote = invoiceNote;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getLocalCcy() {
		return this.localCcy;
	}
	public void setLocalCcy(String localCcy) {
		this.localCcy = localCcy;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOrderWay() {
		return this.orderWay;
	}
	public void setOrderWay(String orderWay) {
		this.orderWay = orderWay;
	}

	public OpenApiPaymentMethodOrder getPaymentMethodOrder() {
		return this.paymentMethodOrder;
	}
	public void setPaymentMethodOrder(OpenApiPaymentMethodOrder paymentMethodOrder) {
		this.paymentMethodOrder = paymentMethodOrder;
	}

	public String getPriceCcy() {
		return this.priceCcy;
	}
	public void setPriceCcy(String priceCcy) {
		this.priceCcy = priceCcy;
	}

	public List<OpenApiProductInfoOrder> getProductInfoOrders() {
		return this.productInfoOrders;
	}
	public void setProductInfoOrders(List<OpenApiProductInfoOrder> productInfoOrders) {
		this.productInfoOrders = productInfoOrders;
	}

	public String getReceived() {
		return this.received;
	}
	public void setReceived(String received) {
		this.received = received;
	}

	public OpenApiSellerInvoiceInfoOrder getSellerInfo() {
		return this.sellerInfo;
	}
	public void setSellerInfo(OpenApiSellerInvoiceInfoOrder sellerInfo) {
		this.sellerInfo = sellerInfo;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getWithoutBill() {
		return this.withoutBill;
	}
	public void setWithoutBill(String withoutBill) {
		this.withoutBill = withoutBill;
	}

}
