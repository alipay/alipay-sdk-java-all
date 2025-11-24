package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工单数据上报
 *
 * @author auto create
 * @since 1.0, 2025-04-22 17:35:24
 */
public class AlipayIserviceIcontrolNonstandarddataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1121464722833657689L;

	/**
	 * 非标准数据内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 小二的星云id
	 */
	@ApiField("nebula_id")
	private String nebulaId;

	/**
	 * 外部数据唯一标识
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 数据类型
	 */
	@ApiField("type")
	private String type;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getNebulaId() {
		return this.nebulaId;
	}
	public void setNebulaId(String nebulaId) {
		this.nebulaId = nebulaId;
	}

	public String getOutBizCode() {
		return this.outBizCode;
	}
	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
