package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文体业务批量查询场馆产品信息SPI中的产品模型。
 *
 * @author auto create
 * @since 1.0, 2021-10-26 15:44:26
 */
public class ProductInfo extends AlipayObject {

	private static final long serialVersionUID = 8529259669143895412L;

	/**
	 * 场馆的产品购买限制规则信息
	 */
	@ApiField("can_buy_rule")
	private ProductBuyLimitRule canBuyRule;

	/**
	 * 是否支持退款，可退款为true，不可退款为false，不传默认true可退款
	 */
	@ApiField("can_refund")
	private Boolean canRefund;

	/**
	 * 产品开始使用前多长时间(分钟)可退款，不传默认开始前30分钟都可退款；产品不可退款(can_refund=false)时不需要传值。
	 */
	@ApiField("can_refund_minute")
	private Long canRefundMinute;

	/**
	 * 产品分类列表
	 */
	@ApiListField("category_list")
	@ApiField("product_category_info")
	private List<ProductCategoryInfo> categoryList;

	/**
	 * 产品描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 产品使用结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 产品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 须知
	 */
	@ApiField("notice")
	private String notice;

	/**
	 * 产品原价(单位：元),保留2位小数
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 服务商的产品ID
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * 产品海报图片地址
	 */
	@ApiField("poster")
	private String poster;

	/**
	 * 产品类型
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 退改规则的自定义文本描述
	 */
	@ApiField("refund_desc")
	private String refundDesc;

	/**
	 * 产品售卖价(单位：元),保留2位小数
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 产品可使用开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 产品库存,无限库存就99999
	 */
	@ApiField("stock_count")
	private Long stockCount;

	/**
	 * 核销时是否需要用户姓名，为true时需要用户姓名，为false为空值时不需要用户姓名，默认为空值不需要用户姓名。
	 */
	@ApiField("user_name_required")
	private Boolean userNameRequired;

	/**
	 * 凭证类型：
1-动态二维码
2-静态二维码
3-购买信息(订单号-姓名-手机号)
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 凭证核销方式：
核销方式：
1-无需核销(已支付- >订单完成)
2-自动核销(已支付- >时间超过产品使用时间- >订单完成)
3-服务商核销确认(已支付- >对接核销通知接口- >订单完成)
	 */
	@ApiField("voucher_verify_type")
	private String voucherVerifyType;

	public ProductBuyLimitRule getCanBuyRule() {
		return this.canBuyRule;
	}
	public void setCanBuyRule(ProductBuyLimitRule canBuyRule) {
		this.canBuyRule = canBuyRule;
	}

	public Boolean getCanRefund() {
		return this.canRefund;
	}
	public void setCanRefund(Boolean canRefund) {
		this.canRefund = canRefund;
	}

	public Long getCanRefundMinute() {
		return this.canRefundMinute;
	}
	public void setCanRefundMinute(Long canRefundMinute) {
		this.canRefundMinute = canRefundMinute;
	}

	public List<ProductCategoryInfo> getCategoryList() {
		return this.categoryList;
	}
	public void setCategoryList(List<ProductCategoryInfo> categoryList) {
		this.categoryList = categoryList;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNotice() {
		return this.notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	public String getPoster() {
		return this.poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getRefundDesc() {
		return this.refundDesc;
	}
	public void setRefundDesc(String refundDesc) {
		this.refundDesc = refundDesc;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Long getStockCount() {
		return this.stockCount;
	}
	public void setStockCount(Long stockCount) {
		this.stockCount = stockCount;
	}

	public Boolean getUserNameRequired() {
		return this.userNameRequired;
	}
	public void setUserNameRequired(Boolean userNameRequired) {
		this.userNameRequired = userNameRequired;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public String getVoucherVerifyType() {
		return this.voucherVerifyType;
	}
	public void setVoucherVerifyType(String voucherVerifyType) {
		this.voucherVerifyType = voucherVerifyType;
	}

}
