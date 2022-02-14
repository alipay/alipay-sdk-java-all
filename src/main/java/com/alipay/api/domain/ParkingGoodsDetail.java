package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车运营商品模型
 *
 * @author auto create
 * @since 1.0, 2020-03-17 14:27:08
 */
public class ParkingGoodsDetail extends AlipayObject {

	private static final long serialVersionUID = 6421755277761819736L;

	/**
	 * 1^2^3（表示周一、周二、周三）,此时间与商品履约开始、结束时间取交集，如2019-01-01到2019-03-01期间的周一、周二、周三
	 */
	@ApiField("arg_date_week")
	private String argDateWeek;

	/**
	 * "商品有效时间结束时间，此时间属于日范围内结束时间，如果
结束时间小于开始时间，则默认跨天"
	 */
	@ApiField("arg_end_time")
	private String argEndTime;

	/**
	 * 商品有效时间开始时间，此时间属于日范围内开始时间
	 */
	@ApiField("arg_start_time")
	private String argStartTime;

	/**
	 * 业务参数 json
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 商品可购买结束日期，截止此时间次日0点（针对日租），会按照日期跨度，按照日维度创建多个商品
	 */
	@ApiField("buy_end_date")
	private String buyEndDate;

	/**
	 * 商品可购买开始日期（针对日租）
	 */
	@ApiField("buy_start_date")
	private String buyStartDate;

	/**
	 * 20.00
	 */
	@ApiField("cost_price")
	private String costPrice;

	/**
	 * 总次数(本期暂不支持)
	 */
	@ApiField("count_num")
	private String countNum;

	/**
	 * 现价，保留小数点后两位
	 */
	@ApiField("current_price")
	private String currentPrice;

	/**
	 * 日次数(本期暂不支持)
	 */
	@ApiField("date_num")
	private String dateNum;

	/**
	 * 商品描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 销售结束时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("end_sell_time")
	private String endSellTime;

	/**
	 * 支付宝商品ID列表
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 库存
	 */
	@ApiField("goods_num")
	private String goodsNum;

	/**
	 * "租期类型，01 时租(本期暂不支持)，02 日租，03 周租(本期暂
不支持)，04月租(本期暂不支持)"
	 */
	@ApiField("goods_rent_type")
	private String goodsRentType;

	/**
	 * NOT_EFFECT：下架；EFFECT：上架；PAUSED：已暂停；
	 */
	@ApiField("goods_status")
	private String goodsStatus;

	/**
	 * 商品类型01-按时，02-按次(本期暂不支持)
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 商品关键字
	 */
	@ApiField("keywords")
	private String keywords;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * isv内部产生商品ID
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 支付宝返回停车场ID
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 上架时间，格式"YYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("put_time")
	private String putTime;

	/**
	 * 销售开始时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("start_sell_time")
	private String startSellTime;

	public String getArgDateWeek() {
		return this.argDateWeek;
	}
	public void setArgDateWeek(String argDateWeek) {
		this.argDateWeek = argDateWeek;
	}

	public String getArgEndTime() {
		return this.argEndTime;
	}
	public void setArgEndTime(String argEndTime) {
		this.argEndTime = argEndTime;
	}

	public String getArgStartTime() {
		return this.argStartTime;
	}
	public void setArgStartTime(String argStartTime) {
		this.argStartTime = argStartTime;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getBuyEndDate() {
		return this.buyEndDate;
	}
	public void setBuyEndDate(String buyEndDate) {
		this.buyEndDate = buyEndDate;
	}

	public String getBuyStartDate() {
		return this.buyStartDate;
	}
	public void setBuyStartDate(String buyStartDate) {
		this.buyStartDate = buyStartDate;
	}

	public String getCostPrice() {
		return this.costPrice;
	}
	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public String getCountNum() {
		return this.countNum;
	}
	public void setCountNum(String countNum) {
		this.countNum = countNum;
	}

	public String getCurrentPrice() {
		return this.currentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getDateNum() {
		return this.dateNum;
	}
	public void setDateNum(String dateNum) {
		this.dateNum = dateNum;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getEndSellTime() {
		return this.endSellTime;
	}
	public void setEndSellTime(String endSellTime) {
		this.endSellTime = endSellTime;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsNum() {
		return this.goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getGoodsRentType() {
		return this.goodsRentType;
	}
	public void setGoodsRentType(String goodsRentType) {
		this.goodsRentType = goodsRentType;
	}

	public String getGoodsStatus() {
		return this.goodsStatus;
	}
	public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getKeywords() {
		return this.keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getPutTime() {
		return this.putTime;
	}
	public void setPutTime(String putTime) {
		this.putTime = putTime;
	}

	public String getStartSellTime() {
		return this.startSellTime;
	}
	public void setStartSellTime(String startSellTime) {
		this.startSellTime = startSellTime;
	}

}
