package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品动态价格删除
 *
 * @author auto create
 * @since 1.0, 2026-07-31 11:12:49
 */
public class AlipayCommerceMerchantcardTemplatepriceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6745126324234744424L;

	/**
	 * 需要删除动态价格的商品模板ID。
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * null
	 */
	@ApiListField("city_code_list")
	@ApiField("string")
	private List<String> cityCodeList;

	/**
	 * 删除普通日历价时传true，与区域价、门店价删除条件三选一。
	 */
	@ApiField("delete_calendar_price")
	private Boolean deleteCalendarPrice;

	/**
	 * null
	 */
	@ApiListField("district_code_list")
	@ApiField("string")
	private List<String> districtCodeList;

	/**
	 * null
	 */
	@ApiListField("province_code_list")
	@ApiField("string")
	private List<String> provinceCodeList;

	/**
	 * null
	 */
	@ApiListField("shop_id_list")
	@ApiField("string")
	private List<String> shopIdList;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public List<String> getCityCodeList() {
		return this.cityCodeList;
	}
	public void setCityCodeList(List<String> cityCodeList) {
		this.cityCodeList = cityCodeList;
	}

	public Boolean getDeleteCalendarPrice() {
		return this.deleteCalendarPrice;
	}
	public void setDeleteCalendarPrice(Boolean deleteCalendarPrice) {
		this.deleteCalendarPrice = deleteCalendarPrice;
	}

	public List<String> getDistrictCodeList() {
		return this.districtCodeList;
	}
	public void setDistrictCodeList(List<String> districtCodeList) {
		this.districtCodeList = districtCodeList;
	}

	public List<String> getProvinceCodeList() {
		return this.provinceCodeList;
	}
	public void setProvinceCodeList(List<String> provinceCodeList) {
		this.provinceCodeList = provinceCodeList;
	}

	public List<String> getShopIdList() {
		return this.shopIdList;
	}
	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;
	}

}
