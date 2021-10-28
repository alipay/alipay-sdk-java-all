package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺DM营销数据
 *
 * @author auto create
 * @since 1.0, 2017-05-16 17:02:42
 */
public class DmActivityShopData extends AlipayObject {

	private static final long serialVersionUID = 6764575695947656186L;

	/**
	 * 数据创建时间戳
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 数据修改时间戳
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 单日点击人数
	 */
	@ApiField("one_day_click_persons")
	private Long oneDayClickPersons;

	/**
	 * 单日点击次数
	 */
	@ApiField("one_day_click_times")
	private Long oneDayClickTimes;

	/**
	 * 单日点击人数
	 */
	@ApiField("one_day_exposure_times")
	private Long oneDayExposureTimes;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 总点击人数
	 */
	@ApiField("total_click_persons")
	private Long totalClickPersons;

	/**
	 * 总点击次数
	 */
	@ApiField("total_click_times")
	private Long totalClickTimes;

	/**
	 * 总曝光次数
	 */
	@ApiField("total_exposure_times")
	private Long totalExposureTimes;

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getOneDayClickPersons() {
		return this.oneDayClickPersons;
	}
	public void setOneDayClickPersons(Long oneDayClickPersons) {
		this.oneDayClickPersons = oneDayClickPersons;
	}

	public Long getOneDayClickTimes() {
		return this.oneDayClickTimes;
	}
	public void setOneDayClickTimes(Long oneDayClickTimes) {
		this.oneDayClickTimes = oneDayClickTimes;
	}

	public Long getOneDayExposureTimes() {
		return this.oneDayExposureTimes;
	}
	public void setOneDayExposureTimes(Long oneDayExposureTimes) {
		this.oneDayExposureTimes = oneDayExposureTimes;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getTotalClickPersons() {
		return this.totalClickPersons;
	}
	public void setTotalClickPersons(Long totalClickPersons) {
		this.totalClickPersons = totalClickPersons;
	}

	public Long getTotalClickTimes() {
		return this.totalClickTimes;
	}
	public void setTotalClickTimes(Long totalClickTimes) {
		this.totalClickTimes = totalClickTimes;
	}

	public Long getTotalExposureTimes() {
		return this.totalExposureTimes;
	}
	public void setTotalExposureTimes(Long totalExposureTimes) {
		this.totalExposureTimes = totalExposureTimes;
	}

}
