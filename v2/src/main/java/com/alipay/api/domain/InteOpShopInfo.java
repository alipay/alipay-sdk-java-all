package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体化作业商户门店信息
 *
 * @author auto create
 * @since 1.0, 2026-01-09 18:33:09
 */
public class InteOpShopInfo extends AlipayObject {

	private static final long serialVersionUID = 6621722557549879193L;

	/**
	 * 门店城市编码。
	 */
	@ApiField("shop_city_code")
	private String shopCityCode;

	/**
	 * 门店所在国家编码。中国默认156。
	 */
	@ApiField("shop_country_code")
	private String shopCountryCode;

	/**
	 * 门店详细地址。
	 */
	@ApiField("shop_detail_address")
	private String shopDetailAddress;

	/**
	 * 门店区县编码。
	 */
	@ApiField("shop_district_code")
	private String shopDistrictCode;

	/**
	 * 门店名称。
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店所在省份编码。
	 */
	@ApiField("shop_province_code")
	private String shopProvinceCode;

	/**
	 * 门店内景图片，最小5KB，最大5M（暂不限制图片宽高），图片格式必须为：png、bmp、gif、jpg、jpeg。
传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("shop_scene_pic")
	private String shopScenePic;

	/**
	 * 门店门头照图片，最小5KB，最大5M（暂不限制图片宽高），图片格式必须为：png、bmp、gif、jpg、jpeg。
传入 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("shop_sign_board_pic")
	private String shopSignBoardPic;

	public String getShopCityCode() {
		return this.shopCityCode;
	}
	public void setShopCityCode(String shopCityCode) {
		this.shopCityCode = shopCityCode;
	}

	public String getShopCountryCode() {
		return this.shopCountryCode;
	}
	public void setShopCountryCode(String shopCountryCode) {
		this.shopCountryCode = shopCountryCode;
	}

	public String getShopDetailAddress() {
		return this.shopDetailAddress;
	}
	public void setShopDetailAddress(String shopDetailAddress) {
		this.shopDetailAddress = shopDetailAddress;
	}

	public String getShopDistrictCode() {
		return this.shopDistrictCode;
	}
	public void setShopDistrictCode(String shopDistrictCode) {
		this.shopDistrictCode = shopDistrictCode;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopProvinceCode() {
		return this.shopProvinceCode;
	}
	public void setShopProvinceCode(String shopProvinceCode) {
		this.shopProvinceCode = shopProvinceCode;
	}

	public String getShopScenePic() {
		return this.shopScenePic;
	}
	public void setShopScenePic(String shopScenePic) {
		this.shopScenePic = shopScenePic;
	}

	public String getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}
	public void setShopSignBoardPic(String shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}

}
