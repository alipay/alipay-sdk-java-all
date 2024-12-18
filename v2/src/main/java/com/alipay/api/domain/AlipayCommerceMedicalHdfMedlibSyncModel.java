package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 病历数据同步
 *
 * @author auto create
 * @since 1.0, 2024-12-11 17:00:37
 */
public class AlipayCommerceMedicalHdfMedlibSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3335624156947594952L;

	/**
	 * 内容
	 */
	@ApiField("data")
	private String data;

	/**
	 * 操作类型
	 */
	@ApiField("op")
	private String op;

	/**
	 * 模型的类型
	 */
	@ApiField("type")
	private String type;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getOp() {
		return this.op;
	}
	public void setOp(String op) {
		this.op = op;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
