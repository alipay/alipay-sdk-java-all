package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡产品开通
 *
 * @author auto create
 * @since 1.0, 2022-05-17 19:53:24
 */
public class AlipayCommerceOperationTimescardProductApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1255434936374912543L;

	/**
	 * 预付宝：ALIPAY_YUFUBAO
	 */
	@ApiField("biz_from")
	private String bizFrom;

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

	/**
	 * 次卡资金结算信息
	 */
	@ApiField("settle_info")
	private FundSettleInfo settleInfo;

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

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

	public FundSettleInfo getSettleInfo() {
		return this.settleInfo;
	}
	public void setSettleInfo(FundSettleInfo settleInfo) {
		this.settleInfo = settleInfo;
	}

}
