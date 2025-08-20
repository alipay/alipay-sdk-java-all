package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发放限制信息
 *
 * @author auto create
 * @since 1.0, 2025-01-18 13:46:21
 */
public class DtbankActivitySendControlConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 1353664684796113798L;

	/**
	 * API发放限制的APPID列表
	 */
	@ApiListField("api_send_control_content_list")
	@ApiField("string")
	private List<String> apiSendControlContentList;

	/**
	 * API发放限制
ACTIVITY_APP_ID：仅活动主体的应用
SPECIFY_APP_ID：指定应用
	 */
	@ApiField("api_send_control_type")
	private String apiSendControlType;

	/**
	 * 是否参与会场招商
不参与会场招商时返回值为false，参与会场招商时返回参与的会场招商玩法code列表
false:不参与会场招商

RED_PACKET_WITH_FUNDING:红包码【双12配资】RED_PACKET:红包码
2023_BANK_PROMOTION:银行大促
SPRING2023:2023春季大促
AUTUMN_CARDS:金秋消费节COMMERCIAL_MARKETING_VENUE:商户小程序
DOUBLE12_2023:双12主会场
HUNDRED_TIMES_DISCOUNT:百次立减
	 */
	@ApiListField("play_name_list")
	@ApiField("string")
	private List<String> playNameList;

	/**
	 * 是否需要叠加公域流量
true：需要叠加公域流量
false：不叠加公域流量
	 */
	@ApiField("public_domain")
	private Boolean publicDomain;

	/**
	 * 发放方式
PAGE:仅支付宝二维码及链接发放
API:仅API发放
PAGE_API:支付宝二维码、链接及API发放
	 */
	@ApiField("send_type")
	private String sendType;

	public List<String> getApiSendControlContentList() {
		return this.apiSendControlContentList;
	}
	public void setApiSendControlContentList(List<String> apiSendControlContentList) {
		this.apiSendControlContentList = apiSendControlContentList;
	}

	public String getApiSendControlType() {
		return this.apiSendControlType;
	}
	public void setApiSendControlType(String apiSendControlType) {
		this.apiSendControlType = apiSendControlType;
	}

	public List<String> getPlayNameList() {
		return this.playNameList;
	}
	public void setPlayNameList(List<String> playNameList) {
		this.playNameList = playNameList;
	}

	public Boolean getPublicDomain() {
		return this.publicDomain;
	}
	public void setPublicDomain(Boolean publicDomain) {
		this.publicDomain = publicDomain;
	}

	public String getSendType() {
		return this.sendType;
	}
	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

}
