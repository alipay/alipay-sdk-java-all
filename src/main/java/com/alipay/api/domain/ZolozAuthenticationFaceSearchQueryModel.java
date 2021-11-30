package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸原子产品搜索接口（客户端模式）
 *
 * @author auto create
 * @since 1.0, 2019-01-08 18:29:44
 */
public class ZolozAuthenticationFaceSearchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1166114868834392946L;

	/**
	 * 人脸图片采集后的加密字符串
	 */
	@ApiField("blob")
	private String blob;

	/**
	 * 商户设备编码
	 */
	@ApiField("device_num")
	private String deviceNum;

	/**
	 * 机具分组编码
	 */
	@ApiField("group")
	private String group;

	/**
	 * zim唯一标识
	 */
	@ApiField("zim_id")
	private String zimId;

	public String getBlob() {
		return this.blob;
	}
	public void setBlob(String blob) {
		this.blob = blob;
	}

	public String getDeviceNum() {
		return this.deviceNum;
	}
	public void setDeviceNum(String deviceNum) {
		this.deviceNum = deviceNum;
	}

	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	public String getZimId() {
		return this.zimId;
	}
	public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
