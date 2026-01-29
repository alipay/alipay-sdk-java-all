package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随身贷授信申请结果查询
 *
 * @author auto create
 * @since 1.0, 2025-07-10 14:48:41
 */
public class AlipayPcreditLoanSideloansignApplyQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 7638418753298662758L;

	/**
	 * 用户支付宝ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 阿里授信申请单号
	 */
	@ApiField("credit_apply_no")
	private String creditApplyNo;

	/**
	 * 扩展字段，预留
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁借贷款产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCreditApplyNo() {
		return this.creditApplyNo;
	}
	public void setCreditApplyNo(String creditApplyNo) {
		this.creditApplyNo = creditApplyNo;
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

}
