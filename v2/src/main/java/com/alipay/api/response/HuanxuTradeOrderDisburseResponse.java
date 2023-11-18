package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExtContext;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: huanxu.trade.order.disburse response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:26:13
 */
public class HuanxuTradeOrderDisburseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5129238527436312565L;

	/** 
	 * 聚合支付的支付渠道，焕旭分配。
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * 打款金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("disburse_amount")
	private String disburseAmount;

	/** 
	 * 打款id，焕旭针对每一笔打款请求生成的唯一打款凭证
	 */
	@ApiField("disburse_id")
	private String disburseId;

	/** 
	 * 打款请求号，对应一笔业务订单下的一次打款请求，不同打款请求需保证请求号唯一
	 */
	@ApiField("disburse_request_no")
	private String disburseRequestNo;

	/** 
	 * 打款状态，目前支持如下值： WAIT（打款已受理），打款到银行渠道时会有该状态，业务上需等待后续的异步打款通知来确定最终的打款结果； SUCCESS（打款成功），该状态表示该笔打款已成功处理； FAIL（打款失败），该状态表示该笔打款已失败，并且不可重试，后续如果要重新打款，需要更换打款请求号。
	 */
	@ApiField("disburse_status")
	private String disburseStatus;

	/** 
	 * 用于透传扩展信息，pay_url为支付链接。
	 */
	@ApiField("ext_context")
	private ExtContext extContext;

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel( ) {
		return this.channel;
	}

	public void setDisburseAmount(String disburseAmount) {
		this.disburseAmount = disburseAmount;
	}
	public String getDisburseAmount( ) {
		return this.disburseAmount;
	}

	public void setDisburseId(String disburseId) {
		this.disburseId = disburseId;
	}
	public String getDisburseId( ) {
		return this.disburseId;
	}

	public void setDisburseRequestNo(String disburseRequestNo) {
		this.disburseRequestNo = disburseRequestNo;
	}
	public String getDisburseRequestNo( ) {
		return this.disburseRequestNo;
	}

	public void setDisburseStatus(String disburseStatus) {
		this.disburseStatus = disburseStatus;
	}
	public String getDisburseStatus( ) {
		return this.disburseStatus;
	}

	public void setExtContext(ExtContext extContext) {
		this.extContext = extContext;
	}
	public ExtContext getExtContext( ) {
		return this.extContext;
	}

}
