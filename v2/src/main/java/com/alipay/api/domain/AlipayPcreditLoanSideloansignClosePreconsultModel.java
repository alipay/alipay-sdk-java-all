package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随身贷授信退出预检
 *
 * @author auto create
 * @since 1.0, 2025-04-25 14:01:23
 */
public class AlipayPcreditLoanSideloansignClosePreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 2718868873516628861L;

	/**
	 * 支付宝用户id，客户在支付宝的身份证
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 扩展信息，预留字段
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 标准蚂蚁借贷款产品
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * // 主动退出
MANUAL,

// 支付宝解换绑退出
ALIPAY_UNBIND,

// 淘宝注销
TAOBAO_LOGOUT
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

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
