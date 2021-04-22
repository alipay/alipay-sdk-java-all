package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财受理指令
 *
 * @author auto create
 * @since 1.0, 2020-08-28 14:00:56
 */
public class GFAOpenAPICommand extends AlipayObject {

	private static final long serialVersionUID = 8542632248896621737L;

	/**
	 * 业财受理单id
	 */
	@ApiField("acceptance_id")
	private String acceptanceId;

	/**
	 * 摊销回执信息
	 */
	@ApiField("amortize_receipt")
	private GFAOpenAPICommandReceipt amortizeReceipt;

	/**
	 * 指令消费方
	 */
	@ApiField("command_consumer")
	private String commandConsumer;

	/**
	 * 业财受理指令id
	 */
	@ApiField("command_id")
	private String commandId;

	/**
	 * 解决方案实例id
	 */
	@ApiField("config_instance_id")
	private String configInstanceId;

	/**
	 * 指令方向（正向、逆向）
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 业务流水号
	 */
	@ApiField("out_business_no")
	private String outBusinessNo;

	/**
	 * 平台产品标识
	 */
	@ApiField("platform_product_code")
	private String platformProductCode;

	/**
	 * 结算回执信息
	 */
	@ApiField("settle_receipt")
	private GFAOpenAPICommandReceipt settleReceipt;

	/**
	 * 指令状态（如初始、已发送）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 指令类型（如计费、结算、摊销等）
	 */
	@ApiField("type")
	private String type;

	public String getAcceptanceId() {
		return this.acceptanceId;
	}
	public void setAcceptanceId(String acceptanceId) {
		this.acceptanceId = acceptanceId;
	}

	public GFAOpenAPICommandReceipt getAmortizeReceipt() {
		return this.amortizeReceipt;
	}
	public void setAmortizeReceipt(GFAOpenAPICommandReceipt amortizeReceipt) {
		this.amortizeReceipt = amortizeReceipt;
	}

	public String getCommandConsumer() {
		return this.commandConsumer;
	}
	public void setCommandConsumer(String commandConsumer) {
		this.commandConsumer = commandConsumer;
	}

	public String getCommandId() {
		return this.commandId;
	}
	public void setCommandId(String commandId) {
		this.commandId = commandId;
	}

	public String getConfigInstanceId() {
		return this.configInstanceId;
	}
	public void setConfigInstanceId(String configInstanceId) {
		this.configInstanceId = configInstanceId;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getOutBusinessNo() {
		return this.outBusinessNo;
	}
	public void setOutBusinessNo(String outBusinessNo) {
		this.outBusinessNo = outBusinessNo;
	}

	public String getPlatformProductCode() {
		return this.platformProductCode;
	}
	public void setPlatformProductCode(String platformProductCode) {
		this.platformProductCode = platformProductCode;
	}

	public GFAOpenAPICommandReceipt getSettleReceipt() {
		return this.settleReceipt;
	}
	public void setSettleReceipt(GFAOpenAPICommandReceipt settleReceipt) {
		this.settleReceipt = settleReceipt;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
