package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蓝牙设备信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class BeaconDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 8166846943286978123L;

	/**
	 * 设备类型
	 */
	@ApiField("actiontype")
	private String actiontype;

	/**
	 * 设备是否可用
	 */
	@ApiField("inuse")
	private Boolean inuse;

	/**
	 * 设备说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 设备序列号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 蓝牙设备关联的模板信息
	 */
	@ApiField("template")
	private BeaconTemplate template;

	/**
	 * 设备ID
	 */
	@ApiField("uuid")
	private String uuid;

	public String getActiontype() {
		return this.actiontype;
	}
	public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}

	public Boolean getInuse() {
		return this.inuse;
	}
	public void setInuse(Boolean inuse) {
		this.inuse = inuse;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public BeaconTemplate getTemplate() {
		return this.template;
	}
	public void setTemplate(BeaconTemplate template) {
		this.template = template;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
