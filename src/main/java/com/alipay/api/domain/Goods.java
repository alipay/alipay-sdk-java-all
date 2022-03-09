package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品详细信息
 *
 * @author auto create
 * @since 1.0, 2021-09-18 15:59:42
 */
public class Goods extends AlipayObject {

	private static final long serialVersionUID = 2779485196646811977L;

	/**
	 * 商品id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品数量
	 */
	@ApiField("goods_num")
	private String goodsNum;

	/**
	 * 商品图片（图片上传返回material_key）
	 */
	@ApiField("goods_pic_url")
	private String goodsPicUrl;

	/**
	 * 商品单价，单位为元，精确到小数点后两位，取值范围为 [0.01,100000000]，GENERAL蜻蜓点餐业务场景必填，其他场景选填
	 */
	@ApiField("goods_price")
	private String goodsPrice;

	/**
	 * 商品规格份、件、斤、kg，默认为份
KG：千克
SHARE：份
CATTY：斤
PKG：件
	 */
	@ApiField("goods_specs")
	private String goodsSpecs;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsNum() {
		return this.goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getGoodsPicUrl() {
		return this.goodsPicUrl;
	}
	public void setGoodsPicUrl(String goodsPicUrl) {
		this.goodsPicUrl = goodsPicUrl;
	}

	public String getGoodsPrice() {
		return this.goodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsSpecs() {
		return this.goodsSpecs;
	}
	public void setGoodsSpecs(String goodsSpecs) {
		this.goodsSpecs = goodsSpecs;
	}

}
