package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 负荷聚合控制指令提交
 *
 * @author auto create
 * @since 1.0, 2024-10-22 10:33:34
 */
public class AnttechBlockchainFinanceEnergyCommandSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1397972183928743538L;

	/**
	 * 设备指令内容
	 */
	@ApiField("command_content")
	private CommandContent commandContent;

	/**
	 * 设备实体ID
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 设备指令功能类型
	 */
	@ApiField("function_type")
	private String functionType;

	/**
	 * 可信价值服务中心产品的合约码，由蚂蚁业务同学完成签约后给到商户
	 */
	@ApiField("product_agreement_code")
	private String productAgreementCode;

	/**
	 * 业务幂等键，用户调用时需要保证不同请求requestId唯一。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 是否定时日程
	 */
	@ApiField("scheduler_flag")
	private String schedulerFlag;

	/**
	 * 定时日程为“是”时必填
	 */
	@ApiField("scheduler_time")
	private Date schedulerTime;

	public CommandContent getCommandContent() {
		return this.commandContent;
	}
	public void setCommandContent(CommandContent commandContent) {
		this.commandContent = commandContent;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getFunctionType() {
		return this.functionType;
	}
	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}

	public String getProductAgreementCode() {
		return this.productAgreementCode;
	}
	public void setProductAgreementCode(String productAgreementCode) {
		this.productAgreementCode = productAgreementCode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSchedulerFlag() {
		return this.schedulerFlag;
	}
	public void setSchedulerFlag(String schedulerFlag) {
		this.schedulerFlag = schedulerFlag;
	}

	public Date getSchedulerTime() {
		return this.schedulerTime;
	}
	public void setSchedulerTime(Date schedulerTime) {
		this.schedulerTime = schedulerTime;
	}

}
