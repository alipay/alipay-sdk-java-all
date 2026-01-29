package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广计划创建接口
 *
 * @author auto create
 * @since 1.0, 2025-02-13 14:37:55
 */
public class AlipayCommerceOperationIotnspoperationDeliveryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4492439839351847826L;

	/**
	 * 枚举值：
·SELF_MODE 商户自接入模式
·AGENCY_MODE 服务商代接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 推广计划基础信息
	 */
	@ApiField("n_delivery_base_info")
	private NDeliveryBaseInfo nDeliveryBaseInfo;

	/**
	 * 推广发放规则配置
	 */
	@ApiField("n_delivery_paly_config")
	private NDeliveryPalyConfig nDeliveryPalyConfig;

	/**
	 * 支持指定收单账号、指定设备SN，各规则之间为且关系
	 */
	@ApiField("n_delivery_target_rule")
	private NDeliveryTargetRule nDeliveryTargetRule;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用：请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

	public NDeliveryBaseInfo getnDeliveryBaseInfo() {
		return this.nDeliveryBaseInfo;
	}
	public void setnDeliveryBaseInfo(NDeliveryBaseInfo nDeliveryBaseInfo) {
		this.nDeliveryBaseInfo = nDeliveryBaseInfo;
	}

	public NDeliveryPalyConfig getnDeliveryPalyConfig() {
		return this.nDeliveryPalyConfig;
	}
	public void setnDeliveryPalyConfig(NDeliveryPalyConfig nDeliveryPalyConfig) {
		this.nDeliveryPalyConfig = nDeliveryPalyConfig;
	}

	public NDeliveryTargetRule getnDeliveryTargetRule() {
		return this.nDeliveryTargetRule;
	}
	public void setnDeliveryTargetRule(NDeliveryTargetRule nDeliveryTargetRule) {
		this.nDeliveryTargetRule = nDeliveryTargetRule;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
