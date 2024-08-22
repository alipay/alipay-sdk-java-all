package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益召回组件
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:54
 */
public class BenefitQueryComponent extends AlipayObject {

	private static final long serialVersionUID = 2892657265315523786L;

	/**
	 * 渠道标识，用于判断渠道过滤规则。非固定值，由业务运营定义
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 地理位置纬度，单位：度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地理位置经度，单位：度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 是否跳过发奖流水中的券信息补充，默认不跳过
	 */
	@ApiField("skip_voucher_info")
	private Boolean skipVoucherInfo;

	/**
	 * 权益来源标识，非固定值，由业务运营定义
	 */
	@ApiField("source")
	private String source;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Boolean getSkipVoucherInfo() {
		return this.skipVoucherInfo;
	}
	public void setSkipVoucherInfo(Boolean skipVoucherInfo) {
		this.skipVoucherInfo = skipVoucherInfo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
