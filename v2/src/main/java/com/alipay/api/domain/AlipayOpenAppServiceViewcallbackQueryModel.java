package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务变更回查视图openapi接口
 *
 * @author auto create
 * @since 1.0, 2020-12-02 19:52:04
 */
public class AlipayOpenAppServiceViewcallbackQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5296297919658579863L;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务视图元数据ID
	 */
	@ApiField("service_view_meta_id")
	private String serviceViewMetaId;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceViewMetaId() {
		return this.serviceViewMetaId;
	}
	public void setServiceViewMetaId(String serviceViewMetaId) {
		this.serviceViewMetaId = serviceViewMetaId;
	}

}
