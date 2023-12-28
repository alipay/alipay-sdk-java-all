package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品在货柜内摆放状态
 *
 * @author auto create
 * @since 1.0, 2019-06-19 21:15:23
 */
public class GoodsState extends AlipayObject {

	private static final long serialVersionUID = 5674129652394357159L;

	/**
	 * 算法商品Id
	 */
	@ApiField("algorithm_goods_id")
	private String algorithmGoodsId;

	/**
	 * 商品所在层数
	 */
	@ApiField("floor")
	private Long floor;

	/**
	 * 已有商品左端坐标(单位:毫米)
	 */
	@ApiField("left_loc")
	private Long leftLoc;

	public String getAlgorithmGoodsId() {
		return this.algorithmGoodsId;
	}
	public void setAlgorithmGoodsId(String algorithmGoodsId) {
		this.algorithmGoodsId = algorithmGoodsId;
	}

	public Long getFloor() {
		return this.floor;
	}
	public void setFloor(Long floor) {
		this.floor = floor;
	}

	public Long getLeftLoc() {
		return this.leftLoc;
	}
	public void setLeftLoc(Long leftLoc) {
		this.leftLoc = leftLoc;
	}

}
