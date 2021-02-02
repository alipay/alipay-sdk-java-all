package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑外部支付回执
 *
 * @author auto create
 * @since 1.0, 2018-11-14 12:40:36
 */
public class KoubeiTradeKbpaymentPayorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1885418943369672532L;

	/**
	 * 附加数据，在查询API和支付通知中原样返回，该字段主要用于第三方系统携带订单的自定义数据
	 */
	@ApiField("attach")
	private String attach;

	/**
	 * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY
	 */
	@ApiField("fee_type")
	private String feeType;

	/**
	 * 口碑触发外部支付时，对应的口碑支付单据号；
	 */
	@ApiField("fund_command_id")
	private String fundCommandId;

	/**
	 * 第三方支付回执状态标识；SUCCESS：标识支付成功；FAIL：标识支付失败
	 */
	@ApiField("fund_status")
	private String fundStatus;

	/**
	 * 一笔支付行为中，使用的红包和代金券列表
	 */
	@ApiListField("fund_tool_list")
	@ApiField("kbp_fund_tool")
	private List<KbpFundTool> fundToolList;

	/**
	 * 支付完成时间，当fund_status=SUCCESS时必填；格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010
	 */
	@ApiField("gmt_finish")
	private String gmtFinish;

	/**
	 * 第三方支付单据号，比如在微信支付场景下，为微信支付订单号
	 */
	@ApiField("out_pay_id")
	private String outPayId;

	/**
	 * 请求id，唯一标识一次请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 第三方支付单总金额；单位：分；在回执报文传入成功时，会校验该值，如果不一致，不会驱动业务；该值为正整数数值字符串；
	 */
	@ApiField("total_fee")
	private String totalFee;

	public String getAttach() {
		return this.attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getFeeType() {
		return this.feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getFundCommandId() {
		return this.fundCommandId;
	}
	public void setFundCommandId(String fundCommandId) {
		this.fundCommandId = fundCommandId;
	}

	public String getFundStatus() {
		return this.fundStatus;
	}
	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
	}

	public List<KbpFundTool> getFundToolList() {
		return this.fundToolList;
	}
	public void setFundToolList(List<KbpFundTool> fundToolList) {
		this.fundToolList = fundToolList;
	}

	public String getGmtFinish() {
		return this.gmtFinish;
	}
	public void setGmtFinish(String gmtFinish) {
		this.gmtFinish = gmtFinish;
	}

	public String getOutPayId() {
		return this.outPayId;
	}
	public void setOutPayId(String outPayId) {
		this.outPayId = outPayId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}
