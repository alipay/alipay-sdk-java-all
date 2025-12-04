package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新钱包模板基础信息
 *
 * @author auto create
 * @since 1.0, 2025-11-21 10:48:00
 */
public class AlipayFundWalletTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7444445164781567897L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 修改钱包模板名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部单号，用于幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 钱包模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
