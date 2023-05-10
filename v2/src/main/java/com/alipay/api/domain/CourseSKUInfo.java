package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 课程SKU信息
 *
 * @author auto create
 * @since 1.0, 2021-03-10 16:55:06
 */
public class CourseSKUInfo extends AlipayObject {

	private static final long serialVersionUID = 3837629922595346983L;

	/**
	 * 课程数量
	 */
	@ApiField("course_num")
	private Long courseNum;

	/**
	 * 现价(单位 : 分)
	 */
	@ApiField("cur_price")
	private Long curPrice;

	/**
	 * 原价(单位 : 分)
	 */
	@ApiField("ori_price")
	private Long oriPrice;

	/**
	 * 外部skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 库存数量
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public Long getCourseNum() {
		return this.courseNum;
	}
	public void setCourseNum(Long courseNum) {
		this.courseNum = courseNum;
	}

	public Long getCurPrice() {
		return this.curPrice;
	}
	public void setCurPrice(Long curPrice) {
		this.curPrice = curPrice;
	}

	public Long getOriPrice() {
		return this.oriPrice;
	}
	public void setOriPrice(Long oriPrice) {
		this.oriPrice = oriPrice;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
