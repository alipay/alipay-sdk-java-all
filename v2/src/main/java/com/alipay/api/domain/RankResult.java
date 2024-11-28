package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 榜单结果
 *
 * @author auto create
 * @since 1.0, 2024-05-21 16:53:17
 */
public class RankResult extends AlipayObject {

	private static final long serialVersionUID = 5346651999273871615L;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 车辆列表
	 */
	@ApiListField("car_list")
	@ApiField("rank_car")
	private List<RankCar> carList;

	/**
	 * 榜单数据值
销售榜为销售数据
降价榜为百分比值
	 */
	@ApiField("count")
	private String count;

	/**
	 * 降价数值
	 */
	@ApiField("descender_price")
	private String descenderPrice;

	/**
	 * 详细信息
	 */
	@ApiField("detail_info")
	private DetailInfo detailInfo;

	/**
	 * 图片
	 */
	@ApiField("image")
	private String image;

	/**
	 * 上次排名
	 */
	@ApiField("last_rank")
	private String lastRank;

	/**
	 * 上次排名数据值
	 */
	@ApiField("last_rank_value")
	private String lastRankValue;

	/**
	 * max_price
	 */
	@ApiField("max_price")
	private String maxPrice;

	/**
	 * 最低价
	 */
	@ApiField("min_price")
	private String minPrice;

	/**
	 * 排名
	 */
	@ApiField("rank")
	private String rank;

	/**
	 * 排名数据类型
	 */
	@ApiField("rank_data_type")
	private String rankDataType;

	/**
	 * 车系id
	 */
	@ApiField("series_id")
	private String seriesId;

	/**
	 * 车系名称
	 */
	@ApiField("series_name")
	private String seriesName;

	/**
	 * 车系能源类型
	 */
	@ApiField("series_new_energy_type")
	private String seriesNewEnergyType;

	/**
	 * 排行数据说明
	 */
	@ApiField("text")
	private String text;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<RankCar> getCarList() {
		return this.carList;
	}
	public void setCarList(List<RankCar> carList) {
		this.carList = carList;
	}

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getDescenderPrice() {
		return this.descenderPrice;
	}
	public void setDescenderPrice(String descenderPrice) {
		this.descenderPrice = descenderPrice;
	}

	public DetailInfo getDetailInfo() {
		return this.detailInfo;
	}
	public void setDetailInfo(DetailInfo detailInfo) {
		this.detailInfo = detailInfo;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getLastRank() {
		return this.lastRank;
	}
	public void setLastRank(String lastRank) {
		this.lastRank = lastRank;
	}

	public String getLastRankValue() {
		return this.lastRankValue;
	}
	public void setLastRankValue(String lastRankValue) {
		this.lastRankValue = lastRankValue;
	}

	public String getMaxPrice() {
		return this.maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getMinPrice() {
		return this.minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getRank() {
		return this.rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getRankDataType() {
		return this.rankDataType;
	}
	public void setRankDataType(String rankDataType) {
		this.rankDataType = rankDataType;
	}

	public String getSeriesId() {
		return this.seriesId;
	}
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesName() {
		return this.seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getSeriesNewEnergyType() {
		return this.seriesNewEnergyType;
	}
	public void setSeriesNewEnergyType(String seriesNewEnergyType) {
		this.seriesNewEnergyType = seriesNewEnergyType;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
