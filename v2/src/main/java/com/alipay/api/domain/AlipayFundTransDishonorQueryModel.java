package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询转账订单退票接口
 *
 * @author auto create
 * @since 1.0, 2020-08-27 11:48:45
 */
public class AlipayFundTransDishonorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6753878214694596323L;

	/**
	 * 查询退票起始时间:（大于等于），格式为yyyyMMdd。
用于查询退票起始日期00:00:00后发生的退票。
与refund_end差距不得大于15天。
	 */
	@ApiField("dishonor_begin")
	private String dishonorBegin;

	/**
	 * 查询退票截止时间：（小于），格式为yyyyMMdd。
用于查询退票截止日期24:00:00前发生的退票。
与refund_begin差距不得大于15天。
	 */
	@ApiField("dishonor_end")
	private String dishonorEnd;

	/**
	 * 查询页号。
必须是正整数。
默认值为1。
	 */
	@ApiField("page")
	private String page;

	public String getDishonorBegin() {
		return this.dishonorBegin;
	}
	public void setDishonorBegin(String dishonorBegin) {
		this.dishonorBegin = dishonorBegin;
	}

	public String getDishonorEnd() {
		return this.dishonorEnd;
	}
	public void setDishonorEnd(String dishonorEnd) {
		this.dishonorEnd = dishonorEnd;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

}
