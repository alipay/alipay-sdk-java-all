package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 城服绿色能量发送通用接口
 *
 * @author auto create
 * @since 1.0, 2021-07-02 15:20:41
 */
public class AlipayEcoCityserviceCityserviceEnergySendModel extends AlipayObject {

	private static final long serialVersionUID = 7572285376854513726L;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("energy_ext_request")
	private List<EnergyExtRequest> extInfo;

	/**
	 * 外部业务号，用作幂等。同一场景下，一条外部业务号只可消费一次。
	 */
	@ApiField("outer_no")
	private String outerNo;

	/**
	 * 能量发放场景，如：医院-挂号
	 */
	@ApiField("scene")
	private String scene;

	public List<EnergyExtRequest> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<EnergyExtRequest> extInfo) {
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
