package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付交易结果查询
 *
 * @author auto create
 * @since 1.0, 2025-07-02 19:14:34
 */
public class AlipayCommerceLogisticsFreightflowTraderesultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1791952988797182968L;

	/**
	 * 如果biz_scene是转账场景，则传入转账申请时候的幂等号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 本期支持转账 ："TRANSFER"
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式。 本期： ANT_MYBANK(网商银行模式)
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 网商银行应用id,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_app_id")
	private String mybankAppId;

	/**
	 * 发起网商操作(如转账)时网商返回的操作单号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/**
	 * 合作方机构号,如果mode为网商银行，则为网商银行分配
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getMybankAppId() {
		return this.mybankAppId;
	}
	public void setMybankAppId(String mybankAppId) {
		this.mybankAppId = mybankAppId;
	}

	public String getOperateNo() {
		return this.operateNo;
	}
	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
