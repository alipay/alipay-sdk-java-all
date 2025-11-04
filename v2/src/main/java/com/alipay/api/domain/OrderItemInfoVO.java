package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2025-08-11 14:13:43
 */
public class OrderItemInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2664677995239193653L;

	/**
	 * 商品69码
	 */
	@ApiField("bar_code")
	private String barCode;

	/**
	 * 商品类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品erp编码
	 */
	@ApiField("erp_code")
	private String erpCode;

	/**
	 * 商品图片
	 */
	@ApiField("head_img_url")
	private String headImgUrl;

	/**
	 * 商品名称
	 */
	@ApiField("item_brand")
	private String itemBrand;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private Long itemCnt;

	/**
	 * 商品成色
	 */
	@ApiField("item_condition")
	private String itemCondition;

	/**
	 * 商品成色等级
	 */
	@ApiField("item_condition_grade")
	private String itemConditionGrade;

	/**
	 * 支付宝平台侧商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品退款信息
	 */
	@ApiField("item_refund_info")
	private ItemRefundInfoVO itemRefundInfo;

	/**
	 * 商品标签列表
	 */
	@ApiField("item_tags")
	private ItemTagVO itemTags;

	/**
	 * 本地生活商品凭证信息列表
	 */
	@ApiListField("order_certificate_infos")
	@ApiField("order_certificate_info_v_o")
	private List<OrderCertificateInfoVO> orderCertificateInfos;

	/**
	 * 商户商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商户商品sku_id
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 租赁商品扩展信息
	 */
	@ApiField("rent_item_info")
	private RentItemInfoVO rentItemInfo;

	/**
	 * 商品单价，单位：元,精确到小数点后两位，可以跟上传商品接口的价格不一致
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 发货时效
	 */
	@ApiField("shipping_time_limit")
	private ShippingTimeLimitVO shippingTimeLimit;

	/**
	 * 支付宝侧商品skuid
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getErpCode() {
		return this.erpCode;
	}
	public void setErpCode(String erpCode) {
		this.erpCode = erpCode;
	}

	public String getHeadImgUrl() {
		return this.headImgUrl;
	}
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public String getItemBrand() {
		return this.itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	public Long getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(Long itemCnt) {
		this.itemCnt = itemCnt;
	}

	public String getItemCondition() {
		return this.itemCondition;
	}
	public void setItemCondition(String itemCondition) {
		this.itemCondition = itemCondition;
	}

	public String getItemConditionGrade() {
		return this.itemConditionGrade;
	}
	public void setItemConditionGrade(String itemConditionGrade) {
		this.itemConditionGrade = itemConditionGrade;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public ItemRefundInfoVO getItemRefundInfo() {
		return this.itemRefundInfo;
	}
	public void setItemRefundInfo(ItemRefundInfoVO itemRefundInfo) {
		this.itemRefundInfo = itemRefundInfo;
	}

	public ItemTagVO getItemTags() {
		return this.itemTags;
	}
	public void setItemTags(ItemTagVO itemTags) {
		this.itemTags = itemTags;
	}

	public List<OrderCertificateInfoVO> getOrderCertificateInfos() {
		return this.orderCertificateInfos;
	}
	public void setOrderCertificateInfos(List<OrderCertificateInfoVO> orderCertificateInfos) {
		this.orderCertificateInfos = orderCertificateInfos;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public RentItemInfoVO getRentItemInfo() {
		return this.rentItemInfo;
	}
	public void setRentItemInfo(RentItemInfoVO rentItemInfo) {
		this.rentItemInfo = rentItemInfo;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public ShippingTimeLimitVO getShippingTimeLimit() {
		return this.shippingTimeLimit;
	}
	public void setShippingTimeLimit(ShippingTimeLimitVO shippingTimeLimit) {
		this.shippingTimeLimit = shippingTimeLimit;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
