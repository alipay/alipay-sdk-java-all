package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随身贷解绑退出申请
 *
 * @author auto create
 * @since 1.0, 2025-04-25 14:01:26
 */
public class AlipayPcreditLoanSideloansignCloseApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2422748677436841138L;

	/**
	 * 支付宝用户id，客户在支付宝的身份证
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 扩展字段JSONString，存放支付宝核身信息
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

	/**
	 * 退出申请单号，外部业务单号幂等键
	 */
	@ApiField("quit_credit_apply_no")
	private String quitCreditApplyNo;

	/**
	 * 退出场景
	 */
	@ApiField("scene")
	private String scene;

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

	public String getQuitCreditApplyNo() {
		return this.quitCreditApplyNo;
	}
	public void setQuitCreditApplyNo(String quitCreditApplyNo) {
		this.quitCreditApplyNo = quitCreditApplyNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
