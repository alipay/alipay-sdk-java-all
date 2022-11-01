package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 猛犸定价接口
 *
 * @author auto create
 * @since 1.0, 2019-12-11 20:31:35
 */
public class AlipayDataAiservicePriceoptimizerGetModel extends AlipayObject {

	private static final long serialVersionUID = 1482319558551419786L;

	/**
	 * 接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 目前有两种 :alipay_tinyapp:小程序, app:app客户端
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 市  城市码（例如 杭州 330100）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 拓展变量列表
	 */
	@ApiListField("extend_agrs")
	@ApiField("make_price_agrs")
	private List<MakePriceAgrs> extendAgrs;

	/**
	 * 特征变量列表
	 */
	@ApiListField("feature_args")
	@ApiField("make_price_agrs")
	private List<MakePriceAgrs> featureArgs;

	/**
	 * 活动页面来源，即用户跳转到 活动页面的前一个页面
	 */
	@ApiField("from")
	private String from;

	/**
	 * 商户Id （接入方ISV 必填）
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 定价对象列表
	 */
	@ApiListField("product_list")
	@ApiField("make_price_cards")
	private List<MakePriceCards> productList;

	/**
	 * 标识定价场景
single_pay:单次支付定价 stored_value_card:储值卡
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 接入方名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 用户参与活动的业务标识，需要唯一。通过该业务标识串联用户在活动中的涉及的关键业务流程，该参数由mammoth业务端生成该id并在上述业务流程推进过程中存储记录该id。
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 最小定价单元ID
	 */
	@ApiField("unit_id")
	private String unitId;

	/**
	 * 蚂蚁统一会员ID.作为用户标识，该参数可通过alipay.user.info.share接口获取。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
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

	public List<MakePriceAgrs> getExtendAgrs() {
		return this.extendAgrs;
	}
	public void setExtendAgrs(List<MakePriceAgrs> extendAgrs) {
		this.extendAgrs = extendAgrs;
	}

	public List<MakePriceAgrs> getFeatureArgs() {
		return this.featureArgs;
	}
	public void setFeatureArgs(List<MakePriceAgrs> featureArgs) {
		this.featureArgs = featureArgs;
	}

	public String getFrom() {
		return this.from;
	}
	public void setFrom(String from) {
		this.from = from;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public List<MakePriceCards> getProductList() {
		return this.productList;
	}
	public void setProductList(List<MakePriceCards> productList) {
		this.productList = productList;
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

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUnitId() {
		return this.unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
