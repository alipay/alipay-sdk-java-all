package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费交易创建接口
 *
 * @author auto create
 * @since 1.0, 2023-09-06 10:37:01
 */
public class AlipayCommerceEducateOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7895357241627588879L;

	/**
	 * 订单附加信息。
如果请求时传递了该参数，将在异步通知、对账单中原样返回，同时会在商户和用户的pc账单详情中作为交易描述展示
	 */
	@ApiField("body")
	private String body;

	/**
	 * 买家支付宝用户ID。
2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权;
其它场景下获取用户ID请参考：网页授权获取用户信息;
注：交易的买家与卖家不能相同。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户ID 对应的openId。
小程序场景下获取用户ID请参考：用户授权;
其它场景下获取用户ID请参考：网页授权获取用户信息;
注：交易的买家与卖家不能相同。
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private EduOrderExtendParams extendParams;

	/**
	 * 商户订单号。
由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 产品码。
商家和支付宝签约的产品码。 枚举值（点击查看签约情况）：
FACE_TO_FACE_PAYMENT：当面付产品；该接口目前仅支持当面付产品。
默认值为FACE_TO_FACE_PAYMENT。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 学校编码，录入学校接口返回的参数
	 */
	@ApiField("school_no")
	private String schoolNo;

	/**
	 * 学校支付宝pid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 订单标题。
注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单绝对超时时间。
格式为yyyy-MM-dd HH:mm:ss。
注：time_expire和timeout_express两者只需传入一个或者都不传，如果两者都传，优先使用time_expire。
	 */
	@ApiField("time_expire")
	private Date timeExpire;

	/**
	 * 订单相对超时时间。从交易创建时间开始计算。
该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
当面付场景默认值为3h。
注：time_expire和timeout_express两者只需传入一个或者都不传，如果两者都传，优先使用time_expire。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额。
单位为元，精确到小数点后两位，取值范围：[0.01,100000000] 。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public EduOrderExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(EduOrderExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSchoolNo() {
		return this.schoolNo;
	}
	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}

	public String getSchoolPid() {
		return this.schoolPid;
	}
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(Date timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
