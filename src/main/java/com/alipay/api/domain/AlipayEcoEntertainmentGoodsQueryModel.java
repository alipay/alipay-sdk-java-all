package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数娱商品信息查询
 *
 * @author auto create
 * @since 1.0, 2019-04-28 09:59:13
 */
public class AlipayEcoEntertainmentGoodsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3543147798574967492L;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 具体商品代码,三级分类,比如:视频会员充值(一级分类)-> xxx黄金会员(二级分类)->三个月黄金会员充值(三级分类)
	 */
	@ApiField("goods_id")
	private String goodsId;

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
	 * 提供服务的isv代码,用于查询指定isv提供的商品
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 具体isv提供的产品代码,属于产品的二级分类
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 采购商代码,唯一确定采购商身份,由数娱平台分配
	 */
	@ApiField("purchaser_code")
	private String purchaserCode;

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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

	public String getPurchaserCode() {
		return this.purchaserCode;
	}
	public void setPurchaserCode(String purchaserCode) {
		this.purchaserCode = purchaserCode;
	}

}
