package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * voyager营销咨询接口
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:42:55
 */
public class AlipayVoyagerMarketingConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6795694159172334412L;

	/**
	 * 下单时间
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 核销渠道（AGENT=出境游AI，GUI=常规链路，Voyager 内部映射为 AGENT_ONLY/DEFAULT_GUI）
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 咨询请求号
	 */
	@ApiField("consult_request_id")
	private String consultRequestId;

	/**
	 * 环境信息，三方透传
	 */
	@ApiField("env_info")
	private VoyagerEnvInfo envInfo;

	/**
	 * 扩展信息，json字符串。风控消费字段：supplierName（供应商名称）、passengerCount（申请人数）、countryCode（签证国家）、productType（商品类型）
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * null
	 */
	@ApiListField("goods_info_list")
	@ApiField("voyager_goods_info")
	private List<VoyagerGoodsInfo> goodsInfoList;

	/**
	 * 行业标识
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 多语言
	 */
	@ApiField("language")
	private String language;

	/**
	 * 用户 openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单价格参数（订单原价，门槛基准）
	 */
	@ApiField("order_price_param")
	private OrderPriceParam orderPriceParam;

	/**
	 * 用户userId
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * null
	 */
	@ApiListField("voucher_ids")
	@ApiField("string")
	private List<String> voucherIds;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getConsultRequestId() {
		return this.consultRequestId;
	}
	public void setConsultRequestId(String consultRequestId) {
		this.consultRequestId = consultRequestId;
	}

	public VoyagerEnvInfo getEnvInfo() {
		return this.envInfo;
	}
	public void setEnvInfo(VoyagerEnvInfo envInfo) {
		this.envInfo = envInfo;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public List<VoyagerGoodsInfo> getGoodsInfoList() {
		return this.goodsInfoList;
	}
	public void setGoodsInfoList(List<VoyagerGoodsInfo> goodsInfoList) {
		this.goodsInfoList = goodsInfoList;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getLanguage() {
		return this.language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public OrderPriceParam getOrderPriceParam() {
		return this.orderPriceParam;
	}
	public void setOrderPriceParam(OrderPriceParam orderPriceParam) {
		this.orderPriceParam = orderPriceParam;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getVoucherIds() {
		return this.voucherIds;
	}
	public void setVoucherIds(List<String> voucherIds) {
		this.voucherIds = voucherIds;
	}

}
