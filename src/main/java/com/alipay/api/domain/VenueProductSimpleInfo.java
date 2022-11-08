package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文体业务订单的简化产品模型，用于订单同步
 *
 * @author auto create
 * @since 1.0, 2022-06-07 18:02:30
 */
public class VenueProductSimpleInfo extends AlipayObject {

	private static final long serialVersionUID = 1442714337553464966L;

	/**
	 * 商品规格名称。可以是场地名称（比如羽毛球场地1）。当产品类型为日历型或者日历型票券时必填。
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 商品购买数量
	 */
	@ApiField("count")
	private String count;

	/**
	 * 商品使用结束时间（Date类型），结束时间非空时必须有开始时间传值，且开始时间必须早于结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 订单中产品记录主键id，全局唯一。
	 */
	@ApiField("order_product_id")
	private String orderProductId;

	/**
	 * 商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 商品类型，'calendar'-日历型，'ticket'-票券，'course'-课程，'calendar_ticket'-日历型票券，'others'-其他商品
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 产品售卖价(单位：元),保留2位小数
	 */
	@ApiField("sale_amount")
	private String saleAmount;

	/**
	 * 商品使用开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 产品规格信息，仅日历型票券商品需要配置该字段
	 */
	@ApiField("zone_name")
	private String zoneName;

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getOrderProductId() {
		return this.orderProductId;
	}
	public void setOrderProductId(String orderProductId) {
		this.orderProductId = orderProductId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSaleAmount() {
		return this.saleAmount;
	}
	public void setSaleAmount(String saleAmount) {
		this.saleAmount = saleAmount;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getZoneName() {
		return this.zoneName;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

}
