package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class ShopInfo extends AlipayObject {

	private static final long serialVersionUID = 3873145276696569838L;

	/**
	 * 企业门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺内景图片，如要签约当面付产品，需上传3张店铺内景图片
	 */
	@ApiListField("shop_scene_pic")
	@ApiField("string")
	private List<String> shopScenePic;

	/**
	 * 店铺门头照图片
	 */
	@ApiField("shop_sign_board_pic")
	private String shopSignBoardPic;

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<String> getShopScenePic() {
		return this.shopScenePic;
	}
	public void setShopScenePic(List<String> shopScenePic) {
		this.shopScenePic = shopScenePic;
	}

	public String getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}
	public void setShopSignBoardPic(String shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}

}
