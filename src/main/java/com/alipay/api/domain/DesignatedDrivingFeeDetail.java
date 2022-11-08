package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代驾-费用详情
 *
 * @author auto create
 * @since 1.0, 2022-08-23 16:31:08
 */
public class DesignatedDrivingFeeDetail extends AlipayObject {

	private static final long serialVersionUID = 6283692357595349451L;

	/**
	 * 费用金额
参考DesignatedDrivingFeeTypeEnum
	 */
	@ApiField("fee_amount")
	private String feeAmount;

	/**
	 * 费用真实描述，注意和fee title区分开，fee desc是包含具体信息的
参考DesignatedDrivingFeeTypeEnum
	 */
	@ApiField("fee_desc")
	private String feeDesc;

	/**
	 * 费用类型标识
参考DesignatedDrivingFeeTypeEnum
	 */
	@ApiField("fee_id")
	private String feeId;

	/**
	 * 代驾费用标题，注意和代驾费用描述区分开，费用描述由isv定义，比如等候费（5分钟）
参考DesignatedDrivingFeeTypeEnum
	 */
	@ApiField("fee_title")
	private String feeTitle;

	public String getFeeAmount() {
		return this.feeAmount;
	}
	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFeeDesc() {
		return this.feeDesc;
	}
	public void setFeeDesc(String feeDesc) {
		this.feeDesc = feeDesc;
	}

	public String getFeeId() {
		return this.feeId;
	}
	public void setFeeId(String feeId) {
		this.feeId = feeId;
	}

	public String getFeeTitle() {
		return this.feeTitle;
	}
	public void setFeeTitle(String feeTitle) {
		this.feeTitle = feeTitle;
	}

}
