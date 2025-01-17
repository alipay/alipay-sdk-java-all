package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租车报价信息
 *
 * @author auto create
 * @since 1.0, 2024-10-15 14:56:33
 */
public class RentCarQuoteInfo extends AlipayObject {

	private static final long serialVersionUID = 2618774737465256778L;

	/**
	 * spu下报价排序
	 */
	@ApiField("amt_rank_sort")
	private String amtRankSort;

	/**
	 * 租车车类型
	 */
	@ApiField("car_type")
	private String carType;

	/**
	 * 和最优价价差之和(单位元)
	 */
	@ApiField("diff_adv_quote_amt")
	private String diffAdvQuoteAmt;

	/**
	 * 行程结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 服务商名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 实际支付价格(单位元,扣除券后价格)
	 */
	@ApiField("sku_actual_amt")
	private String skuActualAmt;

	/**
	 * 日均单价(单位元)
	 */
	@ApiField("sku_avg_amt")
	private String skuAvgAmt;

	/**
	 * sku车辆ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 门店名
	 */
	@ApiField("sku_sname")
	private String skuSname;

	/**
	 * 优惠前总价（单位元）
	 */
	@ApiField("sku_total_amt")
	private String skuTotalAmt;

	/**
	 * spu车型ID
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * spu车型名称
	 */
	@ApiField("spu_name")
	private String spuName;

	/**
	 * 行程开始详情地址
	 */
	@ApiField("start_address")
	private String startAddress;

	/**
	 * 行程开始城市名
	 */
	@ApiField("start_city_name")
	private String startCityName;

	/**
	 * 行程开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getAmtRankSort() {
		return this.amtRankSort;
	}
	public void setAmtRankSort(String amtRankSort) {
		this.amtRankSort = amtRankSort;
	}

	public String getCarType() {
		return this.carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getDiffAdvQuoteAmt() {
		return this.diffAdvQuoteAmt;
	}
	public void setDiffAdvQuoteAmt(String diffAdvQuoteAmt) {
		this.diffAdvQuoteAmt = diffAdvQuoteAmt;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getSkuActualAmt() {
		return this.skuActualAmt;
	}
	public void setSkuActualAmt(String skuActualAmt) {
		this.skuActualAmt = skuActualAmt;
	}

	public String getSkuAvgAmt() {
		return this.skuAvgAmt;
	}
	public void setSkuAvgAmt(String skuAvgAmt) {
		this.skuAvgAmt = skuAvgAmt;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuSname() {
		return this.skuSname;
	}
	public void setSkuSname(String skuSname) {
		this.skuSname = skuSname;
	}

	public String getSkuTotalAmt() {
		return this.skuTotalAmt;
	}
	public void setSkuTotalAmt(String skuTotalAmt) {
		this.skuTotalAmt = skuTotalAmt;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getSpuName() {
		return this.spuName;
	}
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}

	public String getStartAddress() {
		return this.startAddress;
	}
	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}

	public String getStartCityName() {
		return this.startCityName;
	}
	public void setStartCityName(String startCityName) {
		this.startCityName = startCityName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
