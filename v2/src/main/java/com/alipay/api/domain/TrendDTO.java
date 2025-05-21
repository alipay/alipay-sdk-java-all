package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个股分时点位数据
 *
 * @author auto create
 * @since 1.0, 2025-04-15 16:39:57
 */
public class TrendDTO extends AlipayObject {

	private static final long serialVersionUID = 1135922273343311811L;

	/**
	 * 成交额：根据所属市场，A股元，港股港币元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 均价：根据所属市场，A股元，港股港币元
	 */
	@ApiField("averagePrice")
	private String averagePrice;

	/**
	 * 分时点位分钟时间戳
	 */
	@ApiField("date")
	private String date;

	/**
	 * 参考净值：根据所属市场，A股元，港股港币元
	 */
	@ApiField("iopv")
	private String iopv;

	/**
	 * 分时点位价格：根据所属市场，A股元，港股港币元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 分时点位价格更新的时间戳
	 */
	@ApiField("snapshot_date")
	private String snapshotDate;

	/**
	 * 成交量：根据所属市场，单位股
	 */
	@ApiField("volume")
	private String volume;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAveragePrice() {
		return this.averagePrice;
	}
	public void setAveragePrice(String averagePrice) {
		this.averagePrice = averagePrice;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getIopv() {
		return this.iopv;
	}
	public void setIopv(String iopv) {
		this.iopv = iopv;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSnapshotDate() {
		return this.snapshotDate;
	}
	public void setSnapshotDate(String snapshotDate) {
		this.snapshotDate = snapshotDate;
	}

	public String getVolume() {
		return this.volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}

}
