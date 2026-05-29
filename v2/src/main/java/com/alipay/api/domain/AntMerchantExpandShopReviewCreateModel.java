package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店评价同步
 *
 * @author auto create
 * @since 1.0, 2026-04-16 12:22:45
 */
public class AntMerchantExpandShopReviewCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7894352581859823641L;

	/**
	 * 评价内容id，最长128，需要保证传入的每个评价内容id具备唯一性，有幂等校验
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 数字化门店id；可选，如果传的就使用，如果不传就根据shop_id查询
	 */
	@ApiField("digital_poi_id")
	private String digitalPoiId;

	/**
	 * 支付宝用户open_id(与user_id二选一)
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 评价创建时间
	 */
	@ApiField("review_create_time")
	private Date reviewCreateTime;

	/**
	 * 评价图片信息
	 */
	@ApiField("review_images")
	private String reviewImages;

	/**
	 * 评价修改时间
	 */
	@ApiField("review_modify_time")
	private Date reviewModifyTime;

	/**
	 * 评价文本信息
	 */
	@ApiField("review_text")
	private String reviewText;

	/**
	 * 评价视频信息
	 */
	@ApiField("review_videos")
	private String reviewVideos;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 评分细节(具体样式由业务方提供)
	 */
	@ApiField("star_level")
	private String starLevel;

	/**
	 * 总条评分(1-5)
	 */
	@ApiField("star_level_total")
	private Long starLevelTotal;

	/**
	 * 交易号，如果是退款交易号会长一些
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户user_id
	 */
	@ApiField("user_id")
	private String userId;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getDigitalPoiId() {
		return this.digitalPoiId;
	}
	public void setDigitalPoiId(String digitalPoiId) {
		this.digitalPoiId = digitalPoiId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Date getReviewCreateTime() {
		return this.reviewCreateTime;
	}
	public void setReviewCreateTime(Date reviewCreateTime) {
		this.reviewCreateTime = reviewCreateTime;
	}

	public String getReviewImages() {
		return this.reviewImages;
	}
	public void setReviewImages(String reviewImages) {
		this.reviewImages = reviewImages;
	}

	public Date getReviewModifyTime() {
		return this.reviewModifyTime;
	}
	public void setReviewModifyTime(Date reviewModifyTime) {
		this.reviewModifyTime = reviewModifyTime;
	}

	public String getReviewText() {
		return this.reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public String getReviewVideos() {
		return this.reviewVideos;
	}
	public void setReviewVideos(String reviewVideos) {
		this.reviewVideos = reviewVideos;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStarLevel() {
		return this.starLevel;
	}
	public void setStarLevel(String starLevel) {
		this.starLevel = starLevel;
	}

	public Long getStarLevelTotal() {
		return this.starLevelTotal;
	}
	public void setStarLevelTotal(Long starLevelTotal) {
		this.starLevelTotal = starLevelTotal;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
