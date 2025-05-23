package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送验证码
 *
 * @author auto create
 * @since 1.0, 2022-04-27 09:23:00
 */
public class AnttechBlockchainDefinCustomerVerifycodeSendModel extends AlipayObject {

	private static final long serialVersionUID = 5177578921929261244L;

	/**
	 * 自定义的action，比如：LOGIN，REGISTER，MODIFY_PASSWORD等
	 */
	@ApiField("action")
	private String action;

	/**
	 * 所属业务线
    DCHAIN("DCHAIN","供应链信用流转平台"),
    ABS("ABS","ABS资产流转平台"),
    BAMBOO("BAMBOO","BAMBOO项目"),
    LOGISTICS_FIN("LOGISTICS_FIN", "物流金融"),
    TRUSPLE("TRUSPLE", "跨境贸易金融平台");
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 接受验证码的目标地址，可以是手机号或者邮箱号
133333333
test@example.com
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 配置的短信或者邮件模板的ID
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * EMAIL
SMS
	 */
	@ApiField("type")
	private String type;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
