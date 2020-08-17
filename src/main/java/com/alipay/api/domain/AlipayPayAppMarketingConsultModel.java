package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户前置营销内容咨询接口
 *
 * @author auto create
 * @since 1.0, 2020-07-24 19:58:22
 */
public class AlipayPayAppMarketingConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4311782721382923659L;

	/**
	 * 业务场景，用于区分商户具体的咨场景，示例：
OPENING_PAGE：开屏页营销咨询；
ORDER_PAGE：下单页营销咨询
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 手机号密文，若传了手机号明文，则本字段可不传
	 */
	@ApiField("encrypted_mobile")
	private String encryptedMobile;

	/**
	 * 手机号明文，若传了手机号密文，则本字段可不传
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEncryptedMobile() {
		return this.encryptedMobile;
	}
	public void setEncryptedMobile(String encryptedMobile) {
		this.encryptedMobile = encryptedMobile;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

}
