package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灯火数据回传接口
 *
 * @author auto create
 * @since 1.0, 2020-01-14 10:05:35
 */
public class AlipayDataDataserviceDmpserviceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1826853286865375498L;

	/**
	 * 转化id
event_type = 1时必填
	 */
	@ApiField("conversion_id")
	private Long conversionId;

	/**
	 * 转化时间
event_type = 1时必填
	 */
	@ApiField("conversion_time")
	private String conversionTime;

	/**
	 * 转化类型，0-表单提交，1-客户资讯搜集，2-商品加购物车，3-订单提交，4-我要投保，5-保险交易笔数，6-保险交易金额，7-基金交易笔数，8-基金交易金额
event_type = 1时必填
	 */
	@ApiField("conversion_type")
	private String conversionType;

	/**
	 * 设备id

device_id和user_id不能同时为空
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备类型, 0:imei, 1:idfa, 2:imei_md5, 3:imei_sha256, 4:idfa_md5, 5:idfa_sha256

设备类型和device_id是同时存在
device_id和user_id不能同时为空
	 */
	@ApiField("device_type")
	private Long deviceType;

	/**
	 * 0-落地页到达事件
1-转化事件
	 */
	@ApiField("event_type")
	private Long eventType;

	/**
	 * 扩展字段，json格式存储，列表里面包含kv
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 1:转化, 0:非转化
event_type = 1时必填
	 */
	@ApiField("is_conversion")
	private Long isConversion;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 数据来源，如来源数立，可以SL
	 */
	@ApiField("source")
	private String source;

	/**
	 * 当前访问的url  encode后的字符串
	 */
	@ApiField("track_url")
	private String trackUrl;

	/**
	 * 用户id

设备id和用户id不能同时为空
	 */
	@ApiField("user_id")
	private String userId;

	public Long getConversionId() {
		return this.conversionId;
	}
	public void setConversionId(Long conversionId) {
		this.conversionId = conversionId;
	}

	public String getConversionTime() {
		return this.conversionTime;
	}
	public void setConversionTime(String conversionTime) {
		this.conversionTime = conversionTime;
	}

	public String getConversionType() {
		return this.conversionType;
	}
	public void setConversionType(String conversionType) {
		this.conversionType = conversionType;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Long getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(Long deviceType) {
		this.deviceType = deviceType;
	}

	public Long getEventType() {
		return this.eventType;
	}
	public void setEventType(Long eventType) {
		this.eventType = eventType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getIsConversion() {
		return this.isConversion;
	}
	public void setIsConversion(Long isConversion) {
		this.isConversion = isConversion;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTrackUrl() {
		return this.trackUrl;
	}
	public void setTrackUrl(String trackUrl) {
		this.trackUrl = trackUrl;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
