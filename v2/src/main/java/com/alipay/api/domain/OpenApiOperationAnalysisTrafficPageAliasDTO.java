package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析-流量分析-页面效果返回数据结构体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:50:02
 */
public class OpenApiOperationAnalysisTrafficPageAliasDTO extends AlipayObject {

	private static final long serialVersionUID = 1664778328951586723L;

	/**
	 * 小程序应用ID，分配给开发者的应用ID
	 */
	@ApiField("alipay_app_id")
	private String alipayAppId;

	/**
	 * 小程序应用名称，开发者的应用设置的小程序应用名称
	 */
	@ApiField("alipay_app_name")
	private String alipayAppName;

	/**
	 * 数据平台类型，数据上报的平台类型枚举
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 业务的数据日期
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 页面跳失人数
	 */
	@ApiField("end_page_user_cnt")
	private OperationValueLongDTO endPageUserCnt;

	/**
	 * 页面跳失率
	 */
	@ApiField("end_page_user_cnt_rate")
	private OperationValueBaseDTO endPageUserCntRate;

	/**
	 * 页面引导加购下单转化率
	 */
	@ApiField("guid_add_order_user_cvr")
	private OperationValueBaseDTO guidAddOrderUserCvr;

	/**
	 * 页面引导加购人数
	 */
	@ApiField("guid_add_user_cnt")
	private OperationValueLongDTO guidAddUserCnt;

	/**
	 * 页面引导下单人数
	 */
	@ApiField("guid_order_user_cnt")
	private OperationValueLongDTO guidOrderUserCnt;

	/**
	 * 页面分享次数
	 */
	@ApiField("guid_share_cnt")
	private OperationValueLongDTO guidShareCnt;

	/**
	 * 页面分享人数
	 */
	@ApiField("guid_share_user_cnt")
	private OperationValueLongDTO guidShareUserCnt;

	/**
	 * 页面引导访问-加购转化率
	 */
	@ApiField("guid_visit_add_user_cvr")
	private OperationValueBaseDTO guidVisitAddUserCvr;

	/**
	 * 多端小程序应用ID，非支付宝平台的其他平台的小程序应用ID
	 */
	@ApiField("multi_app_id")
	private String multiAppId;

	/**
	 * 多端小程序应用名称，非支付宝平台的小程序应用名称
	 */
	@ApiField("multi_app_name")
	private String multiAppName;

	/**
	 * 页面名称
	 */
	@ApiField("page_name")
	private String pageName;

	/**
	 * 页面URL，页面名称的子集
	 */
	@ApiField("page_url")
	private String pageUrl;

	/**
	 * 页面浏览量
	 */
	@ApiField("pv")
	private OperationValueLongDTO pv;

	/**
	 * 页面平均停留时长，单位：秒
	 */
	@ApiField("stay_second_avg")
	private OperationValueLongDTO staySecondAvg;

	/**
	 * 页面访问人数
	 */
	@ApiField("uv")
	private OperationValueLongDTO uv;

	public String getAlipayAppId() {
		return this.alipayAppId;
	}
	public void setAlipayAppId(String alipayAppId) {
		this.alipayAppId = alipayAppId;
	}

	public String getAlipayAppName() {
		return this.alipayAppName;
	}
	public void setAlipayAppName(String alipayAppName) {
		this.alipayAppName = alipayAppName;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

	public OperationValueLongDTO getEndPageUserCnt() {
		return this.endPageUserCnt;
	}
	public void setEndPageUserCnt(OperationValueLongDTO endPageUserCnt) {
		this.endPageUserCnt = endPageUserCnt;
	}

	public OperationValueBaseDTO getEndPageUserCntRate() {
		return this.endPageUserCntRate;
	}
	public void setEndPageUserCntRate(OperationValueBaseDTO endPageUserCntRate) {
		this.endPageUserCntRate = endPageUserCntRate;
	}

	public OperationValueBaseDTO getGuidAddOrderUserCvr() {
		return this.guidAddOrderUserCvr;
	}
	public void setGuidAddOrderUserCvr(OperationValueBaseDTO guidAddOrderUserCvr) {
		this.guidAddOrderUserCvr = guidAddOrderUserCvr;
	}

	public OperationValueLongDTO getGuidAddUserCnt() {
		return this.guidAddUserCnt;
	}
	public void setGuidAddUserCnt(OperationValueLongDTO guidAddUserCnt) {
		this.guidAddUserCnt = guidAddUserCnt;
	}

	public OperationValueLongDTO getGuidOrderUserCnt() {
		return this.guidOrderUserCnt;
	}
	public void setGuidOrderUserCnt(OperationValueLongDTO guidOrderUserCnt) {
		this.guidOrderUserCnt = guidOrderUserCnt;
	}

	public OperationValueLongDTO getGuidShareCnt() {
		return this.guidShareCnt;
	}
	public void setGuidShareCnt(OperationValueLongDTO guidShareCnt) {
		this.guidShareCnt = guidShareCnt;
	}

	public OperationValueLongDTO getGuidShareUserCnt() {
		return this.guidShareUserCnt;
	}
	public void setGuidShareUserCnt(OperationValueLongDTO guidShareUserCnt) {
		this.guidShareUserCnt = guidShareUserCnt;
	}

	public OperationValueBaseDTO getGuidVisitAddUserCvr() {
		return this.guidVisitAddUserCvr;
	}
	public void setGuidVisitAddUserCvr(OperationValueBaseDTO guidVisitAddUserCvr) {
		this.guidVisitAddUserCvr = guidVisitAddUserCvr;
	}

	public String getMultiAppId() {
		return this.multiAppId;
	}
	public void setMultiAppId(String multiAppId) {
		this.multiAppId = multiAppId;
	}

	public String getMultiAppName() {
		return this.multiAppName;
	}
	public void setMultiAppName(String multiAppName) {
		this.multiAppName = multiAppName;
	}

	public String getPageName() {
		return this.pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageUrl() {
		return this.pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public OperationValueLongDTO getPv() {
		return this.pv;
	}
	public void setPv(OperationValueLongDTO pv) {
		this.pv = pv;
	}

	public OperationValueLongDTO getStaySecondAvg() {
		return this.staySecondAvg;
	}
	public void setStaySecondAvg(OperationValueLongDTO staySecondAvg) {
		this.staySecondAvg = staySecondAvg;
	}

	public OperationValueLongDTO getUv() {
		return this.uv;
	}
	public void setUv(OperationValueLongDTO uv) {
		this.uv = uv;
	}

}
