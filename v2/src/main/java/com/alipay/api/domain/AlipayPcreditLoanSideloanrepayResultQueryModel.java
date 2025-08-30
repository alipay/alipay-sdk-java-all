package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随身贷还款结果查询
 *
 * @author auto create
 * @since 1.0, 2025-05-27 11:49:41
 */
public class AlipayPcreditLoanSideloanrepayResultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8456951221941594613L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 扩展参数，预留字段，JSONString格式
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品码, 信贷产品码销售外标 加 渠道编码组成，固定为: SL_PD_SALE_CODE-TAOTIAN
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 外部渠道还款申请单号
	 */
	@ApiField("repay_apply_no")
	private String repayApplyNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRepayApplyNo() {
		return this.repayApplyNo;
	}
	public void setRepayApplyNo(String repayApplyNo) {
		this.repayApplyNo = repayApplyNo;
	}

}
