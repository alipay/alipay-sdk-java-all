package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品检内容
 *
 * @author auto create
 * @since 1.0, 2025-11-27 14:38:13
 */
public class ContentInfo extends AlipayObject {

	private static final long serialVersionUID = 8319719792424118957L;

	/**
	 * 详情明细
	 */
	@ApiListField("content_details")
	@ApiField("content_detail")
	private List<ContentDetail> contentDetails;

	public List<ContentDetail> getContentDetails() {
		return this.contentDetails;
	}
	public void setContentDetails(List<ContentDetail> contentDetails) {
		this.contentDetails = contentDetails;
	}

}
