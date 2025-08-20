package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityBean;
import com.alipay.api.domain.SkuBean;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.catering.order.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-20 14:27:36
 */
public class AlipayOfflineSmddCateringOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6793793383549319935L;

	/** 
	 * 活动列表，商品促销活动
	 */
	@ApiListField("activity_list")
	@ApiField("activity_bean")
	private List<ActivityBean> activityList;

	/** 
	 * 运费 单位元
	 */
	@ApiField("delivery_fee")
	private String deliveryFee;

	/** 
	 * 优惠提示文案信息
	 */
	@ApiField("discount_notice_text")
	private String discountNoticeText;

	/** 
	 * 优惠金额 单位元
	 */
	@ApiField("discounted_price")
	private String discountedPrice;

	/** 
	 * 订单确认时友好地异常信息（可以直接透出）
	 */
	@ApiField("exception_msg")
	private String exceptionMsg;

	/** 
	 * 该价格是商品总价-满减优惠的，不包含外送费，打包费，单位元
	 */
	@ApiField("item_total_price")
	private String itemTotalPrice;

	/** 
	 * 购物车原价 单位元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/** 
	 * 打包费 单位元
	 */
	@ApiField("package_fee")
	private String packageFee;

	/** 
	 * 付款价 单位元
	 */
	@ApiField("payment_price")
	private String paymentPrice;

	/** 
	 * sku列表
	 */
	@ApiListField("sku_list")
	@ApiField("sku_bean")
	private List<SkuBean> skuList;

	/** 
	 * 商品总数 单位：个/份
	 */
	@ApiField("total_item")
	private Long totalItem;

	public void setActivityList(List<ActivityBean> activityList) {
		this.activityList = activityList;
	}
	public List<ActivityBean> getActivityList( ) {
		return this.activityList;
	}

	public void setDeliveryFee(String deliveryFee) {
		this.deliveryFee = deliveryFee;
	}
	public String getDeliveryFee( ) {
		return this.deliveryFee;
	}

	public void setDiscountNoticeText(String discountNoticeText) {
		this.discountNoticeText = discountNoticeText;
	}
	public String getDiscountNoticeText( ) {
		return this.discountNoticeText;
	}

	public void setDiscountedPrice(String discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public String getDiscountedPrice( ) {
		return this.discountedPrice;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	public String getExceptionMsg( ) {
		return this.exceptionMsg;
	}

	public void setItemTotalPrice(String itemTotalPrice) {
		this.itemTotalPrice = itemTotalPrice;
	}
	public String getItemTotalPrice( ) {
		return this.itemTotalPrice;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getOriginalPrice( ) {
		return this.originalPrice;
	}

	public void setPackageFee(String packageFee) {
		this.packageFee = packageFee;
	}
	public String getPackageFee( ) {
		return this.packageFee;
	}

	public void setPaymentPrice(String paymentPrice) {
		this.paymentPrice = paymentPrice;
	}
	public String getPaymentPrice( ) {
		return this.paymentPrice;
	}

	public void setSkuList(List<SkuBean> skuList) {
		this.skuList = skuList;
	}
	public List<SkuBean> getSkuList( ) {
		return this.skuList;
	}

	public void setTotalItem(Long totalItem) {
		this.totalItem = totalItem;
	}
	public Long getTotalItem( ) {
		return this.totalItem;
	}

}
