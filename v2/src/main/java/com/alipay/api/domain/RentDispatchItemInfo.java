package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁派单商品信息
 *
 * @author auto create
 * @since 1.0, 2026-04-24 10:13:52
 */
public class RentDispatchItemInfo extends AlipayObject {

	private static final long serialVersionUID = 1574678262631812314L;

	/**
	 * 商品数量
	 */
	@ApiField("item_cnt")
	private String itemCnt;

	/**
	 * 商户侧商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商户侧商品sku_id
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 租期天数
	 */
	@ApiField("rent_days")
	private Long rentDays;

	/**
	 * 租期起始时间。匹配格式yyyy-MM-dd HH:mm:ss的date类型
	 */
	@ApiField("rent_start_time")
	private Date rentStartTime;

	public String getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(String itemCnt) {
		this.itemCnt = itemCnt;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public Long getRentDays() {
		return this.rentDays;
	}
	public void setRentDays(Long rentDays) {
		this.rentDays = rentDays;
	}

	public Date getRentStartTime() {
		return this.rentStartTime;
	}
	public void setRentStartTime(Date rentStartTime) {
		this.rentStartTime = rentStartTime;
	}

}
