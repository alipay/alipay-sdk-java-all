package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 质检详情
 *
 * @author auto create
 * @since 1.0, 2024-09-23 10:33:33
 */
public class QualityDetectDetail extends AlipayObject {

	private static final long serialVersionUID = 1519793195768732659L;

	/**
	 * 品检详情信息，其中每个key代表需要品检的字段，value则是供应商品检过程中识别到的物料实体信息值
	 */
	@ApiField("detect_detail")
	private String detectDetail;

	/**
	 * 参数是NFC链接，由支付宝平台下发，品检时供应商须回传该链接
	 */
	@ApiField("nfc_url")
	private String nfcUrl;

	/**
	 * 参数代表实体物料的唯一标识，平台将每个物料通过该字段进行区分，下发给供应商，供应商品检是需要将该字段上传用以物料实体的识别
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public String getDetectDetail() {
		return this.detectDetail;
	}
	public void setDetectDetail(String detectDetail) {
		this.detectDetail = detectDetail;
	}

	public String getNfcUrl() {
		return this.nfcUrl;
	}
	public void setNfcUrl(String nfcUrl) {
		this.nfcUrl = nfcUrl;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
