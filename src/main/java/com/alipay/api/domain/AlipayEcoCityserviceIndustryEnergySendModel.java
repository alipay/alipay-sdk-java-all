package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 市民中心行业绿色能量发送接口
 *
 * @author auto create
 * @since 1.0, 2022-04-06 11:48:02
 */
public class AlipayEcoCityserviceIndustryEnergySendModel extends AlipayObject {

	private static final long serialVersionUID = 7533715392161121454L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private EnergyExtRequest extInfo;

	/**
	 * 外部业务号，用作幂等。 自定义传入，同一场景下，一条外部业务号只可消费一次。
	 */
	@ApiField("outer_no")
	private String outerNo;

	/**
	 * 行业场景，如社保行业，公积金等，具体场景详情请联系owner
	 */
	@ApiField("scene")
	private String scene;

	public EnergyExtRequest getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(EnergyExtRequest extInfo) {
		this.extInfo = extInfo;
	}

	public String getOuterNo() {
		return this.outerNo;
	}
	public void setOuterNo(String outerNo) {
		this.outerNo = outerNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
