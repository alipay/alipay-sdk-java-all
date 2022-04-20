package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡产品开通
 *
 * @author auto create
 * @since 1.0, 2022-03-18 16:46:38
 */
public class AlipayCommerceOperationTimescardProductApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5181923913237394885L;

	/**
	 * 字段已经废弃，无需传参
	 */
	@ApiField("isv_partner_id")
	private String isvPartnerId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 字段已经废弃，无需传参
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getIsvPartnerId() {
		return this.isvPartnerId;
	}
	public void setIsvPartnerId(String isvPartnerId) {
		this.isvPartnerId = isvPartnerId;
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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
