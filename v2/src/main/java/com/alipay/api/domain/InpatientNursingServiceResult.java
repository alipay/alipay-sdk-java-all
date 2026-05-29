package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 陪护服务结果
 *
 * @author auto create
 * @since 1.0, 2026-05-14 15:01:05
 */
public class InpatientNursingServiceResult extends AlipayObject {

	private static final long serialVersionUID = 6827931655261385225L;

	/**
	 * 服务小结图片URL
	 */
	@ApiListField("service_summary_photo_url_list")
	@ApiField("string")
	private List<String> serviceSummaryPhotoUrlList;

	public List<String> getServiceSummaryPhotoUrlList() {
		return this.serviceSummaryPhotoUrlList;
	}
	public void setServiceSummaryPhotoUrlList(List<String> serviceSummaryPhotoUrlList) {
		this.serviceSummaryPhotoUrlList = serviceSummaryPhotoUrlList;
	}

}
