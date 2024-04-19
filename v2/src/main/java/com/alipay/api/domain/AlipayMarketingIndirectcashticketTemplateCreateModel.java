package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 有资金间联票创建接口
 *
 * @author auto create
 * @since 1.0, 2023-11-27 10:29:05
 */
public class AlipayMarketingIndirectcashticketTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3787815366224185698L;

	/**
	 * 票价值面额，即每张票最多可以抵扣的金额。（仅用于有资金定额票,有资金不定额票不能填写此值）。币种为人民币，单位为元。小数点以后最多保留两位，没有抵扣完的面额，可以下次使用；该数值有效范围为0.1~9999
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商家品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 扩展字段,JSON字符串。目前支持使用模式扩展：{"useMode":"H5","useModeData":{"url":"http://www.yourdomian.com/yourusepage.htm","signKeys":"voucherId,userId,tag","charset":"UTF-8","signType":"RSA2","tag":"this is my tag"}}
其中如果useMode表示自定义的使用模式类型，目前仅支持"H5",表示在票详情页按钮跳转至自定义H5页面，当传入useMode参数后，将会检查useModeData对象数据，其中的url为必传参数;url字段表示客制化使用按钮跳转链接，传入该字段后在票详情使用时点击效果将会跳转此链接，链接将进行白名单过滤，如果无法接入成功请联系技术支持;signKeys字段表示跳转至客制链接时的加签字段，如果不传默认为voucherId,userId,tag;signType为加签类型，目前支持RSA及RSA2,如果不传则不会加签;charset为链接编码格式，不传默认为UTF-8;tag为自定义参数，会直接透传回使用链接;当传入合法加签信息后，票使用链接将为http://www.yourdomain.com/yourusepage.htm?voucherId=当前票id&userId=当前用户id&tag=传入tag&sign=对应算法及key生成的加签数据
	 */
	@ApiField("extension_info")
	private String extensionInfo;

	/**
	 * 出资人登录账号。用于发票的资金会从该账号划拨到发票专用账户上。当调用创建接口成功后，会返回付款订单页面，仅当前传入资金账号可进行付款，付款完成后票变更为激活状态，可进行发放
	 */
	@ApiField("fund_account")
	private String fundAccount;

	/**
	 * 票使用场景。可枚举，目前支持“饮水小票”(WATER_TICKET)，充电小票（BATTERY_TICKET）场景值会关联当前票的展示模板，默认描述等信息，若需特殊场景接入，请联系技术支持。该场景码用于收银台、支付结果页、个人用户账单。目前暂不支持自定义票展示名称
	 */
	@ApiField("group_code")
	private String groupCode;

	/**
	 * 商家自定义备注字段，最多128个字符
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 票发放后的通知地址
	 */
	@ApiField("notify_uri")
	private String notifyUri;

	/**
	 * 外部业务单号。用作幂等控制。同一个PID下相同的外部业务单号作唯一键，参数不变的情况下，再次请求返回同样的模板id。请求成功后，修改参数再次提交，需要更换订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发放结束时间，晚于该时间不能发票。票的发放结束时间和发放开始时间跨度不能大于5年（一年统一按照365天来计算）。发放结束时间必须晚于发放开始时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 发放开始时间，早于该时间不能发票。发放开始时间不能大于当前时间15天。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 重定向地址。支付成功后需要重定向的地址，如果为空则不做重定向
	 */
	@ApiField("redirect_uri")
	private String redirectUri;

	/**
	 * 规则配置，JSON字符串:{"SMID":"978454453,978454454"}，
SMID为二级商户ID，使用逗号分隔且不能有重复ID，最大数量不能超过3000（如果需要超过此限制，请联系技术支持），由于支付宝无法校验SMID是否准确，所以SMID的正确性由商户自己保证
	 */
	@ApiField("rule_conf")
	private String ruleConf;

	/**
	 * 票可用时段，JSON数组字符串，空数组即[]，表示不限制，指定每周时间段示例：[{"day_rule": "1,2,3,4,5", "time_begin": "09:00:00", "time_end": "22:00:00"}, {"day_rule": "6,7", "time_begin": "08:00:00", "time_end": "23:00:00"}]，数组中每个元素都包含三个key：day_rule, time_begin, time_end，其中day_rule表示周几，取值范围[1, 2, 3, 4, 5, 6, 7]（周7表示星期日），多个值使用英文逗号隔开；time_begin和time_end分别表示生效起始时间和结束时间，格式为HH:mm:ss。另外，数组中各个时间规则是或关系。例如，[{"day_rule": "1,2,3,4,5", "time_begin": "09:00:00", "time_end": "22:00:00"}, {"day_rule": "6,7", "time_begin": "08:00:00", "time_end": "23:00:00"}]表示在每周的一，二，三，四，五的早上9点到晚上10点票可用或者每周的星期六和星期日的早上8点到晚上11点票可用
	 */
	@ApiField("ticket_available_time")
	private String ticketAvailableTime;

	/**
	 * 票使用说明。JSON数组字符串，最多可以有10条，每条最多50字。必须写明票的使用条件、领取条件、退款规则，请参考示例。如果未传入该字段，将填充为默认描述
	 */
	@ApiField("ticket_description")
	private String ticketDescription;

	/**
	 * 拟发行票的数量。单位为张。该数值必须是大于0的整数。如果是定额代金票（CASH_FIX_TICKET）此值必须填写，如果是不定额代金票（ CASH_RANDOM_TICKET）此值不能填写
	 */
	@ApiField("ticket_quantity")
	private Long ticketQuantity;

	/**
	 * 票类型，取值范围为： 
1. 定额代金票：BALANCE_FIX_TICKET
2. 不定额代金票 :BALANCE_RANDOM_TICKET)
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 票有效期。有两种类型：绝对时间和相对时间。使用JSON字符串表示。绝对时间有3个key：type、start、end，type取值固定为"ABSOLUTE"，start和end分别表示票生效时间和失效时间，格式为yyyy-MM-dd HH:mm:ss。绝对时间示例：{"type": "ABSOLUTE", "start": "2017-01-10 00:00:00", "end": "2017-01-13 23:59:59"}。相对时间有3个key：type、duration、unit，type取值固定为"RELATIVE"，duration表示从发票时间开始到往后推duration个单位时间为止作为票的使用有效期，unit表示有效时间单位，有效时间单位可枚举：MINUTE, HOUR, DAY。示例：{"type": "RELATIVE", "duration": 1 , "unit": "DAY" }，如果此刻发票，那么该票从现在开始生效1(duration)天(unit)后失效。有效期最多5年（一年按照365天来计算），绝对时间限制按照当前系统时间计算可配日期（当前日期+有效期）
	 */
	@ApiField("ticket_valid_period")
	private String ticketValidPeriod;

	/**
	 * 票发放总金额，仅用于有资金不定额票（BALANCE_RANDOM_TICKET)。币种为人民币，单位为元。该数值需大于等于1，小于等于10,000,000，小数点以后最多保留两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getExtensionInfo() {
		return this.extensionInfo;
	}
	public void setExtensionInfo(String extensionInfo) {
		this.extensionInfo = extensionInfo;
	}

	public String getFundAccount() {
		return this.fundAccount;
	}
	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}

	public String getGroupCode() {
		return this.groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNotifyUri() {
		return this.notifyUri;
	}
	public void setNotifyUri(String notifyUri) {
		this.notifyUri = notifyUri;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public Date getPublishStartTime() {
		return this.publishStartTime;
	}
	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public String getRedirectUri() {
		return this.redirectUri;
	}
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getRuleConf() {
		return this.ruleConf;
	}
	public void setRuleConf(String ruleConf) {
		this.ruleConf = ruleConf;
	}

	public String getTicketAvailableTime() {
		return this.ticketAvailableTime;
	}
	public void setTicketAvailableTime(String ticketAvailableTime) {
		this.ticketAvailableTime = ticketAvailableTime;
	}

	public String getTicketDescription() {
		return this.ticketDescription;
	}
	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public Long getTicketQuantity() {
		return this.ticketQuantity;
	}
	public void setTicketQuantity(Long ticketQuantity) {
		this.ticketQuantity = ticketQuantity;
	}

	public String getTicketType() {
		return this.ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getTicketValidPeriod() {
		return this.ticketValidPeriod;
	}
	public void setTicketValidPeriod(String ticketValidPeriod) {
		this.ticketValidPeriod = ticketValidPeriod;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
