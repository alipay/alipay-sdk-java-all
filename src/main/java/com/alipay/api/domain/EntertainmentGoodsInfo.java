package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数娱充值类商品信息模型
 *
 * @author auto create
 * @since 1.0, 2017-08-03 15:56:38
 */
public class EntertainmentGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 7755158945958351631L;

	/**
	 * 商品 ID
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 充值业务类型:
video-视频充值 
social-社交充值 
music-音乐充值
live-直播充值 
read-阅读充值 
key-卡密充值
game-游戏充值
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 商品供应商代码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 商品所属产品类型,二级分类
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 商品下架时间,为 yyyyMMdd 格式
	 */
	@ApiField("sale_end_time")
	private String saleEndTime;

	/**
	 * 商品上架时间,为 yyyyMMdd 格式
	 */
	@ApiField("sale_start_time")
	private String saleStartTime;

	/**
	 * 商品价格
	 */
	@ApiField("settle_price")
	private String settlePrice;

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

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSaleEndTime() {
		return this.saleEndTime;
	}
	public void setSaleEndTime(String saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public String getSaleStartTime() {
		return this.saleStartTime;
	}
	public void setSaleStartTime(String saleStartTime) {
		this.saleStartTime = saleStartTime;
	}

	public String getSettlePrice() {
		return this.settlePrice;
	}
	public void setSettlePrice(String settlePrice) {
		this.settlePrice = settlePrice;
	}

}
