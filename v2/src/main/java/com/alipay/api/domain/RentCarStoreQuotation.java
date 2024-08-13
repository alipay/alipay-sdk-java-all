package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝租车门店报价
 *
 * @author auto create
 * @since 1.0, 2024-06-19 11:57:47
 */
public class RentCarStoreQuotation extends AlipayObject {

	private static final long serialVersionUID = 5854795173745365714L;

	/**
	 * 评论数（取用户对商户评论数的总和）
	 */
	@ApiField("comment_num")
	private Long commentNum;

	/**
	 * 评论内容，取用户对商户评论标签中最多的一个返回
	 */
	@ApiField("comment_tag")
	private String commentTag;

	/**
	 * 门店与用户的直线距离，单位米
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 在当前随心租卡片、租期、门店、车型下，随心租可以使用的天数。仅随心租场景可用，其他车型报价场景不需要传
	 */
	@ApiField("easy_card_usable_day_count")
	private Long easyCardUsableDayCount;

	/**
	 * 费用明细，每项费用都是优惠前的金额，请确保费用明细中所有金额加起来等于总金额totalAmount
	 */
	@ApiField("fee_info")
	private RentCarOrderFeeInfo feeInfo;

	/**
	 * isv优惠金额，单位分。仅用于展示，不会参与到优惠计算中
	 */
	@ApiField("isv_discount_amount")
	private Long isvDiscountAmount;

	/**
	 * 门店纬度，高德坐标系
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店经度，高德坐标系
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 服务商当前车型、门店报价的id，用于从支付宝租车页面跳转到服务商页面时，准确定位车型、门店及价格数据
	 */
	@ApiField("quote_id")
	private String quoteId;

	/**
	 * 评论分数(取用户对商户评论分数的权重值：如平均值)，最低分4.0，最高分5.0
	 */
	@ApiField("service_score")
	private String serviceScore;

	/**
	 * 特色服务的列表，特色服务枚举值见 <a href="https://adccloud.yuque.com/adccloud/aqkbzc/bg8fiw#bO71H">特色服务枚举</a>
	 */
	@ApiListField("special_services")
	@ApiField("string")
	private List<String> specialServices;

	/**
	 * 三方系统中的门店id
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 供应商名称
	 */
	@ApiField("supplier_name")
	private String supplierName;

	/**
	 * 在请求参数中如果传了用户购买随心租的订单id，则服务商需要判断哪些车型、门店可以使用哪些随心租 当前字段已废弃(无用字段，废弃不再使用)
	 */
	@ApiListField("support_easy_card_order_ids")
	@ApiField("string")
	@Deprecated
	private List<String> supportEasyCardOrderIds;

	/**
	 * 单位分，例如总价100元，传10000。总价=日租金X日均价+其余费用（例如车辆整备费、基础服务费等）
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 日租金，单位分，例如日租金50元，传5000
	 */
	@ApiField("unit_amount")
	private Long unitAmount;

	/**
	 * 使用随心租后用户需要支付的总价。仅随心租场景使用，其余车辆报价场景不需要传
	 */
	@ApiField("use_easy_card_total_amount")
	private Long useEasyCardTotalAmount;

	public Long getCommentNum() {
		return this.commentNum;
	}
	public void setCommentNum(Long commentNum) {
		this.commentNum = commentNum;
	}

	public String getCommentTag() {
		return this.commentTag;
	}
	public void setCommentTag(String commentTag) {
		this.commentTag = commentTag;
	}

	public Long getDistance() {
		return this.distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public Long getEasyCardUsableDayCount() {
		return this.easyCardUsableDayCount;
	}
	public void setEasyCardUsableDayCount(Long easyCardUsableDayCount) {
		this.easyCardUsableDayCount = easyCardUsableDayCount;
	}

	public RentCarOrderFeeInfo getFeeInfo() {
		return this.feeInfo;
	}
	public void setFeeInfo(RentCarOrderFeeInfo feeInfo) {
		this.feeInfo = feeInfo;
	}

	public Long getIsvDiscountAmount() {
		return this.isvDiscountAmount;
	}
	public void setIsvDiscountAmount(Long isvDiscountAmount) {
		this.isvDiscountAmount = isvDiscountAmount;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getServiceScore() {
		return this.serviceScore;
	}
	public void setServiceScore(String serviceScore) {
		this.serviceScore = serviceScore;
	}

	public List<String> getSpecialServices() {
		return this.specialServices;
	}
	public void setSpecialServices(List<String> specialServices) {
		this.specialServices = specialServices;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getSupplierName() {
		return this.supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public List<String> getSupportEasyCardOrderIds() {
		return this.supportEasyCardOrderIds;
	}
	public void setSupportEasyCardOrderIds(List<String> supportEasyCardOrderIds) {
		this.supportEasyCardOrderIds = supportEasyCardOrderIds;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getUnitAmount() {
		return this.unitAmount;
	}
	public void setUnitAmount(Long unitAmount) {
		this.unitAmount = unitAmount;
	}

	public Long getUseEasyCardTotalAmount() {
		return this.useEasyCardTotalAmount;
	}
	public void setUseEasyCardTotalAmount(Long useEasyCardTotalAmount) {
		this.useEasyCardTotalAmount = useEasyCardTotalAmount;
	}

}
