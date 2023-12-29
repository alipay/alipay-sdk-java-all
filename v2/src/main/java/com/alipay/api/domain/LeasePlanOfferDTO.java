package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁计划报价信息
 *
 * @author auto create
 * @since 1.0, 2023-06-28 14:03:45
 */
public class LeasePlanOfferDTO extends AlipayObject {

	private static final long serialVersionUID = 6435699768351852997L;

	/**
	 * 租赁下单跳转地址
	 */
	@ApiField("lessor_path")
	private String lessorPath;

	/**
	 * 租赁商pid
	 */
	@ApiField("lessor_pid")
	private String lessorPid;

	/**
	 * 报价时间
	 */
	@ApiField("offer_time")
	private Date offerTime;

	/**
	 * sku最低价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 规格id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getLessorPath() {
		return this.lessorPath;
	}
	public void setLessorPath(String lessorPath) {
		this.lessorPath = lessorPath;
	}

	public String getLessorPid() {
		return this.lessorPid;
	}
	public void setLessorPid(String lessorPid) {
		this.lessorPid = lessorPid;
	}

	public Date getOfferTime() {
		return this.offerTime;
	}
	public void setOfferTime(Date offerTime) {
		this.offerTime = offerTime;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
