package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜品sku模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:14:09
 */
public class KbdishSkuInfo extends AlipayObject {

	private static final long serialVersionUID = 4248471379473443834L;

	/**
	 * 餐盒费用
	 */
	@ApiField("box_price")
	private String boxPrice;

	/**
	 * 口碑的菜品id,新增的时候可以为空
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 套餐明细list
	 */
	@ApiListField("dish_packages_detail_list")
	@ApiField("kbdish_packages_detail_info")
	private List<KbdishPackagesDetailInfo> dishPackagesDetailList;

	/**
	 * 商品的skuId
	 */
	@ApiField("goods_sku_id")
	private String goodsSkuId;

	/**
	 * 会员价格，该字段已废弃
	 */
	@ApiField("member_price")
	private String memberPrice;

	/**
	 * 外部的菜品skuId, isv自己的skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 售卖价格
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * sku的扩展字典,json字符串,注意： 如果是字符串拼接的方式，转移符\要替换为\\\ 。星巴克定制设置成{\"default\":\"true\"}, 一个菜下的sku只允许一个默认设置
	 */
	@ApiField("sku_ext_content")
	private String skuExtContent;

	/**
	 * sku的id 口碑生成
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku的排序字段
	 */
	@ApiField("sku_sort")
	private String skuSort;

	/**
	 * 规格id1
	 */
	@ApiField("spec_code_01")
	private String specCode01;

	/**
	 * 规格id2
	 */
	@ApiField("spec_code_02")
	private String specCode02;

	/**
	 * 规格id3
	 */
	@ApiField("spec_code_03")
	private String specCode03;

	/**
	 * 规格id4
	 */
	@ApiField("spec_code_04")
	private String specCode04;

	/**
	 * 规格id5
	 */
	@ApiField("spec_code_05")
	private String specCode05;

	/**
	 * open 启动 stop 停用
变更状态的时候必输入.新增时候如果不设置默认设置启动
	 */
	@ApiField("status")
	private String status;

	public String getBoxPrice() {
		return this.boxPrice;
	}
	public void setBoxPrice(String boxPrice) {
		this.boxPrice = boxPrice;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public List<KbdishPackagesDetailInfo> getDishPackagesDetailList() {
		return this.dishPackagesDetailList;
	}
	public void setDishPackagesDetailList(List<KbdishPackagesDetailInfo> dishPackagesDetailList) {
		this.dishPackagesDetailList = dishPackagesDetailList;
	}

	public String getGoodsSkuId() {
		return this.goodsSkuId;
	}
	public void setGoodsSkuId(String goodsSkuId) {
		this.goodsSkuId = goodsSkuId;
	}

	public String getMemberPrice() {
		return this.memberPrice;
	}
	public void setMemberPrice(String memberPrice) {
		this.memberPrice = memberPrice;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getSkuExtContent() {
		return this.skuExtContent;
	}
	public void setSkuExtContent(String skuExtContent) {
		this.skuExtContent = skuExtContent;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuSort() {
		return this.skuSort;
	}
	public void setSkuSort(String skuSort) {
		this.skuSort = skuSort;
	}

	public String getSpecCode01() {
		return this.specCode01;
	}
	public void setSpecCode01(String specCode01) {
		this.specCode01 = specCode01;
	}

	public String getSpecCode02() {
		return this.specCode02;
	}
	public void setSpecCode02(String specCode02) {
		this.specCode02 = specCode02;
	}

	public String getSpecCode03() {
		return this.specCode03;
	}
	public void setSpecCode03(String specCode03) {
		this.specCode03 = specCode03;
	}

	public String getSpecCode04() {
		return this.specCode04;
	}
	public void setSpecCode04(String specCode04) {
		this.specCode04 = specCode04;
	}

	public String getSpecCode05() {
		return this.specCode05;
	}
	public void setSpecCode05(String specCode05) {
		this.specCode05 = specCode05;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
