package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供给实例咨询
 *
 * @author auto create
 * @since 1.0, 2026-09-02 14:52:48
 */
public class AlipayOfflineProviderIndflowSupplyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4869883274828412154L;

	/**
	 * 业务参数
	 */
	@ApiField("biz_info")
	private IndflowBizInfo bizInfo;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 由BD分配，展位外部ID
	 */
	@ApiField("out_pos_id")
	private String outPosId;

	/**
	 * 样式类型
	 */
	@ApiField("style_type")
	private String styleType;

	public IndflowBizInfo getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(IndflowBizInfo bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getOutPosId() {
		return this.outPosId;
	}
	public void setOutPosId(String outPosId) {
		this.outPosId = outPosId;
	}

	public String getStyleType() {
		return this.styleType;
	}
	public void setStyleType(String styleType) {
		this.styleType = styleType;
	}

}
