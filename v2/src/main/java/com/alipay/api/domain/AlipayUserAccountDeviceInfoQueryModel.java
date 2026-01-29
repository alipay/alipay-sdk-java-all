package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询设备是否支付宝新用户
 *
 * @author auto create
 * @since 1.0, 2023-01-04 11:10:00
 */
public class AlipayUserAccountDeviceInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6523475341495338359L;

	/**
	 * 设备号数组，对应设备类型为device_type字段代表的设备类型。为兼容而保留，参数已经被devices取代。devices不存在的时候是必填。
	 */
	@ApiListField("device_ids")
	@ApiField("string")
	private List<String> deviceIds;

	/**
	 * 设备类型，包括OAID，IMEI、IDFA、MOBILE(大小写敏感）。为兼容而保留，参数已经被devices取代。devices不存在的时候是必填。
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 1. devices字段内容为JSON串；
2. devices每一个直接的key代表一个设备
3. 一个设备可以包含一个或多个设备类型信息（IDFA，IMEI，OAID，MOBILE），类型信息不许重复；

示例：
{
  "unique_key_1": { // 唯一key，调用方自己定义，用来标识设备
    "OAID": {
      "device_id": "id1",
      "encrypt_type": "MD5"
    },
    "IMEI": {
      "device_id": "id2",
      "encrypt_type": "MD5"
    },
    "IDFA": {
      "device_id": "id3",
      "encrypt_type": "MD5"
    },
    "MOBILE": {
      "device_id": "id4",
      "encrypt_type": "MD5"
    }
  },
  "unique_key_2": { // 唯一key，调用方自己定义，用来标识设备
    ... // 填写需要咨询的设备类型，ID和加密类型
  }
}
	 */
	@ApiField("devices")
	private String devices;

	/**
	 * 设备id的加密方式，不传认为设备号没有加密。当前支持类型为MD5。为兼容而保留，参数已经被devices取代。
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 扩展参数，如设备系统类型，系统版本等,格式为基本字符串组成的json串
	 */
	@ApiField("extra_info")
	private String extraInfo;

	/**
	 * 一般代表调用的合作机构名称，可写简称，大小写敏感。为兼容而保留，参数已经被devices取代。devices不存在的时候是必填。
	 */
	@ApiField("request_from")
	private String requestFrom;

	public List<String> getDeviceIds() {
		return this.deviceIds;
	}
	public void setDeviceIds(List<String> deviceIds) {
		this.deviceIds = deviceIds;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDevices() {
		return this.devices;
	}
	public void setDevices(String devices) {
		this.devices = devices;
	}

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public String getExtraInfo() {
		return this.extraInfo;
	}
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

}
