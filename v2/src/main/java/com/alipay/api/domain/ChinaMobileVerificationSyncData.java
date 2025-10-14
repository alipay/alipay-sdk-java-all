package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 移动核销流水集合
 *
 * @author auto create
 * @since 1.0, 2024-11-28 14:26:06
 */
public class ChinaMobileVerificationSyncData extends AlipayObject {

	private static final long serialVersionUID = 3893944857246266883L;

	/**
	 * 核销来源为收银台商家券时必填
	 */
	@ApiField("channel_order_id")
	private String channelOrderId;

	/**
	 * status=1时，可以传失败原因
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 如果核销流水类型为后向同步，该字段必填
	 */
	@ApiField("coupon")
	private String coupon;

	/**
	 * 格式为yyyy-MM-dd HH:mm:ss；
若核销流水撤销标识=0，此值为核销完成时间
若核销流水撤销标识=1，此值为返销完成的时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * decimal(65,2)，支持两位小数；
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 需加密，加密方式与coupon字段一致
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 发放接口里面的订单号，即移动侧发放单号
	 */
	@ApiField("order_item_id")
	private String orderItemId;

	/**
	 * 需加密，加密方式与coupon字段一致
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * decimal(65,2)，支持两位小数；
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 保留字段
	 */
	@ApiField("retain")
	private String retain;

	/**
	 * 发放接口里面的skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 0-分省平台；1-核销平台；2-权益方；3-收银台商家券
第三方对接时为2-权益方；4-小程序核销商家券
	 */
	@ApiField("source")
	private Long source;

	/**
	 * 0-成功；1-失败
核销流水类型=0时，只需传成功状态的流水
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 门店编码
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * decimal(65,2)，支持两位小数；
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 如果核销流水类型为实时流水同步，该字段必填，值为5.7申请核销信息接口返回的全网权益平台核销流水ID
	 */
	@ApiField("verification_id")
	private String verificationId;

	/**
	 * 券类型编码，即该类券在权益方侧的标识，用于区分是券包中的哪张券。非必传，若为券包类型权益必传
	 */
	@ApiField("verification_skucode")
	private String verificationSkucode;

	public String getChannelOrderId() {
		return this.channelOrderId;
	}
	public void setChannelOrderId(String channelOrderId) {
		this.channelOrderId = channelOrderId;
	}

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCoupon() {
		return this.coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getMid() {
		return this.mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getRetain() {
		return this.retain;
	}
	public void setRetain(String retain) {
		this.retain = retain;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Long getSource() {
		return this.source;
	}
	public void setSource(Long source) {
		this.source = source;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getVerificationId() {
		return this.verificationId;
	}
	public void setVerificationId(String verificationId) {
		this.verificationId = verificationId;
	}

	public String getVerificationSkucode() {
		return this.verificationSkucode;
	}
	public void setVerificationSkucode(String verificationSkucode) {
		this.verificationSkucode = verificationSkucode;
	}

}
