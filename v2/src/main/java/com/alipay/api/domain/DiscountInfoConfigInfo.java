package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠配置信息

 *
 * @author auto create
 * @since 1.0, 2023-08-10 11:23:39
 */
public class DiscountInfoConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 4653189265831946277L;

	/**
	 * 优惠立减门槛金额 以分为单位 比如：99代表0.99元
	 */
	@ApiField("discount_threshold_amt")
	private String discountThresholdAmt;

	/**
	 * 立减类型 reduce:满立减(满5元减3元) random:随机立减(满10元随机立减1元到3元
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 优惠立减值, 分为单位 如果discount_type=reduce，那么就是具体的优惠立减额，比如：999代表满足一定金额减9.99元； 如果discount_type=random，那么就是”最小额-最大额“，比如:99-990，代表立减范围从0.99元到9.99元随机决策
	 */
	@ApiField("discount_value")
	private String discountValue;

	public String getDiscountThresholdAmt() {
		return this.discountThresholdAmt;
	}
	public void setDiscountThresholdAmt(String discountThresholdAmt) {
		this.discountThresholdAmt = discountThresholdAmt;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getDiscountValue() {
		return this.discountValue;
	}
	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}

}
