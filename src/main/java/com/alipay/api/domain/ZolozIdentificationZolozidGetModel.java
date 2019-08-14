package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取主站zid
 *
 * @author auto create
 * @since 1.0, 2018-03-13 17:10:17
 */
public class ZolozIdentificationZolozidGetModel extends AlipayObject {

	private static final long serialVersionUID = 4823275358224476759L;

	/**
	 * get region
	 */
	@ApiField("action")
	private String action;

	/**
	 * bizId
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扩展字段
	 */
	@ApiField("extern_params")
	private String externParams;

	/**
	 * json字符串
	 */
	@ApiField("zcif_params")
	private String zcifParams;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getExternParams() {
		return this.externParams;
	}
	public void setExternParams(String externParams) {
		this.externParams = externParams;
	}

	public String getZcifParams() {
		return this.zcifParams;
	}
	public void setZcifParams(String zcifParams) {
		this.zcifParams = zcifParams;
	}

}
