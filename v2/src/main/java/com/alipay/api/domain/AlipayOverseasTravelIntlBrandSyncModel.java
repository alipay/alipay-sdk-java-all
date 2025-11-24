package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * A+品牌同步
 *
 * @author auto create
 * @since 1.0, 2023-12-19 11:44:59
 */
public class AlipayOverseasTravelIntlBrandSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4585524349744453738L;

	/**
	 * 品牌信息
	 */
	@ApiField("brand_info")
	private IntlBrandInfo brandInfo;

	/**
	 * 外部信息列表
	 */
	@ApiListField("external_list")
	@ApiField("external_info")
	private List<ExternalInfo> externalList;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public IntlBrandInfo getBrandInfo() {
		return this.brandInfo;
	}
	public void setBrandInfo(IntlBrandInfo brandInfo) {
		this.brandInfo = brandInfo;
	}

	public List<ExternalInfo> getExternalList() {
		return this.externalList;
	}
	public void setExternalList(List<ExternalInfo> externalList) {
		this.externalList = externalList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
