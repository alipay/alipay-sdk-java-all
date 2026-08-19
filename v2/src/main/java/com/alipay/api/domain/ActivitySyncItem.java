package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-18 15:27:48
 */
public class ActivitySyncItem extends AlipayObject {

	private static final long serialVersionUID = 6259434814756954393L;

	/**
	 * 单次同步活动商品只能维护20种，超过20种需要上传完整活动商品，则需要分批上传，用于描述所属具体活动id的批次
	 */
	@ApiField("activity_batch_id")
	private String activityBatchId;

	/**
	 * 活动描述
	 */
	@ApiField("activity_description")
	private String activityDescription;

	/**
	 * 活动结束时间
	 */
	@ApiField("activity_end_time")
	private Date activityEndTime;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动Slogan
	 */
	@ApiField("activity_slogan")
	private String activitySlogan;

	/**
	 * 活动开始时间
	 */
	@ApiField("activity_start_time")
	private Date activityStartTime;

	/**
	 * 支付宝定义的活动类型，严格要求按照
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 用于表述商家的具体活动Id
	 */
	@ApiField("merchant_activity_id")
	private String merchantActivityId;

	/**
	 * null
	 */
	@ApiListField("products")
	@ApiField("product_sync_item")
	private List<ProductSyncItem> products;

	/**
	 * 支付宝定义来源渠道编码，必须按照规范传入
	 */
	@ApiField("source_channel_code")
	private String sourceChannelCode;

	/**
	 * 来源渠道名称
	 */
	@ApiField("source_channel_name")
	private String sourceChannelName;

	/**
	 * 上传的文件Id，图片大小60*60，单个文件不超过50kb，支持格式：JPG/JPEG/PNG
	 */
	@ApiField("source_logo")
	private String sourceLogo;

	public String getActivityBatchId() {
		return this.activityBatchId;
	}
	public void setActivityBatchId(String activityBatchId) {
		this.activityBatchId = activityBatchId;
	}

	public String getActivityDescription() {
		return this.activityDescription;
	}
	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}

	public Date getActivityEndTime() {
		return this.activityEndTime;
	}
	public void setActivityEndTime(Date activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivitySlogan() {
		return this.activitySlogan;
	}
	public void setActivitySlogan(String activitySlogan) {
		this.activitySlogan = activitySlogan;
	}

	public Date getActivityStartTime() {
		return this.activityStartTime;
	}
	public void setActivityStartTime(Date activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getMerchantActivityId() {
		return this.merchantActivityId;
	}
	public void setMerchantActivityId(String merchantActivityId) {
		this.merchantActivityId = merchantActivityId;
	}

	public List<ProductSyncItem> getProducts() {
		return this.products;
	}
	public void setProducts(List<ProductSyncItem> products) {
		this.products = products;
	}

	public String getSourceChannelCode() {
		return this.sourceChannelCode;
	}
	public void setSourceChannelCode(String sourceChannelCode) {
		this.sourceChannelCode = sourceChannelCode;
	}

	public String getSourceChannelName() {
		return this.sourceChannelName;
	}
	public void setSourceChannelName(String sourceChannelName) {
		this.sourceChannelName = sourceChannelName;
	}

	public String getSourceLogo() {
		return this.sourceLogo;
	}
	public void setSourceLogo(String sourceLogo) {
		this.sourceLogo = sourceLogo;
	}

}
