package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝脱机交易
 *
 * @author auto create
 * @since 1.0, 2022-11-15 10:13:27
 */
public class AlipayOfflineTrade extends AlipayObject {

	private static final long serialVersionUID = 1184113876436219378L;

	/**
	 * 交易实际发生时间
	 */
	@ApiField("actual_order_time")
	private Date actualOrderTime;

	/**
	 * 交易金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易对应的卡类型。
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 用户open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易扩展信息,json格式字符串。
	 */
	@ApiField("order_biz_context")
	private String orderBizContext;

	/**
	 * 支付宝外部交易号，唯一表示一笔商户支付宝交易。商户必须保证唯一。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 原始脱机操作记录
	 */
	@ApiListField("records")
	@ApiField("string")
	private List<String> records;

	/**
	 * 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_login_name")
	private String sellerLoginName;

	/**
	 * 脱机交易标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Date getActualOrderTime() {
		return this.actualOrderTime;
	}
	public void setActualOrderTime(Date actualOrderTime) {
		this.actualOrderTime = actualOrderTime;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderBizContext() {
		return this.orderBizContext;
	}
	public void setOrderBizContext(String orderBizContext) {
		this.orderBizContext = orderBizContext;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public List<String> getRecords() {
		return this.records;
	}
	public void setRecords(List<String> records) {
		this.records = records;
	}

	public String getSellerLoginName() {
		return this.sellerLoginName;
	}
	public void setSellerLoginName(String sellerLoginName) {
		this.sellerLoginName = sellerLoginName;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
