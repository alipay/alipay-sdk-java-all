package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险标的
 *
 * @author auto create
 * @since 1.0, 2019-08-20 16:42:41
 */
public class InsObject extends AlipayObject {

	private static final long serialVersionUID = 8635457786818739747L;

	/**
	 * 标的物的标识id
	 */
	@ApiField("insured_object_id")
	private String insuredObjectId;

	/**
	 * 标的信息;标准json 格式
	 */
	@ApiField("insured_object_info")
	private String insuredObjectInfo;

	/**
	 * 标的类型;0:财产所在地;1:其它;2:车;3:资金债务;4:电商订单
	 */
	@ApiField("type")
	private Long type;

	public String getInsuredObjectId() {
		return this.insuredObjectId;
	}
	public void setInsuredObjectId(String insuredObjectId) {
		this.insuredObjectId = insuredObjectId;
	}

	public String getInsuredObjectInfo() {
		return this.insuredObjectInfo;
	}
	public void setInsuredObjectInfo(String insuredObjectInfo) {
		this.insuredObjectInfo = insuredObjectInfo;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
