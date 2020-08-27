package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建AA收款
 *
 * @author auto create
 * @since 1.0, 2018-07-19 11:22:14
 */
public class AlipayFundTransAacollectBatchCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8653436747386545478L;

	/**
	 * 收款备注，显示在支付宝账单
	 */
	@ApiField("batch_memo")
	private String batchMemo;

	/**
	 * 渠道，由支付宝业务方提供值，目前只打印日志
    taobao:淘系过来的 
    alipay:钱包内的
    mini：小程序 
    other:其他来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 调用方扩充参数，按照Map<String,String>格式json
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 是否限定份数，true/false, 默认为不限定
	 */
	@ApiField("limit_items_total")
	private String limitItemsTotal;

	/**
	 * 单笔金额,平均后的金额
	 */
	@ApiField("pay_amount_single")
	private String payAmountSingle;

	/**
	 * 收款总金额，不限份数不传
	 */
	@ApiField("pay_amount_total")
	private String payAmountTotal;

	/**
	 * 当前支付宝userId，即收款方支付宝userId
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/**
	 * 付款方支付宝uid列表，按照List<String>格式json
    每个uid生成一条BatchDetailModel
    限定份数时必传，且人数＝实际份数
	 */
	@ApiField("payer_user_ids")
	private String payerUserIds;

	/**
	 * 实际创建总笔数(若包括自己，这里为showitemsTotal-1),不限份数不传
	 */
	@ApiField("real_items_total")
	private String realItemsTotal;

	/**
	 * 显示总笔数(选择的人数)，不限份数不传
	 */
	@ApiField("show_items_total")
	private String showItemsTotal;

	/**
	 * 来源，如支付宝、小程序，涉及ctu属性
    钱包内淘宝求赞助:innerTBH5 
    钱包群收：innerBiz
    小程序收款：fromMini
	 */
	@ApiField("source")
	private String source;

	public String getBatchMemo() {
		return this.batchMemo;
	}
	public void setBatchMemo(String batchMemo) {
		this.batchMemo = batchMemo;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getLimitItemsTotal() {
		return this.limitItemsTotal;
	}
	public void setLimitItemsTotal(String limitItemsTotal) {
		this.limitItemsTotal = limitItemsTotal;
	}

	public String getPayAmountSingle() {
		return this.payAmountSingle;
	}
	public void setPayAmountSingle(String payAmountSingle) {
		this.payAmountSingle = payAmountSingle;
	}

	public String getPayAmountTotal() {
		return this.payAmountTotal;
	}
	public void setPayAmountTotal(String payAmountTotal) {
		this.payAmountTotal = payAmountTotal;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public String getPayerUserIds() {
		return this.payerUserIds;
	}
	public void setPayerUserIds(String payerUserIds) {
		this.payerUserIds = payerUserIds;
	}

	public String getRealItemsTotal() {
		return this.realItemsTotal;
	}
	public void setRealItemsTotal(String realItemsTotal) {
		this.realItemsTotal = realItemsTotal;
	}

	public String getShowItemsTotal() {
		return this.showItemsTotal;
	}
	public void setShowItemsTotal(String showItemsTotal) {
		this.showItemsTotal = showItemsTotal;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
