package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建订单
 *
 * @author auto create
 * @since 1.0, 2025-08-20 14:24:06
 */
public class AlipayOfflineSmddCateringOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1248398177545423117L;

	/**
	 * 商品促销活动，订单确认接口中的 activity_list 透传，无商品促销活动可不传
	 */
	@ApiListField("activity_list")
	@ApiField("activity_bean")
	private List<ActivityBean> activityList;

	/**
	 * 买家唯一标识
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 桌码拓展对象
	 */
	@ApiField("code_ext")
	private CodeExtBean codeExt;

	/**
	 * 就餐人数，单位人。如果没有选择就餐人数，默认传1
	 */
	@ApiField("dining_number")
	private Long diningNumber;

	/**
	 * 备注，用户没填可不传
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 订单类型，固定传 TO_SHOP
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 外部订单号，保证订单全局唯一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 请求时间戳，1970至今毫秒值
	 */
	@ApiField("request_stamp")
	private Long requestStamp;

	/**
	 * 必填信息，用户输入的必填项信息。关于必填项表单渲染，可以从订单必填项查询接口查询
	 */
	@ApiListField("require_info_list")
	@ApiField("require_bean")
	private List<RequireBean> requireInfoList;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * sku列表
	 */
	@ApiListField("sku_list")
	@ApiField("sku_bean")
	private List<SkuBean> skuList;

	/**
	 * 用户看到的配送费，单位元。订单确认接口返回的 delivery_fee 字段
	 */
	@ApiField("view_delivery_cost")
	private String viewDeliveryCost;

	/**
	 * 用户看到需支付金额，单位元。订单确认接口返回的 payment_price 付款价
	 */
	@ApiField("view_total_price")
	private String viewTotalPrice;

	public List<ActivityBean> getActivityList() {
		return this.activityList;
	}
	public void setActivityList(List<ActivityBean> activityList) {
		this.activityList = activityList;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public CodeExtBean getCodeExt() {
		return this.codeExt;
	}
	public void setCodeExt(CodeExtBean codeExt) {
		this.codeExt = codeExt;
	}

	public Long getDiningNumber() {
		return this.diningNumber;
	}
	public void setDiningNumber(Long diningNumber) {
		this.diningNumber = diningNumber;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public Long getRequestStamp() {
		return this.requestStamp;
	}
	public void setRequestStamp(Long requestStamp) {
		this.requestStamp = requestStamp;
	}

	public List<RequireBean> getRequireInfoList() {
		return this.requireInfoList;
	}
	public void setRequireInfoList(List<RequireBean> requireInfoList) {
		this.requireInfoList = requireInfoList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<SkuBean> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<SkuBean> skuList) {
		this.skuList = skuList;
	}

	public String getViewDeliveryCost() {
		return this.viewDeliveryCost;
	}
	public void setViewDeliveryCost(String viewDeliveryCost) {
		this.viewDeliveryCost = viewDeliveryCost;
	}

	public String getViewTotalPrice() {
		return this.viewTotalPrice;
	}
	public void setViewTotalPrice(String viewTotalPrice) {
		this.viewTotalPrice = viewTotalPrice;
	}

}
