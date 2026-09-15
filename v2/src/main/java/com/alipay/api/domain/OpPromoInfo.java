package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-11 16:42:57
 */
public class OpPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 2316576185779472773L;

	/**
	 * 优惠数量
	 */
	@ApiField("promo_cnt")
	private Long promoCnt;

	/**
	 * 优惠补充说明
	 */
	@ApiField("promo_desc")
	private String promoDesc;

	/**
	 * 优惠到期时间
	 */
	@ApiField("promo_expired_time")
	private Date promoExpiredTime;

	/**
	 * 优惠id
	 */
	@ApiField("promo_id")
	private String promoId;

	/**
	 * 优惠名称
	 */
	@ApiField("promo_name")
	private String promoName;

	/**
	 * 单个优惠价值，单位为元
	 */
	@ApiField("promo_price")
	private String promoPrice;

	/**
	 * 优惠类型
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 优惠数量单位，如个、份
	 */
	@ApiField("promo_unit")
	private String promoUnit;

	public Long getPromoCnt() {
		return this.promoCnt;
	}
	public void setPromoCnt(Long promoCnt) {
		this.promoCnt = promoCnt;
	}

	public String getPromoDesc() {
		return this.promoDesc;
	}
	public void setPromoDesc(String promoDesc) {
		this.promoDesc = promoDesc;
	}

	public Date getPromoExpiredTime() {
		return this.promoExpiredTime;
	}
	public void setPromoExpiredTime(Date promoExpiredTime) {
		this.promoExpiredTime = promoExpiredTime;
	}

	public String getPromoId() {
		return this.promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

	public String getPromoName() {
		return this.promoName;
	}
	public void setPromoName(String promoName) {
		this.promoName = promoName;
	}

	public String getPromoPrice() {
		return this.promoPrice;
	}
	public void setPromoPrice(String promoPrice) {
		this.promoPrice = promoPrice;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getPromoUnit() {
		return this.promoUnit;
	}
	public void setPromoUnit(String promoUnit) {
		this.promoUnit = promoUnit;
	}

}
