package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发奖组件
 *
 * @author auto create
 * @since 1.0, 2025-11-28 09:38:12
 */
public class BenefitActionComponent extends AlipayObject {

	private static final long serialVersionUID = 5849846694962451853L;

	/**
	 * 渠道标识，用于判断渠道过滤规则。非固定值，由业务运营定义
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 权益编码，非固定值，由业务运营配置
	 */
	@ApiField("code")
	private String code;

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
	 * 外部业务编码，业务幂等键
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部业务类型，非固定值，由业务运营自定义
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 指定发放的红包金额大小，单位：分
	 */
	@ApiField("send_price")
	private Long sendPrice;

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

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public Long getSendPrice() {
		return this.sendPrice;
	}
	public void setSendPrice(Long sendPrice) {
		this.sendPrice = sendPrice;
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
