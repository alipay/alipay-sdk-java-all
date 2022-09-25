package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收钱吱口令创建
 *
 * @author auto create
 * @since 1.0, 2020-06-22 17:29:26
 */
public class AlipayFundTransCollectSinglemoneytokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5639747582415921728L;

	/**
	 * 业务回调通知参数,由业务方定义,用于支付成功后mnotify回调通知透传
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 收款模式,枚举类型: 0 普通收钱 1 一码一付 2 一人一付，微供场景填2
	 */
	@ApiField("collect_mode")
	private String collectMode;

	/**
	 * 订单过期时间戳,指定单据过期时间,必须大于当前时间,精确到秒,
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 扩展参数,对于一些CTU需要使用的参数请通过该参数传递
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部单据号,微供1688场景对应商品订单号,用作幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 渠道来源,由接口业务方分配,目前微供1688场景传递1688
	 */
	@ApiField("out_channel")
	private String outChannel;

	/**
	 * 收款金额,单位元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 收款备注,显示在支付宝账单,不传不展示,不支持emoji表情符号
	 */
	@ApiField("pay_memo")
	private String payMemo;

	/**
	 * 进入付款的模式,枚举类型:1吱口令，2二维码
	 */
	@ApiField("pay_mode")
	private String payMode;

	/**
	 * 收款方支付宝用户ID,对于微供吱口令场景即微商支付宝用户ID
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public String getCollectMode() {
		return this.collectMode;
	}
	public void setCollectMode(String collectMode) {
		this.collectMode = collectMode;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutChannel() {
		return this.outChannel;
	}
	public void setOutChannel(String outChannel) {
		this.outChannel = outChannel;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayMemo() {
		return this.payMemo;
	}
	public void setPayMemo(String payMemo) {
		this.payMemo = payMemo;
	}

	public String getPayMode() {
		return this.payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

}
