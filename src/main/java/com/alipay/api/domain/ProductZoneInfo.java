package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文体业务批量查询场馆产品信息SPI中的产品区间模型。
 *
 * @author auto create
 * @since 1.0, 2021-10-26 15:50:06
 */
public class ProductZoneInfo extends AlipayObject {

	private static final long serialVersionUID = 4775453847298131265L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 产品原价(单位：元),保留2位小数
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 区间唯一ID
	 */
	@ApiField("out_zone_id")
	private String outZoneId;

	/**
	 * 产品售卖价(单位：元),保留2位小数
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 库存,无限库存就99999，日历预订产品是1或0
	 */
	@ApiField("stock_count")
	private Long stockCount;

	/**
	 * 商品规格。日历型票券商品必填，其他类型商品不需要填写。
	 */
	@ApiField("zone_name")
	private String zoneName;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getOutZoneId() {
		return this.outZoneId;
	}
	public void setOutZoneId(String outZoneId) {
		this.outZoneId = outZoneId;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Long getStockCount() {
		return this.stockCount;
	}
	public void setStockCount(Long stockCount) {
		this.stockCount = stockCount;
	}

	public String getZoneName() {
		return this.zoneName;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

}
