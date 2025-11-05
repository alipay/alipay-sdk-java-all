package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云风险智能电话外呼结果回执
 *
 * @author auto create
 * @since 1.0, 2024-11-25 17:41:49
 */
public class AlipayCloudCloudpromoMessageCallCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 5573498162246274863L;

	/**
	 * 外呼触达明细信息
	 */
	@ApiField("action_detail")
	private CallBackActionDetail actionDetail;

	/**
	 * 外呼触达结果，用来标识电话呼出状态
	 */
	@ApiField("action_result")
	private Long actionResult;

	/**
	 * 语音外呼时返回的批次号，用于业务执行时的幂等校验
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 该手机号的发送次数，默认1
	 */
	@ApiField("call_times")
	private Long callTimes;

	/**
	 * 用户标识信息,电话外呼时，用手机号做为标识
	 */
	@ApiField("customer_key")
	private String customerKey;

	/**
	 * 外部流水号，用于幂等处理,最长64位
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 用户标识类型 MOBILE明文手机号 MOBILE_MD5 MOBILE_SHA256
	 */
	@ApiField("param_type")
	private String paramType;

	/**
	 * 呼叫结果编码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 外呼结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 语音外呼场景策略由运营来做配置，配置好后策略码由运营提供，用来决策外呼场景
	 */
	@ApiField("scene_strategy_id")
	private String sceneStrategyId;

	public CallBackActionDetail getActionDetail() {
		return this.actionDetail;
	}
	public void setActionDetail(CallBackActionDetail actionDetail) {
		this.actionDetail = actionDetail;
	}

	public Long getActionResult() {
		return this.actionResult;
	}
	public void setActionResult(Long actionResult) {
		this.actionResult = actionResult;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getCallTimes() {
		return this.callTimes;
	}
	public void setCallTimes(Long callTimes) {
		this.callTimes = callTimes;
	}

	public String getCustomerKey() {
		return this.customerKey;
	}
	public void setCustomerKey(String customerKey) {
		this.customerKey = customerKey;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

	public String getParamType() {
		return this.paramType;
	}
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getSceneStrategyId() {
		return this.sceneStrategyId;
	}
	public void setSceneStrategyId(String sceneStrategyId) {
		this.sceneStrategyId = sceneStrategyId;
	}

}
