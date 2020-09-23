package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版文件信息
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:40:28
 */
public class TemplateFileDTO extends AlipayObject {

	private static final long serialVersionUID = 1898971696214718867L;

	/**
	 * 是否支持转赠，当设置为可转赠则可以在支付宝卡包中点击转赠按钮，将拥有的券转赠给其他用户。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("can_present")
	private Boolean canPresent;

	/**
	 * 是否支持共享，如果支持共享则可以有多个用户拥有同一张卡券。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("can_share")
	private Boolean canShare;

	/**
	 * 卡券模版版本信息，当前版本为4。不支持动态参数。
	 */
	@ApiField("format_version")
	private String formatVersion;

	/**
	 * 卡券序列号，同一第三方提供的序列号需要唯一，同一用户重复添加的卡券，对应的serialNumber要求一致。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("serial_number")
	private String serialNumber;

	public Boolean getCanPresent() {
		return this.canPresent;
	}
	public void setCanPresent(Boolean canPresent) {
		this.canPresent = canPresent;
	}

	public Boolean getCanShare() {
		return this.canShare;
	}
	public void setCanShare(Boolean canShare) {
		this.canShare = canShare;
	}

	public String getFormatVersion() {
		return this.formatVersion;
	}
	public void setFormatVersion(String formatVersion) {
		this.formatVersion = formatVersion;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

}
