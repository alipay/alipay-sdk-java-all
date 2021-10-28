package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * AI定损宝
 *
 * @author auto create
 * @since 1.0, 2020-05-09 11:22:35
 */
public class AnttechAiCvDsbIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 4695591998722852927L;

	/**
	 * 蚂蚁内部单号
	 */
	@ApiField("ant_estimate_no")
	private String antEstimateNo;

	/**
	 * 外部保险单号
	 */
	@ApiField("estimate_request_no")
	private String estimateRequestNo;

	/**
	 * 定损图片信息
	 */
	@ApiListField("image_info")
	@ApiField("dsb_image_info")
	private List<DsbImageInfo> imageInfo;

	public String getAntEstimateNo() {
		return this.antEstimateNo;
	}
	public void setAntEstimateNo(String antEstimateNo) {
		this.antEstimateNo = antEstimateNo;
	}

	public String getEstimateRequestNo() {
		return this.estimateRequestNo;
	}
	public void setEstimateRequestNo(String estimateRequestNo) {
		this.estimateRequestNo = estimateRequestNo;
	}

	public List<DsbImageInfo> getImageInfo() {
		return this.imageInfo;
	}
	public void setImageInfo(List<DsbImageInfo> imageInfo) {
		this.imageInfo = imageInfo;
	}

}
