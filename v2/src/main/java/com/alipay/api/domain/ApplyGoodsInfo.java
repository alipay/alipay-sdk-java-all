package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上新商品信息
 *
 * @author auto create
 * @since 1.0, 2019-01-04 11:54:30
 */
public class ApplyGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 2733336119527821315L;

	/**
	 * 支付宝商品Id(国标码)
	 */
	@ApiField("alipay_goods_id")
	private String alipayGoodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 备注说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 商品图片url1
	 */
	@ApiField("show_url_1")
	private String showUrl1;

	/**
	 * 商品图片url2
	 */
	@ApiField("show_url_2")
	private String showUrl2;

	/**
	 * 商品图片url3
	 */
	@ApiField("show_url_3")
	private String showUrl3;

	/**
	 * 商品三维 (单位mm*mm*mm)
	 */
	@ApiField("three_dimension")
	private String threeDimension;

	/**
	 * 商品重量 (单位g)
	 */
	@ApiField("weight")
	private String weight;

	public String getAlipayGoodsId() {
		return this.alipayGoodsId;
	}
	public void setAlipayGoodsId(String alipayGoodsId) {
		this.alipayGoodsId = alipayGoodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getShowUrl1() {
		return this.showUrl1;
	}
	public void setShowUrl1(String showUrl1) {
		this.showUrl1 = showUrl1;
	}

	public String getShowUrl2() {
		return this.showUrl2;
	}
	public void setShowUrl2(String showUrl2) {
		this.showUrl2 = showUrl2;
	}

	public String getShowUrl3() {
		return this.showUrl3;
	}
	public void setShowUrl3(String showUrl3) {
		this.showUrl3 = showUrl3;
	}

	public String getThreeDimension() {
		return this.threeDimension;
	}
	public void setThreeDimension(String threeDimension) {
		this.threeDimension = threeDimension;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
