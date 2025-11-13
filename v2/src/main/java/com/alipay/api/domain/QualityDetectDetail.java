package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 质检详情
 *
 * @author auto create
 * @since 1.0, 2025-09-12 17:00:09
 */
public class QualityDetectDetail extends AlipayObject {

	private static final long serialVersionUID = 7826158583973997188L;

	/**
	 * 线圈烧录的UTC时间戳
	 */
	@ApiField("burning_time_stamp")
	private Long burningTimeStamp;

	/**
	 * 品检详情信息，其中每个key代表需要品检的字段，value则是供应商品检过程中识别到的物料实体信息值
	 */
	@ApiField("detect_detail")
	private String detectDetail;

	/**
	 * 动态NFC链接，由MCU生成，基于静态链接和时间戳的动态加密算法拼接而成，每次NFC碰起来的链接都不一样
	 */
	@ApiField("dynamic_nfc_url")
	private String dynamicNfcUrl;

	/**
	 * 参数是NFC链接，由支付宝平台下发，品检时供应商须回传该链接
	 */
	@ApiField("nfc_url")
	private String nfcUrl;

	/**
	 * 当前UTC时间戳
	 */
	@ApiField("quality_time_stamp")
	private Long qualityTimeStamp;

	/**
	 * 参数代表实体物料的唯一标识，平台将每个物料通过该字段进行区分，下发给供应商，供应商品检是需要将该字段上传用以物料实体的识别
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public Long getBurningTimeStamp() {
		return this.burningTimeStamp;
	}
	public void setBurningTimeStamp(Long burningTimeStamp) {
		this.burningTimeStamp = burningTimeStamp;
	}

	public String getDetectDetail() {
		return this.detectDetail;
	}
	public void setDetectDetail(String detectDetail) {
		this.detectDetail = detectDetail;
	}

	public String getDynamicNfcUrl() {
		return this.dynamicNfcUrl;
	}
	public void setDynamicNfcUrl(String dynamicNfcUrl) {
		this.dynamicNfcUrl = dynamicNfcUrl;
	}

	public String getNfcUrl() {
		return this.nfcUrl;
	}
	public void setNfcUrl(String nfcUrl) {
		this.nfcUrl = nfcUrl;
	}

	public Long getQualityTimeStamp() {
		return this.qualityTimeStamp;
	}
	public void setQualityTimeStamp(Long qualityTimeStamp) {
		this.qualityTimeStamp = qualityTimeStamp;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
