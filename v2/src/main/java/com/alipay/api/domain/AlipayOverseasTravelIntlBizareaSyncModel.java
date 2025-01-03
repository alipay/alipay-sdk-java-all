package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * A+商圈同步
 *
 * @author auto create
 * @since 1.0, 2023-11-02 17:05:52
 */
public class AlipayOverseasTravelIntlBizareaSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8333891834572721244L;

	/**
	 * 商圈信息
	 */
	@ApiField("biz_area_info")
	private BizAreaDTO bizAreaInfo;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public BizAreaDTO getBizAreaInfo() {
		return this.bizAreaInfo;
	}
	public void setBizAreaInfo(BizAreaDTO bizAreaInfo) {
		this.bizAreaInfo = bizAreaInfo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
