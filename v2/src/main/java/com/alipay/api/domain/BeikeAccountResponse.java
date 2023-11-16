package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 呗壳额度接口返回对象
 *
 * @author auto create
 * @since 1.0, 2019-12-04 14:08:30
 */
public class BeikeAccountResponse extends AlipayObject {

	private static final long serialVersionUID = 6736165943394277294L;

	/**
	 * 当前操作变化值
	 */
	@ApiField("change_amount")
	private Long changeAmount;

	/**
	 * 呗壳当前用户所有的免息额度值，long类型
	 */
	@ApiField("current_amount")
	private Long currentAmount;

	/**
	 * 外部唯一单号
	 */
	@ApiField("outer_biz_no")
	private String outerBizNo;

	public Long getChangeAmount() {
		return this.changeAmount;
	}
	public void setChangeAmount(Long changeAmount) {
		this.changeAmount = changeAmount;
	}

	public Long getCurrentAmount() {
		return this.currentAmount;
	}
	public void setCurrentAmount(Long currentAmount) {
		this.currentAmount = currentAmount;
	}

	public String getOuterBizNo() {
		return this.outerBizNo;
	}
	public void setOuterBizNo(String outerBizNo) {
		this.outerBizNo = outerBizNo;
	}

}
