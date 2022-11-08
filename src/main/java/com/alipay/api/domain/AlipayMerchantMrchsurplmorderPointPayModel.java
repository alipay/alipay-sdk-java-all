package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * LinkedMall下单之前调用积分扣减做权益兑换
 *
 * @author auto create
 * @since 1.0, 2022-05-09 20:28:54
 */
public class AlipayMerchantMrchsurplmorderPointPayModel extends AlipayObject {

	private static final long serialVersionUID = 3872451893627945844L;

	/**
	 * LinkedMall入驻的业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 请求发起的时间，时间格式：yyyyMMddHHmmssSSS
	 */
	@ApiField("deducted_date")
	private String deductedDate;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * LinkedMall的订单ID
	 */
	@ApiField("lm_order_id")
	private Long lmOrderId;

	/**
	 * 下单的扩展属性
	 */
	@ApiField("merchant_exts")
	private String merchantExts;

	/**
	 * 本次下单需要扣减的积分数
	 */
	@ApiField("point")
	private Long point;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * skuId
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDeductedDate() {
		return this.deductedDate;
	}
	public void setDeductedDate(String deductedDate) {
		this.deductedDate = deductedDate;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(Long lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public String getMerchantExts() {
		return this.merchantExts;
	}
	public void setMerchantExts(String merchantExts) {
		this.merchantExts = merchantExts;
	}

	public Long getPoint() {
		return this.point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
