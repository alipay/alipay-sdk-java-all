package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费机构查询接口
 *
 * @author auto create
 * @since 1.0, 2023-08-21 09:53:33
 */
public class AlipayEbppJfInstcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7566748296777667162L;

	/**
	 * 城市级别的行政区划代码, 支持地市以及区县
杭州: 330100
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 业务类型, 默认JF
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝提供的渠道短码
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用于指定对应的服务类型
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 缴费费种
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getAdCode() {
		return this.adCode;
	}
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
