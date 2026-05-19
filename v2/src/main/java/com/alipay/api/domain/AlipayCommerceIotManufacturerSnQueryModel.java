package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 厂商非sdk设备链接信息查询
 *
 * @author auto create
 * @since 1.0, 2026-04-10 10:28:05
 */
public class AlipayCommerceIotManufacturerSnQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6194427242519381876L;

	/**
	 * 用于查询设备url信息
	 */
	@ApiListField("tag_sn_info_list_request")
	@ApiField("tag_sn_info_list_request")
	private List<TagSnInfoListRequest> tagSnInfoListRequest;

	public List<TagSnInfoListRequest> getTagSnInfoListRequest() {
		return this.tagSnInfoListRequest;
	}
	public void setTagSnInfoListRequest(List<TagSnInfoListRequest> tagSnInfoListRequest) {
		this.tagSnInfoListRequest = tagSnInfoListRequest;
	}

}
