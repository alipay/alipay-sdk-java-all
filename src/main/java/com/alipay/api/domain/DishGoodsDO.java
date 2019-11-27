package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点菜订单里面的菜品对象
 *
 * @author auto create
 * @since 1.0, 2018-09-17 15:26:34
 */
public class DishGoodsDO extends AlipayObject {

	private static final long serialVersionUID = 3242989721366428711L;

	/**
	 * 菜品的ID
当前值来自于alipay.offline.provider.useraction.record商户操作行为接口
中上传用户点菜菜单中的dish对象的goodsId 字段
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 菜品名称  
当前值来自于alipay.offline.provider.useraction.record商户操作行为接口
中上传用户点菜菜单中的dish对象的goodsName 字段
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 点菜数量
当前值来自于alipay.offline.provider.useraction.record商户操作行为接口
中上传用户点菜菜单中的dish对象的num 字段，double类型。一位小数
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 菜品价格
当前值来自于alipay.offline.provider.useraction.record商户操作行为接口
中上传用户点菜菜单中的dish对象的price 字段，单位分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 规格ID 
当前值来自于alipay.offline.provider.useraction.record商户操作行为接口
中上传用户点菜菜单中的dish对象的skuId 字段
	 */
	@ApiField("sku_id")
	private String skuId;

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

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
