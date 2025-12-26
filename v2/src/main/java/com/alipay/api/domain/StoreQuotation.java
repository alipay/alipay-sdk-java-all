package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租车车辆信息门店报价
 *
 * @author auto create
 * @since 1.0, 2023-07-19 15:57:17
 */
public class StoreQuotation extends AlipayObject {

	private static final long serialVersionUID = 4838233383452912969L;

	/**
	 * 评论数（取用户对商户评论数的总和）	N
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
	 * isv优惠金额，单位分
	 */
	@ApiField("isv_discount_amount")
	private Long isvDiscountAmount;

	/**
	 * 门店坐标纬度，高德坐标系
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店坐标经度，高德坐标系
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 商户自定义的报价id，通过这个id从车辆列表页跳转到订单页时商户可以准确定位门店、车辆。
由于这个字段是后续加的，并且车生活不消费此字段，所以是可选的，但是其实每个商户每个报价都是要传的，为了避免意外情况所以设置的可选。
由于大方用这个字段传递一些额外参数，所以暂时把最大长度设置为2000
	 */
	@ApiField("quote_id")
	private String quoteId;

	/**
	 * 评论分数(取用户对商户评论分数的权重值：如平均值)
	 */
	@ApiField("service_score")
	private String serviceScore;

	/**
	 * 特色服务标签列表
	 */
	@ApiListField("special_services")
	@ApiField("string")
	private List<String> specialServices;

	/**
	 * 门店编码。长度设置100位的原因是哈啰回传的storeCode比较长，例如「2852480814313111552_121.809431_31.151069_1501897333010649089」。在哈啰已经接入并且不影响业务流程的情况下暂时保持现状
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
	 * 总价，单位分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 日租金，单位分
	 */
	@ApiField("unit_amount")
	private Long unitAmount;

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

}
