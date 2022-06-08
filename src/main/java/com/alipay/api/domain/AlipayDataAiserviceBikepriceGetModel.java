package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 哈啰支付宝端内售卖智能定价接口
 *
 * @author auto create
 * @since 1.0, 2021-06-15 16:40:47
 */
public class AlipayDataAiserviceBikepriceGetModel extends AlipayObject {

	private static final long serialVersionUID = 8883547276487987596L;

	/**
	 * 渠道来源，跳转到渠道(流量位)的上一级页面(由调用方定义渠道枚举，给出对应英文代码或中文解释)
	 */
	@ApiField("ad_source")
	private String adSource;

	/**
	 * 卡型代码版本,0为旧版卡型代码(默认),1为新版卡型代码
	 */
	@ApiField("card_type_version")
	private Long cardTypeVersion;

	/**
	 * 用户购买hellobike月卡的渠道，目前有两种：alipay_tinyapp:小程序, hellobike_app:hellobike客户端，该参数取值为hellobike调用方自身的业务参数。端内售卡场景取alipay_app
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 请求约束条件，用于约束优惠卡的出价区间等信息
	 */
	@ApiListField("constraints")
	@ApiField("card_price_request_item")
	private List<CardPriceRequestItem> constraints;

	/**
	 * 渠道(流量位)，如购卡页(0)和待支付页(1)。该参数取值为调用方自身的业务参数。(由调用方定义流量位枚举，给出对应英文代码或中文解释)
	 */
	@ApiField("from")
	private String from;

	/**
	 * 外部业务扩展参数,包括外部特征及外部扩展参数
	 */
	@ApiField("make_price_ext_params")
	private MakePriceExtParams makePriceExtParams;

	/**
	 * 业务端口，安卓、iOS、支付宝小程序、微信、H5、高德
	 */
	@ApiField("plat_form")
	private String platForm;

	/**
	 * 是否要对周期卡展示顺序进行排序，默认false
	 */
	@ApiField("rank")
	private String rank;

	/**
	 * 场景码，目前用于区分「单车」和「电单车」两种场景，其中，单车对应 bike， 电单车对应 ebike。不传该字段，默认为单车。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 服务场景标示,本场景传入alipay_hellobike
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 系统平台代码,有支付宝,ios,安卓等
	 */
	@ApiField("system_code")
	private String systemCode;

	/**
	 * 业务流水id(接口调用生成传入，需唯一，与后续数据回流中的业务id保持统一)
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 新老用户标签 该参数取值为调用方自身的业务参数(由调用方定义枚举，给出对应英文代码或中文解释)
	 */
	@ApiField("user_attribute")
	private String userAttribute;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAdSource() {
		return this.adSource;
	}
	public void setAdSource(String adSource) {
		this.adSource = adSource;
	}

	public Long getCardTypeVersion() {
		return this.cardTypeVersion;
	}
	public void setCardTypeVersion(Long cardTypeVersion) {
		this.cardTypeVersion = cardTypeVersion;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public List<CardPriceRequestItem> getConstraints() {
		return this.constraints;
	}
	public void setConstraints(List<CardPriceRequestItem> constraints) {
		this.constraints = constraints;
	}

	public String getFrom() {
		return this.from;
	}
	public void setFrom(String from) {
		this.from = from;
	}

	public MakePriceExtParams getMakePriceExtParams() {
		return this.makePriceExtParams;
	}
	public void setMakePriceExtParams(MakePriceExtParams makePriceExtParams) {
		this.makePriceExtParams = makePriceExtParams;
	}

	public String getPlatForm() {
		return this.platForm;
	}
	public void setPlatForm(String platForm) {
		this.platForm = platForm;
	}

	public String getRank() {
		return this.rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getSystemCode() {
		return this.systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUserAttribute() {
		return this.userAttribute;
	}
	public void setUserAttribute(String userAttribute) {
		this.userAttribute = userAttribute;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
