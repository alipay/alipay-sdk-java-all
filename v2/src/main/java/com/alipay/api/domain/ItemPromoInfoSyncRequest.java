package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品营销信息
 *
 * @author auto create
 * @since 1.0, 2023-03-31 14:59:02
 */
public class ItemPromoInfoSyncRequest extends AlipayObject {

	private static final long serialVersionUID = 3234296846986226844L;

	/**
	 * 营销扩展信息
	 */
	@ApiListField("promo_ext_info")
	@ApiField("ext_info_pair")
	private List<ExtInfoPair> promoExtInfo;

	/**
	 * 优惠价格
	 */
	@ApiField("promo_price")
	private String promoPrice;

	/**
	 * 优惠总库存
	 */
	@ApiField("promo_stock_total")
	private Long promoStockTotal;

	/**
	 * 优惠玩法类型
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 优惠失效时间
	 */
	@ApiField("valid_time_end")
	private Date validTimeEnd;

	/**
	 * 优惠生效时间
	 */
	@ApiField("valid_time_start")
	private Date validTimeStart;

	public List<ExtInfoPair> getPromoExtInfo() {
		return this.promoExtInfo;
	}
	public void setPromoExtInfo(List<ExtInfoPair> promoExtInfo) {
		this.promoExtInfo = promoExtInfo;
	}

	public String getPromoPrice() {
		return this.promoPrice;
	}
	public void setPromoPrice(String promoPrice) {
		this.promoPrice = promoPrice;
	}

	public Long getPromoStockTotal() {
		return this.promoStockTotal;
	}
	public void setPromoStockTotal(Long promoStockTotal) {
		this.promoStockTotal = promoStockTotal;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public Date getValidTimeEnd() {
		return this.validTimeEnd;
	}
	public void setValidTimeEnd(Date validTimeEnd) {
		this.validTimeEnd = validTimeEnd;
	}

	public Date getValidTimeStart() {
		return this.validTimeStart;
	}
	public void setValidTimeStart(Date validTimeStart) {
		this.validTimeStart = validTimeStart;
	}

}
