package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * mpcpromo商家券数据
 *
 * @author auto create
 * @since 1.0, 2023-08-29 13:34:56
 */
public class MpcpromoVoucherList extends AlipayObject {

	private static final long serialVersionUID = 6382794598677858767L;

	/**
	 * 创建商家券活动成功后获取
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 可用城市列表
	 */
	@ApiListField("available_city_list")
	@ApiField("string")
	private List<String> availableCityList;

	/**
	 * 券可使用的门店列表列表
	 */
	@ApiListField("available_shop_ids")
	@ApiField("string")
	private List<String> availableShopIds;

	/**
	 * 不同标签用，分隔
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * 1、服务商平台模式即belong_merchant_info.business_type为ISV时必传 2、上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 1、服务商平台模式即belong_merchant_info.business_type为ISV时必传
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 客服电话和客服链接必须二选一
	 */
	@ApiField("customer_service_mobile")
	private String customerServiceMobile;

	/**
	 * 客服链接
	 */
	@ApiField("customer_service_url")
	private String customerServiceUrl;

	/**
	 * 领券请求失败
	 */
	@ApiField("on_get_coupon_fail")
	private String onGetCouponFail;

	/**
	 * 领券请求成功调用的事件，领券结果可能成功也可能失败。
	 */
	@ApiField("on_get_coupon_success")
	private String onGetCouponSuccess;

	/**
	 * 商家券领券跳转链接、自定义活动地址
	 */
	@ApiField("on_get_coupon_url")
	private String onGetCouponUrl;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券可领结束时间
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 券可领开始时间
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 发放者商户号
	 */
	@ApiField("sender_merchant_id")
	private String senderMerchantId;

	/**
	 * 券总量
	 */
	@ApiField("total_num")
	private Long totalNum;

	/**
	 * 商家券类型：满减、折扣、团购
	 */
	@ApiField("type")
	private String type;

	/**
	 * 1、该字段目前只支持兑换券即voucher_type为EXCHANGE_VOUCHER
	 */
	@ApiField("voucher_comment")
	private String voucherComment;

	/**
	 * 券详细使用说明
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 1、voucher_image填入，该值才能填入； 2、最多3张； 3、兑换券即voucher_type为EXCHANGE_VOUCHER时不支持
	 */
	@ApiListField("voucher_detail_images")
	@ApiField("string")
	private List<String> voucherDetailImages;

	/**
	 * 该字段在兑换券场景下必传，上传图片尺寸670*335，支持格式：png、jpg、jpeg、bmp，大小不超过2MB
	 */
	@ApiField("voucher_image")
	private String voucherImage;

	/**
	 * 优惠规则
	 */
	@ApiField("voucher_rule")
	private String voucherRule;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public List<String> getAvailableCityList() {
		return this.availableCityList;
	}
	public void setAvailableCityList(List<String> availableCityList) {
		this.availableCityList = availableCityList;
	}

	public List<String> getAvailableShopIds() {
		return this.availableShopIds;
	}
	public void setAvailableShopIds(List<String> availableShopIds) {
		this.availableShopIds = availableShopIds;
	}

	public String getBizTag() {
		return this.bizTag;
	}
	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCustomerServiceMobile() {
		return this.customerServiceMobile;
	}
	public void setCustomerServiceMobile(String customerServiceMobile) {
		this.customerServiceMobile = customerServiceMobile;
	}

	public String getCustomerServiceUrl() {
		return this.customerServiceUrl;
	}
	public void setCustomerServiceUrl(String customerServiceUrl) {
		this.customerServiceUrl = customerServiceUrl;
	}

	public String getOnGetCouponFail() {
		return this.onGetCouponFail;
	}
	public void setOnGetCouponFail(String onGetCouponFail) {
		this.onGetCouponFail = onGetCouponFail;
	}

	public String getOnGetCouponSuccess() {
		return this.onGetCouponSuccess;
	}
	public void setOnGetCouponSuccess(String onGetCouponSuccess) {
		this.onGetCouponSuccess = onGetCouponSuccess;
	}

	public String getOnGetCouponUrl() {
		return this.onGetCouponUrl;
	}
	public void setOnGetCouponUrl(String onGetCouponUrl) {
		this.onGetCouponUrl = onGetCouponUrl;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public Date getPublishStartTime() {
		return this.publishStartTime;
	}
	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public String getSenderMerchantId() {
		return this.senderMerchantId;
	}
	public void setSenderMerchantId(String senderMerchantId) {
		this.senderMerchantId = senderMerchantId;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}
	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getVoucherComment() {
		return this.voucherComment;
	}
	public void setVoucherComment(String voucherComment) {
		this.voucherComment = voucherComment;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public List<String> getVoucherDetailImages() {
		return this.voucherDetailImages;
	}
	public void setVoucherDetailImages(List<String> voucherDetailImages) {
		this.voucherDetailImages = voucherDetailImages;
	}

	public String getVoucherImage() {
		return this.voucherImage;
	}
	public void setVoucherImage(String voucherImage) {
		this.voucherImage = voucherImage;
	}

	public String getVoucherRule() {
		return this.voucherRule;
	}
	public void setVoucherRule(String voucherRule) {
		this.voucherRule = voucherRule;
	}

}
