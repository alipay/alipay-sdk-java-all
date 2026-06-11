package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付交易结果查询
 *
 * @author auto create
 * @since 1.0, 2026-04-13 17:15:02
 */
public class AlipayCommerceLogisticsFreightflowTraderesultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8495815471552129378L;

	/**
	 * 如果biz_scene是转账场景，则传入转账申请时候的幂等号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 转账 ："TRANSFER",
调拨："ALLOCATE"
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
	 * 合作方机构号。
如果mode为网商银行，则为网商银行分配。
如果mode为浦发银行，则为浦发APP对应的X-SPDB-Client-ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 浦发银行母户户号
	 */
	@ApiField("spdb_parent_account_no")
	private String spdbParentAccountNo;

	/**
	 * 浦发银行特定流水号
	 */
	@ApiField("spdb_seq_no")
	private FreigtFlowSpdbBizSeqNo spdbSeqNo;

	/**
	 * 浦发银行特定场景参数,当mode=SPDB时必选
	 */
	@ApiField("spdb_spec_params")
	private FreightFlowSpdbSpecParams spdbSpecParams;

	/**
	 * 02-客户出金
06-会员调拨(子户互转)
	 */
	@ApiField("spdb_tran_tp_dsc")
	private String spdbTranTpDsc;

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

	public String getSpdbParentAccountNo() {
		return this.spdbParentAccountNo;
	}
	public void setSpdbParentAccountNo(String spdbParentAccountNo) {
		this.spdbParentAccountNo = spdbParentAccountNo;
	}

	public FreigtFlowSpdbBizSeqNo getSpdbSeqNo() {
		return this.spdbSeqNo;
	}
	public void setSpdbSeqNo(FreigtFlowSpdbBizSeqNo spdbSeqNo) {
		this.spdbSeqNo = spdbSeqNo;
	}

	public FreightFlowSpdbSpecParams getSpdbSpecParams() {
		return this.spdbSpecParams;
	}
	public void setSpdbSpecParams(FreightFlowSpdbSpecParams spdbSpecParams) {
		this.spdbSpecParams = spdbSpecParams;
	}

	public String getSpdbTranTpDsc() {
		return this.spdbTranTpDsc;
	}
	public void setSpdbTranTpDsc(String spdbTranTpDsc) {
		this.spdbTranTpDsc = spdbTranTpDsc;
	}

}
