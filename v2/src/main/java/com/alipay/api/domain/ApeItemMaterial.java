package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ape创意 商品生成文本的素材信息
 *
 * @author auto create
 * @since 1.0, 2023-07-27 10:46:04
 */
public class ApeItemMaterial extends AlipayObject {

	private static final long serialVersionUID = 2133669198321251766L;

	/**
	 * 商品属性的字段描述
	 */
	@ApiField("attribute")
	private String attribute;

	/**
	 * 绿色无伤，宝妈必备
	 */
	@ApiField("custom")
	private String custom;

	/**
	 * 商品的详情图
	 */
	@ApiListField("goods_detail_pic_list")
	@ApiField("string")
	private List<String> goodsDetailPicList;

	/**
	 * 物品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * https://sl-tas-oss.shulidata.com/marketing/d48551424d88b9813a9f58bf019d69bc.JPEG
	 */
	@ApiField("material_pic")
	private String materialPic;

	/**
	 * 商品价格优惠的字段
	 */
	@ApiField("price_privilege")
	private String pricePrivilege;

	public String getAttribute() {
		return this.attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getCustom() {
		return this.custom;
	}
	public void setCustom(String custom) {
		this.custom = custom;
	}

	public List<String> getGoodsDetailPicList() {
		return this.goodsDetailPicList;
	}
	public void setGoodsDetailPicList(List<String> goodsDetailPicList) {
		this.goodsDetailPicList = goodsDetailPicList;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMaterialPic() {
		return this.materialPic;
	}
	public void setMaterialPic(String materialPic) {
		this.materialPic = materialPic;
	}

	public String getPricePrivilege() {
		return this.pricePrivilege;
	}
	public void setPricePrivilege(String pricePrivilege) {
		this.pricePrivilege = pricePrivilege;
	}

}
