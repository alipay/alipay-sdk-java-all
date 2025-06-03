package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 刷脸核身设备进件
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:03:30
 */
public class AlipayOpenIotmbsDevicesettleAddModel extends AlipayObject {

	private static final long serialVersionUID = 1475649817195123235L;

	/**
	 * 设备所属的厂商名称
	 */
	@ApiField("device_company_name")
	private String deviceCompanyName;

	/**
	 * 设备所属物权的商户id
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 需要已经完成sn录入的设备
	 */
	@ApiListField("sns")
	@ApiField("string")
	private List<String> sns;

	/**
	 * 与产品沟通后才能使用
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用于定位业务流水问题
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public String getDeviceCompanyName() {
		return this.deviceCompanyName;
	}
	public void setDeviceCompanyName(String deviceCompanyName) {
		this.deviceCompanyName = deviceCompanyName;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public List<String> getSns() {
		return this.sns;
	}
	public void setSns(List<String> sns) {
		this.sns = sns;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
