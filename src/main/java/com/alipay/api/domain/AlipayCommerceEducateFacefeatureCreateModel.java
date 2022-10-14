package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用一脸通行入库接口
 *
 * @author auto create
 * @since 1.0, 2022-08-22 19:38:45
 */
public class AlipayCommerceEducateFacefeatureCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4835499745347287443L;

	/**
	 * 行业编码。（注：该接口为定向开放接口，使用前需要与对应的"业务产品"申请，切勿随意填写）
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 机构编号。（同：机构id/机构内标）
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * isv英文简称。（注：请不要填写中文名称）
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 唯一标识ID
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
