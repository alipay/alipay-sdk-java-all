package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养订单的商品
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:48:53
 */
public class MaintainBizOrderGoods extends AlipayObject {

	private static final long serialVersionUID = 2719634139453265461L;

	/**
	 * 商品图片地址，下单时记录的商品图片
	 */
	@ApiField("goods_image")
	private String goodsImage;

	/**
	 * 车主平台商品子订单id。保养订单对应商品子订单表id
	 */
	@ApiField("order_goods_id")
	private String orderGoodsId;

	/**
	 * 原始价格，下单时商品的原始价格。金额单位(元)，保留两位小数。
	 */
	@ApiField("original_cost")
	private String originalCost;

	/**
	 * 外部商品编码
	 */
	@ApiField("out_goods_no")
	private String outGoodsNo;

	/**
	 * 外部商品套餐唯一标示。下单时记录的ISV端商品套餐主键
	 */
	@ApiField("out_package_id")
	private String outPackageId;

	/**
	 * 外部套餐名称。下单时记录的商品套餐名称，在商品详情页时透出显示
	 */
	@ApiField("package_name")
	private String packageName;

	/**
	 * 销售价格，下单时商品的销售价格。金额单位(元)，保留两位小数。
	 */
	@ApiField("real_cost")
	private String realCost;

	/**
	 * 商品购买数量
	 */
	@ApiField("sale_num")
	private Long saleNum;

	public String getGoodsImage() {
		return this.goodsImage;
	}
	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	public String getOrderGoodsId() {
		return this.orderGoodsId;
	}
	public void setOrderGoodsId(String orderGoodsId) {
		this.orderGoodsId = orderGoodsId;
	}

	public String getOriginalCost() {
		return this.originalCost;
	}
	public void setOriginalCost(String originalCost) {
		this.originalCost = originalCost;
	}

	public String getOutGoodsNo() {
		return this.outGoodsNo;
	}
	public void setOutGoodsNo(String outGoodsNo) {
		this.outGoodsNo = outGoodsNo;
	}

	public String getOutPackageId() {
		return this.outPackageId;
	}
	public void setOutPackageId(String outPackageId) {
		this.outPackageId = outPackageId;
	}

	public String getPackageName() {
		return this.packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getRealCost() {
		return this.realCost;
	}
	public void setRealCost(String realCost) {
		this.realCost = realCost;
	}

	public Long getSaleNum() {
		return this.saleNum;
	}
	public void setSaleNum(Long saleNum) {
		this.saleNum = saleNum;
	}

}
